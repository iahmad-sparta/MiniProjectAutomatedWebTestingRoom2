package testproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testproject.pages.auth.LoginPage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testproject.pages.auth.RegisterPage;

import java.time.Duration;


public class Website {

    private final WebDriver webDriver;
    private final HomePage homePage;
    private final ProductsPage productsPage;
    private final ContactUsPage contactUsPage;
    private final LoginPage loginPage;
    private final RegisterPage registerPage;
    private Cart cart;
    private Checkout checkout;
    private Payment payment;
    private final ProductPage productPage;

    public Website(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.homePage = new HomePage(webDriver);
        this.productsPage = new ProductsPage(webDriver);
        this.contactUsPage = new ContactUsPage(webDriver);
        this.loginPage = new LoginPage(webDriver);
        this.registerPage = new RegisterPage(webDriver);
        cart = new Cart(webDriver);
        checkout =  new Checkout(webDriver);
        payment = new Payment(webDriver);
        this.productPage = new ProductPage(webDriver);
    }

    public String getCurrentUrl() {
        return webDriver.getCurrentUrl();
    }

    public String getPageTitle() {
        return webDriver.getTitle();
    }

    public Cart getCart() {
        return cart;
    }

    public Checkout getCheckout() {
        return checkout;
    }

    public Payment getPayment() {
        return payment;
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

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public RegisterPage getRegisterPage() {
        return registerPage;
    }

    public void goToPage(String URL) {
        webDriver.get(URL);
    }
    public ProductPage getProductPage() {
        return productPage;
    }
}
