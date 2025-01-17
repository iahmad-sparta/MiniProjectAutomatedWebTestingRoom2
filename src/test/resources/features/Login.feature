Feature: Login

  Scenario: A User is Trying to Login with a Correct Email Address and Password
    Given I am on the Login Page
    And I enter the email address "ziinkgaming8@gmail.com"
    And I enter the password "test"
    When I click the Login Button
    Then Logged in as Username is visible

Scenario: A User is Trying to Login with a Correct Email Address and Incorrect Password
    Given I am on the Login Page
    And I enter the email address "ziinkgaming8@gmail.com"
    And I enter the password "test1"
    When I click the Login Button
    Then The email or password is incorrect

  Scenario: A User is Trying to Logout
    Given I am logged in
    When I click the Logout Button
    Then I should be logged out

  Scenario: Register a User with an Existing Email
    Given I am on the Login Page
      And I enter the name "tester"
      And I enter the email "test@sky.com"
    When I click Signup
    Then The email address is already in use
