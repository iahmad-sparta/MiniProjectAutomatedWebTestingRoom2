package testproject.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testproject.pages.Website;

import java.io.IOException;

public class RegisterStepdefs {
    private Website website;
    private static final String BASE_URL = "https://www.saucedemo.com/";

    @Before
    public void setup() throws IOException {
        TestSetup.startChromeService();
        TestSetup.createWebDriver();
    }

    @After
    public void afterEach() {
        TestSetup.quitWebDriver();
        TestSetup.stopService();
    }

    @Given("I am on the Login Page")
    public void iAmOnTheLoginPage() {
    }

    @And("I enter the name {string}")
    public void iEnterTheName(String arg0) {
    }

    @And("I enter the email {string}")
    public void iEnterTheEmail(String arg0) {
    }

    @When("I click Signup")
    public void iClickSignup() {
    }

    @Then("I go to the Signup Page")
    public void iGoToTheSignupPage() {
    }

    @Given("I am on the Singup Page")
    public void iAmOnTheSingupPage() {
    }

    @And("I fill in the personal information")
    public void iFillInThePersonalInformation() {
    }

    @And("I fill in the address information")
    public void iFillInTheAddressInformation() {
    }

    @When("I click Create Account")
    public void iClickCreateAccount() {
    }

    @Then("The account has been created")
    public void theAccountHasBeenCreated() {
    }
}
