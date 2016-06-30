Feature: Login and logout functionality of OrangeHRM

Scenario: Verify login functionality

Given the browser is launched and we navigate to the orangehrm page
When  we enter the username and password
And click on the login button
Then it should display welcome admin msg 


Scenario: Verify logout functionality

When we click on welcome admin
And click on logout
Then it should navigate to the loginpage
