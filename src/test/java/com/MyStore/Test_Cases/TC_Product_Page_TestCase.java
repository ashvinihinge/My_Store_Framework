package com.MyStore.Test_Cases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.MyStore.Page_Object.Index_Page;
import com.MyStore.Page_Object.My_Account_Page;
import com.MyStore.Page_Object.RegisterUserAccount;
import com.MyStore.Page_Object.Search_Result_Page;

public class TC_Product_Page_TestCase extends Base_Test_CasesClass {

	@Test
	
	public void verifySearchProduct() throws IOException {
		
		
		String searchKey="Printed Chiffon Dress";
		logger.info("---------------- Test Case Search Product Started ------");
		
		// Sign In 
		Index_Page pg = new Index_Page(driver);
		pg.ClickOnSignInLink();
		
		
		//Enter Account  :
		
		My_Account_Page myaccoutpage = new My_Account_Page(driver);
		myaccoutpage.enterRegEmailAddress(emailAddress);
		myaccoutpage.enterRegPassword(password);
		
		logger.info("Enter Email Address and Password for Already resgister ");
		myaccoutpage.clickOnSignInBtn();
		logger.info(" Click On Sign In Btn");
		
		//Enter search key in search text box: 
		RegisterUserAccount regUser = new RegisterUserAccount(driver);
		regUser.enterDataInSearchBox(searchKey);
		regUser.clickOnSearchButton();
		
		//Get Name of Search Product :
		Search_Result_Page resultpage=new Search_Result_Page(driver);
		
		
		String searchResulutProductName=resultpage.getSearchResultProductName();
		System.out.println(searchResulutProductName);
		
		//Verify Correct Product is display or not After Search:
		if(searchResulutProductName.contains(searchKey)) {
			logger.info("Search Product Test Case is Passed :");
			Assert.assertTrue(true);
			
			//-------------Sign Out-------
			//regUser.clickOnSignOut();
		}
		else {
			logger.info("Search Product Test Case is Failed :");
			captureFullPageScreenShot(driver, "verifySearchProduct");
			Assert.assertTrue(false);
			
		}
		
		resultpage.clickOnSearchProuct();
		logger.info(" ************************** Test Case Search Product End*******************");
		
		

	}
	
	
}
