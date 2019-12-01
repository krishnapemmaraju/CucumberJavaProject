$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/kpemmaraju/eclipse-workspace/SampleCucumberBDDProject/src/main/java/Feature/hooksFeatureExample.feature");
formatter.feature({
  "line": 1,
  "name": "Hooks Feature in Cucumber",
  "description": "",
  "id": "hooks-feature-in-cucumber",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Hooks Feature in Cucumber",
  "description": "",
  "id": "hooks-feature-in-cucumber;hooks-feature-in-cucumber",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on LoginPage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Enters valid userName and Password and click SingIN",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Should be on MyAccountPage",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on MyPersonalInformation button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User should be on \"\u003cusername\u003e\" , \"\u003cpassword\u003e\" MyPersonal Information Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "hooks-feature-in-cucumber;hooks-feature-in-cucumber;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "hooks-feature-in-cucumber;hooks-feature-in-cucumber;;1"
    },
    {
      "cells": [
        "test1",
        "test2"
      ],
      "line": 13,
      "id": "hooks-feature-in-cucumber;hooks-feature-in-cucumber;;2"
    },
    {
      "cells": [
        "test3",
        "test4"
      ],
      "line": 14,
      "id": "hooks-feature-in-cucumber;hooks-feature-in-cucumber;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 219100,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Hooks Feature in Cucumber",
  "description": "",
  "id": "hooks-feature-in-cucumber;hooks-feature-in-cucumber;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on LoginPage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Enters valid userName and Password and click SingIN",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Should be on MyAccountPage",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on MyPersonalInformation button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User should be on \"test1\" , \"test2\" MyPersonal Information Page",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefinitionExample.user_is_on_LoginPage()"
});
formatter.result({
  "duration": 135630700,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinitionExample.user_Enters_valid_userName_and_Password_and_click_SingIN()"
});
formatter.result({
  "duration": 103100,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinitionExample.user_Should_be_on_MyAccountPage()"
});
formatter.result({
  "duration": 73800,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinitionExample.click_on_MyPersonalInformation_button()"
});
formatter.result({
  "duration": 78200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test1",
      "offset": 19
    },
    {
      "val": "test2",
      "offset": 29
    }
  ],
  "location": "HooksStepDefinitionExample.user_should_be_on_MyPersonal_Information_Page(String,String)"
});
formatter.result({
  "duration": 3512800,
  "status": "passed"
});
formatter.after({
  "duration": 125900,
  "status": "passed"
});
formatter.before({
  "duration": 294000,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Hooks Feature in Cucumber",
  "description": "",
  "id": "hooks-feature-in-cucumber;hooks-feature-in-cucumber;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on LoginPage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Enters valid userName and Password and click SingIN",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Should be on MyAccountPage",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on MyPersonalInformation button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User should be on \"test3\" , \"test4\" MyPersonal Information Page",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefinitionExample.user_is_on_LoginPage()"
});
formatter.result({
  "duration": 87100,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinitionExample.user_Enters_valid_userName_and_Password_and_click_SingIN()"
});
formatter.result({
  "duration": 80200,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinitionExample.user_Should_be_on_MyAccountPage()"
});
formatter.result({
  "duration": 72200,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinitionExample.click_on_MyPersonalInformation_button()"
});
formatter.result({
  "duration": 78800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test3",
      "offset": 19
    },
    {
      "val": "test4",
      "offset": 29
    }
  ],
  "location": "HooksStepDefinitionExample.user_should_be_on_MyPersonal_Information_Page(String,String)"
});
formatter.result({
  "duration": 136600,
  "status": "passed"
});
formatter.after({
  "duration": 56700,
  "status": "passed"
});
});