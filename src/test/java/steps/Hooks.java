//package steps;
//
//import utilities.Driver;
//import cucumber.api.Scenario;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//
//import java.util.concurrent.TimeUnit;
//
//public class Hooks {
//	@Before
//	public void setUp() {
//		WebDriver driver = Driver.getDriver();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.manage().window().fullscreen();

//		//driver.get("https://porsche.com/");

//
//	}
//
//	@After
//	public void tearDown(Scenario scenario) {  //screenshot
//		if(scenario.isFailed()) {
//			final byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//			scenario.embed(screenshot, "image/png");
//			scenario.write("This scenario Failed");
//		}
//
//		Driver.closeDriver();
//	}
//
//}
