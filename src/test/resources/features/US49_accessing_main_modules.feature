@beyzawip
Feature: Accessing main modules for Store, Sales manager and Driver

  User Story 49
  Verify that store & sales manager see 8 module names.
  Expected module names: Dashboards, Fleet, Customers, Sales, Activities, Marketing, Reports & Segments, System
  Verify that Driver sees 4 module names
  Expected module names: Fleet, Customers, Activities, System


#AC1
  Scenario: Login as store manager
    Given store manager is on the login page of the fleet application
    When store manager enters username "storemanager52"
    And store manager enters password  "UserUser123"
    And store manager clicks login button
    Then store manager should see the modules name
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |


  Scenario: Login as sales manager
    Given sales manager is on the login page of the fleet application
    When sales manager enters username "salesmanager111"
    And sales manager enters password  "UserUser123"
    And sales manager clicks login button
    Then sales manager should see the modules name
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |


    #AC2

  Scenario: Login as a driver
    Given driver is on the login page of the fleet application
    When driver enters username "user11"
    And driver enters password "UserUser123"
    And driver clicks login button
    Then driver should see modules name
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |



