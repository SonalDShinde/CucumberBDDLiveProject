Feature: Login with Valid Credentials

  Scenario: Sucessful Login With Valid Credentials
    Given The user navigates to login page
    When user enters email as "sonal123@gmail.com" and password as "sonal123"
    And the user clicks on login button
    Then the user should be redirected to the MyAccount page
    
  
  
  
