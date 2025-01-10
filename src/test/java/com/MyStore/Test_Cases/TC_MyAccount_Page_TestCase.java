package com.MyStore.Test_Cases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.MyStore.Page_Object.Index_Page;
import com.MyStore.Page_Object.My_Account_Creation_Details;
import com.MyStore.Page_Object.My_Account_Page;
import com.MyStore.Page_Object.RegisterUserAccount;

public class TC_MyAccount_Page_TestCase extends Base_Test_CasesClass {

	/*
	@Test(enabled = true)

	public void verifyRegistrationAndLogin() {

		
		Index_Page pg = new Index_Page(driver);
		pg.ClickOnSignInLink();

		logger.info("Click On Sign In Link ");

		My_Account_Page myaccoutpage = new My_Account_Page(driver);
		myaccoutpage.enterCreateEmailAddress("ash20@gmail.com");
		logger.info("Enter Email Address In Create Account Section ");

		myaccoutpage.clickOnCreateAccountBtn();
		logger.info("Click On Create An Account Button ");

		My_Account_Creation_Details accountCreatePage = new My_Account_Creation_Details(driver);

		accountCreatePage.selectCustomerTitleMrs();
		accountCreatePage.enterCustomerFirstName("A");
		accountCreatePage.enterCustomerLastName("H");
		accountCreatePage.enterCustomerPassword("ah2024");

		logger.info("Enter Customer Details On My Account Creation Page ");

		accountCreatePage.clickOnRegister();

		logger.info("Click On Register Button On My Account Creation Page ");

		RegisterUserAccount regUser = new RegisterUserAccount(driver);
		String UserNametext = regUser.getRegisterUserNameText();

		Assert.assertEquals("A H", UserNametext);
		logger.info("Register User Account Home Page will Opened ");
	}

	@Test

	public void verifyRegisterUserLoginOrNot() throws IOException {

		logger.info("verifyRegisterUserLoginOrNot Test Excuted Will Started...... ");
		Index_Page pg = new Index_Page(driver);
		pg.ClickOnSignInLink();

		logger.info("Click On Sign In Link ");

		My_Account_Page myaccoutpage = new My_Account_Page(driver);
		myaccoutpage.enterRegEmailAddress("ash20@gmail.com");
		logger.info("Enter Register Email Id  ");
		myaccoutpage.enterRegPassword("ah2024");
		logger.info("Enter Password");
		myaccoutpage.clickOnSignInBtn();
		logger.info("Click Register Sign In Button  ");
		
		// Verify User Name 
		RegisterUserAccount regUser = new RegisterUserAccount(driver);
		String UserNametext = regUser.getRegisterUserNameText();

		
		if(UserNametext.equals("A H")) {
			logger.info("verifyRegisterUserLogin- Passed" );
			Assert.assertTrue(true);
			}
		else {
			logger.info("verifyRegisterUserLogin- Failed" );
			captureFullPageScreenShot(driver,"verifyRegisterUserLoginOrNot");
			
			Assert.assertTrue(false);
	
		}
		
		
		
		
		
	}
*/
}
