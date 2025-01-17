package testproject.stepdefs;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testproject.pages.HomePage;
import testproject.pages.Website;
import java.io.IOException;
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

    @When("I click on the Products link in the navigation menu")
    public void iClickOnTheLinkInTheNavigationMenu() {
        website.getHomePage().clickProductsButton();
    }

    @Then("I should be redirected to the Products page")
    public void iShouldBeRedirectedToThePage() {
        assertThat(website.getCurrentUrl().contains("/products"), is(true));
    }

    @And("I should see a list of products")
    public void iShouldSeeAListOfProducts() {
        assertThat(website.getProductsPage().getProductsList(), is(true));
    }

    @Given("I am on the Products page")
    public void iAmOnTheProductsPage() {
        website = TestSetup.getWebsite(BASE_URL + "products");
    }

    @Then("each product should display: Price, Add to Cart, Name, View Product, Image")
    public void eachProductShouldDisplay() {
        boolean isProductValid = website.getProductsPage().getProductDetails();
        if (!isProductValid) {
            throw new AssertionError("One or more product details are missing or invalid.");
        }
    }
}
