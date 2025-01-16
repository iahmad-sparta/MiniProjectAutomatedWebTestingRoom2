package testproject.stepdefs;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testproject.pages.HomePage;
import testproject.pages.Website;
import java.io.IOException;
import java.time.Duration;
import org.hamcrest.Matchers.*;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ProductsStepDefs {

    public Website website;
    public HomePage homePage;
    private static final String BASE_URL = "https://automationexercise.com/";

    @Before
    public void setup() throws IOException {
        TestSetup.startChromeService();
        TestSetup.createWebDriver();
    }

    @After
    public void afterEach(){
        TestSetup.quitWebDriver();
        TestSetup.stopService();
    }

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        website = TestSetup.getWebsite(BASE_URL);
    }

    @When("I click on the {string} link in the navigation menu")
    public void iClickOnTheLinkInTheNavigationMenu(String linkText) {
        website.findElement(By.xpath("//a[contains(text(), '" + linkText + "')]")).click();
    }


    @Then("I should be redirected to the {string} page")
    public void iShouldBeRedirectedToThePage(String expectedPage) {
        assertThat(website.getCurrentUrl().contains(expectedPage), is (true));
    }

    @And("I should see a list of products")
    public void iShouldSeeAListOfProducts() {
        assertThat (website.getProductsPage().isProductListVisible(), is(true));
    }

}
