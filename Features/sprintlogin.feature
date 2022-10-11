# Feature file used to provide scenarios

Feature: HRM Application
Scenario: Verify user is able to login with valid user id and password
Given browser is open and application is in login page
When user enters user name and password
Then home page is displayed 

Scenario: Apply for leave
Given browser is open and application is in login page
When user enters user name and password
Then home page is displayed 
Then able to apply for leave 

Scenario: Search for admin
Given browser is open and application is in login page
When user enters user name and password
Then home page is displayed 
Then able to search for admin 