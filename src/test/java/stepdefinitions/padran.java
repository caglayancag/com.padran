package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import pages.homePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class padran {
    Actions actions;
    homePage home = new homePage();
    @Given("Visitor {string} goes to home page")
    public void visitor_goes_to_home_page(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @Given("Clicks the {string} link from the {string} tab")
    public void clicks_the_link_from_the_tab(String string, String string2) {
        ReusableMethods.bekle(3);
       home.servicesLink.click();
        ReusableMethods.bekle(3);
        home.testAutomationLink.click();

    }

    @Given("Verifies that you have gone to the relevant page")
    public void verifies_that_you_have_gone_to_the_relevant_page() {
        String actualText=home.testAutomationtext.getText();
        String expectedText="Test Automation";

        Assert.assertEquals(expectedText, actualText);


    }

    @Given("Clicks the search button")
    public void clicks_the_search_button() {

        home.searchButton.click();
        ReusableMethods.bekle(3);
    }

    @Given("Types {string} into the search text and presses Enter")
    public void types_into_the_search_text_and_presses_enter(String string) {
        home.searchField.sendKeys(string+ Keys.ENTER);
        ReusableMethods.bekle(3);
    }

    @Given("verifies that search results include {string}")
    public void verifies_that_search_results_include(String string) {
       String actualResult= home.searchResult.getText();
       String expectedResult=string;

       Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Given("close the page")
    public void close_the_page() {

        Driver.quitDriver();
    }


}
