Feature: Search for a product

  Scenario: Search for a product
    Given I am on the Products page
    When I enter "T-shirt" into the search bar
    And I click the "Search" button
    Then I should see products related to "T-shirt"