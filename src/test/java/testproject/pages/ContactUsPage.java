package testproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage {
    private final WebDriver webDriver;

    //get the web elements
    private final By contactName = By.name("name");
    private final By contactEmail = By.name("email");
    private final By contactSubject = By.name("subject");
    private final By contactMessage = By.id("message");
    private final By uploadFile = By.name("upload_file");
    private final By submitButton = By.className("submit_form");
    private final By successMessage = By.className("alert-success");

    public ContactUsPage(WebDriver driver) {
        this.webDriver = driver;
        this.webDriver.manage().addCookie(new Cookie("FCCDCF", "%5Bnull%2Cnull%2Cnull%2C%5B%22CQLUvgAQLUvgAEsACBENBYFoAP_gAEPgABBoINJD7C7FbSFCwH5zaLsAMAhHRsAAQoQAAASBAmABQAKQIAQCgkAQFASgBAACAAAAICRBIQIECAAAAUAAQAAAAAAEAAAAAAAIIAAAgAEAAAAIAAACAIAAEAAIAAAAEAAAmAgAAIIACAAAgAAAAAAAAAAAAAAAAgCAAAAAAAAAAAAAAAAAAQOhSD2F2K2kKFkPCmwXYAYBCujYAAhQgAAAkCBMACgAUgQAgFJIAgCIFAAAAAAAAAQEiCQAAQABAAAIACgAAAAAAIAAAAAAAQQAABAAIAAAAAAAAEAQAAIAAQAAAAIAABEhCAAQQAEAAAAAAAQAAAAAAAAAAABAAA%22%2C%222~70.89.93.108.122.149.196.236.259.311.313.323.358.415.442.449.486.494.495.540.574.609.864.981.1029.1048.1051.1095.1097.1126.1205.1276.1301.1365.1415.1449.1514.1570.1577.1598.1651.1716.1735.1753.1765.1870.1878.1889.1958.1960.2072.2253.2299.2373.2415.2506.2526.2531.2568.2571.2575.2624.2677.2778~dv.%22%2C%2211CE8DF1-FD09-4141-9597-B265885E0F5B%22%5D%5D"));
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
        //this is to handle the browser alert message
        //event that involves clicking "Ok"
        this.webDriver.switchTo().alert().accept();
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
