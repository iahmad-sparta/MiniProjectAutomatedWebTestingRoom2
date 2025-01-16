package testproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Website {

    private final WebDriver webDriver;
    private final HomePage homePage;
    private final ProductsPage productsPage;

    public Website(WebDriver webDriver) {
        this.webDriver = webDriver;
        homePage = new HomePage(webDriver);
        productsPage = new ProductsPage(webDriver);
    }

    private ProductsPage getProductsPage() {
        return productsPage;
    }

    public HomePage getHomePage(){
        return homePage;
    }

    public String getCurrentUrl() {
        return webDriver.getCurrentUrl();
    }

    public String getPageTitle() {
        return webDriver.getTitle();
    }

    public WebElement findElement(By by) {
        return webDriver.findElement(by);
    }
}