@login

Feature: As a user I should be able to login
  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: HR, Marketing, Helpdesk

  Background:
    Given user is on the login page

  Scenario Outline: Login with valid credentials for HR, Helpdesk, and Marketing user.
    When user enters valid "<username>" and valid "<password>"
    Then  the user should be able to login and redirected homepage

    Examples:
      | username                       | password |
      | hr12@cybertekschool.com        | UserUser |
      | helpdesk12@cybertekschool.com  | UserUser |
      | marketing12@cybertekschool.com | UserUser |

  Scenario Outline:"Incorrect login or password" should be displayed when user enters an invalid username or password
    When user enters invalid "<username>" or invalid "<password>"
    Then verify that "Incorrect login or password" error message is displayed

    Examples:
      | username                           | password        |
      | invalidusername@cybertekschool.com | UserUser        |
      | helpdesk12@cybertekschool.com      | invalidpassword |
      | wrongusername@cybertekschool.com   | invalidpasscode |

    #Failed Scenario: AC:3 actual message "Incorrect login or password" expected "Please fill out this field"
  Scenario Outline: "Please fill out this field" should be displayed when user  leaves the username or password field empty
    When the user leaves the "<username>" or  "<password>" field empty
    Then verify that the "Please fill out this field" error message is displayed

    Examples:
      | username                       | password |
      | hr12@cybertekschool.com        |          |
      |                                | UserUser |
      | marketing12@cybertekschool.com |          |



  Scenario: User can see "Remember Me" link  and is clickable on the login page
      Then the user should be able to see the "Remember me on this computer" link
      And the "Remember me on this computer" link should be clickable


  Scenario: User should see the password in bullet signs by default
    Then the password should appear in bullet signs by default























