Feature: Test category tabs to get to women dresses


  Scenario: A user is trying to view a category of products

    Given I am on the homepage
    And I click on the category 'Women'
    When I click on Dress
    Then A category page has the text 'WOMEN - DRESS PRODUCTS'