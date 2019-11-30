Feature: Save Address to My Account Using Maps 

Scenario: Save Address for Customer Using Maps For Test 

	Given User is on SignIn PageMaps 
	Then User enters username and password and click on Sign INMaps 
	    |username|password|
		|kk300@gmail.com |krish16|
	Then User is on MyAccountPageMaps 
	Then User Click on My Address buttonMaps 
	Then User Clicks on Add a New Address buttonMaps 
	Then User enters CustomerAddress and click on SaveMaps 
		|Address|City|State|Postcode|MobilePhone|AddressAlias|
		|TestAddress12|Manchester|4|87656|09897889|MyAddress14|
		|TestAddress13|Manchester|4|87656|09897889|MyAddres15|
		|TestAddress14|Manchester|4|87656|09897889|MyAddress16|
		|TestAddress15|Manchester|4|87656|09897889|MyAddress17|
	Then Close the BrowserMaps 
	
