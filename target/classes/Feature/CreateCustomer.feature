Feature: Create Customer 

Scenario Outline: Create New Customer for Automation Website

Given user is on websiteHomePage
When User clicks on SignIn link
Then Enter the new "<emailID>" and click on Create Account
Then Select Title
Then select "<BirthDay>" , "<BirthMonth>" , "<BirthYear>" 
Then Enter "<FirstName>" , "<LastName>" , "<Password>" 
Then Enter Address "<Address>" , "<City>" , "<State>" , "<Postcode>" , "<MobilePhone>"
Then Click on Register
Then Verify Account Name "<FirstName>" , "<LastName>"
Then close the browser

Examples: 
      |emailID|FirstName|LastName|Password|BirthDay|BirthMonth|BirthYear|Address|City|State|Postcode|MobilePhone| 
      |kl14@gmail.com|KK|KJ|krish16|10|3|1989|TestAddress|Manchester|1|88997|0987878778|
      |kl15@gmail.com|KK|KJ|krish16|10|5|1987|TestAddress1|Manchester|1|88997|0987878778|