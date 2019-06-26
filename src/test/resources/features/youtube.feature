@youtube
Feature: Youtube search feature
Background: User bla bla bla balba lba lan
  Given User is on the youtube homepage
  And User is able to see the search box
  And User is able to see the search button

  Scenario: Testing youtube search

    When User searches for Funny cat videos
    Then User should see results related to funny cat videos

  Scenario: Testing youtube search

    When User searches for Funny dog videos
    Then User should see results related to funny dog videos

  Scenario: Testing youtube search

    When User searches for Funny pet videos
    Then User should see results related to funny pet videos