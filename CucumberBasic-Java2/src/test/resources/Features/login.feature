Feature: feature to test login functionality

  @E2E
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters valid username and password
    And clicks on button
    Then user is navigated to the home page

  @E2E
  Scenario: Check login is fail with invalid credentials
    Given user is on login page
    When user enters invalid username and password
    And clicks on button
    Then user is redirected to the login page
