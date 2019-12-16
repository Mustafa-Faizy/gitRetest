Feature: Log out from test environment

Background: 
Given User is on TekSchool page
And User Click on Test Environment link 
And User should see Test Environment page
When User click on myAccount menu on top if the page
And User click on login on myAccount menu
And User enter username 'teststudent@gmail.com' and password 'Tek@Test.com' in returning menu
And User click on login button
Then User should be loged in   
 
 @testEnvironment
 Scenario: Loging out from test environment
 When User clicks on myAccount menu
 And User clicks on log out button
 When User logs out 'You have been logged off your account. It is now safe to leave the computer. Your shopping cart has been saved, the items inside it will be restored whenever you log back into your account' message should display
 Then myAcoount must have 'Register' and 'Login' options 
 