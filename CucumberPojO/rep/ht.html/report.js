$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/LoginFeature.feature");
formatter.feature({
  "name": "Verifying adactin Hotel booking",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verifying adactin login page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on Adactin login Page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enter the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user enter the loginButton",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "dina2311",
        "D@12345678"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying adactin login page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on Adactin login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.user_is_on_Adactin_login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the \"dina2311\" and \"D@12345678\"",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.user_enter_the_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the loginButton",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_enter_the_loginButton()"
});
formatter.result({
  "status": "passed"
});
});