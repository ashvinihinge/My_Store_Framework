package com.MyStore.Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Payment_Page {
	
	WebDriver driver;
	// create constructor :
	public  Order_Payment_Page(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver,this );
	}
	
	
	// Identify WebElement on Order Payment Page
	
	@FindBy(className="bankwire")
	WebElement payByBankWise ;
	
	
		@FindBy(className="payment_module")
		WebElement payByCheck ;
		

		// Enter Action on Order Payment Page
		public void clickOnPayByBankWise() {
			payByBankWise.click();
			}
		
		public void clickOnPayByCheck() {
			payByCheck.click();
			}

}
