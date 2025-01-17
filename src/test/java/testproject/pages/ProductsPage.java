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
    private final By productList = By.cssSelector(".features_items");
    private final By firstProductViewButton = By.cssSelector("a[href='/product_details/1']");
    private final By productPrice = By.cssSelector(".productinfo.text-center h2");
    private final By productCategory = By.cssSelector(".productinfo.text-center p");
    private final By productAddToCartButton= By.cssSelector(".productinfo.text-center a.add-to-cart");
    private final By productImage = By.cssSelector(".productinfo.text-center img");


    public String getProductsHeaderText() {
        return webDriver.findElement(productsHeader).getText();
    }

    public boolean getProductsList() {
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
    public boolean getProductDetails() {
        try {
            WebElement priceElement = webDriver.findElement(productPrice);
            if (priceElement == null || priceElement.getText().isEmpty()) return false;

            WebElement categoryElement = webDriver.findElement(productCategory);
            if (categoryElement == null || categoryElement.getText().isEmpty()) return false;

            WebElement addToCartElement = webDriver.findElement(productAddToCartButton);
            if (addToCartElement == null || addToCartElement.getText().isEmpty()) return false;

            WebElement imageElement = webDriver.findElement(productImage);
            return imageElement != null && !imageElement.getAttribute("src").isEmpty();

        } catch (Exception e) {
            return false;
        }
    }
}
    

