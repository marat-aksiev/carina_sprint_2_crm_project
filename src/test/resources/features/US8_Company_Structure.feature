@B29G11-250
Feature: Adding a Department to the Company Structure
  Agile story: As an HR user, I want to be able to add a department to the company structure


  Background: user is already logged in
    Given user navigates to the Employees menu and clicks on it

@hr
  Scenario: HR user should be able to add department from the company structure
    When user navigates to the Add Department menu and clicks on the button
    Then user should see Add department pop-up window
    When user clicks on Select from structure text
    And user clicks on Company option
    Then user adds details of new department
    When user clicks anywhere on pop-up window
    And user should see ADD and CLOSE buttons
    And user clicks ADD button
    Then user added new department successfully

@helpdesk @marketing
  Scenario: Helpdesk and Marketing users do not have "Add Department" option
    When user is directed to the Company Structure page
    Then user does not have Add Department option


  Scenario Outline: All user types should be able to display company structure
    When user is directed to the Company Structure page
    Then user should see Company Structure page
    Examples:
      | UserType  |
      | HR        |
      | Helpdesk  |
      | Marketing |


