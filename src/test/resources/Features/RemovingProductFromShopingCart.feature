Feature: Removing product from shoping cart

Background: 


Given User is on TekSchool page
And User Click on Test Environment link 
And User should see Test Environment page
When User click on myAccount menu on top if the page
And User click on login on myAccount menu
And User enter username 'teststudent@gmail.com' and password 'Tek@Test.com' in returning menu
And User click on login button
Then User should be loged in   

Then User should see the blue bar at the product section
Then User clicks on the desire product
And User should see label of 'Add to cart' under each product
When user clicks on the item 
Then User should see the detailed list of the product on right side of the page
And User clicks 'Add to Cart' button
Then User should see 'you have added NAME OF PRODUCT to your shoping cart' success message



@SDET_006
Scenario: User removing product from cart

When User clicks on shoping cart on top of the page
And User should see the Red X button for each item
When User clicks on Red X button 
And User should see 'Are you sure' message
Then User slects yes the item should be removed from shoping cart