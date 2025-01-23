#Feature: Add to Cart functionality
 # As a user of the OpenCart website
  #I want to add products to my cart
  #So that I can purchase them later

  #Background:
   # Given I am on the OpenCart homepage

  #Scenario: Add a single product to the cart
    #Given I search for "MacBook"
   # When I add the product "MacBook" to the cart
    #Then the cart should display "1 item(s)"

  #Scenario: Add multiple products to the cart
   # Given I search for "MacBook"
    #When I add the product "MacBook" to the cart
    #And I search for "iPhone"
    #And I add the product "iPhone" to the cart
    #Then the cart should display "2 item(s)"

  #Scenario: Add an out-of-stock product to the cart
   # Given I search for "Samsung Galaxy Tab"
   # When I add the product "Samsung Galaxy Tab" to the cart
    #Then I should see a message "The product is out of stock!"

  #Scenario Outline: Add various products to the cart
   # Given I search for "<product>"
    #When I add the product "<product>" to the cart
    #hen the cart should display "<expectedItems> item(s)"

    #Examples:
      #| product           | expectedItems |
      #| MacBook           | 1             |
      #| iPhone            | 2             |
      #| Canon EOS 5D      | 3             |
