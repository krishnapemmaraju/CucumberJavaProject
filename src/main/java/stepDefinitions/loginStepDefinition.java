package stepDefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class loginStepDefinition {
	
	WebDriver driver;
	public static Properties prop = new Properties();
	
	@Given("^I am already on Login Page$")
	public void user_already_login_page() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\kpemmaraju\\eclipse-workspace\\SampleCucumberBDDProject\\src\\main\\java\\CucumberConfigFile\\config.properties");
        prop.load(fis);
		System.setProperty("webdriver.chrome.driver", "C:\\KrishnaData\\Selenium\\chromedriver_win3277V\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.linkText("Sign in")).click();
	}

	@When("^Title is My Store$")
	public void user_login_page_title() {
		String title =   driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Login - My Store", title);
	}
	
	// another regular expression - \"([^\"]*)\"
	
	@Then("^User enters valid \"(.*)\" and User enters valid \"(.*)\"$")
	public void user_enters_valid_username_and_User_enters_valid_password(String username , String password) throws Throwable {
	      driver.findElement(By.id("email")).sendKeys(username);
	      driver.findElement(By.id("passwd")).sendKeys(password);
	}
	
	@Then("^User clicks on Login button$")
	public myAccountStepDefinition user_clicks_on_Login_button() throws Throwable {
	      driver.findElement(By.id("SubmitLogin")).click();
	      return new myAccountStepDefinition();
	}

	@Then("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	      String myaccTitle = driver.getTitle();
	      Assert.assertEquals("My account - My Store", myaccTitle);
	}
	
	@Then("^Close the browser$")
	public void teardown() {
		driver.quit();
	}
}
