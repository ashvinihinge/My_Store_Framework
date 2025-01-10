package com.MyStore.Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Result_Page {
	
	WebDriver driver;
	// Constructor
	
	public Search_Result_Page(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
		}
	
	////a[contains(text(), 'Printed Chiffon Dress') and @title='Printed Chiffon Dress']
	
	//Identify WebElement On Search Result Page
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]")
			WebElement searchResultProduct;
	
	@FindBy(linkText ="More")
	WebElement more;
	

	
	//Identify Action in Search Result Page
	
	public String getSearchResultProductName() {
		return searchResultProduct.getText();
		
	}

	public void clickOnSearchProuct() {
		searchResultProduct.click();
	
	}

	
	public void clickOnMoreLink() {
		more.click();
	}

	}


