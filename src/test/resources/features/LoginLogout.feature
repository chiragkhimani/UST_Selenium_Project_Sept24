Feature: Validate Login Functionality

  Background:
    Given user open website
    Then verify user is on login page

  @Smoke
  Scenario: Verify user can login with valid credentials
    When user login valid username and password
    Then verify user is on home page

  Scenario: Verify user cannot login with invalid credentials
    When user login with invalid credentials
    Then verify invalid login error message is displayed

  Scenario: Verify user can logout of the application
    When user login valid username and password
    Then verify user is on home page
    When user click on hamburger menu
    And click on logout link
    Then verify user is on login page