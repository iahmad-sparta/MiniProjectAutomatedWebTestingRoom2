package testproject.stepdefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import testproject.pages.Website;

import static testproject.stepdefs.TestSetup.getWebsite;


public class ProductsStepDefs {
    public Website website;
    private static final String BASE_URL = "https://automationexercise.com/";

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        website = getWebsite(BASE_URL);
    }

    @When("I click on the {string} link in the navigation menu")
    public void iClickOnTheLinkInTheNavigationMenu(String linkText) {
        website.findElement(By.cssSelector("a[href='/products']")).click();

    }

    @Then("I should be redirected to the {string} page")
    public void iShouldBeRedirectedToThePage(String expectedPage) {

    }

    @And("I should see a list of products")
    public void iShouldSeeAListOfProducts() {

    }
}
