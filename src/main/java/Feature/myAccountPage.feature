Feature: Validate My Account Feature

Scenario: Validate My Account Feature

Given User already logged on to homepage
When Title is My account - My Store
Then User clicks on My Personal Information button
Then Extract the First Name and LastName