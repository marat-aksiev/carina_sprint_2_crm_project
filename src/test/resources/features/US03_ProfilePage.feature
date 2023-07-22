@profile_page
Feature: As a user, I want to access my profile page.

  Background: User is already logged in
    Given user is on the login page

  @profile_ac1
  Scenario Outline: Verify the users view the following options on my profile page
    When user enters valid credentials for user role "<role>"
    And the user clicks profile menu item MY_PROFILE
    Then Following options are accessible on profile page
      | General       |
      | Drive         |
      | Tasks         |
      | Calendar      |
      | Conversations |

    Examples:
      | role      |
      | hr        |
      | helpdesk  |
      | marketing |

  @profile_ac2
  Scenario Outline: Verify the email address under the General tab
    When user enters valid credentials for user role "<role>"
    And the user clicks profile menu item MY_PROFILE
    Then the email address under the General tab is email for user role "<role>"

    Examples:
      | role      |
      | hr        |
      | helpdesk  |
      | marketing |

  @profile_menu
  Scenario Outline: Open all profile menu items using Enum
    When user enters valid credentials for user role "hr"
    And the user clicks profile menu item <menu item>

    Examples:
      | menu item               |
      | MY_PROFILE              |
      | EDIT_PROFILE_SETTINGS   |
      | THEMES                  |
      | CONFIGURE_NOTIFICATIONS |
      | LOG_OUT                 |

  @profile_menu
  Scenario Outline: Open all profile menu items using String names
    When user enters valid credentials for user role "hr"
    And the user clicks profile menu item named "<menu item>"

    Examples:
      | menu item               |
      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure notifications |
      | Log out                 |


