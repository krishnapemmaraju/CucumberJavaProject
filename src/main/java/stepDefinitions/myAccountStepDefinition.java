package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class myAccountStepDefinition {
	
	WebDriver driver;
	loginStepDefinition loginStep = new loginStepDefinition();
	
	@Given("^User already logged on to homepage$")
	public void navigateToMyAccountPage() {
		System.setProperty("webdriver.chrome.driver", "C:\\KrishnaData\\Selenium\\chromedriver_win3277V\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.linkText("Sign in")).click();
	}
	
	@When("^Title is My account - My Store$")
	public void validMyAccTitle() throws Throwable {
	     String myaccTitile = driver.getTitle();
	     Assert.assertEquals("My account - My Store",myaccTitile);
	}
	
	@Then("^User clicks on My Personal Information button$")
	public void MyPersonalInfo() {
		driver.findElement(By.linkText("My Personal information")).click();
	}
	
	@Then("^Extract the First Name and LastName$")
	public void getLastFirstName() {
		String firstName = driver.findElement(By.id("firstname")).getAttribute("value");
		String lastName = driver.findElement(By.id("lastname")).getAttribute("value");
        System.out.println(firstName+lastName);
	}
}
