Feature: Profile Sharing Options

  Background:
    Given user is in login page
    When user Enters "fikkodoltu4@vusra.com" and "121212A"
    And click Login Button
    Then Home Page is visible
    Given user clicks profile icon
    And clicks share button
    Then Share modal is displayed


  @Home
  Scenario Outline: user shares profile
    Given user clicks email input field
    And types the "<email>" address
    And selects contact to share
    And writes "<message>" to share
    And clicks send button
    Then user is returned to share modal

    Examples:
      | email                | message |
      | abir0dhaka@gmail.com | Hello   |


  #TC_4.6.2
  @Home
  Scenario: Share profile using Facebook
    Given user clicks Fb button
    Then Fb window is opened

  @Home
  Scenario: Share profile using Twitter
    Given user clicks Twitter button
    Then Twitter window is opened