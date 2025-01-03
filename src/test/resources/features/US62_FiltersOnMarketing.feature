@US62
Feature: Manage filters on the Marketing page

  Background: User should be logged in to application
    Given the user logged in as "sales manager"


  Scenario: Verify that Store and Sales managers see all 5 filter options as checked by default
    Given user is on the home page of application where title is "Dashboard"
    And user click Marketing module
    Then user click Campaigns option
    When user click Filter icon
    And user click Manage filters option menu
    Then user see 5 filter options as checked by default


  Scenario: Verify that any amount of boxes can be unchecked
    Given user is on the home page of application where title is "Dashboard"
    And user click Marketing module
    Then user click Campaigns option
    When user click Filter icon
    And user click Manage filters option menu
    Then user see 5 filter options as checked by default
    Then user can unchecked any amount of checkboxes with "Code"



  Scenario Outline: Verify that any amount of boxes can be unchecked
    Given user is on the home page of application where title is "Dashboard"
    And user click Marketing module
    Then user click Campaigns option
    When user click Filter icon
    And user click Manage filters option menu
    Then user see 5 filter options as checked by default
    Then user can unchecked any amount of checkboxes with "<ValueOfAttribute>"

    Examples:
      | ValueOfAttribute |
      | End Date         |
      | Start Date       |