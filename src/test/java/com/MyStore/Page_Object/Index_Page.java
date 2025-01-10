package com.MyStore.Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Index_Page {

	// Create Object Of WebDriver
	WebDriver driver;

	public Index_Page(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// Identify the WebElement

	@FindBy(linkText = "Sign in")
	WebElement signInLink;

	@FindBy(xpath = "(//a[text()='T-shirts'])[2]")
	WebElement tshirtsMenu;

	// Identify Action To Perform On WebElement:

	public void ClickOnSignInLink() {
		signInLink.click();
	}

	public String getPageTitle() {
		return (driver.getTitle());
	}

	public void ClickTShirtsMenu() {
		tshirtsMenu.click();
	}
}
