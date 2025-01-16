package testproject.pages;

import org.openqa.selenium.WebDriver;

public class Website {

    private WebDriver webDriver;
    private LoginPage loginPage;

    public Website(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.loginPage = new LoginPage(webDriver);
    }

    public String getCurrentUrl() {
        return webDriver.getCurrentUrl();
    }

    public String getPageTitle() {
        return webDriver.getTitle();
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }
}