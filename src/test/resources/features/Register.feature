Feature: Register

  Background:
    Given I am on the Login Page
      And I enter the name "tester"
      And I enter the email "test8@sky.com"
    When I click Signup
    Then I go to the Signup Page



  Scenario: Registering a New User
    Given I am on the Singup Page
    And I fill in the personal information
    And I fill in the address information
    When I click Create Account
    Then The account has been created