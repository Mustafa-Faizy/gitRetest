Feature: Adding Product to shoping cart


Background: 
Given User is on TekSchool page
And User Click on Test Environment link 
And User should see Test Environment page
When User click on myAccount menu on top if the page
And User click on login on myAccount menu
And User enter username 'teststudent@gmail.com' and password 'Tek@Test.com' in returning menu
And User click on login button
Then User should be loged in   
And User should see the blue bar at the product section
Then User clicks on the desire product
And User should see label of 'Add to cart' under each product
When user clicks on the item 
Then User should see the detailed list of the product on right side of the page
Then User should see Haert icon at the top of the deatail page
And User should see 'Add to Wish List' message when hover the mouse over the icon
When User click on Haert icon
And User click on Wish List menu
And User should see list of items

@SDET_005
Scenario: Shopping cart

When User should see the blue bar at the product section
Then User clicks on the desire product
And User should see label of 'Add to cart' under each product
When user clicks on the item 
Then User should see the detailed list of the product on right side of the page
And User clicks 'Add to Cart' button
Then User should see 'you have added NAME OF PRODUCT to your shoping cart' success message



@SDET_007
Scenario: Adding product to Wish List

Then User should see Haert icon at the top of the deatail page
And User should see 'Add to Wish List' message when hover the mouse over the icon
When User click on Haert icon
Then User should see 'you have added NAME OF ITEM to your Wish List' message
And User click on Wish List menu
And User should see list of items
When User add the same item to the Wish List


@SDET_008
Scenario: Removing item from wish list

Then User sould see Red X button for each item
When User clicks on Red X button
Then User Should see 'You have modified your wish list!' message






























