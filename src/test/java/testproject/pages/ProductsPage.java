package testproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
}
