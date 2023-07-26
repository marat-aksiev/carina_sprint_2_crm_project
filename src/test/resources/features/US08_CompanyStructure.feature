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
    Then user does not have ADD DEPARTMENT option

    Examples:
      | role     |
      | helpdesk |
#      | marketing |


  @hr
  Scenario Outline: HR user should be able to add department from the company structure
    Given user enters valid credentials for user role "<role>"
    When user clicks on the Employees menu
    And user sees "Company Structure" in the page header
    When user navigates to the Add Department menu and clicks on the button
    Then user should see "Add department" pop-up window

    When user navigates to the Department name input box and enters new "<department name>"
    And user navigates to the Parent department input box
    And user chooses "<parent department>" from dropdown menu
    And user clicks ADD button to add new department
    Then user added new department successfully

    Examples:
      | role | department name        | parent department |
      | hr   | Instructors Department | Cyber Vet         |
      | hr   | Manager Department     | Cyber Vet         |
      | hr   | Security Department    | Cyber Vet         |
      | hr   | Engineer Department    | Cyber Vet         |

