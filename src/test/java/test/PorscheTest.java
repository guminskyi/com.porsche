package test;

import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class PorscheTest {

    WebDriver driver;

    @BeforeClass
    public void setupA() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://porsche.com/usa/modelstart");
    }
//    @AfterMethod
//    public void tearDownA() {
//        driver.close();
//        driver.quit();
//
//    }

    @Test
    public void testA() {
        WebElement porsche718 = driver.findElement(By.xpath("//img[@alt='Porsche - 718']"));
        porsche718.click();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement porsche718PriceElement = driver.findElement(By.cssSelector
                ("[data-model-id='1'] [class='m-14-model-price']"));
        String porsche718PriceStringFromElement = porsche718PriceElement.getText();
        // System.out.println(porsche718PriceStringFromElement);

        String porsche718PriceString = porsche718PriceStringFromElement.substring
                (7, porsche718PriceStringFromElement.length() - 3);
        System.out.println(porsche718PriceString);
        porsche718PriceString = porsche718PriceString.replace(",", "");
        porsche718PriceString = porsche718PriceString.replace(".", "");
        int porsche718PriceInt = Integer.parseInt(porsche718PriceString);

        porsche718PriceElement.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        String currentWindow = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for (String each : handles) {
            if (!currentWindow.equals(each)) {
                driver.switchTo().window(each);
                System.out.println("window switched.");
                break;

            }
        }

        WebElement expandBtn = driver.findElement(By.xpath("//*[@id=\"s_iccCca\"]/div[1]/div[4]/div[1]/span"));

        expandBtn.click();
        System.out.println("click on arrow");

        WebElement porsche718BasePriceElementConfigurator = driver.findElement(By.xpath
                ("//*[@id='s_iccCca']/div[1]/div[2]/div[2]"));
        String porsche718BasePriceStringConfigurator = porsche718BasePriceElementConfigurator.getText();
        porsche718BasePriceStringConfigurator = porsche718BasePriceStringConfigurator.substring(1);
        porsche718BasePriceStringConfigurator = porsche718BasePriceStringConfigurator.replace(",", "");
        porsche718BasePriceStringConfigurator = porsche718BasePriceStringConfigurator.replace(".", "");
        int porsche718BasePriceInt = Integer.parseInt(porsche718BasePriceStringConfigurator);
        System.out.println(porsche718BasePriceInt);

        Assert.assertTrue(porsche718PriceInt == porsche718BasePriceInt);

    }



    //    @BeforeMethod
//    public void setupB() {
//        driver = Driver.getDriver();
//        driver.manage().window().maximize();
//        driver.get("https://porsche.com/usa/modelstart");
//    }
    @Test
    public void testB() {
        WebElement porsche718 = driver.findElement(By.xpath("//img[@alt='Porsche - 718']"));
        porsche718.click();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement porsche718PriceElement = driver.findElement(By.cssSelector
                ("[data-model-id='1'] [class='m-14-model-price']"));
        porsche718PriceElement.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        String currentWindow = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for (String each : handles) {
            if (!currentWindow.equals(each)) {
                driver.switchTo().window(each);
                System.out.println("window switched.");
                break;
            }
        }

        WebElement porsche718PriceForEquipmentWE = driver.findElement(By.xpath
                ("//div[@class='row']//div[@class='cca-price']"));
        String porsche718PriceForEquipmentString = porsche718PriceForEquipmentWE.getText().substring(1);
        System.out.println(porsche718PriceForEquipmentString);

        Assert.assertTrue(Integer.valueOf(porsche718PriceForEquipmentString) == 0);

    }

