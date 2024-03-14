Feature: Web Tables Automation

  I am automating http://www.way2automation.com/angularjs-protractor/webtables/
with the below scenarios.

  Scenario Outline: Add a user and validate the user has been added to the table
    Given I open the web tables page
    When I add a user with username "<Username>" and email "<Email>"
    Then the user "<Username>" should be displayed in the table

    Examples:
      | Username | Email                  | FirstName|LastName|Password|Mobilephone|
      | test123  | test123@example.com    | Mark     |Novak   |password|777888444|

  Scenario: Delete the user "novak" from the table and validate the user has been deleted
    Given I open the web tables page
    When I delete the user "novak" from the table
    Then the user "novak" should not be displayed in the table
