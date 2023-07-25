@B29G11-320
Feature: As a user, I want to access Employees page

  Background: User is already logged in
    Given user is on the login page

  @B29G11-313
  Scenario Outline: Verify the users view the following options on my company structure page
    When user enters valid credentials for user role "<role>"
    And user clicks on Employees menu on login page
    Then Following options are accessible on company structure page
      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Efficiency Report   |
      | Honored Employees   |
      | Birthdays           |
      | New page            |

    Examples:
      | role      |
      | hr        |
      | helpdesk  |
      | marketing |

  @B29G11-317
  Scenario Outline: Verify the users view "Company structure"
    When user enters valid credentials for user role "<role>"
    And user clicks on Employees menu on login page
    Then on the Company structure page user sees "Company structure"

    Examples:
      | role      |
      | hr        |
      | helpdesk  |
      | marketing |