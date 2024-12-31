@US52
Feature: Accessing to Vehicle Contracts page
  US52

  Background:
    Given the user is on the login page

  Scenario Outline: Verify that Store managers and Sales managers can access the Vehicle Contracts page
    Given the user logged in as "<userType>"
    And User clicks on Fleet Module
    And User select Vehicle Contracts Option
    Then User should see Vehicle Contracts Page with title "All - Vehicle Contract - Entities - System - Car - Entities - System"

    Examples:
      | userType      |
      | store manager |
      | sales manager |


  Scenario: Verify that Drivers can NOT access the Vehicle Contracts page
    Given the user logged in as "driver"
    And User clicks on Fleet Module
    Then User should see message "You do not have permission to perform this action."

