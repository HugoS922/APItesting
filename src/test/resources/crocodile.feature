Feature: k6 user login

  Scenario: user should be able to login with valid credentials

  @datadriven
  Scenario Outline:
    Given The user is on Login page
    When The user enters a username "<users>"
    And the user enters a password "<password>"
    Then The user should be logged in successfully
    Examples:
      | users           | password                     |
      | hugo96sa        | 73223294                     |
      | LosJucumaris123 | LosJucumarisJalaUniversity34 |
