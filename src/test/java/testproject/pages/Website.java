package testproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Website {

    private final WebDriver webDriver;
    private final HomePage homePage;
    private final ProductsPage productsPage;
    private final ContactUsPage contactUsPage;

    public Website(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.homePage = new HomePage(webDriver);
        this.productsPage = new ProductsPage(webDriver);
        this.contactUsPage = new ContactUsPage(webDriver);
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

    public HomePage getHomePage() {
        return homePage;
    }

    public ProductsPage getProductsPage() {
        return productsPage;
    }

    public ContactUsPage getContactUsPage() {
        return contactUsPage;
    }
}
