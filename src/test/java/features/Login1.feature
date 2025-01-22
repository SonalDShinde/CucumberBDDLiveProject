Feature: 

  Scenario: Login with valid credentials
    Given I have the user data from "src/test/resources/testData/loginData.json"
    When I log in using username "testuser1" and password
    Then I should see a successful login message
