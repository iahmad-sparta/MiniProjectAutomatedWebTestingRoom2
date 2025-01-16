Feature:
  Scenario: Navigate to the Products page
  Given I am on the homepage
  When I click on the "Products" link in the navigation menu
  Then I should be redirected to the "Products" page
  And I should see a list of products

  Scenario: Verify product details on the Products page
  Given I am on the "Products" page
  Then each product should display: