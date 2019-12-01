$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/kpemmaraju/eclipse-workspace/SampleCucumberBDDProject/src/main/java/Feature/cucumberTags.feature");
formatter.feature({
  "line": 1,
  "name": "Automation Test Website",
  "description": "",
  "id": "automation-test-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login with Valid UserName and Password",
  "description": "",
  "id": "automation-test-website;login-with-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    },
    {
      "line": 3,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "This is a valid Login",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberTagStepDefinition.this_is_a_valid_Login()"
});
formatter.result({
  "duration": 89415200,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Update the Customer EmailAdrress",
  "description": "",
  "id": "automation-test-website;update-the-customer-emailadrress",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "This is a MyAccount Customer EmailAddress Update",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberTagStepDefinition.this_is_a_MyAccount_Customer_EmailAddress_Update()"
});
formatter.result({
  "duration": 28000,
  "status": "passed"
});
});