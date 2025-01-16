Feature: Contact Us
  Scenario: A User fills out the Contact Us Form
    Given I am on the Contact Us Page.
    And I enter my name, email, subject and message
    And I upload a file
    When I click the Submit Button
    Then Your details have been submitted successfully is visible
