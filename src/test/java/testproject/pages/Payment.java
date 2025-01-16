package testproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Payment {
    private WebDriver webDriver;

    private By nameOnCard =  new By.ByName("name_on_card");
    private By cardNumber = new By.ByName("card_number");
    private By cvc = new By.ByName("cvc");
    private By expiryMonth = new By.ByName("expiry_month");
    private By expiryYear = new By.ByName("expiry_year");

    private By payAndConfirmOrderButton = new By.ById("submit");

    public void enterCard(String nameOnCard,String cardNumber,String cvc,String expiryMonth,String expiryYear) {
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
