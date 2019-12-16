package pageObjects;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoginPageObject extends Base {
	
	
	public LoginPageObject() {
		
		PageFactory.initElements(driver, this);
		
	}
	
  // @FindBy this anotaion is part of pagefactory class that help us initialize the element
	
	@FindBy(how = How.XPATH, using = "//a[text()='Test Environment']")
	private WebElement testEnvironmentLink;
	
	
	
	@FindBy(how = How.XPATH, using = "//a[text()='Login to Class']")
	private WebElement loginToClassLink;
	
	
	@FindBy(how = How.ID,using="mc4wp_email")
	private WebElement subscribeEmailField;
	
	
	
	/**
	 * this method will click on testEnvironment link on tekschool page
	 */
	
	
	public void clickOnTestEnvironmentLink() {
		testEnvironmentLink.sendKeys(Keys.ENTER);
	}
	
	
	
	/**
	 * this method will click on login to class link on tekschool page
	 */
	public void clickOnLoginToClassLink() {
		loginToClassLink.sendKeys(Keys.ENTER);
	}
	
	
	/**
	 * this method will enter email value in subscribe email field in tekschool page
	 * @param emailValue
	 */
	
	public void sendValueToSubscribeEmailField(String emailValue) {
		subscribeEmailField.sendKeys(emailValue);
	}
	
	
	/**
	 * this method will return tekschool page title
	 * @return
	 */
	
	public String pageTitle() {
		String TekSchoolPageTitle = driver.getTitle();
				return TekSchoolPageTitle;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
