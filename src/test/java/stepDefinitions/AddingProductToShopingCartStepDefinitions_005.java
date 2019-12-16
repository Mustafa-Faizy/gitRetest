package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageObjects.AddingProductToShopingCartPageObject_005;
import utilities.Utility;

public class AddingProductToShopingCartStepDefinitions_005 extends Base {

	AddingProductToShopingCartPageObject_005 shoppingCartPageObject = new AddingProductToShopingCartPageObject_005();
	
	

@Given("^User should see the blue bar at the product section$")
public void user_should_see_the_blue_bar_at_the_product_section() throws Throwable {
    shoppingCartPageObject.blueBareDisplayed();
}


@Then("^User clicks on the desire product$")
public void user_clicks_on_the_desire_product() throws Throwable {
	Utility.screenshot(driver);
    shoppingCartPageObject.clickingOnTablet();
}


@And("^User should see label of 'Add to cart' under each product$")
public void user_should_see_label_of_Add_to_cart_under_each_product() throws Throwable {
    shoppingCartPageObject.addToCartTextDisplayed();
}

@When("^user clicks on the item$")
public void user_clicks_on_the_item() throws Throwable {
	Utility.screenshot(driver);
    shoppingCartPageObject.clickOnItemName();
}

@Then("^User should see the detailed list of the product on right side of the page$")
public void user_should_see_the_detailed_list_of_the_product_on_right_side_of_the_page() throws Throwable {
   shoppingCartPageObject.itemDetailVerification();
}

@And("^User clicks 'Add to Cart' button$")
public void user_should_see_blue_button_with_label_of_Add_to_Cart() throws Throwable {
	Utility.screenshot(driver);
  shoppingCartPageObject.addingToCart();
}

@Then("^User should see 'you have added NAME OF PRODUCT to your shoping cart' success message$")
public void user_should_you_have_added_NAME_OF_PRODUCT_to_your_shoping_cart_success_message() throws Throwable {
   shoppingCartPageObject.successMessage();
   Utility.screenshot(driver);
}
	
	
	
	
	
	
	
	
	// Adding product To Wish List

@Then("^User should see Haert icon at the top of the deatail page$")
public void user_should_see_Haert_icon_at_the_top_of_the_deatail_page() throws Throwable {

	shoppingCartPageObject.heartIconVerification();
   
}

@Then("^User should see 'Add to Wish List' message when hover the mouse over the icon")
public void user_hover_the_mouse_over_the_icon() throws Throwable {
    
	shoppingCartPageObject.mouseHoveringOnheartIcon();
	Utility.screenshot(driver);
}


@When("^User click on Haert icon$")
public void user_click_on_Haert_icon() throws Throwable {
    
	shoppingCartPageObject.clickOnHeartIcon();
	Utility.screenshot(driver);
}

@Then("^User should see 'you have added NAME OF ITEM to your Wish List' message$")
public void user_should_see_you_have_added_NAME_OF_ITEM_to_your_Wish_List_message() throws Throwable {
   
	shoppingCartPageObject.wishListSuccessMasgVerificatio();
   
}

@Then("^User click on Wish List menu$")
public void user_click_on_Wish_List_menu() throws Throwable {
   
	shoppingCartPageObject.clickOnwishList();
	Utility.screenshot(driver);
}

@Then("^User should see list of items$")
public void user_should_see_list_of_items() throws Throwable {
    
	shoppingCartPageObject.vericationOfListOFItemInWishList();

}

@When("^User add the same item to the Wish List$")
public void user_add_the_same_item_to_the_Wish_List() throws Throwable {
   
	shoppingCartPageObject.addingSameItemToWishList();
  
}

	
	
	
	
	
	//Removing product from Wish List


	
	
@Then("^User sould see Red X button for each item$")
public void user_sould_see_Red_X_button_for_each_item() throws Throwable {
    Assert.assertEquals(true, shoppingCartPageObject.wishListXbuttonVerification());
   Utility.screenshot(driver);
}


@When("^User clicks on Red X button$")
public void user_clicks_on_red_x_button() {
	
	shoppingCartPageObject.removingItemFromWishList();
}



@Then("^User Should see 'You have modified your wish list!' message$")
public void user_Should_see_You_have_modified_your_wish_list_message() throws Throwable {
    
	Assert.assertEquals(true, shoppingCartPageObject.removalSuccessMsgFromWishList());
 Utility.screenshot(driver);
}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
