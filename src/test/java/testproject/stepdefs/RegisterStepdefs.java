package testproject.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import testproject.pages.Website;

import java.io.IOException;

public class RegisterStepdefs {
    private Website website;
    private static final String BASE_URL = "https://automationexercise.com/";

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

        this.website = TestSetup.getWebsite(BASE_URL + "login");
    }

    @And("I enter the name {string}")
    public void iEnterTheName(String arg0) {
        website.getLoginPage().enterName(arg0);
    }

    @And("I enter the email {string}")
    public void iEnterTheEmail(String arg0) {
        website.getLoginPage().enterEmailLogin(arg0);
    }

    @When("I click Signup")
    public void iClickSignup() {
        website.getLoginPage().clickSignUpButton();
    }

    @Then("I go to the Signup Page")
    public void iGoToTheSignupPage() {
        MatcherAssert.assertThat(website.getCurrentUrl(), Matchers.containsString("signup"));
    }

    @Given("I am on the Singup Page")
    public void iAmOnTheSingupPage() {
        this.website = TestSetup.getWebsite(BASE_URL + "signup");
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
