package com.MyStore.Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.reactivex.rxjava3.functions.Action;
import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class Product_Page {


	WebDriver driver;
	// Constructor
	
	public Product_Page(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
		}
	
	
	// Identify the WebElement: 
	//For New User
	@FindBy(id="quantity_wanted")
	WebElement quantitywanted;
	
	@FindBy(id="group_1")
	WebElement size;
	

	@FindBy(name="Submit")
	WebElement addToCart;
	
	
	@FindBy(linkText="Proceed to checkout")
	WebElement proceedToCheckOut;
	
	@FindBy(xpath ="//a[contains(.,'Faded Short Sleeve T-shirts')]")
	WebElement tshirtsProduct;
	
	
	// Method for set quantity :
	 public void setQuantity(String qty) {
		 quantitywanted.clear();
		 quantitywanted.sendKeys(qty);
	 }
	 
	// Method for set quantity :
		 public void setSize(String sizeType) {
			Select sel=new Select(size);
			sel.selectByVisibleText(sizeType);
	 }


		 public void clickOnAddToCart() {
			 addToCart.click();
		 } 
		 public void clickOnProceedToCheckOut() {
			 proceedToCheckOut.click();
		 } 
		 
		 
		 public void moveOverOnTShirtsProduct(){
			
			 Actions action=new Actions(driver);
			 action.moveToElement(tshirtsProduct).build().perform();
		 }
}
