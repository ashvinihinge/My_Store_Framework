package com.MyStore.Test_Cases;

import org.testng.annotations.Test;

import com.MyStore.Page_Object.Index_Page;

public class TC_Verify_AddTo_WishList_Without_Login_TestCase extends Base_Test_CasesClass {

	
	@Test
	public void verifyAddToWishList_Without_Login() {	

	logger.info("---------------- Test Case Of_Add To WishList Without Login TestCase Started ------");
	//Index Page
	Index_Page pg = new Index_Page(driver);
	pg.ClickTShirtsMenu();
	}
	
}
