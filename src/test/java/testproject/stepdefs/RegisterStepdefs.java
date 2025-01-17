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
import testproject.pages.auth.RegisterPage;

import java.io.IOException;

public class RegisterStepdefs {
    private Website website;
    private static final String BASE_URL = "https://automationexercise.com/";

    RegisterPage registerPage;

    @Before
    public void setup() throws IOException {
        TestSetup.startChromeService();
        TestSetup.createWebDriver();
        website = TestSetup.getWebsite();
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
        website.getLoginPage().enterEmailSignup(arg0);
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
//        this.website = TestSetup.getWebsite(BASE_URL + "signup");
        registerPage = website.getRegisterPage();
    }

    @And("I fill in the personal information")
    public void iFillInThePersonalInformation() {
        registerPage.selectTitle("Mr");
        registerPage.enterName(" tester");
        registerPage.enterPassword("tester");
        registerPage.selectDay("1");
        registerPage.selectMonth("1");
        registerPage.selectYear("2000");
    }

    @And("I fill in the address information")
    public void iFillInTheAddressInformation() {
        registerPage.enterFirstName("tester_first");
        registerPage.enterLastName("tester_last");
        registerPage.enterCompany("tester_company");
        registerPage.enterAddress1("tester_address1");
        registerPage.enterAddress2("tester_address2");
        registerPage.enterCity("tester_city");
        registerPage.selectCountry("United States");
        registerPage.enterState("tester_state");
        registerPage.enterZipcode("12345");
        registerPage.enterMobileNumber("1234567890");
    }

    @When("I click Create Account")
    public void iClickCreateAccount() {
        registerPage = website.getRegisterPage();
        registerPage.clickRegister();
    }

    @Then("The account has been created")
    public void theAccountHasBeenCreated() {
        String url = TestSetup.getWebsite().getCurrentUrl();
        MatcherAssert.assertThat(url, Matchers.containsString("account_created"));
    }

    @Then("The email address is already in use")
    public void theEmailAddressIsAlreadyInUse() {
        String error = website.getLoginPage().getRegisterErrorMessage();
        MatcherAssert.assertThat(error, Matchers.containsString("Email Address already exist!"));
    }
}
