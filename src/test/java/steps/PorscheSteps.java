package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PorscheSteps {


    @When("User goes to Google application")
    public void user_goes_to_Google_application() {
        System.out.println("yulia");
    }

    @Then("User searches for apple")
    public void user_searches_for_apple() {
        System.out.println("is annoying");
    }

    @Then("User should see apple related results")
    public void user_should_see_apple_related_results() {

    }

    @Then("User tests something")
    public void user_tests_something() {

    }
}
