
@smoke
Feature: padran.com example test

  Scenario: TC_01 as a visitor I should be able to review the test automation tab

    * Visitor "padran.com" goes to home page
    * Clicks the "Test Automation" link from the "Services" tab
    * Verifies that you have gone to the relevant page
    * close the page

  Scenario: TC_02 As a visitor, I should be able to search within the site.

    * Visitor "padran.com" goes to home page
    * Clicks the search button
    * Types "Mobile Testing" into the search text and presses Enter
    * verifies that search results include "Mobile Testing"
    * close the page