Feature: k6 user login
  Scenario: user should be able to login with valid credentials
    Given The user is on Login page
    When The user enters valid credentials
    Then The user should be logged in successfully
