Feature: This is my first feature
  # comment
  @goo
  Scenario: Google search scenario
    When User goes to Google application
    Then User searches for apple
    And User should see apple related results
    And User tests something