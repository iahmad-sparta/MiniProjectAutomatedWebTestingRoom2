Feature: Add product to cart
  Scenario: User adds product to cart
    Given I am on the products page
    And I select a Blue Top

    When I click add to cart
    Then I should see a popup message showing that the product has been added to cart.
    And I can click continue shopping.

    Given The user has added a second item to cart
    And I select a Men Tshirt.
    When I click add to cart
    Then I should be able to view the cart

    Given The user wants to view the cart.
    And Is in the products page.
    When I click the Cart from the navigation menu.
    Then I should see the products that were added to the cart