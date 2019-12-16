package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RemovingProductFromShopingCartPageObject_006 extends Base  {

	
	
	public RemovingProductFromShopingCartPageObject_006() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(how =How.XPATH, using = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement clickOnShopingCartWebElement;
	
	public void clickingOnShpingCart() {
		clickOnShopingCartWebElement.click();
	}
	
	
	
	
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-danger btn-xs']")
	private WebElement redXverificationWebElement;
	
	public void XButtonVerification() {
		redXverificationWebElement.isDisplayed();
	}
	
	
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-danger btn-xs']")
	private WebElement clickOnRedXWebElement;
	
	public void clickingOnRedXbutton() {
		clickOnRedXWebElement.click();
	}
	
	
	
	
	@FindBy(how = How.XPATH, using = "//td[text()='x 1']")
	private WebElement areSureMsgVerrifacatioWebElement;
	
	public boolean areYouSureMesgVerification() {
	boolean verification = areSureMsgVerrifacatioWebElement.isDisplayed();
	return verification; 
	}
	
	
	
	@FindBy(how = How.XPATH, using = "//strong[text()='Total']")
	private WebElement clickOnYesButtonWebElement;
	
	public void clickOnYesButton() {
		
	clickOnYesButtonWebElement.click();
	}
	
	
	
	

	
	
	
	
	
	
	
}
