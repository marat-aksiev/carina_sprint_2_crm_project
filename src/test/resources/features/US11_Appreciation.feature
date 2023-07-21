@B29G11-253
Feature: user should be able to send appreciation Activity Stream.
  User story:
  As a user, I should be able to send appreciation by clicking on Appreciation tab in the Activity Stream.

  Accounts are: HR, Marketing, Helpdesk

  Background:
    Given user is on the login page

  Scenario Outline: Verify if user is able to send valid appreciation
    When user enters valid credentials for user role "<role>"
    And user is on appreciation tab
    And  user enters "<message>" text
    And user enters "<to>"
    And user clicks send button
    Then  user should be able to see "<role>" in Activity Stream
    Then  user should be able to see "<to>" in sent message
    Then  user should be able to see "<message>" in last sent message
    Examples:
      | message | to                      | role |
      | test    | hr12@cybertekschool.com | hr   |
#      | thank you! | helpdesk12@cybertekschool.com  | helpdesk  |
#      | well done  | marketing12@cybertekschool.com | marketing |
