Feature: Feature2 Automated Test
  Automated smoke test for Feature2 functionality
  #@smoke
  Scenario Outline: Feature2 functionality
    Given user is on the google homepage
    When the user enters the search text "<searchText>"
    Then click on search and verify the search results retrieved by google
   # And closes the browser window

    Examples:
      | searchText |
      | Selenium |
      | Azure DevOps |
