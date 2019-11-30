Feature: Save Address to My Account

Scenario: Save Address for Customer

Given User is on SignIn Page
Then User enters username and password and click on Sign IN 
|kk300@gmail.com |krish16|
Then User is on MyAccountPage
Then User Click on My Address button
Then User Clicks on Add a New Address button
Then User enters CustomerAddress and click on Save 
|TestAddress6|Manchester|4|87656|09897889|MyAddress6|
Then Validate the New Address by capturing Header
Then Close the Browser

