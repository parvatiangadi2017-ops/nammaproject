Feature: Login Functionality

  Scenario: Login with valid credentials
    Given User launches the browser and opens the login page
    When User enters a valid Email ID
    And User enters a valid Password
    And User clicks on the Login button
    Then User should be logged in successfully