Feature: Login features
This feature includes scenario that would validate the following feature.
1)Login as Admin
2)Login as lindia.anderson
3)Login with negative data

Background:
Given Iam able to navigate onto the login page

@Login
Scenario: Login as Admin
When I enter the username as "Admin"
And I enter the password as "admin123"
And I click on the login button
Then I should see the username as "welcome test1"

Scenario: Login as lindia.anderson
When I enter the username as "Admin"
And I enter the password as "admin123"
And I click on the login button
Then I should see the username as "welcome test1"

@InvalidLogin
Scenario: Login as Negative data
When I enter the username as "nirmala"
And I enter the password as "nirmala"
And I click on the login button
Then I should see the error message as "Invalid credentials"