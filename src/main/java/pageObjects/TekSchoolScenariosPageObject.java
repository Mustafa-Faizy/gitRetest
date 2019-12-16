package pageObjects;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;


public class TekSchoolScenariosPageObject extends Base {

	
	public TekSchoolScenariosPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	
@FindBy(how = How.XPATH, using ="//span[text()='My Account']")
private WebElement myAccountWebElement;
	 
	
	
@FindBy(how = How.XPATH, using ="//a[text()='Register']")
private WebElement registerWebElement;



@FindBy(how = How.XPATH, using ="//a[text()='Login']")
private WebElement loginWebElement;
	
	

@FindBy(how = How.ID, using ="input-email")
private WebElement emailAddressFieldWebElement;
	


@FindBy(how = How.ID, using ="input-password")
private WebElement passwordFieldWebElement;



@FindBy(how = How.XPATH, using = "//input[@type='submit']")
private WebElement loginButtonWebElement;

// here we are making sure that we are logged in we getting the text.
@FindBy(how = How.XPATH, using ="//h2[text()='My Account']")
private WebElement myAccountTextWebElement;


// Writing action methods for WebElements we stored in this class object repository class.

// here just as part of verifications we use is displayed() method which return boolean
public void clickOnMyAccount() {
	try {
		boolean a = myAccountWebElement.isDisplayed();
		if (a == true) {
		myAccountWebElement.click();
		// or i can use Assertion instead of if condition 
		//Assert.assertEquals(true, myAccountWebElement.isDisplayed());
	  }                             // here it was not working with click method throws excepton so we suround it with try and catch block
	}								// and using sendeKeys() method 
	catch(ElementNotInteractableException e) {
		myAccountWebElement.sendKeys(Keys.ENTER);
	}
}



public void clickOnRegister () {
	try {
		registerWebElement.click();
	}
	catch(ElementNotInteractableException e) {
		registerWebElement.sendKeys(Keys.ENTER);
	}
}



public void clickOnLogin() {
	try {
	loginWebElement.click(); 
	}
	catch(ElementNotInteractableException e) {
		loginWebElement.sendKeys(Keys.ENTER);
	}
}



public void enterEmailAddress(String emailValue) {
	emailAddressFieldWebElement.sendKeys(emailValue.trim());
}




public void enterPassword(String passwordValue) {
	passwordFieldWebElement.sendKeys(passwordValue.trim());
}



public void clickOnLoginButton() {
	loginButtonWebElement.click();
}



public boolean verifyLoginToMyAccount() {
	boolean verificationPoint = myAccountTextWebElement.isDisplayed();
	
	return verificationPoint;
}





@FindBy(how = How.XPATH, using = "//input[@id='input-firstname']")
private WebElement firstNameFieldValue;


@FindBy(how = How.ID, using = "input-lastname")
private WebElement lastNameFieldValue;


@FindBy(how = How.ID, using = "input-email")
private WebElement emailiFieldValue;


@FindBy(how = How.ID, using = "input-telephone")
private WebElement telephoneFieldValue;



@FindBy(how = How.ID, using = "input-password")
private WebElement passwordFieldValue;


// i dont have step definition in feature file thats why we dont need it.
@FindBy(how = How.ID, using = "input-confirm")
private WebElement confirmPasswordFieldValue;




@FindBy(how = How.XPATH, using = "//input[@value='1' and @name='newsletter']")
private WebElement subscribeYesButton;





@FindBy(how = How.XPATH, using = "//input[@value='0' and @name='newsletter']")
private WebElement subscribeNoButton;






@FindBy(how = How.XPATH, using = "//input[@value='Continue']")
private WebElement continueButton;



@FindBy(how = How.XPATH, using = "//h1[text()='Your Account Has Been Created!']")
private WebElement accountCreatedConfirmationText;








// methods 

public void fillFirstName(String fisrtName) {
	firstNameFieldValue.sendKeys(fisrtName);
}



public void fillLastName (String lastName) {
	lastNameFieldValue.sendKeys(lastName);
}


public void fillEmail(String emailValue) {
	
	emailiFieldValue.sendKeys(emailValue);
}




public void fillPhone(String phoneValue) {
	
	telephoneFieldValue.sendKeys(phoneValue);
}





public void fillPassword(String password) {
	passwordFieldValue.sendKeys(password);
}







public void fillPasswordConfirmation(String passwordConfirmation) {
	confirmPasswordFieldValue.sendKeys(passwordConfirmation);
}






public void subscribeRadioButton(String yesOrNo) {
	
	if(yesOrNo.equalsIgnoreCase("yes")) {
		subscribeYesButton.click();
	}
	else {
		subscribeNoButton.click();
	}
	
	
}




public void clickOnContinue() {
	continueButton.click();
}





public boolean confirmatioMessage() {
	boolean confirmationText = accountCreatedConfirmationText.isDisplayed();
			return confirmationText;
}




	

	
	
	
	
}
