Feature: Help Center Options

  Background:
    Given user is in login page
    When user Enters "fikkodoltu10@vusra.com" and "121212A"
    And click Login Button
    Then Home Page is visible
    Given User clicks Question mark icon
    Then Help Center options are popped up

  @Home
  Scenario: User visits help center
    Given User clicks visit help center option
    Then Help page opened in new tab

  @Home
  Scenario: User selects create widget option
    Given User clicks Create Widget Option
    Then Developers page opened in new tab

  @Home
  Scenario: User clicks a help center links
    Given User clicks About Link
    Then About page is opened in new tab
