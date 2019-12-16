Feature: Tek School Scenarios

Background: 
Given User is on TekSchool page
And User Click on Test Environment link 
And User should see Test Environment page


@SDET_003
Scenario: SDET2019AUG_SDET_003_Execution

When User click on myAccount menu on top if the page
And User click on login on myAccount menu
And User enter username 'teststudent@gmail.com' and password 'Tek@Test.com' in returning menu
And User click on login button
Then User should be loged in   
 
 
 
 @SDET_003_SO
 Scenario Outline: SDET2019AUG_SDET_003_Execution with multiple user and password
 
When User click on myAccount menu on top if the page
And User enter username '<username>' and password '<password>' in returning menu
And User click on login button
Then User should be loged in   

Examples: 
|username|password|
|teststudent@gmail.com|Tek@Test.com|
|tekschool001@gmail.com|testtest|
|testdata@gmail.com|testdata|
  
  
  
  
  @SDET_RF
  Scenario: SDET2019AUG_SDET_Register_Form_Test
  
  When User click on myAccount menu on top if the page
  And User click on register on myAccount menu
  And User fill register form with below information
  #Firstname|LastName|emai|phone|password|
  |Jack|Don|jack@gmail.com|1234567890|test123|
  And User click on 'no' radio button for subscribe
  And User click on continue button
  Then User should see 'Your Account Has Been Created!'
  
  
  
  
  
  
  
    @SDET_RF_SO
   Scenario Outline: SDET2019AUG_SDET_Register_Form_Test
  
  When User click on myAccount menu on top if the page
  And User click on register on myAccount menu
  And User fill register form with below information
  #Firstname|LastName|emai|phone|password|
  |Jack|Don|<email>|1234567890|test123|
  And User click on '<radioButton>' radio button for subscribe
  And User click on continue button
  Then User should see 'Your Account Has Been Created!'
  
  Examples:
  
  |email|radioButton|
  |asdf@gmail.com|yes|
  |gdhhd@gmail.com|no|
  
  
  
  
  
  
  
  
  
  #DataBase
  
    @SDET_RF_DBV
  Scenario: SDET2019AUG_SDET_Register_Form_Test
  
  When User click on myAccount menu on top if the page
  And User click on register on myAccount menu
  And User fill register form with below information
  #Firstname|LastName|emai|phone|password|
  |Jack|Don|jo.fowler@sakilacustomer.org|1234567890|test123|
  And User click on 'no' radio button for subscribe
  And User click on continue button
  Then User should see 'Your Account Has Been Created!'
  When User connects to DataBase
  And User sends query 'select * from public.customer where email='jo.fowler@sakilacustomer.org''
  Then User verify account is created with email 'jo.fowler@sakilacustomer.org'
  
  
  
  
  
  
  
  
  
  
#  jo.fowler@sakilacustomer.org
#vickie.brewer@sakilacustomer.org
#mattie.hoffman@sakilacustomer.org
#terry.carlson@sakilacustomer.org
#maxine.silva@sakilacustomer.org
#irma.pearson@sakilacustomer.org
#mabel.holland@sakilacustomer.org
#marsha.douglas@sakilacustomer.org
#myrtle.fleming@sakilacustomer.org
#lena.jensen@sakilacustomer.org
#christy.vargas@sakilacustomer.org
  
  
  
  
  
  
  
  
  
  
  
  
  
  