Feature: Post options

  Background:
    Given user is in login page
    When user Enters "fikkodoltu8@vusra.com" and "121212A"
    And click Login Button
    Then Home Page is visible
    Given User clicks a post
    And post page is loaded

  @Home
  Scenario: User clicks a post menu
    Given user clicks menu icon
    Then menu options are popped up

  @Home
  Scenario: User wants to share post
    Given User clicks share icon
    Then Share page is popped up

  @Home
  Scenario: User likes a post
    Given User click like icon
    Then Like count is increased

  @Home
  Scenario: User saves a post
    Given User clicks post save button
    Then button named saved is visible

  @Home
  Scenario: User follows account
    Given User clicks follow button
    Then button text and color changed

  @Home
  Scenario: User Likes a comment
    Given user clicks like icon under a comment
    Then comment like count is increased