Feature: Google Search Automated Test
  Automated smoke test for google search functionality
  #@smoke
  Scenario Outline: Verify google search functionality
    Given user is on the google homepage
    When the user enters the search text "<searchText>"
    Then click on search and verify the search results retrieved by google
   # And closes the browser window

    Examples:
      | searchText |
      | UFT 12 |
      | Postman |
