package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksStepDefinitionExample {
	
	@Before
	public void Setup() {
		System.out.println("Launch the URL");
	}
	
	@Given("^User is on LoginPage$")
	public void user_is_on_LoginPage() throws Throwable {
		System.out.println("User is on SignIn Page");
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^User Enters valid userName and Password and click SingIN$")
	public void user_Enters_valid_userName_and_Password_and_click_SingIN() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User enters Valid UserName and Password");

	}

	@Then("^User Should be on MyAccountPage$")
	public void user_Should_be_on_MyAccountPage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is on My Account Page");

	}

	@Then("^Click on MyPersonalInformation button$")
	public void click_on_MyPersonalInformation_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User clicks on MyPersonalInformation button");

	}

	@Then("^User should be on \"(.*)\" , \"(.*)\" MyPersonal Information Page$")
	public void user_should_be_on_MyPersonal_Information_Page(String username , String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is on MyAccountPersonalInformation Page");
		System.out.println("The UserName is " + username + " and " + "The password is " + password );
	}
	
	@After
	public void teardown() {
		System.out.println("Close the browser");
	}

}
