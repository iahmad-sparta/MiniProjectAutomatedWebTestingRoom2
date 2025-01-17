package testproject.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import testproject.pages.Website;

public class VerifyProductQuantityMyStepdefs {

    private Website website;
    private static String BASE_URL = "https://automationexercise.com/";

    @Given("The user is in the home page.")
    public void theUserIsInTheHomePage() {
        website = TestSetup.getWebsite(BASE_URL);
    }

    @And("The user has added an item to cart.")
    public void theUserHasAddedAnItemToCart() {
        website.getProductPage().selectBlueTopProduct();
        website.getProductPage().clickBlueTopProduct();
        website.getProductPage().clickContinueShopping();
    }

    @When("I click on cart.")
    public void iClickOnCart() {
        website.getHomePage().clickCartsButton();
    }

    @Then("I should see the products that were added to cart.")
    public void iShouldSeeTheProductsThatWereAddedToCart() {
        website.getCart().getProductCount();
    }

    @And("I should see the product quantity in cart.")
    public void iShouldSeeTheProductQuantityInCart() {
        MatcherAssert.assertThat(website.getCart().getProductCount(), Matchers.equalTo(1));
    }
}
