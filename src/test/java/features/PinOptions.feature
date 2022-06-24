Feature: Pin Options

  Background:
    Given user is in login page
    When user Enters "fikkodoltu7@vusra.com" and "121212A"
    And click Login Button
    Then Home Page is visible
    Given User clicks Plus icon
    Then Pin options are popped up

  @Home
  Scenario: User selects Create Pin Option
    Given User clicks create pin option
    Then Create pin page is opened

  @Home
  Scenario: User selects get browser extension option
    Given User clicks get browser option
    Then Extension tab is opened