@login
Feature: Users should be able to login

  Background:
    Given user is on the login page

  @wip
  Scenario Outline: Verify a user can access the Company page
    When the user logged in as "<Users>"
    And the user click on the "Company"
    Then the user verified that the title is equal to "Company"

    Examples:
    |Users|
    |HR   |
    |Help Desk|
    |Marketing|



