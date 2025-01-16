Feature: Contact Us
  Scenario: A User fills out the Contact Us Form
    Given I am on the Contact Us Page.
    And I enter my name as "John Doe", email as "j.doe@email.com", subject as "Cannot modify product quantity in cart." and message as "I am able to add a product to cart, and add it again to update the product quantity, however I cannot modify the product quantity in cart."
    And I upload a file from "C:\\payload\\screenshot.png".
    When I click the Submit Button
    Then Your details have been submitted successfully is visible
