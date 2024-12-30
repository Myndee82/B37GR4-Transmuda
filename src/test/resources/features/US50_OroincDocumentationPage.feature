@login
Feature: Users should be able to access to the Oroinc Documentation page.

  Background: User is already in the log in page
    Given the user is on the login page


  @oronic
  Scenario Outline: Verify  that driver can access to the Oroinc Documentation page
    Given the user logged in as "<userType>"
    Then user is clicking the question mark icon
    Then user should be able to see Oroinc Documentation Page

    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |