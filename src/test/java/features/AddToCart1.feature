Feature: Add to Cart functionality
  As a user of the OpenCart website
  I want to add products to my cart
  So that I can purchase them later

  Background:
    Given I am on the OpenCart homepage

  Scenario: Add a single product to the cart
    Given I search for "MacBook"
    When I add the product "MacBook" to the cart
    Then the cart should display "1 item(s)"
    
    
    
    