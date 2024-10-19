package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriver webDriver;
    BasePage(WebDriver webDriver)
    {
        this.webDriver = webDriver;
    }
    public void waitUntilSeeElement(By by)
    {
        new WebDriverWait(webDriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public void enterData(By by,String data)
    {
        waitUntilSeeElement(by);
        webDriver.findElement(by).sendKeys(data);
    }
    public void clickOnElement(By by)
    {
        waitUntilSeeElement(by);
        webDriver.findElement(by).click();
    }


}
