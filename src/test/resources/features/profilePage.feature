@profile_page
Feature: As a user, I want to access my profile page.

  Background: User is already logged in
    Given user is on the login page
    And user enters valid credentials for user role "hr"

  Scenario: Verify the users view the following options on my profile page
    When the user opened profile page
    Then Following options are accessible on profile page
      | General       |
      | Drive         |
      | Tasks         |
      | Calendar      |
      | Conversations |

  Scenario: Verify the email address under the General tab
    When the user opened profile page
    Then the email address under the General tab is email for user role "hr"