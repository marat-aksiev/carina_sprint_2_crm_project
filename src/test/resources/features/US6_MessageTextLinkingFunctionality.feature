Feature: Adding link into text functionality
  User Story: As a user, I should be able to add link in message

  @B29G11-258 @wip
  Scenario Outline: Verify that user is able to attach a link to the specified text
    When user clicks on MESSAGE text area
    When enters the "<text>"
    And double-clicks on the entered text
    And clicks link button
    And enters link "<address>"
    And clicks Save button
    Then the link address is attached to the text
    Examples:
      | text      | address                    |
      | Google    | https://www.google.com/    |
      | Facebook  | https://www.facebook.com/  |
      | Instagram | https://www.instagram.com/ |