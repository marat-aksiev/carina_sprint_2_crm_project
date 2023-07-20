@B29G11-250
Feature: Adding a Department to the Company Structure
  Agile story: As an HR user, I want to be able to add a department to the company structure
  So that the organization can manage its departments effectively

  Background: User is on the login page

@hr
  Scenario: HR user should be able to add department from the company structure
    Given user is logged in as HR user
    When user navigates to the "Add Department" menu
    And user clicks on "Add Department" button
    And user should see a pop-up window
    When user clicks on "Select from structure" text
    And user clicks on "Company" option
    And user adds details of new department
    And user clicks anywhere on pop-up window
    And user should see "ADD" and "CLOSE" buttons
    And user clicks "ADD" button
    Then user added new department successfully

@helpdesk
  Scenario: Helpdesk user does not have "Add Department" option
    Given user is logged in as Helpdesk user
    When user navigates to the "Employees" menu
    And user clicks on "Employee" menu button
    And user is directed to the "Company Structure" page
    Then user does not have "Add Department" option

@marketing
  Scenario: Marketing user does not have "Add Department" option
    Given user is logged in as Helpdesk user
    When user navigates to the "Employees" menu
    And user clicks on "Employee" menu button
    And user is directed to the "Company Structure" page
    Then user does not have "Add Department" option


  Scenario Outline: All user types should be able to display company structure
    Given the user is logged in as a "<UserType">
    And user navigates to the "Employees" menu
    And "user" clicks on "Employee" menu button
    Then user should see "Company Structure" page
    Examples:
      | UserType  |
      | HR        |
      | Helpdesk  |
      | Marketing |


