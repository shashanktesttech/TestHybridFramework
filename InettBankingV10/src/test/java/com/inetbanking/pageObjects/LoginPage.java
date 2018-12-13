package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(name = "uid")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(name = "password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(name = "btnLogin")
	@CacheLookup
	WebElement btnLogin;

	public void SetUserName(String uname) {
		txtUserName.sendKeys(uname);
	}

	public void SetPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void ClickSubmit() {
		btnLogin.click();
	}

}
