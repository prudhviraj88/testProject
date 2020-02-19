$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/testFeatures/Test1.feature");
formatter.feature({
  "name": "this is test1 feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with invalid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "land on the page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.Test1.land_on_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the wrong credentials",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.Test1.enter_the_wrong_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Show validation message",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.Test1.show_validation_message()"
});
formatter.result({
  "status": "passed"
});
});