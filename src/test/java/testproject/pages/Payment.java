package testproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Payment {
    private WebDriver webDriver;

    private By nameOnCard =  new By.ByName("name_on_card");
    private By cardNumber = new By.ByName("card_number");
    private By cvc = new By.ByName("cvc");
    private By expiryMonth = new By.ByName("expiry_month");
    private By expiryYear = new By.ByName("expiry_year");

    private By payAndConfirmOrderButton = new By.ById("submit");

    public Payment(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void enterCard(String nameOnCard,String cardNumber,String cvc,String expiryMonth,String expiryYear) {

        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Consent']")));
        inputField.click();
        webDriver.findElement(this.nameOnCard).sendKeys(nameOnCard);
        webDriver.findElement(this.cardNumber).sendKeys(cardNumber);
        webDriver.findElement(this.cvc).sendKeys(cvc);
        webDriver.findElement(this.expiryMonth).sendKeys(expiryMonth);
        webDriver.findElement(this.expiryYear).sendKeys(expiryYear);

    }

    public void clickOnPayAndConfirmOrderButton() {
        webDriver.findElement(this.payAndConfirmOrderButton).click();
    }
}
