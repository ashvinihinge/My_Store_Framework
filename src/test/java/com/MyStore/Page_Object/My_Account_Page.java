package com.MyStore.Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Account_Page {

	// Create Web driver Object
	WebDriver driver;

	// Create Constructor
	public My_Account_Page(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// Identify  WebElement For Create New Account section :
	@FindBy(id = "email_create")
	WebElement createEmailIdText;

	@FindBy(id = "SubmitCreate")
	WebElement createAccount;
	

	// Identify WebElement On Already Register User section :
	@FindBy(id = "email")
	WebElement enterRegisterUserEmailIdText;

	@FindBy(id = "passwd")
	WebElement enterRegisterUserPassword;

	@FindBy(id="SubmitLogin")
	WebElement signInButn;

	// Identify Action To Be Perform On WebElement For Create New Account section:
	public void enterCreateEmailAddress(String emailAdd) {
		createEmailIdText.sendKeys(emailAdd);
	}

	public void clickOnCreateAccountBtn() {
		createAccount.click();

	}

// Identify Action To Be Perform On WebElement On Already Register User section :
	public void enterRegEmailAddress(String emailId) {
		enterRegisterUserEmailIdText.sendKeys(emailId);
	}

	public void enterRegPassword(String password) {
		enterRegisterUserPassword.sendKeys(password);
	}

	public void clickOnSignInBtn() {
		signInButn.click();
	}
}
