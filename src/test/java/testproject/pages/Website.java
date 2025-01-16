package testproject.pages;

import org.openqa.selenium.WebDriver;

public class Website {

    private WebDriver webDriver;

    public Website(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String getCurrentUrl() {
        return webDriver.getCurrentUrl();
    }

    public String getPageTitle() {
        return webDriver.getTitle();
    }
}