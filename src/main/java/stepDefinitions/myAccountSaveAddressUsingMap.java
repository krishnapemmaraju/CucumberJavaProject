package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
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

public class myAccountSaveAddressUsingMap {
	
	WebDriver driver;
	Properties prop = new Properties();
	public static String myAccAddrAlias = "";
	
	@Given("^User is on SignIn PageMaps$")
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
	
	@Then("^User enters username and password and click on Sign INMaps$")
	public void UserLoginOnPage(DataTable dts) {
		  
		for ( Map<String, String> data : dts.asMaps(String.class, String.class))
		{
		 driver.findElement(By.id("email")).sendKeys(data.get("username"));
	     driver.findElement(By.id("passwd")).sendKeys(data.get("password"));
	     driver.findElement(By.id("SubmitLogin")).click();
	   	} 
		}
	
	@Then("^User is on MyAccountPageMaps$")
	public void UserOnMyAccPage() {
		String myAcctitle = driver.getTitle();
		Assert.assertEquals(myAcctitle, "My account - My Store");
	}

	@Then("^User Click on My Address buttonMaps$")
	public void UserClicksOnMyAddressButton() {
		driver.findElement(By.xpath("//a[@title='Addresses']")).click();
		String myAddrTitle = driver.getTitle();
		Assert.assertEquals(myAddrTitle, "Addresses - My Store");
	}
	
	@Then("^User Clicks on Add a New Address buttonMaps$")
	public void UserAddNewAddrButton() {
		driver.findElement(By.xpath("//a[@title='Add an address']")).click();
	}
	
	@Then("^User enters CustomerAddress and click on SaveMaps$")
	public void UserAddNewAddrData(DataTable addrData) {
		
		for ( Map<String, String> adddataList : addrData.asMaps(String.class, String.class))
		{
		driver.findElement(By.id("address1")).sendKeys(adddataList.get("Address"));
		driver.findElement(By.id("city")).sendKeys(adddataList.get("City"));
		Select newcustSate = new Select(driver.findElement(By.id("id_state")));
		newcustSate.selectByValue(adddataList.get("State"));
		driver.findElement(By.id("postcode")).sendKeys(adddataList.get("Postcode"));
		driver.findElement(By.id("phone_mobile")).sendKeys(adddataList.get("MobilePhone"));
		driver.findElement(By.id("alias")).clear();
		driver.findElement(By.id("alias")).sendKeys(adddataList.get("AddressAlias"));
		myAccAddrAlias = adddataList.get("AddressAlias");
		driver.findElement(By.id("submitAddress")).click();
		String getNewAddrAlias = driver.findElement(By.xpath("//h3[@class='page-subheading' and contains(text(),'"+myAccAddrAlias+"')]")).getText();
	    System.out.println("Expected Addres Alias is "+myAccAddrAlias.toUpperCase() + "Actual MyAddress Alias is :" + getNewAddrAlias);
		Assert.assertEquals(myAccAddrAlias.toUpperCase(), getNewAddrAlias);
		driver.findElement(By.xpath("//a[@title='Add an address']")).click();
		}
	}
	
	@Then("^Close the BrowserMaps$")
	public void teardown() {
		driver.quit();
	}

}
