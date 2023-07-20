@B29G11-244
  Feature: As a user I should be able to logout
    User Story :
    As a user, I should be able to log out
    Acceptance Criteria:
    1- Verify the users can log out from the app after clicking the “Log out” button.
    2- Verify users see 5 options under the profile name.
      My Profile
      Edit Profile Settings
      Themes
      Configure notifications
      Log out

    Background:
      Given user is on the login page

    @B29G11-299
    Scenario:
      Given user is already logged in to the crm app
      When user click on the profile name
      And user clicks Log Out button
      Then user can see login page

      @B29G11-300
      Scenario:
        Given user is already logged in to the crm app
        When user


