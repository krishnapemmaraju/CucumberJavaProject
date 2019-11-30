package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateCustomerStepDefinition {
	
	WebDriver driver;
	
	@Given("^user is on websiteHomePage$")
	public void user_on_websiteHomepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\KrishnaData\\Selenium\\chromedriver_win3277V\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
	}

	@When("^User clicks on SignIn link$")
	public void ClickOnSignInLink() {
		driver.findElement(By.linkText("Sign in")).click();
	}
	
	@Then("^Enter the new \"(.*)\" and click on Create Account$")
	public void enterNewEmailAccount(String emailID) {
		driver.findElement(By.id("email_create")).sendKeys(emailID);
		driver.findElement(By.id("SubmitCreate")).click();
	}
	
	@Then("^Select Title$")
	public void selectTitle() {
		driver.findElement(By.id("id_gender1")).click();
	}
	
	@Then("^Enter \"(.*)\" , \"(.*)\" , \"(.*)\"$")
	public void EnterFirstLastPassword(String FirstName,String LastName,String Password) {
		driver.findElement(By.id("customer_firstname")).sendKeys(FirstName);
		driver.findElement(By.id("customer_lastname")).sendKeys(LastName);
		driver.findElement(By.id("passwd")).sendKeys(Password);
	}
	
	@Then("^select \"(.*)\" , \"(.*)\" , \"(.*)\"$" )
	public void EnterCustDOB(String BirthDay,String BirthMonth,String BirthYear) {
		Select BDay = new Select(driver.findElement(By.id("days")));
		BDay.selectByValue(BirthDay);
		Select BMonth = new Select(driver.findElement(By.id("months")));
		BMonth.selectByValue(BirthMonth);
		Select BYear = new Select(driver.findElement(By.id("years")));
		BYear.selectByValue(BirthYear);
	}
	
	@Then("^Enter Address \"(.*)\" , \"(.*)\" , \"(.*)\" , \"(.*)\" , \"(.*)\"$")
	public void EnterCustAddress(String Address,String City,String State,String Postcode,String MobilePhone) {
		driver.findElement(By.id("address1")).sendKeys(Address);
		driver.findElement(By.id("city")).sendKeys(City);
		Select custState = new Select (driver.findElement(By.id("id_state")));
		custState.selectByValue(State);
		driver.findElement(By.id("postcode")).sendKeys(Postcode);
		driver.findElement(By.id("phone_mobile")).sendKeys(MobilePhone);
	}
   
	@Then("^Click on Register$")
	public void ClickOnRegister() {
		driver.findElement(By.id("submitAccount")).click();
	}

   @Then("^Verify Account Name \"(.*)\" , \"(.*)\"$")
   public void verifyAccName(String FirstName,String LastName) {
	   String getFirstLastName = driver.findElement(By.xpath("//a[@title='View my customer account']")).getText();
	   System.out.println(FirstName+LastName);
	   Assert.assertEquals(FirstName +" " + LastName, getFirstLastName);
   }
   
   @Then("^close the browser$")
   public void teardown() {
	   driver.quit();
   }
}
