@US61
Feature: Managing filters on the Vehicle Cost Page
  US61

  Background:
    Given the user is on the login page

  Scenario: Verify that Store managers and Sales managers are able to manage filters on the Vehicle Cost page
    When Store Manager user enters valid username "storemanager61"
    And  Store Manager user enters valid password "UserUser123"
    And User should see Dashboard page
    And User clicks on Fleet Module
    And User select Vehicle Cost Option
    Then Verify columns name
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |


  Scenario: Verify that user can check the first checkbox to select All Vehicle Costs
    When Store Manager user enters valid username "storemanager61"
    And  Store Manager user enters valid password "UserUser123"
    And User should see Dashboard page
    And User clicks on Fleet Module
    And User select Vehicle Cost Option
    Then User select first checkbox to select All Vehicle Costs


