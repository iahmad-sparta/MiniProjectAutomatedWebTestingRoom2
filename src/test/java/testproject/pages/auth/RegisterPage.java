package testproject.pages.auth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    private WebDriver webDriver;

//    Personal Information
    private By title = new By.ByXPath("//*[@id='form']/div/div/div/div/form/div[1]");
    private By name = new By.ById("name");
//    private By email = new By.ById("email");
    private By password = new By.ById("password");
    private By day = new By.ById("days");
    private By month = new By.ById("months");
    private By year = new By.ById("years");
//    private By newsletter;
//    private By specialOffers;

//    Address
    private By firstName = new By.ById("first_name");
    private By lastName = new By.ById("last_name");
    private By company = new By.ById("company");
    private By address1 = new By.ById("address1");
    private By address2 = new By.ById("address2");
    private By country = new By.ById("country");
    private By state = new By.ById("state");
    private By city = new By.ById("city");
    private By zipcode = new By.ById("zipcode");
    private By mobileNumber = new By.ById("mobile_number");

    private By registerButton = new By.ByXPath("//*[@id=\"form\"]/div/div/div/div/form/button");

    public RegisterPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void selectTitle(String title) {
        WebElement titleOptions = webDriver.findElement(this.title);
        titleOptions.click();
        titleOptions.findElement(By.xpath("//input[@value='" + title + "']")).click();
    }

    public void enterName(String name) {
        webDriver.findElement(this.name).sendKeys(name);
    }

//    public void enterEmail(String email) {
//        webDriver.findElement(this.email).sendKeys(email);
//    }

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

    public void enterZipcode(String zipcode) {
        webDriver.findElement(this.zipcode).sendKeys(zipcode);
    }

    public void enterMobileNumber(String mobileNumber) {
        webDriver.findElement(this.mobileNumber).sendKeys(mobileNumber);
    }

    public void clickRegister() {
        webDriver.findElement(this.registerButton).click();
    }

}
