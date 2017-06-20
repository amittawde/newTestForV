@test
Feature: Valtech Test

  @test1
  Scenario: Latest News section is displayed
    Given I navigate to www.valtech.com
    Then Latest News section is displayed


  Scenario Outline: Assert H1 tag on each page
    Given I navigate to www.valtech.com
    When I select menu item <menu item>
    Then H1 tag displays correct item <correct item>

    Examples:
    | menu item | correct item|
    | ABOUT     | About       |
    | SERVICES  | Services    |
    | WORK      | Work        |


    Scenario: From the Contacts page output how many Valtech offices in total
      Given I navigate to www.valtech.com
      When I goto Contact page
      Then I find the number of Valtech offices
