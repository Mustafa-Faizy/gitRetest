package stepDefinitions;


import org.testng.Assert;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageObjects.LoginPageObject;

public class LoginStepDifinitions extends Base {

	
	
// Declare loginPAgeObject obj
	
	LoginPageObject loginpage;
	
	
	
	/**
	 * this mthod will open tekschool page 
	 * and verify title
	 * @throws Throwable
	 */

@Given("^User is on TekSchool page$")
public void user_is_on_TekSchool_page() throws Throwable {
  Base.initializeDriver();
  loginpage = new LoginPageObject();
  
  // check for title
  String expectedTitle = "TEK School – Knowledge is power";
   
Assert.assertEquals(loginpage.pageTitle(), expectedTitle);
   
}




/**
 * this method will click on test environment link
 * @throws Throwable
 */

@When("^User Click on Test Environment link$")
public void user_Click_on_Test_Environment_link() throws Throwable {
	 loginpage = new LoginPageObject();
	 loginpage.clickOnTestEnvironmentLink();
    
}



/**
 * this method will verify testenvironment title
 * @throws Throwable
 */

@Then("^User should see Test Environment page$")
public void user_should_see_Test_Environment_page() throws Throwable {
    
	//Assert.assertEquals(driver.getTitle(),"TEK SCHOOL");
	  
}


































	
}
