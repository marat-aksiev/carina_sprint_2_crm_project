@poll_feature
Feature: poll creation feature

  User Story:
  As a user, I should be able to create a poll by clicking on Poll tab under Activity Stream.
  Accounts are: hr, marketing, helpdesk

  Acceptance Criteria:
  1. The delivery should be to 'All employees' by default.
  2. User should be able to create a poll by adding questions and multiple answers.
  3. User should be able to select the “Allow multiple choice” checkbox.
  4. Mandatory fields: Message title, recipient, 1 question, 1 answer -
  Error message: "The message title is not specified"
  Error message: "Please specify at least one person."
  Error message: "The question text is not specified."
  Error message: "The question "........." has no answers."

  Background: User is already logged in
    Given user is on the login page

  Scenario: Verify delivery to 'All employees' by default
    When user navigates to 'poll' button
    And user clicks on poll button
    And user navigates to the delivery field of the poll
    Then user should see 'All employees' option by default

  Scenario Outline: Creation of a poll verification
    When user enters title in the title field
    And user enters a "<question>" text into the poll Question field
    And user enters an answers into the "<answer1>" field
    And user enters an answers into the "<answer2>" field
    And user clicks on SEND button
    Then user sees the created poll in the Activity Stream

    Examples:
      | question                | answer1 | answer2 |
      | What language to learn? | Java    | Python  |

Scenario: Verify that a user is able to select a checkbox 'Allow multiple choice'
  When user navigates to 'poll' button
  And user clicks on poll button
When user navigated to 'Allow multiple choice' checkbox
And user clicks on it
Then user is able to select “Allow multiple choice” option

