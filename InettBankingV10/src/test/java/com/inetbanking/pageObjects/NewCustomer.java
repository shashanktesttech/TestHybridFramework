package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomer {

	public WebDriver cdriver;

	public NewCustomer(WebDriver rdriver) {

		cdriver = rdriver;
		PageFactory.initElements(cdriver, this);
	}

	@FindBy(linkText = "New Customer")
	@CacheLookup
	WebElement NewCustomerLink;

	public void ClickNewCustomerLink() {
		NewCustomerLink.click();
	}

}
