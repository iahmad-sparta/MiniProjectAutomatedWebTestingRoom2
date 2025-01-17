package testproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver webDriver;

    private By loggedInAs = By.cssSelector(".navbar-nav > li:nth-child(10) > a:nth-child(1)");
    private By womenTag = By.xpath("//a[@href='#Women']");
    private By dressTag = By.xpath("//a[@href='/category_products/1']");

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String getLoggedInAs() {
        return webDriver.findElement(loggedInAs).getText();
    }

    public void clickWomen(){
        WebElement womenButton = webDriver.findElement(womenTag);
        womenButton.click();
    }
    public void clickDress(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement dressButton = wait.until(ExpectedConditions.visibilityOfElementLocated(dressTag));
        dressButton.click();
    }
}
