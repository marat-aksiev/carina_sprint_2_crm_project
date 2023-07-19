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
    When user enters valid "<login credential>" and valid "<password>"
    Then  the user should be able to login and redirected homepage and title should contain:  "<drive>" "<login credential>"

    Examples:
      | login credential               | password ||drive|
      | hr12@cybertekschool.com        | UserUser || Drive:     |
      | hr10@cybertekschool.com        | UserUser ||     |
      | hr9@cybertekschool.com         | UserUser ||     |
      | hr5@cybertekschool.com         | UserUser ||     |
      | helpdesk11@cybertekschool.com  | UserUser ||     |
      | helpdesk5@cybertekschool.com   | UserUser ||     |
      | helpdesk6@cybertekschool.com   | UserUser ||     |
      | marketing51@cybertekschool.com | UserUser ||     |
      | marketing60@cybertekschool.com | UserUser ||     |
      | marketing32@cybertekschool.com | UserUser ||     |