Feature: Cart

  Scenario Outline: A user is placing an order but is not registered
  //Given I am the proceed page
  //And I have a product in the cart
  //When I click the Register/Login button
  //And I get the popup 'ACCOUNT CREATED!'
    And I click the cart button
    And I click the checkout button
    And I verify details "<name>" "<address>" "<postcode>" "<country>" "<phone>"
    And I click place order
    Then I enter my payment details "<name>" "<cardNumber>" "<expiryMonth>" "<expiryYear>" "<cvv>"
    And I click pay and confirm order
    Examples:
      | name             | address               | postcode                     | country       | phone| cardNumber      | expiryMonth | expiryYear | cvv |
      | Mr. Robert Helps | 12 grimthorpe terrace | Leeds West yorkshire LS6 3JS | United States | 0123 | 4111111111111111| 12          | 2025       | 123 |




  Scenario Outline: A user is placing an order after they have registered

  //Given I am on the signup page
  //And I have filled in all the details
  //When I get the popup 'ACCOUNT CREATED'
    And I click the cart button
    And I click the checkout button
    And I verify details "<name>" "<address>" "<postcode>" "<country>" "<phone>"
    And I click place order
    Then I enter my payment details "<name>" "<cardNumber>" "<expiryMonth>" "<expiryYear>" "<cvv>"
    And I click pay and confirm order
    Examples:
      | name             | address               | postcode                     | country       | phone| cardNumber      | expiryMonth | expiryYear | cvv |
      | Mr. Robert Helps | 12 grimthorpe terrace | Leeds West yorkshire LS6 3JS | United States | 0123 | 4111111111111111| 12          | 2025       | 123 |




  Scenario Outline: A user is placing an order after they have logged in

    Given I am on the Login Page
    And I enter the email address "ziinkgaming8@gmail.com"
    And I enter the password "test"
    And I click the Login Button
    When I add products to the cart
    And I click the checkout button
    And I verify details "<name>" "<address>" "<postcode>" "<country>" "<phone>"
    And I click place order
    Then I enter my payment details "<name>" "<cardNumber>" "<expiryMonth>" "<expiryYear>" "<cvv>"
    And I click pay and confirm order
    Examples:
      | name             | address               | postcode                     | country       | phone| cardNumber      | expiryMonth | expiryYear | cvv |
      | Mr. Robert Helps | 12 grimthorpe terrace | Leeds West yorkshire LS6 3JS | United States | 0123 | 4111111111111111| 12          | 2025       | 123 |

