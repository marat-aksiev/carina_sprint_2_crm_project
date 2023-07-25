@B29G11-246
Feature:User should be able to send messages by clicking on Message tab
  User Story: As a user, I should be able to send messages by clicking on Message tab
  AC:
  1. User should be able to send a message by filling in the mandatory fields.
  Mandatory fields:  'Message content & 'Recipient'.
  Error messages for mandatory fields:
  "The message title is not specified"
  "Please specify at least one person."

  2. The message delivery should be to 'All employees' by default.

  3. User should be able to cancel sending messages at any time before sending.
  Accounts: HR, Helpdesk, Marketing

Background: user is on the login page

@wip246
  Scenario Outline: Verify  user is be able to send a message by filling in the mandatory fields
    Given the user is logged in first scenario "<userTypes>"

    When user navigates to  message tab

  When user enters "<messageText>" in  message content field

  And  user clicks in the Recipient field on "Add persons, groups or department"

   And user adds the recipient from available options in the tooltip

    Then user clicks the Send button and should be able to send the message


    Examples:
      |userTypes|
      | HR |
      |Help Desk|
      |Marketing|

@wip2_246
  Scenario Outline: Verify that  user is not able to send a message when the "Message" field is empty
  Given the user is logged in second scenario "<userTypes>"
    When  user navigates to the Message tab and clicks on it
    When user leaves the Message field empty and  clicks  send button
    Then user should be able to see the error message "The message title is not specified"
    Examples:
      |userTypes|
      | HR |
      |Help Desk|
      |Marketing|
@wip3_246
  Scenario Outline:Verify that user is not able to send a message when the "Recipient" field is empty
    Given the user is logged in  third scenario "<userTypes>"
    When  user navigates to the Message tab and clicks on
    When user leaves the Recipient input box empty by clicking x button
    And user clicks a send button
    Then user should be able to see the error Message "Please specify at least one person" after clicking send button
    Examples:
      |userTypes|
      | HR |
      |Help Desk|
      |Marketing|
@wip4_246
  Scenario Outline:Verify that the message delivery should be to 'All employees' by default
    Given the user is logged in  forth scenario "<userTypes>"
    When  user clicks on  message tab
    Then "All employees" input text displays in the Recipient field by default
      Examples:
      |userTypes|
      | HR |
      |Help Desk|
      |Marketing|
  @wip5_246
Scenario Outline: Verify  user should be able to cancel sending messages at any time before sending
  Given the user is logged in  fifth scenario "<userTypes>"
  When user navigates to  message tab
  And user clicks on a message field and enters "<messageText>" in the message field
  When user clicks on the cancel button

  Then  user should be able to cancel sending message successfully
    Examples:
    |userTypes|
    | HR |
    |Help Desk|
    |Marketing|