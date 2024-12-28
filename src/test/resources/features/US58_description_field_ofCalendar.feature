Feature: Description field of calender event

  User Story: As a user, I should be able to type into the Description field when I create a calendar
  event.

  Background:
    Given the user logged in as "sales manager"

  @wip
  Scenario: Verify that users can type messages in to the Description field on the Calendar
  Events page.
    Given user is on the home page of application and title is "Dashboard"
    When user click Activities button
    And user click Calendar Events button
    Then user click Create Calendar Event
    Then user click repeat button
    And user select from Repeats dropdown "Weekly"
    When user delete and put number and put number of repeats into Repeat Every input box
    And user select the day event has to be repeated
    When user type into event description description of the event



