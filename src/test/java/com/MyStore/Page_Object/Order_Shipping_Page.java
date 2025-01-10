package com.MyStore.Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Shipping_Page {

	WebDriver driver;
	// create constructor :
	public  Order_Shipping_Page(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver,this );
	}
	
	// Identify WebElement on Order Shipping Page
	@FindBy(id="cgv")
	WebElement termsofservice ;
	
	@FindBy(name="processCarrier")
	WebElement proceedtocheckOutForShipping;
	
	
	
	// Enter Action on Order Shipping Page
	public void selectTermsofservice() {
		termsofservice.click();
		}
	
	public void clickOnProceedToCheckOutShippingPage() {
		proceedtocheckOutForShipping.click();
		}
}
