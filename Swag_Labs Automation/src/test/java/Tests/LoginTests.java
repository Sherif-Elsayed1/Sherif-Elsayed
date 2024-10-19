package Tests;

import Pages.BasePage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginTests extends BaseTests {

    LoginPage loginPage;


    @BeforeMethod
    public void beforeMethod()
    {
        setupData();
    }



    @Test
    public void loginWithCorrectUserNameAndPassword()
    {
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLogin();
        Assert.assertEquals(webDriver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html");
    }

    @Test
    public void errorMessageWillAppearWhenLoginWithBlankUserName()
    {
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLogin();
        Assert.assertEquals(webDriver.findElement(By.cssSelector("h3[data-test=\"error\"]")).getText(),"Epic sadface: Username is required");
    }

    @Test
    public void errorMessageWillAppearWhenLoginWithBlankPassword()
    {
        loginPage.enterUserName("standard_user");
        loginPage.clickOnLogin();
        Assert.assertEquals(webDriver.findElement(By.cssSelector("h3[data-test=\"error\"]")).getText(),"Epic sadface: Password is required");
    }

    @Test
    public void errorMessageWillAppearWhenLoginWithBlankUserNameAndPassword()
    {
        loginPage.clickOnLogin();
        Assert.assertEquals(webDriver.findElement(By.cssSelector("h3[data-test=\"error\"]")).getText(),"Epic sadface: Username is required");
    }

    @Test
    public void errorMessageWillAppearWhenEnteringIncorrectUserName()
    {
        loginPage.enterUserName("standard");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLogin();
        Assert.assertEquals(webDriver.findElement(By.cssSelector("h3[data-test=\"error\"]")).getText(),"Epic sadface: Username and password do not match any user in this service");
    }

    @Test
   public void errorMessageWillAppearWhenEnteringIncorrectPassword()
   {
       loginPage.enterUserName("standard_user");
       loginPage.enterPassword("secret");
       loginPage.clickOnLogin();
       Assert.assertEquals(webDriver.findElement(By.cssSelector("h3[data-test=\"error\"]")).getText(),"Epic sadface: Username and password do not match any user in this service");
   }
   @Test
    public void errorMessageWillAppearWhenEnteringIncorrectPasswordAndIncorrectUserName()
    {
        loginPage.enterUserName("standard");
        loginPage.enterPassword("secret");
        loginPage.clickOnLogin();
        Assert.assertEquals(webDriver.findElement(By.cssSelector("h3[data-test=\"error\"]")).getText(),"Epic sadface: Username and password do not match any user in this service");
    }





    private void setupData()
    {
        loginPage = new LoginPage(webDriver);

    }
}
