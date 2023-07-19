Feature: Adding a Department to the Company Structure
  Agile story: As an HR user, I want to be able to add a department to the company structure
  So that the organization can manage its departments effectively

@hr_user
  Scenario: HR user should be able to add department from the company structure
    Given "user" is logged in as HR user
    When "user" navigates to the "Add Department" menu
    And "user" clicks on "Add Department" button
    And "user" should see a pop-up window
    When "user" clicks on "Select from structure" text
    And "user" clicks on "Company" option
    And "user" adds details of new department
    And "user" clicks anywhere on pop-up window
    And "user" should see "ADD" and "CLOSE" buttons
    And "user" clicks "ADD" button
    Then "user" added new department successfully

  Scenario:
    When "user"
