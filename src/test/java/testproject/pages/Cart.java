package testproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Cart {
    private WebDriver webDriver;

    private By productRows = By.cssSelector("tbody > tr");
    private By proceedToCheckoutButtonLocator  = By.className("check_out");
    private By registerLoginLinkLocator = By.cssSelector("a[href='/login']");



    public Cart(WebDriver driver) {
        this.webDriver = driver;
    }

    public boolean isCartEmpty() {
        List<WebElement> products = webDriver.findElements(productRows);
        return !products.isEmpty();
    }

    public void clickProceedToCheckOutButton() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement proceedToCheckoutButton = wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckoutButtonLocator));
        proceedToCheckoutButton.click();
    }


}
