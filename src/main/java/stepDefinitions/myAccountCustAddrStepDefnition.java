package stepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class myAccountCustAddrStepDefnition {
	
	WebDriver driver;
	Properties prop = new Properties();
	public static String myAccAddrAlias = "";
	
	@Given("^User is on SignIn Page$")
	public void UserOnSignInPage() throws IOException {
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
	
	@Then("^User enters username and password and click on Sign IN$")
	public void UserLoginOnPage(DataTable dts) {
		List<List<String>> data = dts.raw();
		 driver.findElement(By.id("email")).sendKeys(data.get(0).get(0).toString());
	     driver.findElement(By.id("passwd")).sendKeys(data.get(0).get(1).toString());
	     driver.findElement(By.id("SubmitLogin")).click();
	}
	
	@Then("^User is on MyAccountPage$")
	public void UserOnMyAccPage() {
		String myAcctitle = driver.getTitle();
		Assert.assertEquals(myAcctitle, "My account - My Store");
	}

	@Then("^User Click on My Address button$")
	public void UserClicksOnMyAddressButton() {
		driver.findElement(By.xpath("//a[@title='Addresses']")).click();
		String myAddrTitle = driver.getTitle();
		Assert.assertEquals(myAddrTitle, "Addresses - My Store");
	}
	
	@Then("^User Clicks on Add a New Address button$")
	public void UserAddNewAddrButton() {
		driver.findElement(By.xpath("//a[@title='Add an address']")).click();
	}
	
	@Then("^User enters CustomerAddress and click on Save$")
	public void UserAddNewAddrData(DataTable addrData) {
		List<List<String>> adddataList = addrData.raw();
		driver.findElement(By.id("address1")).sendKeys(adddataList.get(0).get(0));
		driver.findElement(By.id("city")).sendKeys(adddataList.get(0).get(1));
		Select newcustSate = new Select(driver.findElement(By.id("id_state")));
		newcustSate.selectByValue(adddataList.get(0).get(2));
		driver.findElement(By.id("postcode")).sendKeys(adddataList.get(0).get(3));
		driver.findElement(By.id("phone_mobile")).sendKeys(adddataList.get(0).get(4));
		driver.findElement(By.id("alias")).clear();
		driver.findElement(By.id("alias")).sendKeys(adddataList.get(0).get(5));
		myAccAddrAlias = adddataList.get(0).get(5);
		driver.findElement(By.id("submitAddress")).click();
	}
	
	@Then("^Validate the New Address by capturing Header$")
	  public void captureNewAddrAlias() {
		String getNewAddrAlias = driver.findElement(By.xpath("//h3[@class='page-subheading' and contains(text(),'"+myAccAddrAlias+"')]")).getText();
	    Assert.assertEquals(myAccAddrAlias.toUpperCase(), getNewAddrAlias);
	}
	
	@Then("^Close the Browser$")
	public void teardown() {
		driver.quit();
	}
}
