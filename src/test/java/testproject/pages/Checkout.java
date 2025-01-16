package testproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Checkout {

    private WebDriver driver;

    private By addressSectionLocator = By.id("address_delivery");
    private By recipientNameLocator = By.cssSelector("li.address_firstname.address_lastname");
    private By addressLine1Locator = By.cssSelector("li.address_address1.address_address2");
    private By cityStatePostcodeLocator = By.cssSelector("li.address_city.address_state_name.address_postcode");
    private By countryLocator = By.className("address_country_name");
    private By phoneLocator = By.className("address_phone");

    private By placeOrderButtonLocator = By.cssSelector("a.btn.btn-default.check_out[href='/payment']");

    public Checkout(WebDriver driver) {
        this.driver = driver;
    }

    public List<String> getDeliveryAddress() {
        List<String> addressList = new ArrayList<>();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement address = wait.until(ExpectedConditions.visibilityOfElementLocated(addressSectionLocator));

        addressList.add(address.findElement(recipientNameLocator).getText());
        addressList.add(address.findElement(addressLine1Locator).getText());
        addressList.add(address.findElement(cityStatePostcodeLocator).getText());
        addressList.add(address.findElement(countryLocator).getText());
        addressList.add(address.findElement(phoneLocator).getText());

        return addressList;
    }

    public void clickPlaceOrderButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement placeOrderButton = wait.until(ExpectedConditions.visibilityOfElementLocated(placeOrderButtonLocator));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", placeOrderButton);
    }
}
