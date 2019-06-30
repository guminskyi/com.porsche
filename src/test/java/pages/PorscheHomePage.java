package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class PorscheHomePage {

	WebDriver driver;

	@Test
	public void testA() throws InterruptedException {
		driver = Driver.getDriver();
		driver.get("https://porsche.com/usa/modelstart");
		WebElement porsche718 = driver.findElement(By.xpath("//img[@alt='Porsche - 718']"));
		porsche718.click();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		WebElement porsche718PriceElement = driver.findElement(By.cssSelector("body.pool-usa.lang-none:nth-child(2)" +
				" div.b-page-wrapper.page.nonavi:nth-child(1) div.m-14-model-overview.m-14-cc.m-14-model-overview--initialized:nth-child(6)" +
				" div.m-14-models-view.module-container:nth-child(1) div.module-grid div.m-14-result-row.m-14-result-context.content-full-width div.m-14-model-series.module-grid:nth-child(2)" +
				" div.m-14-model-tile.visible:nth-child(3) div.m-14-model-tile-link-overview div.m-14-model-tile-title > div.m-14-model-price"));

		String porsche718PriceElementStringFromElement = porsche718PriceElement.getText();
		System.out.println(porsche718PriceElement);

		String porsche718PriceString = porsche718PriceElementStringFromElement.substring
				(7, porsche718PriceElementStringFromElement.length() - 1);
		System.out.println(porsche718PriceString);

		porsche718PriceElement.click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		String url = driver.getWindowHandle();
		driver.switchTo().window(url);

		List<String> allHandles = new ArrayList<>(driver.getWindowHandles());

		driver.switchTo().window(allHandles.get(1));  // <=== switching to 718 Cayman S window
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement miamiBlue = driver.findElement(By.xpath("//li[@id='s_exterieur_x_FJ5']//span"));
		miamiBlue.click();

		WebElement priceExpandBtn = driver.findElement(By.xpath("//*[@id=\"s_iccCca\"]/div[1]/div[4]/div[1]/span"));
		priceExpandBtn.click();
	}

        @Test(priority = 18)
		public void test18() {
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			WebElement interiorCarbonFiber = driver.findElement(By.xpath("//div[@id ='IIC_subHdl']"));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", interiorCarbonFiber);
		}
        @Test(priority = 19)
				public void test19() {
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			WebElement interiorTrimInCarbonFiber = driver.findElement(By.id("vs_table_IIC_x_PEKH_x_c01_PEKH"));
			JavascriptExecutor executor1 = (JavascriptExecutor) driver;
			executor1.executeScript("arguments[0].click();", interiorTrimInCarbonFiber);
		}
        @Test(priority = 20)
				public void test20() {
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			WebElement priceForEquipment = driver.findElement(By.xpath("//div[@class='row']//div[@class='cca-price']"));
			priceForEquipment.click();
		}
        @Test(priority = 21)
				public void test21(){
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		WebElement totalPrice = driver.findElement(By.xpath("//div[@class='cca-price']"));
		totalPrice.click();


	}
}
	





	
	
	

