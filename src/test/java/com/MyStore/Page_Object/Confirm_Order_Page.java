package com.MyStore.Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_Order_Page {

	
	WebDriver driver;
	//2. Create constructor
		public Confirm_Order_Page(WebDriver rdriver)
		{
			driver = rdriver;
			PageFactory.initElements(rdriver, this);//driver that will be used to lookup the web element

		}

		@FindBy(xpath ="/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")
		WebElement confirmOrder;
		
		//*/html/body/div/div[2]/div/div[3]/div/p[1]
		@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/p[1]")
		WebElement sucessAlert;

		@FindBy(linkText = "Sign out")
		WebElement signOut;
		
		public void clickOnSignOut()
		{
			signOut.click();
		}
		
		public void cickOnConfirmOrder()
		{
			confirmOrder.click();
		}
		
		public String getOrderSucessMessage()
		{
			return(sucessAlert.getText());
		}
		

}
