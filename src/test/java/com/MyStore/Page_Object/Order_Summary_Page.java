package com.MyStore.Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Summary_Page {
	
	WebDriver driver;
	// create constructor :
	public  Order_Summary_Page(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver,this );
	}
	
	@FindBy(linkText ="Proceed to checkout")
	WebElement proceed;
	
	public void clickOnProceedToCheckOut() {
		proceed.click();
	}
	

}
