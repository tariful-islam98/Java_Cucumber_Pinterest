Feature: Login User

  @Login
  Scenario Outline: Check login is successful with valid credentials
    Given user is in login page
    When user Enters "<Email>" and "<Password>"
    And click Login Button
    Then Home Page is visible

    Examples:
      | Email                 | Password |
      | fikkodoltu3@vusra.com | 121212A  |