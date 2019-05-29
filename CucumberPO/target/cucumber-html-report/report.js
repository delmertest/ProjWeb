$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/bcpTest.feature");
formatter.feature({
  "name": "BCP web automation exam",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Create doc",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@drive"
    }
  ]
});
formatter.step({
  "name": "I open \"https://www.google.com/\" in \"Firefox\" browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Hooks.i_open_in_browser(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to Drive page",
  "keyword": "When "
});
formatter.match({
  "location": "GDriveSteps.i_go_to_Drive_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login to google with user \"examenparabcp\" and password \"123456bcp\"",
  "keyword": "And "
});
formatter.match({
  "location": "GDriveSteps.i_login_to_google_with_user_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I create a new text document with name \"E01_Delmer Espinoza Vigo_TIMESTAMP\"",
  "keyword": "And "
});
formatter.match({
  "location": "GDriveSteps.i_create_a_new_text_document_with_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that document was saved",
  "keyword": "Then "
});
formatter.match({
  "location": "GDriveSteps.i_verify_that_document_was_saved()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});