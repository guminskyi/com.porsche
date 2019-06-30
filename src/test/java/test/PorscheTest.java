package test;

import java.security.DigestInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

public class PorscheTest {

        WebDriver driver;
        JavascriptExecutor js;

    @BeforeClass
    public void setup() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://porsche.com/usa/modelstart");
        WebElement porsche718 = driver.findElement(By.xpath("//img[@alt='Porsche - 718']"));
        porsche718.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement porsche718PriceElement = driver.findElement(By.cssSelector("body.pool-usa.lang-none:nth-child(2)" +
                " div.b-page-wrapper.page.nonavi:nth-child(1) div.m-14-model-overview.m-14-cc.m-14-model-overview--initialized:nth-child(6)" +
                " div.m-14-models-view.module-container:nth-child(1) div.module-grid div.m-14-result-row.m-14-result-context.content-full-width div.m-14-model-series.module-grid:nth-child(2)" +
                " div.m-14-model-tile.visible:nth-child(3) div.m-14-model-tile-link-overview div.m-14-model-tile-title > div.m-14-model-price"));
        porsche718PriceElement.click();
        List<String> allHandles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(allHandles.get(1));  // <=== switching to 718 Cayman S window
        WebElement priceExpandBtn = driver.findElement(By.xpath("//*[@id=\"s_iccCca\"]/div[1]/div[4]/div[1]/span"));
        priceExpandBtn.click();

    }




// Step 14: Verify that total price is the sum of base price + Price for Equipment + Delivery,
//		Processing and Handling Fee

    @Test(priority = 14)
    public void step14() {

        String deliveryProcessingHandlingFeeStringOriginal = driver.findElement(By.xpath("(//div[@class='row additional']//div[@class='cca-price'])[2]")).getText();
        String deliveryProcessingHandlingFeeString = deliveryProcessingHandlingFeeStringOriginal.replace("$", "").replace(",", "");
        int deliveryProcessingHandlingFee = Integer.parseInt(deliveryProcessingHandlingFeeString);
        String basePrice = Driver.getDriver().findElement(By.xpath("//*[@id=\"s_iccCca\"]/div[1]/div[2]/div[2]"))
                .getText().replace("$", "").replace(",", "");
        int basePriceInt = Integer.valueOf(basePrice);

        String newTotalPlusWheels = driver.findElement(By.xpath("//section[@id='s_price']//div[@class='ccaTable']//div[@class='ccaRow priceTotal highlighted']//div[@class='ccaPrice']")).getText();
        int newTotalPlusWheelsInt = Integer.valueOf(newTotalPlusWheels);
        int totalPlusWheels = basePriceInt + deliveryProcessingHandlingFee;
        if (newTotalPlusWheelsInt == totalPlusWheels) {
            System.out.println("Pass total plus wheels");
        } else {
            System.out.println("Failed total plus wheels");
        }
    }
// ==========================================================================================
//	    15.Select seats ‘Power Sport Seats (14-way) with Memory Package’
        @Test(priority = 15)
                public void step15(){
        js=(JavascriptExecutor)driver;
            js.executeScript("window.scrollBy(0, 880)");
        Driver.getDriver().findElement(By.xpath("//span[@id='s_interieur_x_PP06']")).click();
}
// ==========================================================================================
//	    16.Verify that Price for Equipment is the sum of Miami Blue price + 20" Carrera Sport
//	    Wheels + Power Sport Seats (14-way) with Memory Package
        @Test(priority = 16)
        public void step16() {
            String expectedColorPrice = driver.findElement(By.xpath("//li[@id='s_exterieur_x_FJ5']")).getAttribute("data-price");
            String actualColorPrice = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[4]/section[1]/div[1]/div[4]/div[2]")).getText();
            String priceForWheels = driver.findElement(By.xpath("/html//div[@id='s_exterieur_x_IRA']//div[.='$2,780']")).getText();
            int wheelsPriceInt = Integer.valueOf(priceForWheels);
            String priceForEquipmentAfterWheelsNColorNSeats = driver.findElement(By.xpath("//section[@id='s_price']/div[1]/div[2]/div[2]")).getText().replaceAll("\\D", "");
            String seats = driver.findElement(By.xpath("(//div[@class='pBox'])[8]//div[1]")).getText().replaceAll("\\D", "");
            if ((Integer.parseInt(seats) + Integer.parseInt(actualColorPrice) + Integer.parseInt(priceForWheels)) == Integer.parseInt(priceForEquipmentAfterWheelsNColorNSeats)) {
                System.out.println("Price for Equipment is the sum of Miami Blue price + 20\" Carrera Sport Wheels + Power Sport Seats (14-way) with Memory Package");
            } else {
                System.out.println("System.out.println(\"Price for Equipment is NOT the sum of Miami Blue price + 20\\\" Carrera Sport Wheels + Power Sport Seats (14-way) with Memory Package\");");
            }
        }
// ==========================================================================================
//	    17.Verify that total price is the sum of base price + Price for Equipment + Delivery,
//	    Processing and Handling Fee
        @Test(priority = 17)
        public void step17(){

            String deliveryProcessingHandlingFeeStringOriginal = driver.findElement(By.xpath("(//div[@class='row additional']//div[@class='cca-price'])[2]")).getText();
            String deliveryProcessingHandlingFeeString = deliveryProcessingHandlingFeeStringOriginal.replace("$", "").replace(",", "");
            int deliveryProcessingHandlingFee = Integer.parseInt(deliveryProcessingHandlingFeeString);
            String basePrice = Driver.getDriver().findElement(By.xpath("//*[@id=\"s_iccCca\"]/div[1]/div[2]/div[2]"))
                    .getText().replace("$", "").replace(",", "");
            int basePriceInt = Integer.valueOf(basePrice);
            String newTotalPlusSeats = driver.findElement(By.xpath("//section[@id='s_price']//div[@class='ccaTable']//div[@class='ccaRow priceTotal highlighted']//div[@class='ccaPrice']")).getText();
            int newTotalPlusSeatInt = Integer.valueOf(newTotalPlusSeats);
            int totalPlusSeat = basePriceInt + deliveryProcessingHandlingFee;
            if (newTotalPlusSeatInt == totalPlusSeat) {
                System.out.println("Pass total plus seat");
            } else {
                System.out.println("Failed total plus seat");
            }
        }
    }



