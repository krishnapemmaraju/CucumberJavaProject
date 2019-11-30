Feature: Login Action

############# WITH OUT EXAMPLES KEYWORD #####################
#Scenario: AutomationDemoPractice_LoginTest

#Given I am already on Login Page 
#When Title is My Store 
#Then User enters valid "kk300@gmail.com" and User enters valid "krish16" 
#And User clicks on Login button 
#And User is on Home Page


########### With EXAMPLE KEYWORD ####################

Scenario Outline: AutomationDemoPractice_LoginTest

Given I am already on Login Page 
When Title is My Store 
Then User enters valid "<username>" and User enters valid "<password>" 
And User clicks on Login button 
And User is on Home Page
Then Close the browser

Examples: 
    | username | password |
    | kk300@gmail.com | krish16 |
    | kk301@gmail.com | krish16 |