@employees_page
  Feature: As a user, I want to access Employees page

    Background: User is already logged in
      Given user is on the login page

    Scenario Outline: Verify the users view the following options on my employees page
      When user enters valid credentials for user role "<role>"
      And the user opened employees page
      Then Following options are accessible on employees page
        | Company Structure |
        |Find Employee |
        |Telephone Directory |
        |Staff Changes |
        |Efficiency Report |
        |Honored Employees |
        |Birthdays |
        |New page |

      Examples:
        | role      |
        | hr        |
        | helpdesk  |
        | marketing |

