@12
Feature: As a user, I should be able to upload files and pictures to appreciation

  Background: User is already logged in
    Given user is on the login page

  Scenario Outline: Uploading Files and Images
    Given user enters valid credentials for user role "<role>"
    When user click to More  and selects Appreciation
    And user clicks on the upload files and images
    And user uploads files and images through the upload files and images button

    Examples:
      | role      |
      | hr        |
      | helpdesk  |
      | marketing |

  Scenario Outline: Inserting Files and Images into the Text
    Given user enters valid credentials for user role "<role>"
    When user click to More  and selects Appreciation
    And user clicks on the upload files and images
    And user uploads files and images through the upload files and images button
    Then user clicks on insert in text button

    Examples:
      | role      |
      | hr        |
      | helpdesk  |
      | marketing |


  Scenario Outline: User should be able to remove files and images from message box before sending
    Given user enters valid credentials for user role "<role>"
    When user click to More  and selects Appreciation
    And user clicks on the upload files button
    And user uploads files and images through the upload files&images button
    And user clicks on insert in text button
    Then user clicks on the x button
    Examples:
      | role      |
      | hr        |
      | helpdesk  |
      | marketing |