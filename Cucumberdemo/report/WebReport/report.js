$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("hookesdemo.feature");
formatter.feature({
  "line": 2,
  "name": "this is hooks expalination",
  "description": "",
  "id": "this-is-hooks-expalination",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Hooks"
    }
  ]
});
formatter.before({
  "duration": 678500,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "this scenario is expalination of hooks",
  "description": "",
  "id": "this-is-hooks-expalination;this-scenario-is-expalination-of-hooks",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "thonse has infinty stone",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "thonse sanp his finger",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "thonse killed all the avanger",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "thonse destoyed half the world",
  "keyword": "Then "
});
formatter.match({
  "location": "HookesDemoExample.thonse_has_infinty_stone()"
});
formatter.result({
  "duration": 319314000,
  "status": "passed"
});
formatter.match({
  "location": "HookesDemoExample.thonse_sanp_his_finger()"
});
formatter.result({
  "duration": 107500,
  "status": "passed"
});
formatter.match({
  "location": "HookesDemoExample.thonse_killed_all_the_avanger()"
});
formatter.result({
  "duration": 149600,
  "status": "passed"
});
formatter.match({
  "location": "HookesDemoExample.thonse_destoyed_half_the_world()"
});
formatter.result({
  "duration": 294200,
  "status": "passed"
});
formatter.after({
  "duration": 329500,
  "status": "passed"
});
});