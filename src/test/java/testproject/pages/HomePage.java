package testproject.pages;

import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver webDriver;

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void getCurrentUrl() {
        webDriver.getCurrentUrl();
    }




}

