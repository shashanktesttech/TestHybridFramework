package com.inetbanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginPage_001 extends BaseClass {

	@Test
	public void LoginTest() throws InterruptedException {

		driver.get(baseURL);
		logger.info("URL opened");
		LoginPage lp = new LoginPage(driver);
		lp.SetUserName(username);
		logger.info("user name entered");
		lp.SetPassword(password);
		logger.info("Password entered");
		lp.ClickSubmit();

		if (driver.getCurrentUrl().equals("http://demo.guru99.com/V3/manager/Managerhomepage.php")) {
			logger.info("Login test passed");
			Assert.assertTrue(true);
		} else {
			logger.info("Login test failed");
			Assert.assertTrue(false);
		}

	}
}
