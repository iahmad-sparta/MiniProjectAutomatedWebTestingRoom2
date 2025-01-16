package testproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver webDriver;

    private By name = new By.ByName("name");
    private By email = By.cssSelector("[data-qa='signup-email']");
    private By signupButton = By.cssSelector("[data-qa='signup-button']");

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void enterName(String name) {
        webDriver.findElement(this.name).sendKeys(name);
    }

    public void enterRegEmail(String email) {
        webDriver.findElement(this.email).sendKeys(email);
    }

    public void clickSignup() {
        webDriver.findElement(this.signupButton).click();
    }
}
