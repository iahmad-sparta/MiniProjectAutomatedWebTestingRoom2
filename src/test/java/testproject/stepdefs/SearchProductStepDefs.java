package testproject.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import testproject.pages.HomePage;
import testproject.pages.Website;

import java.io.IOException;

public class SearchProductStepDefs {

    public Website website;
    public HomePage homePage;
    private static final String BASE_URL = "https://automationexercise.com/";

    @Before
    public void setup() throws IOException {
        TestSetup.createWebDriver();
    }

    @After
    public void afterEach(){
        TestSetup.quitWebDriver();
        TestSetup.stopService();
    }

    @When("I enter {string} into the search bar")
    public void iEnterIntoTheSearchBar(String arg0) {
        website = TestSetup.getWebsite();
        website.getProductsPage().searchProducts(arg0);

    }

    @And("I click the {string} button")
    public void iClickTheButton(String buttonName) {
        if (buttonName.equalsIgnoreCase("search")) {
            website.getProductsPage().clickSearchButton();
        }
    }

    @Then("I should see products related to {string}")
    public void iShouldSeeProductsRelatedTo(String searchTerm) {
        boolean isRelevant = website.getProductsPage().verifySearchResults(searchTerm);
        Assert.assertTrue(searchTerm, isRelevant);
    }

}
