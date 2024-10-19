package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    By userNameSelector = By.id("user-name");
    By passwordSelector = By.id("password");
    By loginSelector = By.id("login-button");


    public void enterUserName(String username)
    {
        enterData(userNameSelector,username);
    }
    public void enterPassword(String password)
    {
        enterData(passwordSelector,password);
    }
    public void clickOnLogin()
    {
        clickOnElement(loginSelector);
    }


}
