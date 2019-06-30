@googleparameters

Feature: Google search functionality
  Scenario: Testing Google search
    Given User is on Google homepage
    When User enters "flowers" keyword
    Then User should see "flowers" in the title