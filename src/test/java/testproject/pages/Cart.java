package testproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private WebDriver driver;

    private By productRows = By.cssSelector("tbody > tr");
    private By proceedToCheckOutButton = By.cssSelector("a.btn.btn-default.check_out");


    public Cart(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isCartEmpty() {
        List<WebElement> products = driver.findElements(productRows);
        return !products.isEmpty();
    }
    public void clickProceedToCheckOutButton() {
        driver.findElement(proceedToCheckOutButton).click();
    }


}
