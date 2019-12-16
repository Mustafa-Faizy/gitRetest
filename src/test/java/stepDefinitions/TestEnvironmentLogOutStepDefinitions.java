package stepDefinitions;

import core.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.TestEnvironmentLogOutPageObject;
import utilities.Utility;

public class TestEnvironmentLogOutStepDefinitions extends Base {

	TestEnvironmentLogOutPageObject abc = new TestEnvironmentLogOutPageObject();
	
	
	  

		@When("^User clicks on myAccount menu$")
		public void user_clicks_on_myAccount_menu() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			abc.clickOnMyAccountMenu();
			
		} 
		

		@And("^User clicks on log out button$")
		public void user_clicks_on_log_out_button() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    abc.clickOnLogoutOption();
		    Utility.screenshot(driver);
		}

		@When("^User logs out 'You have been logged off your account\\. It is now safe to leave the computer\\. Your shopping cart has been saved, the items inside it will be restored whenever you log back into your account' message should display$")
		public void user_logs_out_You_have_been_logged_off_your_account_It_is_now_safe_to_leave_the_computer_Your_shopping_cart_has_been_saved_the_items_inside_it_will_be_restored_whenever_you_log_back_into_your_account_message_should_display() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			
			abc.myAccountverificationLogout();
		}

		@Then("^myAcoount must have 'Register' and 'Login' options$")
		public void myacoount_must_have_Register_and_Login_options() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			Utility.screenshot(driver);
			abc.myAccountverificationLogout();
		   
		}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
