package com.MyStore.Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Account_Creation_Details {

	WebDriver driver;

	// Constructor
	public My_Account_Creation_Details(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// Identify WebElement On My Account Creation Page Details:

	// For Title Mrs
	@FindBy(id = "id_gender2")
	WebElement titleMrs;

	// First Name:
	@FindBy(id = "customer_firstname")
	WebElement customerfirstName;

	// Last Name:
	@FindBy(id = "customer_lastname")
	WebElement customerlastName;

	// Email:
	@FindBy(id = "email")
	WebElement customeremail;

	// Enter Password:
	@FindBy(id = "passwd")
	WebElement customerpassword;
	
	// Register Button	
	@FindBy(id = "submitAccount")
		WebElement registerBtn;
	
	// Identify Action Perform On My Account Creation Details Page :
	
	public void selectCustomerTitleMrs() {
		titleMrs.click();
		}
	
	
	public void enterCustomerFirstName(String custfname) {
		customerfirstName.sendKeys(custfname);
		}
	
	public void enterCustomerLastName(String custlastname) {
		customerlastName.sendKeys(custlastname);
		}
	
	public void enterCustomerPassword(String custpassword) {
		customerpassword.sendKeys(custpassword);
		}
	

	public void clickOnRegister() {
		registerBtn.click();
		}
	
	
	
	
	
	
	
	
}
