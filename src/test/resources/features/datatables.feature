@datatables
Feature: Testing datatable website

  Scenario: Testing adding new employee to the table

    Given User is on the datatable homepage
    And User clicks to New Button
    Then User should see Create New Entry Box
    And User should enter firstname
    And User should enter lastname
    And User should enter position
    And User should enter office
    And User should enter exstension
    And User should enter start date
    And User should enter salary
    Then User should click create button
    And User enters first name to search box
    Then  User should see first name is inserted in the table