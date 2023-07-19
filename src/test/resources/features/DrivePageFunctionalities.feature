@B29G11-301
Feature: As a user, I want to access the Drive page.
  Verify the users view the following 6 modules on the Drive page.
  My Drive
  All Documents
  Company Drive
  Sales and Marketing
  Top Management’s documents
  Drive Cleanup

  Background:
    Given user is on the login page

  Scenario Outline: Login with valid credentials for HR, Helpdesk, and Marketing user.
  After successfully login user navigated to the Drive navigation link.
    When user enters valid "<login credential>" and valid "<password>" and press login button
    Then   user should be able to login and redirected to the homepage
    Then user click on the "Drive" navigation link
    Then the user should be able to see the following modules in the Drive navigation menu:
      | Module Name                         |
      | My Drive                            |
      | All Documents                       |
      | Company Drive                       |
      | Sales and Marketing                 |
      | Top Management's documents          |
      | Drive Cleanup                       |

    Examples:
      | login credential               | password |
      | hr12@cybertekschool.com        | UserUser |
      | hr10@cybertekschool.com        | UserUser |
      | hr9@cybertekschool.com         | UserUser |
      | hr5@cybertekschool.com         | UserUser |
      | helpdesk11@cybertekschool.com  | UserUser |
      | helpdesk5@cybertekschool.com   | UserUser |
      | helpdesk6@cybertekschool.com   | UserUser |
      | marketing51@cybertekschool.com | UserUser |
      | marketing60@cybertekschool.com | UserUser |
      | marketing32@cybertekschool.com | UserUser |