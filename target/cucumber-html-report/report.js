$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("contactus.feature");
formatter.feature({
  "line": 2,
  "name": "Contact Us Page",
  "description": "As an end user\r\nI want a contact us page\r\nSo that I can find out more about QAWorks exciting services!!",
  "id": "contact-us-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@acceptanceTests"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Valid Submission",
  "description": "",
  "id": "contact-us-page;valid-submission",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am on the QAWorks Site",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I should be able to contact QAWorks with the following information",
  "rows": [
    {
      "cells": [
        "name",
        "email",
        "message"
      ],
      "line": 10
    },
    {
      "cells": [
        "R.Bridge",
        "R.Bridge@qaworks.com",
        "please contact me I want to find out more"
      ],
      "line": 11
    }
  ],
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
});