//    @AfterMethod
//    public void tearDownB() {
//        driver.close();
//        driver.quit();
//
//    }
//
//    @BeforeMethod
//    public void setupC() {
//        driver = Driver.getDriver();
//        driver.manage().window().maximize();
//        driver.get("https://porsche.com/usa/modelstart");
//    }

    @Test
    public void TestC() {
        WebElement porsche718 = driver.findElement(By.xpath("//img[@alt='Porsche - 718']"));
        porsche718.click();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement porsche718PriceElement = driver.findElement(By.cssSelector
                ("[data-model-id='1'] [class='m-14-model-price']"));
        porsche718PriceElement.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        String currentWindow = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for (String each : handles) {
            if (!currentWindow.equals(each)) {
                driver.switchTo().window(each);
                System.out.println("window switched.");
                break;
            }
        }

        WebElement porsche718TotalPriceWebElementConfigurator = driver.findElement(By.xpath
                ("//div[@class='row highlighted priceTotal separator']//div[@class='cca-price']"));
        String porsche718TotalPriceStringConfigurator = porsche718TotalPriceWebElementConfigurator.getText().replace
                (",","").replace(".", "").substring(1);

        WebElement expandBtn = driver.findElement(By.xpath("//*[@id=\"s_iccCca\"]/div[1]/div[4]/div[1]/span"));
        expandBtn.click();

        WebElement porsche718BasePriceElementConfigurator = driver.findElement(By.xpath
                ("//*[@id='s_iccCca']/div[1]/div[2]/div[2]"));
        String porsche718BasePriceStringConfigurator = porsche718BasePriceElementConfigurator.getText().
                replace(",", "").replace(".", "").substring(1);

        WebElement porsche718DeliveryProcessingAndHandlingFeeElementConfigurator = driver.findElement(By.xpath
                ("//*[@id='s_iccCca']/div[1]/div[3]/div[2]"));
        String porsche718DeliveryProcessingAndHandlingFeeStringConfigurator =
                porsche718DeliveryProcessingAndHandlingFeeElementConfigurator.getText().replace
                        (",", "").replace(".","").substring(1);

        WebElement porsche718PriceForEquipmentElementConfigurator = driver.findElement(By.xpath
                ("//*[@id='s_iccCca']/div[1]/div[4]/div[2]"));
        String porsche718PriceForEquipmentStringConfigurator =
                porsche718PriceForEquipmentElementConfigurator.getText().replace(",","").replace
                        (".","").substring(1);

        int porsche718PriceCombinedConfigurator = Integer.parseInt
                (porsche718BasePriceStringConfigurator) + Integer.parseInt
                (porsche718DeliveryProcessingAndHandlingFeeStringConfigurator) + Integer.parseInt
                (porsche718PriceForEquipmentStringConfigurator);
        System.out.println(porsche718PriceCombinedConfigurator);

        Assert.assertTrue
                (porsche718PriceCombinedConfigurator == Integer.parseInt(porsche718TotalPriceStringConfigurator));

    }

    @Test
    public void TestL() {
        WebElement porsche718 = driver.findElement(By.xpath("//img[@alt='Porsche - 718']"));
        porsche718.click();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement porsche718PriceElement = driver.findElement(By.cssSelector
                ("[data-model-id='1'] [class='m-14-model-price']"));
        porsche718PriceElement.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        String currentWindow = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for (String each : handles) {
            if (!currentWindow.equals(each)) {
                driver.switchTo().window(each);
                System.out.println("window switched.");
                break;
            }
        }

        WebElement miamiBlue = driver.findElement(By.xpath("//li[@id='s_exterieur_x_FJ5']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", miamiBlue);

        String miamiBluePrice = miamiBlue.getAttribute("data-price");
        System.out.println(miamiBluePrice);
        miamiBluePrice = miamiBluePrice.substring(1).replace
                (",", "").replace(".","");
        int miamiBluePriceInt = Integer.parseInt(miamiBluePrice);

        WebElement twentyCarreraSportsWheels = driver.findElement(By.xpath("//li[@id='s_exterieur_x_MXRD']"));
        twentyCarreraSportsWheels.click();
        String wheelsPrice = twentyCarreraSportsWheels.getAttribute("data-price");
        wheelsPrice = wheelsPrice.substring(1).replace(",", "").replace(".","");
        System.out.println(wheelsPrice);
        int wheelsPriceInt = Integer.parseInt(wheelsPrice);

        WebElement powerSportSeats14WayWithMemoryPackage = driver.findElement(By.id("s_interieur_x_PP06"));
        jse.executeScript("arguments[0].click();", powerSportSeats14WayWithMemoryPackage);

        WebElement seatsPrice = driver.findElement(By.xpath
                ("/html[1]/body[1]/div[5]/section[1]/section[2]/div[2]/div[2]/" +
                        "div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]"));
        jse.executeScript("arguments[0].click();", seatsPrice);

        String seatsPriceString = seatsPrice.getText();
        seatsPriceString = seatsPriceString.substring(1).replace
                (",", "").replace(".","");
        int seatsPriceInt = Integer.parseInt(seatsPriceString);

        WebElement interiorCarbonFiber = driver.findElement(By.id("IIC_subHdl"));
        jse.executeScript("arguments[0].click();", interiorCarbonFiber);

        WebElement interiorTrimInCarbonFiberICWStandardInterior = driver.findElement(By.id
                ("vs_table_IIC_x_PEKH_x_c01_PEKH"));
        jse.executeScript("arguments[0].click();", interiorTrimInCarbonFiberICWStandardInterior);

        WebElement interiorTrimInCarbonPrice = driver.findElement(By.xpath
                ("//*[@id=\"vs_table_IIC_x_PEKH\"]/div[1]/div[3]/div"));
        jse.executeScript("arguments[0].click();", interiorTrimInCarbonPrice);

        String interiorTrimInCarbonPriceString = interiorTrimInCarbonPrice.getText();
        interiorTrimInCarbonPriceString = interiorTrimInCarbonPriceString.substring(1).replace
                (",","").replace(".","");
        int interiorTrimInCarbonPriceInt = Integer.parseInt(interiorTrimInCarbonPriceString);

        WebElement performance = driver.findElement(By.id("IMG_subHdl"));
        jse.executeScript("arguments[0].click();", performance);

        WebElement sevenSpeedPorscheDoppelkupplungPDK = driver.findElement(By.xpath
                ("//span[@id='vs_table_IMG_x_M250_x_c11_M250']"));
        jse.executeScript("arguments[0].click();", sevenSpeedPorscheDoppelkupplungPDK);

        WebElement PDKPrice = driver.findElement(By.xpath("//*[@id=\"vs_table_IMG_x_M250\"]/div[1]/div[3]/div"));
        String PDKPriceString = PDKPrice.getText();
        PDKPriceString = PDKPriceString.substring(1).replace(",", "").replace(".","");
        int PDKPriceInt = Integer.parseInt(PDKPriceString);

        WebElement PCCB = driver.findElement(By.xpath("//span[@id='vs_table_IMG_x_M450_x_c81_M450']"));
        jse.executeScript("arguments[0].click();", PCCB);

        WebElement PCCBPrice = driver.findElement(By.xpath("//*[@id=\"vs_table_IMG_x_M450\"]/div[1]/div[3]/div"));
        String PCCBPriceString = PCCBPrice.getText();
        PCCBPriceString = PCCBPriceString.substring(1).replace(",", "").replace(".","");
        int PCCBPriceInt = Integer.parseInt(PCCBPriceString);

        int totalForEquipment = miamiBluePriceInt + wheelsPriceInt + seatsPriceInt +
                interiorTrimInCarbonPriceInt + PDKPriceInt + PCCBPriceInt;

        WebElement porsche718PriceForEquipmentElementConfigurator = driver.findElement(By.xpath
                ("//*[@id='s_iccCca']/div[1]/div[4]/div[2]"));
        String porsche718PriceForEquipmentStringConfigurator =
                porsche718PriceForEquipmentElementConfigurator.getText().replace
                        (",", "").replace(".","").replace("$","");
        int porsche718PriceForEquipmentIntegerConfigurator = Integer.parseInt
                (porsche718PriceForEquipmentStringConfigurator);

        Assert.assertTrue(porsche718PriceForEquipmentIntegerConfigurator == totalForEquipment);

    }

    @Test
    public void TestM() {
        WebElement porsche718 = driver.findElement(By.xpath("//img[@alt='Porsche - 718']"));
        porsche718.click();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement porsche718PriceElement = driver.findElement(By.cssSelector
                ("[data-model-id='1'] [class='m-14-model-price']"));
        porsche718PriceElement.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        String currentWindow = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for (String each : handles) {
            if (!currentWindow.equals(each)) {
                driver.switchTo().window(each);
                System.out.println("window switched.");
                break;
            }
        }

        WebElement porsche718TotalPriceWebElementConfigurator = driver.findElement(By.xpath
                ("//div[@class='row highlighted priceTotal separator']//div[@class='cca-price']"));
        String porsche718TotalPriceStringConfigurator = porsche718TotalPriceWebElementConfigurator.getText().replace
                ("$","").replace(",","").replace(".","");

        WebElement expandBtn = driver.findElement(By.xpath("//*[@id=\"s_iccCca\"]/div[1]/div[4]/div[1]/span"));
        expandBtn.click();

        WebElement porsche718BasePriceElementConfigurator = driver.findElement(By.xpath
                ("//*[@id='s_iccCca']/div[1]/div[2]/div[2]"));
        String porsche718BasePriceStringConfigurator = porsche718BasePriceElementConfigurator.getText().replace
                ("$","").replace(",","").replace(".","");

        WebElement porsche718DeliveryProcessingAndHandlingFeeElementConfigurator = driver.findElement(By.xpath
                ("//*[@id='s_iccCca']/div[1]/div[3]/div[2]"));
        String porsche718DeliveryProcessingAndHandlingFeeStringConfigurator =
                porsche718DeliveryProcessingAndHandlingFeeElementConfigurator.getText().replace
                        ("$","").replace(",","").replace(".","");

        WebElement porsche718PriceForEquipmentElementConfigurator = driver.findElement(By.xpath
                ("//*[@id='s_iccCca']/div[1]/div[4]/div[2]"));
        String porsche718PriceForEquipmentStringConfigurator =
                porsche718PriceForEquipmentElementConfigurator.getText().replace
                        ("$","").replace(",","").replace(".","");

        int porsche718PriceCombinedConfigurator = Integer.parseInt
                (porsche718BasePriceStringConfigurator) + Integer.parseInt
                (porsche718DeliveryProcessingAndHandlingFeeStringConfigurator) + Integer.parseInt
                (porsche718PriceForEquipmentStringConfigurator);

        Assert.assertTrue
                (porsche718PriceCombinedConfigurator == Integer.parseInt(porsche718TotalPriceStringConfigurator));

    }



//    @AfterMethod
//    public void tearDownC() {
//        driver.close();
//        driver.quit();
//
//    }

}
