$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin_feature/adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Adactin hotel room booking application",
  "description": "",
  "id": "adactin-hotel-room-booking-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login functionality",
  "description": "",
  "id": "adactin-hotel-room-booking-application;login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launches the Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The\"\u003cusername\u003e\" username In Inbox",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The\"\u003cpassword\u003e\" Password In Inbox",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The LoginButton  Its Navigates To Searchpage",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "adactin-hotel-room-booking-application;login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 9,
      "id": "adactin-hotel-room-booking-application;login-functionality;;1"
    },
    {
      "cells": [
        "puviyarasan",
        "puvi@1234"
      ],
      "line": 10,
      "id": "adactin-hotel-room-booking-application;login-functionality;;2"
    },
    {
      "cells": [
        "arul",
        "1234"
      ],
      "line": 11,
      "id": "adactin-hotel-room-booking-application;login-functionality;;3"
    },
    {
      "cells": [
        "kumar",
        "22334"
      ],
      "line": 12,
      "id": "adactin-hotel-room-booking-application;login-functionality;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "Login functionality",
  "description": "",
  "id": "adactin-hotel-room-booking-application;login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launches the Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The\"puviyarasan\" username In Inbox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The\"puvi@1234\" Password In Inbox",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The LoginButton  Its Navigates To Searchpage",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Launches_the_Adactin_Application()"
});
formatter.result({
  "duration": 6461847400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "puviyarasan",
      "offset": 15
    }
  ],
  "location": "Stepdefinition.user_Enter_The_username_In_Inbox(String)"
});
formatter.result({
  "duration": 270710400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "puvi@1234",
      "offset": 15
    }
  ],
  "location": "Stepdefinition.user_Enter_The_Password_In_Inbox(String)"
});
formatter.result({
  "duration": 143864800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Click_On_The_LoginButton_Its_Navigates_To_Searchpage()"
});
formatter.result({
  "duration": 1974371700,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Login functionality",
  "description": "",
  "id": "adactin-hotel-room-booking-application;login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launches the Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The\"arul\" username In Inbox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The\"1234\" Password In Inbox",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The LoginButton  Its Navigates To Searchpage",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Launches_the_Adactin_Application()"
});
formatter.result({
  "duration": 618989200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "arul",
      "offset": 15
    }
  ],
  "location": "Stepdefinition.user_Enter_The_username_In_Inbox(String)"
});
formatter.result({
  "duration": 120752800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 15
    }
  ],
  "location": "Stepdefinition.user_Enter_The_Password_In_Inbox(String)"
});
formatter.result({
  "duration": 120300400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Click_On_The_LoginButton_Its_Navigates_To_Searchpage()"
});
formatter.result({
  "duration": 750134700,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login functionality",
  "description": "",
  "id": "adactin-hotel-room-booking-application;login-functionality;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launches the Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The\"kumar\" username In Inbox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The\"22334\" Password In Inbox",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The LoginButton  Its Navigates To Searchpage",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Launches_the_Adactin_Application()"
});
formatter.result({
  "duration": 747992300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kumar",
      "offset": 15
    }
  ],
  "location": "Stepdefinition.user_Enter_The_username_In_Inbox(String)"
});
formatter.result({
  "duration": 169055300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "22334",
      "offset": 15
    }
  ],
  "location": "Stepdefinition.user_Enter_The_Password_In_Inbox(String)"
});
formatter.result({
  "duration": 155859400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Click_On_The_LoginButton_Its_Navigates_To_Searchpage()"
});
formatter.result({
  "duration": 710139600,
  "status": "passed"
});
});