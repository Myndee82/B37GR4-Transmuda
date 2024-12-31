@US61
Feature: Managing filters on the Vehicle Cost Page
  US61

  Background:
    Given the user is on the login page

  Scenario Outline: Verify that Store managers and Sales managers are able to manage filters on the Vehicle Cost page
    Given the user logged in as "<userType>"
    And User clicks on Fleet Module
    And User select Vehicle Cost Option
    Then Verify columns name
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |

    Examples:
      | userType      |
      | store manager |
      | sales manager |


  Scenario Outline: Verify that user can check the first checkbox to select All Vehicle Costs
    Given the user logged in as "<userType>"
    And User clicks on Fleet Module
    And User select Vehicle Cost Option
    Then User select first checkbox to select All Vehicle Costs

    Examples:
      | userType      |
      | store manager |
      | sales manager |


