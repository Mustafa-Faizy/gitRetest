package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TestEnvironmentLogOutPageObject extends Base {
	
	public TestEnvironmentLogOutPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(how = How.XPATH, using = "//span[text()='My Account']")
	private WebElement myAccountmenueWebElement;

	
	
	
	@FindBy(how = How.XPATH, using = "//ul/li/a[text()='Logout']")
	private WebElement logoutButtonWebElement;
	
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='content']/p")
	private WebElement textVerification;
	
	
	
	
	@FindBy(how = How.XPATH, using = "//span[text()='My Account']")
	private WebElement myAccountmenueVerificationWebElement;

	
	
	
	
	public void clickOnMyAccountMenu() {
		myAccountmenueWebElement.click();
	}
	
	
	
	
	public void clickOnLogoutOption() {
		logoutButtonWebElement.click();
	}
	
	
	
	public void textVerify() {
		
		boolean t = textVerification.isDisplayed();
		if(t==true) {
			
		}
	}
	
	
	
	
	public void myAccountverificationLogout() {
		myAccountmenueVerificationWebElement.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
