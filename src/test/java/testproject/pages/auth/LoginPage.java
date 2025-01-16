package testproject.pages.auth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver webDriver;

    private By emailFieldLogin = new By.ByXPath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]");
    private By password = new By.ByXPath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]");
    private By loginButton = new By.ByXPath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");

    private By nameField = new By.ByXPath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]");
    private By emailFieldSignup = By.cssSelector("[data-qa='signup-email']");
    private By signUpButton = By.cssSelector("[data-qa='signup-button']");


    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void enterEmailLogin(String email) {
        webDriver.findElement(emailFieldLogin).sendKeys(email);
    }

    public void enterPassword(String pass) {
        webDriver.findElement(password).sendKeys(pass);
    }

    public void clickLoginButton() {
        webDriver.findElement(loginButton).click();
    }

    public void enterName(String name) {
        webDriver.findElement(nameField).sendKeys(name);
    }

    public void enterEmailSignup(String email) {
        webDriver.findElement(emailFieldSignup).sendKeys(email);
    }

    public void clickSignUpButton() {
        webDriver.findElement(signUpButton).click();
    }

}
