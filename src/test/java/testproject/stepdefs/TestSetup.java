package testproject.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import testproject.pages.HomePage;
import testproject.pages.ProductsPage;
import testproject.pages.Website;
import org.mockito.Mockito;
import java.io.IOException;

import static org.mockito.Mockito.mock;

public class TestSetup {

    private static Website website;
    private static WebDriver mockWebDriver;

    public static void startChromeService() throws IOException {
        System.out.println("Starting chrome service");
   }

    public static void createWebDriver() {
        mockWebDriver = mock(WebDriver.class);
        website = new Website(mockWebDriver);
    }

    public static ChromeOptions getChromeOptions() {
    System.out.println("Getting chrome options");
        return null;
    }

    static void stopService() {
        System.out.println("Stopping service");
    }

    public static void quitWebDriver() {
        System.out.println("Quitting driver");
    }

    static Website getWebsite(String url) {
        website.goToPage(url);
        By button = new By.ByXPath("/html/body/div/div[2]/div[2]/div[2]/div[2]/button[1]");
        try{
            mockWebDriver.findElement(button).click();
        } catch (Exception e) {
            System.out.println("No button found");
        }
        return website;
    }

    public static Website getWebsite() {
        return website;
    }
}
