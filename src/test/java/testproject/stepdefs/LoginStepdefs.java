package testproject.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.remote.http.UrlTemplate;
import testproject.pages.Website;

import java.io.IOException;

public class LoginStepdefs {
    private Website website;
    private static final String BASE_URL = "https://automationexercise.com/";

//    @Before
//    public void setup() throws IOException {
//        TestSetup.startChromeService();
//        TestSetup.createWebDriver();
//    }
//
//    @After
//    public void afterEach() {
//        TestSetup.quitWebDriver();
//        TestSetup.stopService();
//    }

    @And("I enter the email address {string}")
    public void iEnterTheEmailAddress(String arg0) {
//        website = TestSetup.getWebsite(BASE_URL + "login");
        website = TestSetup.getWebsite();
        TestSetup.getWebsite().getLoginPage().enterEmailLogin(arg0);
    }

    @And("I enter the password {string}")
    public void iEnterThePassword(String arg0) {
        website.getLoginPage().enterPassword(arg0);
    }

    @When("I click the Login Button")
    public void iClickTheLoginButton() {
        website.getLoginPage().clickLoginButton();
    }

    @Then("Logged in as Username is visible")
    public void loggedInAsUsernameIsVisible() {
        MatcherAssert.assertThat(website.getHomePage().getLoggedInAs(), Matchers.containsString("robert"));
    }

    @Given("I am logged in")
    public void iAmLoggedIn() {

    }

    @When("I click the Logout Button")
    public void iClickTheLogoutButton() {
    }

    @Then("I should be logged out")
    public void iShouldBeLoggedOut() {
    }
}
