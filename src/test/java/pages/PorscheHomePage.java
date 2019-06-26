package pages;

import utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PorscheHomePage {

	WebDriver driver;

	public PorscheHomePage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);

	}
	@FindBy(linkText = "DRESSES")
	public WebElement mainMenuDresses;

	@FindBy(linkText = "CASUAL DRESSES")
	public WebElement casualDresses;
	
	@FindBy(xpath = "//div[@id ='center_column']//h1/span[1]")
	public WebElement headerText;
	
	@FindBy(xpath="//a[@class='login']")
	public WebElement signInBtn;
	
	@FindBy(xpath="//input[@id='email_create']")
	public WebElement emailField;
	
	@FindBy(xpath = "//button[@id='SubmitCreate']")
	public WebElement createAccountBtn;	
	
	
}
	
	
	
	





	
	
	

