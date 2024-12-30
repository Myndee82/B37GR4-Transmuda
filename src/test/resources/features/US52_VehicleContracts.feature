@US52
Feature: Accessing to Vehicle Contracts page
  US52

  Background:
    Given the user is on the login page

  Scenario: Verify that Store managers and Sales managers can access the Vehicle Contracts page
    When Store Manager user enters valid username "storemanager52"
    And  Store Manager user enters valid password "UserUser123"
    And User should see Dashboard page
    And User clicks on Fleet Module
    And User select Vehicle Contracts Option
    Then User should see Vehicle Contracts Page with title "All - Vehicle Contract - Entities - System - Car - Entities - System"


  Scenario: Verify that Drivers can NOT access the Vehicle Contracts page
    When Driver enters username "user1"
    And  Driver enters password "UserUser123"
    And User should see Dashboard page
    And User clicks on Fleet Module
    Then User should see message "You do not have permission to perform this action."

