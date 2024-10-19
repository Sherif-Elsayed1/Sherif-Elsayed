package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTests {
    WebDriver webDriver;

    @BeforeMethod
    public void setup() //setup for webDriver
    {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void close()
    {
        //webDriver.close();  // i comment it sothat you can see the automation tests
    }
}
