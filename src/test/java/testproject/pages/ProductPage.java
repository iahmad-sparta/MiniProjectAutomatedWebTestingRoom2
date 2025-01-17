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
    private WebElement modal;

    //web elements
    private final By blueTopProduct = new By.ByCssSelector(".col-sm-4:nth-child(3) .product-overlay");
    private final By menShirtProduct = new By.ByCssSelector(".col-sm-4:nth-child(4) .product-overlay");

    public ProductPage(WebDriver driver) {
        this.webDriver = driver;
    }

    public void selectBlueTopProduct() {
        WebElement product = webDriver.findElement(blueTopProduct);
        Actions action = new Actions(webDriver);
        action.moveToElement(product).build().perform();
    }

    public void selectMenShirt() {
        WebElement product = webDriver.findElement(menShirtProduct);
        Actions action = new Actions(webDriver);
        action.moveToElement(product).build().perform();
    }

    public void clickBlueTopProduct() {

        By button = new By.ByXPath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/a");
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement tButton = wait.until(ExpectedConditions.elementToBeClickable(button));
        tButton.click();

    }

    public void clickMenShirt() {
        By button = new By.ByXPath("/html/body/section[2]/div/div/div[2]/div[1]/div[3]/div/div[1]/div[1]/a");
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement tButton = wait.until(ExpectedConditions.elementToBeClickable(button));
        tButton.click();
    }

    public String getAddedProductMessage() {

        try{
            By popupTitle = new By.ByClassName("modal-title");
            WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(popupTitle));
            return webDriver.findElement(popupTitle).getText();
        } catch (Exception e) {
            System.out.println("No modal found");
            return null;
        }
    }

    public void clickContinueShopping() {
        By continueShopping = new By.ByCssSelector("#cartModal > div > div > div.modal-footer > button");
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueShopping));
        webDriver.findElement(continueShopping).click();
    }

    public void viewShoppingCart() {
        By click_shopping_cart_icon = new By.ByCssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(3) > a");
        webDriver.findElement(click_shopping_cart_icon).click();
    }

    public WebElement getBlueTopProduct() {
        return webDriver.findElement(blueTopProduct);
    }


}
