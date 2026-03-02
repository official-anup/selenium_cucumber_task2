Feature: Login Functionality

Scenario: Login User with incorrect email and password
Given Launch the browser
And navigate to URL
Then Verify home page is visible
And Click on SignUp/Login button
Then Verify Login to your account is visible
When Enter incorrect email address and password
And Click Login button
Then Verify error message Your email or password is incorrect! is visible
