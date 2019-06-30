package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.Driver;

public class PorscheSteps {

    @Given("^User opens the browser and goes to Porsche website$")
    public void user_opens_the_browser_and_goes_to_Porsche_website() {
        Driver.getDriver().get("https://porsche.com/");
        System.out.println("HUI");

    }

    @When("^User selects model (\\d+) and stores the price of (\\d+) Cayman Model S and clicks on (\\d+) Cayman S$")
    public void user_selects_model_and_stores_the_price_of_Cayman_Model_S_and_clicks_on_Cayman_S(int arg1, int arg2, int arg3) throws Throwable {

    }

    @Then("^User verifies that Base price displayed on the page is same as the price from the previous step$")
    public void user_verifies_that_Base_price_displayed_on_the_page_is_same_as_the_price_from_the_previous_step() throws Throwable {

    }

}
