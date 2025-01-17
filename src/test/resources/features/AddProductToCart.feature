Feature: Add product to cart
  Scenario: User adds product to cart
    Given I am on the products page
    And I select a Blue Top
    When I click add to cart
    Then I should see a popup message showing that the product has been added to cart.
    And I can click continue shopping.

    Given I am on the products page
    When I click on cart
    Then I should be able to view the cart