package testproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver webDriver;

    private final By productsButton = By.cssSelector("a[href='/products']");
    private By loggedInAs = By.cssSelector(".navbar-nav > li:nth-child(10) > a:nth-child(1)");

    private By logoutButton = new By.ByXPath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String getLoggedInAs() {
        return webDriver.findElement(loggedInAs).getText();
    }

    public void clickProductsButton() {this.webDriver.findElement(this.productsButton).click();
    }

    public void clickLogoutButton() {
        webDriver.findElement(logoutButton).click();
    }
}
