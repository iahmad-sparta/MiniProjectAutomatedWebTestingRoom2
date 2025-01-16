package testproject.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testproject.pages.Website;

import java.io.IOException;

public class ContactUsStepdefs {

    private Website website;
    private static final String BASE_URL = "https://www.saucedemo.com/";

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

    @Given("I am on the Contact Us Page.")
    public void iAmOnTheContactUsPage() {
    }

    @And("I enter my name, email, subject and message")
    public void iEnterMyNameEmailSubjectAndMessage() {
    }

    @And("I upload a file")
    public void iUploadAFile() {
    }

    @When("I click the Submit Button")
    public void iClickTheSubmitButton() {
    }

    @Then("Your details have been submitted successfully is visible")
    public void yourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {
    }
}
