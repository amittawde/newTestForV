@test
Feature: Valtech Test

  Scenario: Latest News section is displayed
    Given I navigate to www.valtech.com
    Then Latest News section is displayed


  Scenario Outline: Assert H1 tag on each page
    Given I navigate to www.valtech.com
    When I select <menu item>
    Then verify that H1 tag displays <correct item>

    Examples:
    | menu item | correct item|
    | About     | About       |
    | Services  | Services    |
    | Work      | Work        |


    Scenario: From the Contacts page output how many Valtech offices in total
      Given I navigate to www.valtech.com
      When I goto Contact page
      Then I find the number of Valtech offices
