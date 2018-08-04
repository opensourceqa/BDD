$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("UserRegistration.feature");
formatter.feature({
  "line": 1,
  "name": "User Registration.",
  "description": "",
  "id": "user-registration.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Registar a user",
  "description": "",
  "id": "user-registration.;registar-a-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "navigate to application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "click on signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "enter email address",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click on create an account button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "select title as \"\u003cTitle\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "enter first name as \"\u003cFirstName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "enter last name as\"\u003cLastName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "enter password as\"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "select date of birth as \"\u003cDate\u003e\"-\"\u003cMonth\u003e\"-\"\u003cYear\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "enter address first name as \"\u003cAddressFName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "enter address last name as \"\u003cAddressLName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "enter company name as \"\u003cCompany\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "enter address as \"\u003cAddress\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "enter city as \"\u003cCity\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "select state as \"\u003cState\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "enter zip code as \"\u003cZip\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "select country as \"\u003cCountry\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "enter mobile number as \"\u003cMobileNo\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "enter address alias as \"\u003cAddressAlias\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "click on Register button",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "verify regiestration status",
  "keyword": "Then "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "user-registration.;registar-a-user;",
  "rows": [
    {
      "cells": [
        "Title",
        "FirstName",
        "LastName",
        "Password",
        "Date",
        "Month",
        "Year",
        "AddressFName",
        "AddressLName",
        "Company",
        "Address",
        "City",
        "State",
        "Zip",
        "Country",
        "MobileNo",
        "AddressAlias"
      ],
      "line": 27,
      "id": "user-registration.;registar-a-user;;1"
    },
    {
      "cells": [
        "Mr",
        "Raj",
        "Kumar",
        "Welcome",
        "01",
        "August",
        "1992",
        "Babu",
        "Rao",
        "Google",
        "Gachiboli",
        "Hyderabad",
        "Telengana",
        "0999876",
        "India",
        "9876543210",
        "23-23 park Avinue"
      ],
      "line": 28,
      "id": "user-registration.;registar-a-user;;2"
    },
    {
      "cells": [
        "Mr",
        "Rajesh",
        "Khanna",
        "Welcome",
        "21",
        "December",
        "1972",
        "Raja",
        "Nanu",
        "NYC",
        "Gachiboli",
        "Hyderabad",
        "Telengana",
        "0996",
        "India",
        "9876543211",
        "23-23 park Avinue"
      ],
      "line": 29,
      "id": "user-registration.;registar-a-user;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 28,
  "name": "Registar a user",
  "description": "",
  "id": "user-registration.;registar-a-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "navigate to application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "click on signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "enter email address",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click on create an account button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "select title as \"Mr\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "enter first name as \"Raj\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "enter last name as\"Kumar\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "enter password as\"Welcome\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "select date of birth as \"01\"-\"August\"-\"1992\"",
  "matchedColumns": [
    4,
    5,
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "enter address first name as \"Babu\"",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "enter address last name as \"Rao\"",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "enter company name as \"Google\"",
  "matchedColumns": [
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "enter address as \"Gachiboli\"",
  "matchedColumns": [
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "enter city as \"Hyderabad\"",
  "matchedColumns": [
    11
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "select state as \"Telengana\"",
  "matchedColumns": [
    12
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "enter zip code as \"0999876\"",
  "matchedColumns": [
    13
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "select country as \"India\"",
  "matchedColumns": [
    14
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "enter mobile number as \"9876543210\"",
  "matchedColumns": [
    15
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "enter address alias as \"23-23 park Avinue\"",
  "matchedColumns": [
    16
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "click on Register button",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "verify regiestration status",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 29,
  "name": "Registar a user",
  "description": "",
  "id": "user-registration.;registar-a-user;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "navigate to application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "click on signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "enter email address",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click on create an account button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "select title as \"Mr\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "enter first name as \"Rajesh\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "enter last name as\"Khanna\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "enter password as\"Welcome\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "select date of birth as \"21\"-\"December\"-\"1972\"",
  "matchedColumns": [
    4,
    5,
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "enter address first name as \"Raja\"",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "enter address last name as \"Nanu\"",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "enter company name as \"NYC\"",
  "matchedColumns": [
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "enter address as \"Gachiboli\"",
  "matchedColumns": [
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "enter city as \"Hyderabad\"",
  "matchedColumns": [
    11
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "select state as \"Telengana\"",
  "matchedColumns": [
    12
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "enter zip code as \"0996\"",
  "matchedColumns": [
    13
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "select country as \"India\"",
  "matchedColumns": [
    14
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "enter mobile number as \"9876543211\"",
  "matchedColumns": [
    15
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "enter address alias as \"23-23 park Avinue\"",
  "matchedColumns": [
    16
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "click on Register button",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "verify regiestration status",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});