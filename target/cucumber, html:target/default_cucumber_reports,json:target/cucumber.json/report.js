$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/test.feature");
formatter.feature({
  "name": "This is my first feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Google search scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@goo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User goes to Google application",
  "keyword": "When "
});
formatter.match({
  "location": "PorscheSteps.user_goes_to_Google_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searches for apple",
  "keyword": "Then "
});
formatter.match({
  "location": "PorscheSteps.user_searches_for_apple()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see apple related results",
  "keyword": "And "
});
formatter.match({
  "location": "PorscheSteps.user_should_see_apple_related_results()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User tests something",
  "keyword": "And "
});
formatter.match({
  "location": "PorscheSteps.user_tests_something()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});