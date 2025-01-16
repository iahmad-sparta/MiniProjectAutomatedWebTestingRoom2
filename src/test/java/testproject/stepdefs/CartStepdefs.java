package testproject.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CartStepdefs {
    @And("I click the cart button")
    public void iClickTheCartButton() {
        String URL = "https://automationexercise.com/view_cart";
        String class_name = "fa-shopping-cart";
    }

    @And("I click the checkout button")
    public void iClickTheCheckoutButton() {
        String class_name = "btn-default check_out";
        String URL = "https://automationexercise.com/checkout";
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
        System.out.println(name);
        System.out.println(address);
        System.out.println(postcode);
        System.out.println(country);
        System.out.println(phone);

    }

    @And("I click place order")
    public void iClickPlaceOrder() {
        String class_name = "btn-default check_out";
    }

    @Then("I enter my payment details {string} {string} {string} {string} {string}")
    public void iEnterMyPaymentDetails(String arg0, String arg1, String arg2, String arg3, String arg4) {
        // enter details into boxes
        /*
        <input class="form-control" name="name_on_card" data-qa="name-on-card" required="" type="text">
        <input name="card_number" data-qa="card-number" class="form-control card-number" required="" type="text">
        <input name="cvc" data-qa="cvc" class="form-control card-cvc" required="" placeholder="ex. 311" type="text">
        <input class="form-control card-expiry-month" name="expiry_month" data-qa="expiry-month" required="" placeholder="MM" type="text">
        <input name="expiry_year" data-qa="expiry-year" class="form-control card-expiry-year" required="" placeholder="YYYY" type="text">

         */
        System.out.println(arg0);
        System.out.println(arg1);
        System.out.println(arg2);
        System.out.println(arg3);

    }

    @And("I click pay and confirm order")
    public void iClickPayAndConfirmOrder() {
        // confirm new page must contain /payment_done
        String URL = "https://automationexercise.com/payment_done/534";
    }



}
