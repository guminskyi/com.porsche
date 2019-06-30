$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "This is my first feature",
  "description": "",
  "id": "this-is-my-first-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6546659902,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "# comment"
    }
  ],
  "line": 4,
  "name": "Google search scenario",
  "description": "",
  "id": "this-is-my-first-feature;google-search-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@goo"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User goes to Google application",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User searches for apple",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User should see apple related results",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User tests something",
  "keyword": "And "
});
formatter.match({
  "location": "PorscheSteps.user_goes_to_Google_application()"
});
formatter.result({
  "duration": 258927405,
  "status": "passed"
});
formatter.match({
  "location": "PorscheSteps.user_searches_for_apple()"
});
formatter.result({
  "duration": 1146836,
  "status": "passed"
});
formatter.match({
  "location": "PorscheSteps.user_should_see_apple_related_results()"
});
formatter.result({
  "duration": 61202,
  "status": "passed"
});
formatter.match({
  "location": "PorscheSteps.user_tests_something()"
});
formatter.result({
  "duration": 68951,
  "status": "passed"
});
formatter.after({
  "duration": 462208022,
  "status": "passed"
});
});