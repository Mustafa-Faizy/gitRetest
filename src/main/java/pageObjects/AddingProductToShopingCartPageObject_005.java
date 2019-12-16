package pageObjects;


import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class AddingProductToShopingCartPageObject_005 extends Base {

	
	public AddingProductToShopingCartPageObject_005() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='collapse navbar-collapse navbar-ex1-collapse']")
	private WebElement blueBareWebElement;
	
	
	public void blueBareDisplayed() {
		blueBareWebElement.isDisplayed();
	}
	
	
	
	@FindBy(how = How.XPATH, using = "//a[text()='Tablets']")
	private WebElement clickOnTabletWebElement;
	
	
	public void clickingOnTablet() {
		try {
			clickOnTabletWebElement.click();
		}
		catch(ElementNotInteractableException e) {
			clickOnTabletWebElement.sendKeys(Keys.ENTER);
		}
	}
	
	
	
	
	@FindBy(how = How.XPATH, using = "//span[text()='Add to Cart']")
	private WebElement addToCartverificationWebElement;
	
	public void addToCartTextDisplayed() {
		addToCartverificationWebElement.isDisplayed();
	}
	
	
	
	@FindBy(how = How.XPATH, using = "//h4/a[text()='Samsung Galaxy Tab 10.1']")           
	private WebElement clicksOnItemNameWebElement;
	
	public void clickOnItemName() {
		
		try {
			clicksOnItemNameWebElement.click();          
		}
		catch(ElementNotInteractableException e) {
			clicksOnItemNameWebElement.sendKeys(Keys.ENTER);
		}
	}
	
	
	
	
	
	
	@FindBy(how = How.XPATH, using = "//div/div/div/div[@class='col-sm-4']")
	private WebElement itemBoxDetailsWebElement;
	
	public void itemDetailVerification() {
		itemBoxDetailsWebElement.isDisplayed();
	}
	
	
	
	
	
	@FindBy(how = How.XPATH, using = "//button[@id='button-cart']")
	private WebElement clickAddToTheCartWebElement;
	
	public void addingToCart() {
		try {
		clickAddToTheCartWebElement.click();
		}
		catch(ElementNotInteractableException e) {
			clickAddToTheCartWebElement.sendKeys(Keys.ENTER);
		}
		
	}
	
	
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageVerificationWebElement;
	
	public void successMessage() {
		successMessageVerificationWebElement.isDisplayed();
	}
	
	

	
	// Adding products to wish list 
	
	
	@FindBy(how = How.XPATH, using = "//button[@data-original-title='Add to Wish List']")
	private WebElement heartIconVerificationWebElement;
	
	public void heartIconVerification() {
		heartIconVerificationWebElement.isDisplayed();
	}
	
	
	@FindBy(how = How.XPATH, using = "//button[@data-original-title='Add to Wish List']")
	private WebElement mouseHoverWebElement;
	
	public void mouseHoveringOnheartIcon() {
		Actions action = new Actions(driver);
		action.moveToElement(mouseHoverWebElement).build().perform();
	}
	
	
	
	@FindBy(how = How.XPATH, using = "//button[@data-original-title='Add to Wish List']")
	private WebElement clickOnHeartIconWebElement;
	
	public void clickOnHeartIcon() {
		clickOnHeartIconWebElement.click();
	}
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement wishListSuccessMsgWebElement;
	
	public void wishListSuccessMasgVerificatio() {
		wishListSuccessMsgWebElement.isDisplayed();
	}
	
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-heart']")                          //"//a[@id='wishlist-total']//span[@class='hidden-xs hidden-sm hidden-md']")
	private WebElement clickOnWishListMenuWebElement;
	
	
	public void clickOnwishList() {
		clickOnWishListMenuWebElement.click();       //.sendKeys(Keys.ENTER);
	}
	
	
	@FindBy(how = How.XPATH, using = "//h2[text()='My Wish List']")
	private WebElement listOfitemVerificationWebElement;
	
	public void vericationOfListOFItemInWishList() {
		listOfitemVerificationWebElement.isDisplayed();
	}
	
	
	@FindBy(how = How.XPATH, using = "//button[@data-original-title='Add to Wish List']")
	private WebElement addingSameItemAgainToWishListWebElement;
	
	public void addingSameItemToWishList() {
		
		addingSameItemAgainToWishListWebElement.click();
	}
	
	
	
	//Removing Product from Wish List
	
	
	
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-times']")
	private WebElement wishListXbuttonVerificationWebElement;
	
	public boolean wishListXbuttonVerification() {
		boolean xButtonDisplayed = wishListXbuttonVerificationWebElement.isDisplayed();
		return xButtonDisplayed;
	}
	
	
	
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-times']")
	private WebElement clickOnXButtonWishListWebElement;
	
	public void removingItemFromWishList() {
		
		try {
			clickOnXButtonWishListWebElement.click();
		}
		catch(Exception e) {
			clickOnXButtonWishListWebElement.sendKeys(Keys.ENTER);
		}
	}
	
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement wishListRemovalMasgWebElement;
	
	public boolean removalSuccessMsgFromWishList() {
		
		boolean removalMsgDispalyed = wishListRemovalMasgWebElement.isDisplayed();
		
		return removalMsgDispalyed;
	}
	
	
	
	
	
	
	
	
	
}
