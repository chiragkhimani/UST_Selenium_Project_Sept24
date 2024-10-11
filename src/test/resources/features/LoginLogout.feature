Feature: Validate Login Functionality

  Background:
    Given user open website
    Then verify user is on login page

  @Smoke
  Scenario: Verify user can login with valid credentials
    When user login with username "admin" and password "admin123"
    Then verify user is on home page

  Scenario Outline: Verify user cannot login with invalid credentials1
    When user login with username "<username>" and password "<password>"
    Then verify invalid login error message is displayed

    Examples:
      | username | password         |
      | invalid  | invalid123       |
      | admin    | invalid123       |
      | admin    | ADMIN123         |
      | admin    | adminonetwothree |


  Scenario: Verify user can logout of the application
    When user login with username "admin" and password "admin123"
    Then verify user is on home page
    When user click on hamburger menu
    And click on logout link
    Then verify user is on login page

  Scenario: Verify list usernames displays on Login Page
    Then verify list of below username displays on login page
      | standard_user34643564   | standard_user34643564   |
      | locked_out_user         | locked_out_user         |
      | problem_user            | problem_user            |
      | performance_glitch_user | performance_glitch_user |
      | error_user              | error_user              |
      | visual_user             | visual_user             |