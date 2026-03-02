Feature: Login functionality

Scenario: User should be able to login with valid credentials

Given Open browser
And Go to url
When User enter data in username and password
And click on login button
Then user should redirect to home page
