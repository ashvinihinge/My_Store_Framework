package com.MyStore.Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterUserAccount {

	WebDriver driver;

	// Constructor
	
	public RegisterUserAccount(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// Identify WebElement

	@FindBy(xpath = "//a[@title='View my customer account']")
	WebElement registerUserName;
	
	
	@FindBy(name="search_query")
	WebElement searchBox;
	

	@FindBy(name="submit_search")
	WebElement sumitSearch;
	
	

	@FindBy(linkText ="Sign out")
	WebElement SignOutBtn;
	
	public String getRegisterUserNameText() {
		String registerUserNameText=registerUserName.getText();
		return registerUserNameText;
	}

	public void clickOnSignOut() {
		SignOutBtn.click();
	}
	

	public void enterDataInSearchBox(String searchKey) {
		
		searchBox.sendKeys(searchKey);
	}
	

	public void clickOnSearchButton() {
		sumitSearch.click();
	}
	
	
}
