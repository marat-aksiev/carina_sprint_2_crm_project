@poll_feature
@B29G11-285
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

  @B29G11-334
  Scenario Outline: Verify delivery to 'All employees' by default
    When user enters valid credentials for user role "<role>"
    And user clicks on poll button
    Then user should see All employees option by default
    Examples:
      | role      |
      | hr        |
      | helpdesk  |
      | marketing |

  @B29G11-335
  Scenario Outline: Creation of a poll verification
    When user enters valid credentials for user role "<role>"
    And user clicks on poll button
    And user enters "<title>" in the title field
    And user enters a "<question>" text into the poll Question field
    And user enters an answers into the "<answer1>" and "<answer2>" fields
    And user clicks on SEND button
    Then user sees the created poll in the Activity Stream

    Examples:
      | role      | title                | question                | answer1 | answer2 |
      | hr        | Programming Language | What language to learn? | Java    | Python  |
      | helpdesk  | Programming Language | What language to learn? | Java    | Python  |
      | marketing | Programming Language | What language to learn? | Java    | Python  |

  @B29G11-336
  Scenario Outline: Verify that a user is able to select a checkbox 'Allow multiple choice'
    When user enters valid credentials for user role "<role>"
    And user clicks on poll button
    And user clicks on Allow multiple choice option
    Then user is able to select Allow multiple choice option

    Examples:
      | role      |
      | hr        |
      | helpdesk  |
      | marketing |

  @B29G11-337
  Scenario Outline: Verify error message 'The message title is not specified'
    When user enters valid credentials for user role "<role>"
    And user clicks on poll button
    And user enters a "<question>" text into the poll Question field
    And user enters an answers into the "<answer1>" field
    And user clicks on SEND button
    Then user sees an error message The message title is not specified

    Examples:
      | question                | answer1 | role      |
      | What language to learn? | Java    | hr        |
      | What language to learn? | Java    | helpdesk  |
      | What language to learn? | Java    | marketing |

  @B29G11-338
  Scenario Outline: Verify error message 'Please specify at least one person'
    When user enters valid credentials for user role "<role>"
    And user clicks on poll button
    And user enters "<title>" in the title field
    And user enters a "<question>" text into the poll Question field
    And user enters an answers into the "<answer1>" field
    And user removes All employees option
    And user clicks on SEND button
    Then user sees an error message Please specify at least one person

    Examples:
      | title                | question                | answer1 | role      |
      | Programming Language | What language to learn? | Java    | hr        |
      | Programming Language | What language to learn? | Java    | helpdesk  |
      | Programming Language | What language to learn? | Java    | marketing |

@B29G11-339
  Scenario Outline: Verify error message 'The question text is not specified.'
    When user enters valid credentials for user role "<role>"
    And user clicks on poll button
    And user enters "<title>" in the title field
    And user enters an answers into the "<answer1>" field
    And user clicks on SEND button
    Then user sees an error message The question text is not specified

    Examples:
      | title                | answer1 | role      |
      | Programming Language | Java    | hr        |
      | Programming Language | Java    | helpdesk  |
      | Programming Language | Java    | marketing |

  @B29G11-340
  Scenario Outline: Verify error message 'The question ... has no answers'
    When user enters valid credentials for user role "<role>"
    And user clicks on poll button
    And user enters "<title>" in the title field
    And user enters a "<question>" text into the poll Question field
    And user clicks on SEND button
    Then user sees an error message The question "<question>" has no answers.

    Examples:
      | title                | question                | role      |
      | Programming Language | What language to learn? | hr        |
      | Programming Language | What language to learn? | helpdesk  |
      | Programming Language | What language to learn? | marketing |