package testproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage {
    private final WebDriver webDriver;

    //get the web elements
    private final By contactName = By.name("name");
    private final By contactEmail = By.name("email");
    private final By contactSubject = By.name("subject");
    private final By contactMessage = By.id("message");
    private final By uploadFile = By.name("uploadFile");
    private final By submitButton = By.className("submit_form");
    private final By successMessage = By.className("alert-success");

    public ContactUsPage(WebDriver driver) {
        this.webDriver = driver;
    }

    public void enterContactName(String contactName) {
        this.webDriver.findElement(this.contactName).sendKeys(contactName);
    }

    public void enterContactEmail(String contactEmail) {
        this.webDriver.findElement(this.contactEmail).sendKeys(contactEmail);
    }

    public void enterContactSubject(String contactSubject) {
        this.webDriver.findElement(this.contactSubject).sendKeys(contactSubject);
    }

    public void enterContactMessage(String contactMessage) {
        this.webDriver.findElement(this.contactMessage).sendKeys(contactMessage);
    }

    public String getAlertSuccessMessageText() {
        return this.webDriver.findElement(this.successMessage).getText();
    }

    public void clickSubmitButton() {
        this.webDriver.findElement(this.submitButton).click();
    }

    public void uploadFile(String filePath) {
        this.webDriver.findElement(this.uploadFile).sendKeys(filePath);
    }

    //get the webelements
    public WebElement getContactName() {
        return this.webDriver.findElement(contactName);
    }

    public WebElement getContactEmail() {
        return this.webDriver.findElement(contactEmail);
    }

    public WebElement getContactSubject() {
        return this.webDriver.findElement(contactSubject);
    }

    public WebElement getContactMessage() {
        return this.webDriver.findElement(contactMessage);
    }
}