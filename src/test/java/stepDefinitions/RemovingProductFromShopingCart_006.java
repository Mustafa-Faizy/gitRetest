package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.RemovingProductFromShopingCartPageObject_006;
import utilities.Utility;

public class RemovingProductFromShopingCart_006 extends Base {

	RemovingProductFromShopingCartPageObject_006 removingProduct = new RemovingProductFromShopingCartPageObject_006();
	
	
	
	
	
	@Given("^User clicks on shoping cart on top of the page$")
	public void user_clicks_on_shoping_cart_on_top_of_the_page() throws Throwable {
	  
		removingProduct.clickingOnShpingCart();
		
	  
	}

	@And("^User should see the Red X button for each item$")
	public void user_should_see_the_Red_X_button_for_each_item() throws Throwable {
		Utility.screenshot(driver);
		removingProduct.XButtonVerification();
	 
	}
//
//	@When("^User clicks on Red X button$")
//	public void user_clicks_on_Red_X_button() throws Throwable {
//	  
//		removingProduct.clickingOnRedXbutton();
//	
//	}

	@And("^User should see 'Are you sure' message$")
	public void user_should_see_Are_you_sure_message() throws Throwable {
	  Utility.screenshot(driver);
		Assert.assertEquals(true, removingProduct.areYouSureMesgVerification());
	    
	}

	@Then("^User slects yes the item should be removed from shoping cart$")
	public void user_slects_yes_the_item_should_be_removed_from_shoping_cart() throws Throwable {
	  
		removingProduct.clickOnYesButton();
	    
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
