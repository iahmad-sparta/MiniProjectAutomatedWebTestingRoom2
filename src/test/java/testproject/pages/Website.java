package testproject.pages;

import org.openqa.selenium.WebDriver;

public class Website {

    private WebDriver webDriver;

    private final ContactUsPage contactUsPage;

    public Website(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.contactUsPage = new ContactUsPage(webDriver);
    }

    public String getCurrentUrl() {
        return webDriver.getCurrentUrl();
    }

    public String getPageTitle() {
        return webDriver.getTitle();
    }

    public ContactUsPage getContactUsPage() {
        return contactUsPage;
    }
}