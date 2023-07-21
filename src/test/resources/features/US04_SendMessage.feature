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

  Background:
    Given User is on the login page


  Scenario Outline: Verify the HR user is be able to send a message by filling in the mandatory fields
    Given user is logged in with "<role>"  credentials
    When  user clicks on the message field

    And user enters "<text>" in the message content field

    And And user clicks in the "Recipient" field on "Add persons, groups or department"

    And user adds the "<recipient>" from available options in the tooltip

    And user clicks the "Send" button

    Then  user should be able to send a message

    And the message is successfully sent to a selected group of recipients

    Examples:
      | text        | recipient      |
      | Hello World | All recipients |

  Scenario: Verify that  user is not able to send a message when the "" field is empty
    Given user is logged in with "<role>"  credentials
    When  user navigates to the "Message" tab and clicks on it
    When user leaves the "Message" field empty
    And user clicks the "<Send>" button
    Then Then user should be able to see the error message "<The message title is not specified>"

  Scenario:Verify that user is not able to send a message when the "Recipient" field is empty
    Given user is logged in with "<role>"  credentials
    When  user navigates to the "Message" tab
    And  user clicks on it
    When user leaves the "Recipient" input box empty
    And user clicks the "Send" button
    Then user should be able to see the error message "Please specify at least one person" after clicking send button

Scenario: