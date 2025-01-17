Feature: Verify Product quantity in Cart
  Scenario: The user wants to view the quantity of products he has added to cart
  Given The user is in the home page.
  And The user has added an item to cart.
  When I click on cart.
  Then I should see the products that were added to cart.
  And I should see the product quantity in cart.

