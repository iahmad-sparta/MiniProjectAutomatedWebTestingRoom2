package testproject.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProductPage {
    private final WebDriver webDriver;

    //web elements
    private final By blueTopProduct = new By.ByCssSelector(".col-sm-4:nth-child(3) .product-overlay");

    public ProductPage(WebDriver driver) {
        this.webDriver = driver;
//        webDriver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/button[1]")).click();
    }

    public void selectBlueTopProduct() {
        WebElement product = webDriver.findElement(blueTopProduct);
        Actions action = new Actions(webDriver);
        action.moveToElement(product).build().perform();
    }

    public void clickBlueTopProduct() {
        WebElement product = webDriver.findElement(By.cssSelector(".col-sm-4:nth-child(3) .product-overlay .btn"));
        Actions action = new Actions(webDriver);
        action.moveToElement(product).build().perform();
    }

    public WebElement getAddedProductMessage() {
        By button = new By.ByCssSelector("#cartModal");

        try{
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));WebElement address = wait.until(ExpectedConditions.visibilityOfElementLocated(addressSectionLocator));
            WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
            WebElement modal = webDriverWait.until(driver -> ExpectedConditions.visibilityOfElementLocated(button)).apply(webDriver);
            return modal;
        } catch (Exception e) {
            System.out.println("No modal found");
            return null;
        }
    }

    public void clickContinueShopping() {
        WebElement continueShoppingButton = webDriver.findElement(By.cssSelector("#cartModal > div > div > div.modal-footer > button"));
        Actions action = new Actions(webDriver);
        action.moveToElement(continueShoppingButton).build().perform();
    }

    public WebElement getBlueTopProduct() {
        return webDriver.findElement(blueTopProduct);
    }


}
