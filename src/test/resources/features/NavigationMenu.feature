@navigate
Feature: Navigation Menu

  Scenario: Navigate Fleet -- Vehicles
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigate to Fleet, Vehicles
    Then the tittle should be Vehicles

  @db
  Scenario: Navigating Marketing - Campaigns
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates to Marketing, Campaigns
    Then title should be Campaigns

  Scenario: Navigating Activities - Calendar Events
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates to Activities, Calendar Events
    Then title should be Calendar Events


  Scenario: Menu Options
    Given the user logged in as "driver"
    Then the user should see following options
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |

  Scenario: Menu Options Sales Manager
    Given the user logged in as "sales manager"
    Then the user should see following options
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

  @wip
  Scenario: login as a given user
    Given the user is on the login page
    When the user logs in using following credentials
      | username  | user10      |
      | password  | UserUser123 |
      | firstname | John        |
      | lastname  | Doe         |
    Then the user should be able to login