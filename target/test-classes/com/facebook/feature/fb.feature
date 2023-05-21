Feature: validate the functionality of facebook social media application
Scenario: facebook login page
Given user lanch facebook application
When user enter the id in the username field
And user enter password in the password field
Then user click the login butten it is redirect to home page 


Scenario: home page
When user click profile button on profile field
Then user click logout button it is redirect to login page

