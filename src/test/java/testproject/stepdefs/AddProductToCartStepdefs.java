package testproject.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebElement;
import testproject.pages.Website;

import java.io.IOException;
import java.util.logging.Logger;

public class AddProductToCartStepdefs {
    private Website website;
    private static final String BASE_URL = "https://automationexercise.com/products";
    Logger logger = Logger.getLogger(AddProductToCartStepdefs.class.getName());
//    @Before
//    public void setup() throws IOException {
//        TestSetup.startChromeService();
//        TestSetup.createWebDriver();
//
//        this.website = TestSetup.getWebsite(BASE_URL);
//    }
//
//    @After
//    public void afterEach() {
//        TestSetup.quitWebDriver();
//        TestSetup.stopService();
//    }

    @Given("I am on the products page")
    public void iAmOnTheProductsPage() {
        website = TestSetup.getWebsite(BASE_URL);
    }

    @And("I select a Blue Top")
    public void iSelectABlueTop() {
        website.getProductPage().selectBlueTopProduct();
    }

    @When("I click add to cart")
    public void iClickAddToCart() {
        website.getProductPage().clickBlueTopProduct();
    }

    @Then("I should see a popup message showing that the product has been added to cart.")
    public void iShouldSeeAPopupMessageShowingThatTheProductHasBeenAddedToCart() {
        String msg = website.getProductPage().getAddedProductMessage();
        System.out.println(msg);
        MatcherAssert.assertThat(website.getProductPage().getAddedProductMessage(), Matchers.containsString("Added"));
    }

    @And("I can click continue shopping.")
    public void iCanClickContinueShopping() {
        website.getProductPage().clickContinueShopping();
    }

    @When("I click on cart")
    public void iClickOnCart() {
        website.getProductPage().viewShoppingCart();
    }

    @Then("I should be able to view the cart")
    public void iShouldBeAbleToViewTheCart() {
        MatcherAssert.assertThat(website.getCurrentUrl(), Matchers.containsString( "/view_cart"));
    }
}
