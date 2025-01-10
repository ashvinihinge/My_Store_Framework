package com.MyStore.Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class My_Account_Address_Details {

	WebDriver driver;

	// Create Constructor
	public My_Account_Address_Details(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	// Identify WebElement On My Account Address Page Details:

	// For Address
	@FindBy(id="address1")
	WebElement address;

	// For City
	@FindBy(id = "city")
	WebElement city;

	// For State
	@FindBy(id = "id_state")
	WebElement state;

	// For PostCode
	@FindBy(id = "postcode")
	WebElement postCode;

	// For country
	@FindBy(id = "id_country")
	WebElement country;

	// For Home Phone
	@FindBy(id = "phone")
	WebElement homephone;

	// For Mobile Number
	@FindBy(id = "phone_mobile")
	WebElement mobile;

	// For Alias
	@FindBy(id="alias")
	WebElement aliasTitle;

	// For Submit
	@FindBy(id = "submitAddress")
	WebElement saveAddressBtn;

	// Identify The Method to be Performed on Web Element:

	// Enter Address:
	public void enterAddress(String addressText) {
		address.sendKeys(addressText);
	}

	// Enter City:
	public void enterCity(String cityText) {
		city.sendKeys(cityText);
	}

	// Select State:
	public void selectState(String stateText) {
		Select sel = new Select(state);
		sel.selectByVisibleText(stateText);
	}

	// Enter Postal Code
	public void enterPostalCode(String postCodeText) {
		postCode.sendKeys(postCodeText);
	}

	// Select Country:
	public void selectCountry(String countryText) {
		Select sel = new Select(country);
		sel.selectByVisibleText(countryText);
	}

	// Enter Home Phone Number:
	public void enterHomePhone(String homephoneText) {
		homephone.sendKeys(homephoneText);
	}

	

	// Enter Mobile Number:
	public void enterMobileNo(String mobileText) {
		mobile.sendKeys(mobileText);
	}

	// Enter Alias details:
	public void enterAlias(String aliasText) {
		aliasTitle.clear();
		aliasTitle.sendKeys(aliasText);
	}

// Click On Save Button
	public void clickOnSaveBtn() {

	}

}
