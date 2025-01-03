Feature: User should see edit car info icons on the Vehicles page

  @US54
  Scenario Outline: Verify user can see edit car info icons on Vehicles page
    Given user is log in with the "<username>" and "<password>"
    When user hovers over fleet tab
    Then user clicks on vehicles tab
    And user sees the card edit info icons

    Examples:
      | username        | password    |
      | user1           | UserUser123 |
      | salesmanager101 | UserUser123 |
      | storemanager85  | UserUser123 |