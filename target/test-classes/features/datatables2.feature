@datatables2
Feature: Testing datatable website

  Scenario: Testing adding new employee to the table

    Given User is on the datatable homepage
    And User clicks to New Button
    Then User should see Create New Entry Box
    And User should enter firstname "Tom"
    And User should enter lastname "Ford"
    And User should enter position "hdhkfh"
    And User should enter office "London"
    And User should enter exstension "341"
    And User should enter start date "2019-01-12"
    And User should enter salary "100000"
    Then User should click create button
    And User enters first name "Tom" to search box
    Then  User should see first name "Tom" is inserted in the table