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


Background: user is on the login page
 Scenario Outline: Verify user is logged in
   Given the user is logged in  as "<userTypes>"
   When user enters valid credentials
   Then user should be able to log in
Examples:
|userTypes|
   | HR |
   |Help Desk|
   |Marketing|




  Scenario: Verify  user is be able to send a message by filling in the mandatory fields

    When  user clicks message field

    And user enters "<messageText>" in  message content field

    And And user clicks in the Recipient field on "Add persons, groups or department"

    And user adds the recipient from available options in the tooltip

    And user clicks the Send button

    Then  user should be able to send the message

    And the message is successfully sent to the selected group of recipients


  Scenario: Verify that  user is not able to send a message when the "Message" field is empty
    When  user navigates to the Message tab and clicks on it
    When user leaves the Message field empty
    And user clicks  send button
    Then Then user should be able to see the error message "The message title is not specified"


  Scenario:Verify that user is not able to send a message when the "Recipient" field is empty

    When  user navigates to the Message tab
    And  user clicks on it
    When user leaves the Recipient input box empty
    And user clicks a send button
    Then user should be able to see the error Message "Please specify at least one person" after clicking send button


  Scenario:Verify that the message delivery should be to 'All employees' by default

    When  user clicks on  message tab
    Then "All employees" input text displays in the Recipient field by default

Scenario: Verify  user should be able to cancel sending messages at any time before sending

  When user clicks on a message field
  And  user enters "<messageText>" in the message field
  When user clicks on the cancel button
  Then Message tab is clickable
  And entered text is shown in the message field
  Then  user should be able to cancel sending message successfully