package testproject.pages.auth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver webDriver;

    private By emailFieldLogin;
    private By password;
    private By loginButton;

    private By nameField;
    private By emailFieldSignup;
    private By signUpButton;


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
