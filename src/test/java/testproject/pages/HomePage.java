package testproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver webDriver;

    private final By productsButton = By.cssSelector("a[href='/products']");
    private final By cartsButton = By.cssSelector("a[href='/view_cart']");
    private By loggedInAs = By.cssSelector(".navbar-nav > li:nth-child(10) > a:nth-child(1)");
    private By womenTag = By.xpath("//a[@href='#Women']");
    private By dressTag = By.xpath("//a[@href='/category_products/1']");
    private By viewProduct = By.cssSelector("div.choose a[href='/product_details/1']");
    private By viewBrand = By.cssSelector("div.brands-name a[href='/brand_products/Polo']");
    private By viewCategory = By.cssSelector("div#women a[href='/category_products/1']");
    private By addToCart = By.className("add-to-cart");
    private By subscribeForm = new By.ById("subscribe_email");
    private By subscribeButton = new By.ById("subscribe_button");
    private By deleteAccountButton = By.cssSelector("ul.nav a[href='/delete_account']");

    private By logoutButton = new By.ByXPath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String getLoggedInAs() {
        return webDriver.findElement(loggedInAs).getText();
    }

    public void clickDeleteAccount() {
        webDriver.findElement(this.deleteAccountButton).click();
    }

    public void clickWomen(){
        WebElement womenButton = webDriver.findElement(womenTag);
        womenButton.click();
    }
    public void clickDress() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement dressButton = wait.until(ExpectedConditions.visibilityOfElementLocated(dressTag));
        dressButton.click();
    }
    public void clickProductsButton() {this.webDriver.findElement(this.productsButton).click();
    }

    public void clickCartsButton() {this.webDriver.findElement(this.cartsButton).click();}


    public void clickLogoutButton() {
        webDriver.findElement(logoutButton).click();
    }
}
