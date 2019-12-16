package stepDefinitions;


import org.testng.Assert;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageObjects.LoginPageObject;
import utilities.Utility;

public class CanvasLoginPageStepDefinitions extends Base  {

	
	LoginPageObject loginpage;



@When("^User click on Login button on top of the page$")
public void user_click_on_Login_button_on_top_of_the_page() throws Throwable {
	 // Write code for clicking on Login to class
	loginpage = new LoginPageObject();
	Utility.screenshot(driver);
	loginpage.clickOnLoginToClassLink();
}



@Then("^User should see Canvas Login Page$")
public void user_should_see_Canvas_Login_Page() throws Throwable {
	
	// verify the title of canvas page
	
	Assert.assertEquals(driver.getTitle(), "Log In to Canvas");
	Utility.screenshot(driver);
}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
