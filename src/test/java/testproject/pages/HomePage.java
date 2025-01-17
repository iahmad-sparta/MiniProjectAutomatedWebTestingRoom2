package testproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver webDriver;

    private final By productsButton = By.cssSelector("a[href='/products']");
    private final By cartsButton = By.cssSelector("a[href='/view_cart']");
    private By loggedInAs = By.cssSelector(".navbar-nav > li:nth-child(10) > a:nth-child(1)");

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String getLoggedInAs() {
        return webDriver.findElement(loggedInAs).getText();
    }

    public void clickProductsButton() {this.webDriver.findElement(this.productsButton).click();
    }
    public void clickCartsButton() {this.webDriver.findElement(this.cartsButton).click();}
}
