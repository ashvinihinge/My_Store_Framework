package com.MyStore.Test_Cases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.MyStore.Page_Object.Address_Summary_Page;
import com.MyStore.Page_Object.Confirm_Order_Page;
import com.MyStore.Page_Object.Index_Page;
import com.MyStore.Page_Object.My_Account_Page;
import com.MyStore.Page_Object.Order_Payment_Page;
import com.MyStore.Page_Object.Order_Shipping_Page;
import com.MyStore.Page_Object.Order_Summary_Page;
import com.MyStore.Page_Object.Product_Page;
import com.MyStore.Page_Object.RegisterUserAccount;
import com.MyStore.Page_Object.Search_Result_Page;

public class TC_Verify_Buy_Product_TestCase extends Base_Test_CasesClass {

	@Test(priority = 1)
	
	public void verifyBuyProduct() throws IOException {

		logger.info("---------------- Test Case Of Buy Product Started ------");
		// Sign Ins
		Index_Page pg = new Index_Page(driver);
		pg.ClickOnSignInLink();

		// Enter Account Details :
		My_Account_Page myaccoutpage = new My_Account_Page(driver);
		myaccoutpage.enterRegEmailAddress(emailAddress);
		myaccoutpage.enterRegPassword(password);
		logger.info("Enter email and password for alredy register");
		myaccoutpage.clickOnSignInBtn();

		logger.info(" Click On Sign In Btn");

		// Enter Product Details :
		String searchKey = "Printed Chiffon Dress";
		RegisterUserAccount regUser = new RegisterUserAccount(driver);
		regUser.enterDataInSearchBox(searchKey);
		regUser.clickOnSearchButton();
		logger.info(" Search Product ");
		
		// Search Product details :
		Search_Result_Page resultpage = new Search_Result_Page(driver);
		resultpage.clickOnSearchProuct();
		
		logger.info(" Click On Search Button");
		// Product Page :
		Product_Page productpg = new Product_Page(driver);
		productpg.setSize("M");
		logger.info("size M entered");
		productpg.setQuantity("2");
		logger.info("Quantity is entered");
		productpg.clickOnAddToCart();
		logger.info("Click on Add To Cart Option");
		productpg.clickOnProceedToCheckOut();
		logger.info("Click on Proceed to Check Out");
		
		
		logger.info(" Product Details");
		// Order Summary Page 
		Order_Summary_Page orderSummaryPg=new Order_Summary_Page(driver);
		orderSummaryPg.clickOnProceedToCheckOut();
		logger.info("Click on Proceed to Check Out of Order Summary Page");
		
		/*
		// Enter Address Details:
		My_Account_Address_Details addressDetailspg=new My_Account_Address_Details(driver);
				addressDetailspg.enterAddress("Manchar");
				logger.info("Enter Address");
				addressDetailspg.enterCity("Pune ");
				addressDetailspg.selectState("Alabama");
				addressDetailspg.enterPostalCode("00000");
				addressDetailspg.selectCountry("United States");
				addressDetailspg.enterHomePhone("8990909898");
				addressDetailspg.enterMobileNo("9898898786");
				addressDetailspg.enterAlias("My Home10");
				// Click on Save Button:
				addressDetailspg.clickOnSaveBtn();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			*/	
				
		//Address Summary Page
				Address_Summary_Page addSummarypg=new Address_Summary_Page(driver);
				
				addSummarypg.clickOnProceedToCheckOutForAddress();
				logger.info(" Click on Proceed To Check Out For Address");
				
				
		//Order Shipping Page
				Order_Shipping_Page shippingPage =new Order_Shipping_Page(driver);
				shippingPage.selectTermsofservice();
				shippingPage.clickOnProceedToCheckOutShippingPage();
				
				logger.info(" Click on Proceed To Check Out For Shipping");
				
		// Order Payment Page:
				Order_Payment_Page orderpaymentpage=new Order_Payment_Page(driver);
				orderpaymentpage.clickOnPayByCheck();
				
				logger.info(" Click on Pay To Check");
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					//e.printStackTrace();
				}
				 
		// Confirm Order page:
				Confirm_Order_Page  confirmorderpg=new Confirm_Order_Page(driver);
				
				confirmorderpg.cickOnConfirmOrder();
				
				logger.info(" Click on Confirm Order ");
				
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					//e.printStackTrace();
				}

				String sucessMsg = confirmorderpg.getOrderSucessMessage();	
				logger.info(sucessMsg); 
				
			//	Assert.assertEquals(sucessMsg, "Your order on My Store is complete.");
				
				if(sucessMsg.equals("Your order on My Shop is complete."))
				{
					logger.info("VerifyBuyProduct - Passed"); 
					Assert.assertTrue(true);

					confirmorderpg.clickOnSignOut();

				}
				else
				{
					logger.info("VerifyBuyProduct - Failed");
					captureFullPageScreenShot(driver,"verifyBuyProduct");
					Assert.assertFalse(true);

				} 

				logger.info("***************TestCase BuyProduct ends*****************"); 
	}

				
				@Test (priority = 2)
				
				public void VerifySignOut() throws IOException{
				
					logger.info("---------------- Test Case Of Verify Sign Out  Started ------");
					// Sign In
					Index_Page pg = new Index_Page(driver);
					pg.ClickOnSignInLink();
					logger.info("---------------- Click on Sign In Link ------");
					
					
					My_Account_Page myaccoutpage = new My_Account_Page(driver);
					myaccoutpage.enterRegEmailAddress(emailAddress);
					myaccoutpage.enterRegPassword(password);
					logger.info("Enter email and password for alredy register");
					myaccoutpage.clickOnSignInBtn();

					logger.info(" Click On Sign In Btn");
					
					RegisterUserAccount regUser = new RegisterUserAccount(driver);
					regUser.clickOnSignOut();
					
					
					if(pg.getPageTitle().equals("Login - My Shop")) {
						
						logger.info("VerifySignOut - Passed");
							Assert.assertTrue(true);
						}

						else
						{
							logger.info("VerifySignOut - Failed");
							captureFullPageScreenShot(driver,"VerifySignOut");
							Assert.assertTrue(false);
						}
					}
		}
				
		
	
