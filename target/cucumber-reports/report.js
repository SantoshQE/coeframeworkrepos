$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/functionalTests/Feature2.feature");
formatter.feature({
  "name": "Feature2 Automated Test",
  "description": "  Automated smoke test for Feature2 functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Feature2 functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the google homepage",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters the search text \"\u003csearchText\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on search and verify the search results retrieved by google",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "searchText"
      ]
    },
    {
      "cells": [
        "Selenium"
      ]
    },
    {
      "cells": [
        "Azure DevOps"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Feature2 functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the google homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.userIsOnTheGoogleHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.write("Inside teardown method--\u003eTest Passed");
formatter.embedding("image/png", "embedded0.png", "Test");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "the user enters the search text \"Selenium\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.googlesearchtextentery(String)"
});
formatter.result({
  "status": "passed"
});
formatter.write("Inside teardown method--\u003eTest Passed");
formatter.embedding("image/png", "embedded1.png", "Test");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "click on search and verify the search results retrieved by google",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.clickOnSearchbuttonandVerify()"
});
formatter.result({
  "status": "passed"
});
formatter.write("Inside teardown method--\u003eTest Passed");
formatter.embedding("image/png", "embedded2.png", "Test");
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Feature2 functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the google homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.userIsOnTheGoogleHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.write("Inside teardown method--\u003eTest Passed");
formatter.embedding("image/png", "embedded3.png", "Test");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "the user enters the search text \"Azure DevOps\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.googlesearchtextentery(String)"
});
formatter.result({
  "status": "passed"
});
formatter.write("Inside teardown method--\u003eTest Passed");
formatter.embedding("image/png", "embedded4.png", "Test");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "click on search and verify the search results retrieved by google",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.clickOnSearchbuttonandVerify()"
});
formatter.result({
  "status": "passed"
});
formatter.write("Inside teardown method--\u003eTest Passed");
formatter.embedding("image/png", "embedded5.png", "Test");
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/functionalTests/GoogleSearch.feature");
formatter.feature({
  "name": "Google Search Automated Test",
  "description": "  Automated smoke test for google search functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify google search functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the google homepage",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters the search text \"\u003csearchText\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on search and verify the search results retrieved by google",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "searchText"
      ]
    },
    {
      "cells": [
        "UFT 12"
      ]
    },
    {
      "cells": [
        "Postman"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify google search functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the google homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.userIsOnTheGoogleHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.write("Inside teardown method--\u003eTest Passed");
formatter.embedding("image/png", "embedded6.png", "Test");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "the user enters the search text \"UFT 12\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.googlesearchtextentery(String)"
});
formatter.result({
  "status": "passed"
});
formatter.write("Inside teardown method--\u003eTest Passed");
formatter.embedding("image/png", "embedded7.png", "Test");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "click on search and verify the search results retrieved by google",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.clickOnSearchbuttonandVerify()"
});
formatter.result({
  "status": "passed"
});
formatter.write("Inside teardown method--\u003eTest Passed");
formatter.embedding("image/png", "embedded8.png", "Test");
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify google search functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the google homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.userIsOnTheGoogleHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.write("Inside teardown method--\u003eTest Passed");
formatter.embedding("image/png", "embedded9.png", "Test");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "the user enters the search text \"Postman\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.googlesearchtextentery(String)"
});
formatter.result({
  "status": "passed"
});
formatter.write("Inside teardown method--\u003eTest Passed");
formatter.embedding("image/png", "embedded10.png", "Test");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "click on search and verify the search results retrieved by google",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.clickOnSearchbuttonandVerify()"
});
formatter.result({
  "status": "passed"
});
formatter.write("Inside teardown method--\u003eTest Passed");
formatter.embedding("image/png", "embedded11.png", "Test");
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});