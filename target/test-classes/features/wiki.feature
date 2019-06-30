Feature: Wikipedia search
  @wiki
  Scenario: Wikipedia search test
    Given User is on Wikipedia home page
    When User enters Steve Jobs in the search bar and clicks Enter
    Then User should see the first header displaying Steve Jobs
