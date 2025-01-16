Feature: Cart

  Scenario: A user is placing an order but is not registered
    Given I am the proceed page
    And I have a product in the cart
    When I click the Register/Login button
    And I get the popup 'ACCOUNT CREATED!'
    And I click the cart button
    And I click the checkout button
    And I verify details
    And I click place order
    Then I enter my payment details
    And I click pay and confirm order

  Scenario: A user is placing an order after they have registered

    Given I am on the signup page
    And I have filled in all the details
    When I get the popup 'ACCOUNT CREATED'
    And I click the cart button
    And I click the checkout button
    And I verify details
    And I click place order
    Then I enter my payment details
    And I click pay and confirm order

  Scenario: A user is placing an order after they have logged in

    Given I am on the Signup/Login button
    And I have filled the email and password in
    And I click the login button
    When I add products to the cart
    And I click the checkout button
    And I verify details
    And I click place order
    Then I enter my payment details
    And I click pay and confirm order