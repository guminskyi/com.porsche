Feature: Google search feature
  @google

  Scenario: Making sure Google search is working as expected
    Given User is on Google home page
    And User enters flowers
    And User clicks search button
    Then User should see results related to flowers