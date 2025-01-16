package testproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Website {

    private WebDriver webDriver;
    private Cart cart;
    private Checkout checkout;
    private Payment payment;

    private By addToCartButtonLocator = By.cssSelector("a.btn.btn-default.add-to-cart[data-product-id='1']");
    private By cartButtonLocator = By.cssSelector("a[href='/view_cart']");
    private By continueShoppingButtonLocator = By.cssSelector("button.btn.btn-success.close-modal.btn-block[data-dismiss='modal']");



    public Website(WebDriver webDriver) {
        this.webDriver = webDriver;
        cart = new Cart(webDriver);
        checkout =  new Checkout(webDriver);
        payment = new Payment(webDriver);
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
}