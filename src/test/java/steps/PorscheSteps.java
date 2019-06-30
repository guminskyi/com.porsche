//package steps;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import utilities.Driver;
//
//public class PorscheSteps {
//
//    @Given("^User opens the browser and goes to Porsche website$")
//
//    public void user_opens_the_browser_and_goes_to_Porsche_website() {
//        Driver.getDriver().get("https://porsche.com/");
//        System.out.println("HUI");
//
//    }
//
//    @When("^User selects model (\\d+) and stores the price of (\\d+) Cayman Model S and clicks on (\\d+) Cayman S$")
//    public void user_selects_model_and_stores_the_price_of_Cayman_Model_S_and_clicks_on_Cayman_S(int arg1, int arg2, int arg3) throws Throwable {
//
//    }
//
//    @Then("^User verifies that Base price displayed on the page is same as the price from the previous step$")
//    public void user_verifies_that_Base_price_displayed_on_the_page_is_same_as_the_price_from_the_previous_step() throws Throwable {
//
//    }
//
//=======
//    public void user_opens_the_browser_and_goes_to_Porsche_website() throws Throwable {
//        Driver.getDriver().get("https://www.porsche.com/usa/modelstart/");
//        System.out.println("Si ma rog de ce?");
//    }
//
//    @When("^User selects model (\\d+) and stores the price of (\\d+) Cayman Model S and clicks on (\\d+) Cayman S$")
//    public void user_selects_model_and_stores_the_price_of_Cayman_Model_S_and_clicks_on_Cayman_S(int arg1, int arg2, int arg3) throws Throwable {
//
//    }
//
//    @Then("^User verifies that Base price displayed on the page is same as the price from the previous step$")
//    public void user_verifies_that_Base_price_displayed_on_the_page_is_same_as_the_price_from_the_previous_step() throws Throwable {
//
//    }
//
//    @Then("^User verifies that Price for Equipment is (\\d+)$")
//    public void user_verifies_that_Price_for_Equipment_is(int arg1) throws Throwable {
//
//    }
//
//    @Then("^User verifies that total price is the sum of base price plus Delivery Processing and Handling Fee$")
//    public void user_verifies_that_total_price_is_the_sum_of_base_price_plus_Delivery_Processing_and_Handling_Fee() throws Throwable {
//
//    }
//
//    @Then("^User selects color Miami Blue$")
//    public void user_selects_color_Miami_Blue() throws Throwable {
//
//    }
//
//    @Then("^User verifies that Price for Equipment is Equal to Miami Blue price$")
//    public void user_verifies_that_Price_for_Equipment_is_Equal_to_Miami_Blue_price() throws Throwable {
//
//    }
//
//    @Then("^User verifies that total price is the sum of base price plus Price for Equipment plus Delivery Processing and Handling Fee$")
//    public void user_verifies_that_total_price_is_the_sum_of_base_price_plus_Price_for_Equipment_plus_Delivery_Processing_and_Handling_Fee() throws Throwable {
//
//    }
//
//    @Then("^User selects (\\d+) Carrera Sport Wheels$")
//    public void user_selects_Carrera_Sport_Wheels(int arg1) throws Throwable {
//
//    }
//
//    @Then("^User verifies that Price for Equipment is the sum of Miami Blue price plus (\\d+) Carrera Sport Wheels(\\d+)$")
//    public void user_verifies_that_Price_for_Equipment_is_the_sum_of_Miami_Blue_price_plus_Carrera_Sport_Wheels(int arg1, int arg2) throws Throwable {
//
//    }
//
//    @Then("^User selects seats Power Sport Seats (\\d+) way with Memory Package$")
//    public void user_selects_seats_Power_Sport_Seats_way_with_Memory_Package(int arg1) throws Throwable {
//
//    }
//
//    @Then("^User verifies that Price for Equipment is the sum of Miami Blue price plus (\\d+) Carrera Sport Wheels plus Power Sport Seats (\\d+) way with Memory Package$")
//    public void user_verifies_that_Price_for_Equipment_is_the_sum_of_Miami_Blue_price_plus_Carrera_Sport_Wheels_plus_Power_Sport_Seats_way_with_Memory_Package(int arg1, int arg2) throws Throwable {
//
//    }
//
//    @Then("^User clicks on Interior Carbon Fiber$")
//    public void user_clicks_on_Interior_Carbon_Fiber() throws Throwable {
//
//    }
//
//    @Then("^User selects Interior Trim in Carbon Fiber icw Standard Interior$")
//    public void user_selects_Interior_Trim_in_Carbon_Fiber_icw_Standard_Interior() throws Throwable {
//
//    }
//
//    @Then("^User verifies that Price for Equipment is the sum of Miami Blue price plus (\\d+) Carrera Sport Wheels plus Power Sport Seats (\\d+)-way with Memory Package plus Interior Trim in Carbon Fiber icw Standard Interior$")
//    public void user_verifies_that_Price_for_Equipment_is_the_sum_of_Miami_Blue_price_plus_Carrera_Sport_Wheels_plus_Power_Sport_Seats_way_with_Memory_Package_plus_Interior_Trim_in_Carbon_Fiber_icw_Standard_Interior(int arg1, int arg2) throws Throwable {
//
//    }
//
//    @Then("^User clicks on Performance$")
//    public void user_clicks_on_Performance() throws Throwable {
//
//    }
//
//    @Then("^User selects (\\d+)-speed Porsche Doppelkupplung PDK$")
//    public void user_selects_speed_Porsche_Doppelkupplung_PDK(int arg1) throws Throwable {
//
//    }
//
//    @Then("^User selects Porsche Ceramic Composite Brakes PCCB$")
//    public void user_selects_Porsche_Ceramic_Composite_Brakes_PCCB() throws Throwable {
//
//    }
//
//    @Then("^User verifies that Price for Equipment is the sum of Miami Blue price plus (\\d+) Carrera Sport Wheels plus Power Sport Seats (\\d+)-way with Memory Package plus Interior Trim in Carbon Fiber icw Standard Interior plus (\\d+) speed Porsche Doppelkupplung PDK plus Porsche Ceramic Composite Brakes PCCB$")
//    public void user_verifies_that_Price_for_Equipment_is_the_sum_of_Miami_Blue_price_plus_Carrera_Sport_Wheels_plus_Power_Sport_Seats_way_with_Memory_Package_plus_Interior_Trim_in_Carbon_Fiber_icw_Standard_Interior_plus_speed_Porsche_Doppelkupplung_PDK_plus_Porsche_Ceramic_Composite_Brakes_PCCB(int arg1, int arg2, int arg3) throws Throwable {
//
//    }
//
//
//>>>>>>> c42f96fb0c6939059b732881dd623ed932971ce1
//}
