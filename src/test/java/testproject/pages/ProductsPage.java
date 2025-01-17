package testproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductsPage {

    private final WebDriver webDriver;

    public ProductsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private final By productsHeader = By.cssSelector("h2.title.text-center");
    private final By productList = By.cssSelector(".product-container");
    private final By firstProductViewButton = By.cssSelector("a[href='/product_details/1']");

    public String getProductsHeaderText() {
        return webDriver.findElement(productsHeader).getText();
    }

    public boolean isProductListVisible() {
        return !webDriver.findElements(productList).isEmpty();
    }

    public void clickFirstProductViewButton() {
        webDriver.findElement(firstProductViewButton).click();
    }

    public String correctTitle(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement title = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='title text-center']")));

        return title.getText();
    }
}
