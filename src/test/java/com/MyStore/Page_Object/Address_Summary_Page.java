package com.MyStore.Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Summary_Page {

	WebDriver driver;
	// create constructor :
	public  Address_Summary_Page(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver,this );
	}
	
	@FindBy(name="processAddress")
	WebElement proceedForAddressPage;
	
	public void clickOnProceedToCheckOutForAddress() {
		proceedForAddressPage.click();
	}
}
