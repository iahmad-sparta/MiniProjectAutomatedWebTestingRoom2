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

public class ContactUsStepdefs {

    private Website website;
    private static final String BASE_URL = "https://automationexercise.com/contact_us";

    @Given("I am on the Contact Us Page.")
    public void iAmOnTheContactUsPage()
    {
        System.out.println("I am on the Contact Us Page");
        website = TestSetup.getWebsite(BASE_URL);
    }

    @And("I enter my name as {string}, email as {string}, subject as {string} and message as {string}")
    public void iEnterMyNameAsEmailAsSubjectAsAndMessageAs(String arg0, String arg1, String arg2, String arg3) {
        this.website.getContactUsPage().enterContactName(arg0);
        this.website.getContactUsPage().enterContactEmail(arg1);
        this.website.getContactUsPage().enterContactSubject(arg2);
        this.website.getContactUsPage().enterContactMessage(arg3);
    }

    @And("I upload a file from {string}.")
    public void iUploadAFileFrom(String arg0) {
        this.website.getContactUsPage().uploadFile(arg0);
    }

    @When("I click the Submit Button")
    public void iClickTheSubmitButton() {
        this.website.getContactUsPage().clickSubmitButton();
    }

    @Then("Your details have been submitted successfully is visible")
    public void yourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {
        MatcherAssert.assertThat(this.website.getContactUsPage().getAlertSuccessMessageText(), Matchers.equalTo("Success! Your details have been submitted successfully."));
    }

}
