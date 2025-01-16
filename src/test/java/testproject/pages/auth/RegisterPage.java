package testproject.pages.auth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    private WebDriver webDriver;

//    Personal Information
    private By title;
    private By name;
    private By email;
    private By password;
    private By day;
    private By month;
    private By year;
//    private By newsletter;
//    private By specialOffers;

//    Address
    private By firstName;
    private By lastName;
    private By company;
    private By address1;
    private By address2;
    private By country;
    private By state;
    private By city;
    private By postcode;
    private By mobileNumber;

    public RegisterPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void selectTitle(String title) {
    }

    public void enterName(String name) {
        webDriver.findElement(this.name).sendKeys(name);
    }

    public void enterEmail(String email) {
        webDriver.findElement(this.email).sendKeys(email);
    }

    public void enterPassword(String password) {
        webDriver.findElement(this.password).sendKeys(password);
    }

    public void selectDay(String day) {
        WebElement dayOptions = webDriver.findElement(this.day);
        dayOptions.click();
        dayOptions.findElement(By.xpath("//option[text()='" + day + "']")).click();
    }

    public void selectMonth(String month) {
        WebElement monthOptions = webDriver.findElement(this.month);
        monthOptions.click();
        monthOptions.findElement(By.xpath("//option[text()='" + month + "']")).click();
    }

    public void selectYear(String year) {
        WebElement yearOptions = webDriver.findElement(this.year);
        yearOptions.click();
        yearOptions.findElement(By.xpath("//option[text()='" + year + "']")).click();
    }

    public void enterFirstName(String firstName) {
        webDriver.findElement(this.firstName).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        webDriver.findElement(this.lastName).sendKeys(lastName);
    }

    public void enterCompany(String company) {
        webDriver.findElement(this.company).sendKeys(company);
    }

    public void enterAddress1(String address1) {
        webDriver.findElement(this.address1).sendKeys(address1);
    }

    public void enterAddress2(String address2) {
        webDriver.findElement(this.address2).sendKeys(address2);
    }

    public void selectCountry(String country) {
        WebElement countryOptions = webDriver.findElement(this.country);
        countryOptions.click();
        countryOptions.findElement(By.xpath("//option[text()='" + country + "']")).click();
    }

    public void enterState(String state) {
        webDriver.findElement(this.state).sendKeys(state);
    }

    public void enterCity(String city) {
        webDriver.findElement(this.city).sendKeys(city);
    }

    public void enterPostcode(String postcode) {
        webDriver.findElement(this.postcode).sendKeys(postcode);
    }

    public void enterMobileNumber(String mobileNumber) {
        webDriver.findElement(this.mobileNumber).sendKeys(mobileNumber);
    }

}
