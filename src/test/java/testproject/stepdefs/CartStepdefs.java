package testproject.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import testproject.pages.Website;

import java.io.IOException;
import java.util.List;

public class CartStepdefs {
    private static String BASE_URL = "https://automationexercise.com/";
    private Website website;

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

    @And("I click the cart button")
    public void iClickTheCartButton() {
        // mock setup
        website = TestSetup.getWebsite(BASE_URL);

        boolean cartNotEmpty = website.getCart().isCartEmpty();
        System.out.println(cartNotEmpty);
        //MatcherAssert.assertThat(cartNotEmpty, Matchers.is(true));
    }

    @And("I click the checkout button")
    public void iClickTheCheckoutButton() {
        String class_name = "btn-default check_out";
        String URL = "https://automationexercise.com/checkout";
        website = TestSetup.getWebsite("https://automationexercise.com/checkout");

        MatcherAssert.assertThat(website.getCurrentUrl(), Matchers.equalTo(URL));
    }

    @And("I verify details {string} {string} {string} {string} {string}")
    public void iVerifyDetails(String name, String address, String postcode, String country, String phone) {
        String class_name = "address item box";
        // assert address item box is equal to login details
        /*
        <ul class="address item box" id="address_delivery">
							<li class="address_title"><h3 class="page-subheading">Your delivery address</h3></li>
							<li class="address_firstname address_lastname">Mr. Robert Helps</li>
							<li class="address_address1 address_address2"></li>
							<li class="address_address1 address_address2">12 grimthorpe terrace</li>
							<li class="address_address1 address_address2"></li>
							<li class="address_city address_state_name address_postcode">Leeds West yorkshire
								LS6 3JS</li>
							<li class="address_country_name">United States</li>
							<li class="address_phone">0123</li>
		</ul>
         */
        /*List<String> fetchedAddress =  website.getCheckout().getDeliveryAddress();
        Assert.assertEquals("Recipient name does not match", name, fetchedAddress.get(0));
        Assert.assertEquals("Address line does not match", address, fetchedAddress.get(1));
        Assert.assertEquals("Postcode does not match", postcode, fetchedAddress.get(2));
        Assert.assertEquals("Country does not match", country, fetchedAddress.get(3));
        Assert.assertEquals("Phone number does not match", phone, fetchedAddress.get(4));*/

    }

    @And("I click place order")
    public void iClickPlaceOrder() {
        String class_name = "btn-default check_out";
        website.getCheckout().clickPlaceOrderButton();
        MatcherAssert.assertThat(website.getCurrentUrl(), Matchers.equalTo(BASE_URL + "payment"));
    }

    @Then("I enter my payment details {string} {string} {string} {string} {string}")
    public void iEnterMyPaymentDetails(String name, String cardNumber, String expiryMonth, String expiryYear, String cvv) {
        // enter details into boxes
        /*
        <input class="form-control" name="name_on_card" data-qa="name-on-card" required="" type="text">
        <input name="card_number" data-qa="card-number" class="form-control card-number" required="" type="text">
        <input name="cvc" data-qa="cvc" class="form-control card-cvc" required="" placeholder="ex. 311" type="text">
        <input class="form-control card-expiry-month" name="expiry_month" data-qa="expiry-month" required="" placeholder="MM" type="text">
        <input name="expiry_year" data-qa="expiry-year" class="form-control card-expiry-year" required="" placeholder="YYYY" type="text">

         */
        website.getPayment().enterCard(name, cardNumber, expiryMonth, expiryYear, cvv);

    }

    @And("I click pay and confirm order")
    public void iClickPayAndConfirmOrder() {
        // confirm new page must contain /payment_done
        String URL = "https://automationexercise.com/payment_done";
        website.getPayment().clickOnPayAndConfirmOrderButton();
        MatcherAssert.assertThat(website.getCurrentUrl(), Matchers.containsString(URL));
    }


    @When("I add products to the cart")
    public void iAddProductsToTheCart() {

    }
}
