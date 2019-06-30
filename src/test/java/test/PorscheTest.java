package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PorscheTest {

    WebDriver driver;

    @BeforeMethod
    public void BeforeMethod (){
        driver = Driver.getDriver();
        driver.get("https://porsche.com/usa/modelstart");
        WebElement porsche718 = driver.findElement(By.xpath("//img[@alt='Porsche - 718']"));
        porsche718.click();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

//    @Test(priority = 6)
//    public void test6() {
//        WebElement porsche718PriceElement = driver.findElement(By.cssSelector("body.pool-usa.lang-none:nth-child(2)" +
//                " div.b-page-wrapper.page.nonavi:nth-child(1) div.m-14-model-overview.m-14-cc.m-14-model-overview--initialized:nth-child(6)" +
//                " div.m-14-models-view.module-container:nth-child(1) div.module-grid div.m-14-result-row.m-14-result-context.content-full-width div.m-14-model-series.module-grid:nth-child(2)" +
//                " div.m-14-model-tile.visible:nth-child(3) div.m-14-model-tile-link-overview div.m-14-model-tile-title > div.m-14-model-price"));
//        String porsche718PriceElementString = porsche718PriceElement.getText();
//        String porsche718BasePrice1 = porsche718PriceElementString.substring
//                (7, porsche718PriceElementString.length() - 4);
//        porsche718PriceElement.click();
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        List<String> allHandles = new ArrayList<>(driver.getWindowHandles());
//
//        driver.switchTo().window(allHandles.get(1));  // <=== switching to 718 Cayman S window
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement miamiBlue = driver.findElement(By.xpath("//span[@style='background-color: rgb(0, 120, 138);']"));
//
//        //WebElement priceExpandBtn = driver.findElement(By.xpath("(//div[@class='cca-label']//span[@class='expandButton'])[1]"));
//        WebElement priceExpandBtn = driver.findElement(By.xpath("//*[@id=\"s_iccCca\"]/div[1]/div[4]/div[1]/span"));
//        priceExpandBtn.click();
//        String porsche718BasePrice2String = driver.findElement(By.xpath("//*[@id=\"s_iccCca\"]/div[1]/div[2]/div[2]")).getText();
//        String porsche718BasePrice2 = porsche718BasePrice2String.substring
//                (1);
//        Assert.assertTrue(porsche718BasePrice1.equals(porsche718BasePrice2));
//    }
//    @Test (priority = 7)
//    public void test7() {
//        WebElement porsche718PriceElement = driver.findElement(By.cssSelector("body.pool-usa.lang-none:nth-child(2) div.b-page-wrapper.page.nonavi:nth-child(1) div.m-14-model-overview.m-14-cc.m-14-model-overview--initialized:nth-child(6) div.m-14-models-view.module-container:nth-child(1) div.module-grid div.m-14-result-row.m-14-result-context.content-full-width div.m-14-model-series.module-grid:nth-child(2) div.m-14-model-tile.visible:nth-child(3) div.m-14-model-tile-link-overview div.m-14-model-tile-title > div.m-14-model-price"));
//        porsche718PriceElement.click();
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        List<String> allHandles = new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(allHandles.get(1));  // <=== switching to 718 Cayman S window
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement priceExpandBtn = driver.findElement(By.xpath("//*[@id=\"s_iccCca\"]/div[1]/div[4]/div[1]/span"));
//        priceExpandBtn.click();
//
//        String priceForEquipmentString = driver.findElement(By.xpath("//*[@id=\"s_iccCca\"]/div[1]/div[4]/div[2]")).getText();
//        String priceForEquipment = priceForEquipmentString.substring(1);
//        Assert.assertTrue(priceForEquipment.equals("0"));
//    }

    @Test (priority = 21)
    public void test21(){
        WebElement porsche718PriceElement = driver.findElement(By.cssSelector("body.pool-usa.lang-none:nth-child(2) div.b-page-wrapper.page.nonavi:nth-child(1) div.m-14-model-overview.m-14-cc.m-14-model-overview--initialized:nth-child(6) div.m-14-models-view.module-container:nth-child(1) div.module-grid div.m-14-result-row.m-14-result-context.content-full-width div.m-14-model-series.module-grid:nth-child(2) div.m-14-model-tile.visible:nth-child(3) div.m-14-model-tile-link-overview div.m-14-model-tile-title > div.m-14-model-price"));
        porsche718PriceElement.click();

        List<String> allHandles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(allHandles.get(1));  // <=== switching to 718 Cayman S window

        WebElement miamiBlue = driver.findElement(By.id("s_exterieur_x_FJ5"));
        miamiBlue.click();

        WebElement twentyInchCarreraSportSWheels = driver.findElement(By.xpath("//li[@id='s_exterieur_x_MXRD']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();",twentyInchCarreraSportSWheels);

        WebElement powerSportSeatsWMemoryPackage = driver.findElement(By.xpath("//span[@id='s_interieur_x_PP06']"));
        jse.executeScript("arguments[0].click();",powerSportSeatsWMemoryPackage);

        WebElement interiorCarbonFiber = driver.findElement(By.id("IIC_subHdl"));
        jse.executeScript("arguments[0].click();",interiorCarbonFiber);

        WebElement standardInterior = driver.findElement(By.id("vs_table_IIC_x_PEKH_x_c01_PEKH"));
        jse.executeScript("arguments[0].click();",standardInterior);

        String totalPriceStringOriginal = driver.findElement(By.xpath("//div[@class='row highlighted priceTotal separator']//div[@class='cca-price']")).getText();
        String totalPriceString = totalPriceStringOriginal.replace("$", "").replace(",", "");
        int totalPrice = Integer.parseInt(totalPriceString);

        String priceForEquipmentStringOriginal = driver.findElement(By.xpath("//div[@class='row']//div[@class='cca-price']")).getText();
        String priceForEquipmentString = priceForEquipmentStringOriginal.replace("$", "").replace(",", "");
        int priceForEquipment = Integer.parseInt(priceForEquipmentString);

        WebElement priceExpandBtn = driver.findElement(By.xpath("//*[@id=\"s_iccCca\"]/div[1]/div[4]/div[1]/span"));
        priceExpandBtn.click();

        String basePriceStringOriginal = driver.findElement(By.xpath("//*[@id=\"s_iccCca\"]/div[1]/div[2]/div[2]")).getText();
        String basePriceString = basePriceStringOriginal.replace("$", "").replace(",", "");
        int basePrice = Integer.parseInt(basePriceString);

        String deliveryProcessingHandlingFeeStringOriginal = driver.findElement(By.xpath("(//div[@class='row additional']//div[@class='cca-price'])[2]")).getText();
        String deliveryProcessingHandlingFeeString = deliveryProcessingHandlingFeeStringOriginal.replace("$", "").replace(",", "");
        int deliveryProcessingHandlingFee = Integer.parseInt(deliveryProcessingHandlingFeeString);

        Assert.assertTrue(totalPrice == basePrice + priceForEquipment + deliveryProcessingHandlingFee);
    }
}
