package com.inetbanking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String baseURL = "http://demo.guru99.com/V3/index.php";
	public String username = "mngr165282";
	public String password = "Enaqyqa";s
	public static WebDriver driver;

	public static Logger logger; // Adding logger

	@BeforeClass
	public void Setup() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver/chromedriver.exe");
		driver = new ChromeDriver();

		logger = Logger.getLogger("Inetbanking");
		PropertyConfigurator.configure(System.getProperty("user.dir")+ "//log4j.properties");

	}

	@AfterClass
	public void tearDown() {
		driver.quit();

	}
}
