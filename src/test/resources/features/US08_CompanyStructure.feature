@B29G11-250 @US_08
Feature: Adding a Department to the Company Structure
  Agile story: As an HR user, I want to be able to add a department to the company structure


  Background: user is already logged in
    Given user is on the login page

  @all_users
  Scenario Outline: All user types should be able to display company structure
    Given user enters valid credentials for user role "<role>"
    When user clicks on the Employees menu
    Then user sees "Company Structure" in the page header
    Examples:
      | role      |
      | hr        |
      | helpdesk  |
      | marketing |


  @helpdesk @marketing
  Scenario Outline: Helpdesk and Marketing users do not have "Add Department" option
    Given user enters valid credentials for user role "<role>"
    When user clicks on the Employees menu
    And user sees "Company Structure" in the page header
    Then user does not have add department option

    Examples:
      | role      |
      | helpdesk  |
      | marketing |


  @hr
  Scenario Outline: HR user should be able to add department from the company structure
    Given user enters valid credentials for user role "<role>"
    When user clicks on the Employees menu
    And user sees "Company Structure" in the page header
    When user navigates to the Add Department menu and clicks on the button
    Then user should see "Add department" pop-up window
    When user clicks on Select from structure text
    And user clicks on Company option
    Then user adds details of new department
    When user clicks anywhere on pop-up window
    And user should see ADD and CLOSE buttons
    And user clicks ADD button
    Then user added new department successfully
    Examples:
      | role      |
      | hr        |