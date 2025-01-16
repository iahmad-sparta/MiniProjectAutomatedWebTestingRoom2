package testproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageOld {
    private WebDriver webDriver;

    private By name = new By.ByXPath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]");
    private By email = By.cssSelector("[data-qa='signup-email']");
    private By signupButton = By.cssSelector("[data-qa='signup-button']");

    public LoginPageOld(WebDriver webDriver) {
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
