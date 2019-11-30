package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.runtime.model.CucumberBackground;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\kpemmaraju\\eclipse-workspace\\SampleCucumberBDDProject\\src\\main\\java\\Feature\\SaveAddressMyAccount.feature",
		glue={"stepDefinitions"}, //path of STep Definitions
		format= {"pretty","html:test-output","json:json-output/cucumber.json","junit:junit-output/cucumber.xml"}, //,"json:json-output/cucumber.json or "junit:junit_xml/cucumber.xml - To generate different types of reporting
		monochrome = true, //display the console output in a proper readable format
		strict=true, // it will check if there are pending or undefined steps are there , but it will execute the other steps
		dryRun=false// will let you know the steps which are not implemented
		)

public class TestRunner {
	
	

}
