@US61
Feature: Manaaging filters on the Vehicle Cost Page
  US61

  Background:
    Given the user is on the login page

  Scenario: Verify that Store managers and Sales managers are able to manage filters on the Vehicle Cost page
    And Store managers and Sales managers enters valid credentials
      | Store managers | Sales managers  |
      | storemanager61 | salesmanager101 |
    And User should see Dashboard page
    And User clicks on Fleet Module
    And User select Vehicle Cost Option
    Then Verify colums name
      | TYPE | TOTAL PRICE | DATE


