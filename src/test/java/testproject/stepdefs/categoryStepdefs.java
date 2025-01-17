package testproject.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import testproject.pages.Website;

public class categoryStepdefs {

    private static String BASE_URL = "https://automationexercise.com/";
    private Website website;

    @And("I click on the category {string}")
    public void iClickOnTheCategoryWomen(String category) {
        website = TestSetup.getWebsite(BASE_URL);
        website.getHomePage().clickWomen();
    }

    @When("I click on Dress")
    public void iClickOnDress() {
        website.getHomePage().clickDress();
    }

    @Then("A category page has the text {string}")
    public void aCategoryPageHasTheTextWOMENTOPSPRODUCTS(String title) {

        System.out.println(title);
        MatcherAssert.assertThat(title, Matchers.is(website.getProductsPage().correctTitle(title)));
    }
}
