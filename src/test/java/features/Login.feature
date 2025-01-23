Feature: Login with Valid Credentials

  @sanity
  Scenario: Sucessful Login With Valid Credentials
    Given The user navigates to login page
    When user enters email as "sonal123@gmail.com" and password as "sonal123"
    And the user clicks on login button
    Then the user should be redirected to the MyAccount page

  Scenario Outline: Sucessful Login With Valid Data Set Credentials
    Given The user navigates to login page
    When user enters email as "<email>" and password as "<password>"
    And the user clicks on login button
    Then the user should be redirected to the MyAccount page

    Examples: 
      | email                     | password |
      | sonal123@gmail.com        | sonal123 |
      | shinde123@gmail.com       | shinde123|

      