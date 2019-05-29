Feature: BCP web automation exam

  @drive
  Scenario: Create doc
    Given I open "https://www.google.com/" in "Firefox" browser
    When I go to Drive page
    And I login to google with user "examenparabcp" and password "123456bcp"
    And I create a new text document with name "E01_Delmer Espinoza Vigo_TIMESTAMP"
    Then I verify that document was saved
