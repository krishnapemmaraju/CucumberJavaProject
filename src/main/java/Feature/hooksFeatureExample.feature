Feature: Hooks Feature in Cucumber 

Scenario Outline: Hooks Feature in Cucumber

Given User is on LoginPage
When User Enters valid userName and Password and click SingIN
Then User Should be on MyAccountPage
Then Click on MyPersonalInformation button
Then User should be on "<username>" , "<password>" MyPersonal Information Page

Examples:
   |username|password|
   |test1|test2|
   |test3|test4|