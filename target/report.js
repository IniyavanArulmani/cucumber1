$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login Function",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To check Add customer function by entering valid details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepsCheck.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter some valid details",
  "rows": [
    {
      "cells": [
        "iniyavan",
        "arulmani"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepsCheck.user_enter_some_valid_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters remaining details",
  "rows": [
    {
      "cells": [
        "email",
        "iniyavan7777@gmail.com"
      ]
    },
    {
      "cells": [
        "message",
        "Hai Java"
      ]
    },
    {
      "cells": [
        "telepone",
        "9677772535"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepsCheck.user_enters_remaining_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify wheather able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepsCheck.verify_wheather_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/features/Tariff.feature");
formatter.feature({
  "name": "Tariff plan",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To Validate tariff plan is getting added for a customer",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User enter the tariff details \"\u003cMontlyRental\u003e\",\"\u003cFreeLocalMinutes\u003e\",\"\u003cFreeInternationalMinutes\u003e\",\"\u003cFreeSMS\u003e\",\"\u003cLocalperCharge\u003e\",\"\u003cInternationalperCharge\u003e\",\"\u003cSMSperCharge\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Check weather tariff added successfully at a time",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "MontlyRental",
        "FreeLocalMinutes",
        "FreeInternationalMinutes",
        "FreeSMS",
        "LocalperCharge",
        "InternationalperCharge",
        "SMSperCharge"
      ]
    },
    {
      "cells": [
        "10",
        "20",
        "3",
        "100",
        "200",
        "300",
        "700"
      ]
    },
    {
      "cells": [
        "19",
        "30",
        "4",
        "400",
        "200",
        "400",
        "600"
      ]
    },
    {
      "cells": [
        "15",
        "40",
        "5",
        "500",
        "200",
        "300",
        "600"
      ]
    },
    {
      "cells": [
        "14",
        "50",
        "6",
        "200",
        "900",
        "100",
        "300"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "TariffPlanSteps.user_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To Validate tariff plan is getting added for a customer",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User enter the tariff details \"10\",\"20\",\"3\",\"100\",\"200\",\"300\",\"700\"",
  "keyword": "When "
});
formatter.match({
  "location": "TariffPlanSteps.user_enter_the_tariff_details(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check weather tariff added successfully at a time",
  "keyword": "Then "
});
formatter.match({
  "location": "TariffPlanSteps.check_weather_tariff_added_successfully_at_a_time()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "TariffPlanSteps.user_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To Validate tariff plan is getting added for a customer",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User enter the tariff details \"19\",\"30\",\"4\",\"400\",\"200\",\"400\",\"600\"",
  "keyword": "When "
});
formatter.match({
  "location": "TariffPlanSteps.user_enter_the_tariff_details(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check weather tariff added successfully at a time",
  "keyword": "Then "
});
formatter.match({
  "location": "TariffPlanSteps.check_weather_tariff_added_successfully_at_a_time()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "TariffPlanSteps.user_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To Validate tariff plan is getting added for a customer",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User enter the tariff details \"15\",\"40\",\"5\",\"500\",\"200\",\"300\",\"600\"",
  "keyword": "When "
});
formatter.match({
  "location": "TariffPlanSteps.user_enter_the_tariff_details(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check weather tariff added successfully at a time",
  "keyword": "Then "
});
formatter.match({
  "location": "TariffPlanSteps.check_weather_tariff_added_successfully_at_a_time()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "TariffPlanSteps.user_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To Validate tariff plan is getting added for a customer",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User enter the tariff details \"14\",\"50\",\"6\",\"200\",\"900\",\"100\",\"300\"",
  "keyword": "When "
});
formatter.match({
  "location": "TariffPlanSteps.user_enter_the_tariff_details(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check weather tariff added successfully at a time",
  "keyword": "Then "
});
formatter.match({
  "location": "TariffPlanSteps.check_weather_tariff_added_successfully_at_a_time()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});