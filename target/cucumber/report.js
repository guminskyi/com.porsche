$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("porsche.feature");
formatter.feature({
  "line": 2,
  "name": "Buy a Porsche",
  "description": "",
  "id": "buy-a-porsche",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@porsche"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "a",
  "description": "",
  "id": "buy-a-porsche;a",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User opens the browser and goes to Porsche website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User selects model \"718\" and stores the price of \"718\" Cayman Model S and clicks on \"718\" Cayman \"S\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User verifies that Base price displayed on the page is same as the price from the previous step",
  "keyword": "Then "
});
formatter.match({
  "location": "PorscheSteps.user_opens_the_browser_and_goes_to_Porsche_website()"
});
formatter.result({
  "duration": 5489778398,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "PorscheSteps.user_verifies_that_Base_price_displayed_on_the_page_is_same_as_the_price_from_the_previous_step()"
});
formatter.result({
  "status": "skipped"
});
});