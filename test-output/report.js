$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/kpemmaraju/eclipse-workspace/SampleCucumberBDDProject/src/main/java/Feature/SaveAddressMyAccount.feature");
formatter.feature({
  "line": 1,
  "name": "Save Address to My Account",
  "description": "",
  "id": "save-address-to-my-account",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Save Address for Customer",
  "description": "",
  "id": "save-address-to-my-account;save-address-for-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on SignIn Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters username and password and click on Sign IN",
  "rows": [
    {
      "cells": [
        "kk300@gmail.com",
        "krish16"
      ],
      "line": 7
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User is on MyAccountPage",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User Click on My Address button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User Clicks on Add a New Address button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User enters CustomerAddress and click on Save",
  "rows": [
    {
      "cells": [
        "TestAddress6",
        "Manchester",
        "4",
        "87656",
        "09897889",
        "MyAddress6"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Validate the New Address by capturing Header",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Close the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "myAccountCustAddrStepDefnition.UserOnSignInPage()"
});
formatter.result({
  "duration": 13740658700,
  "status": "passed"
});
formatter.match({
  "location": "myAccountCustAddrStepDefnition.UserLoginOnPage(DataTable)"
});
formatter.result({
  "duration": 1631870000,
  "status": "passed"
});
formatter.match({
  "location": "myAccountCustAddrStepDefnition.UserOnMyAccPage()"
});
formatter.result({
  "duration": 15274000,
  "status": "passed"
});
formatter.match({
  "location": "myAccountCustAddrStepDefnition.UserClicksOnMyAddressButton()"
});
formatter.result({
  "duration": 793938100,
  "status": "passed"
});
formatter.match({
  "location": "myAccountCustAddrStepDefnition.UserAddNewAddrButton()"
});
formatter.result({
  "duration": 848945200,
  "status": "passed"
});
formatter.match({
  "location": "myAccountCustAddrStepDefnition.UserAddNewAddrData(DataTable)"
});
formatter.result({
  "duration": 1909594200,
  "status": "passed"
});
formatter.match({
  "location": "myAccountCustAddrStepDefnition.captureNewAddrAlias()"
});
formatter.result({
  "duration": 33200400,
  "status": "passed"
});
formatter.match({
  "location": "myAccountCustAddrStepDefnition.teardown()"
});
formatter.result({
  "duration": 717555900,
  "status": "passed"
});
});