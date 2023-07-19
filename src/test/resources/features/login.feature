@login

Feature: As a user I should be able to login
  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: HR, Marketing, Helpdesk

  Background:
    Given user is on the login page

  Scenario Outline: Login with valid credentials for HR, Helpdesk, and Marketing user.
    When user enters valid "<login credential>" and valid "<password>"
    Then  the user should be able to login and redirected homepage

    Examples:
      | login credential               | password |
      | hr12@cybertekschool.com        | UserUser |
      | helpdesk12@cybertekschool.com  | UserUser |
      | marketing12@cybertekschool.com | UserUser |



