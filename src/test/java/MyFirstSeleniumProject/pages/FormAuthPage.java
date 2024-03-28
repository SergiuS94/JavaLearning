package MyFirstSeleniumProject.pages;

import MyFirstSeleniumProject.utils.Base;
import org.junit.Assert;
import org.openqa.selenium.By;

public class FormAuthPage extends Base {
    private final By formAuthHeader = By.cssSelector("#content > div > h2");
    private final By loginButton = By.cssSelector("#login > button > i");

    private final By usernameField = By.id("username");
    private final By passwordField = By.id("password");

    private final By alertNotification = By.cssSelector("#flash");


    public void checkHeaderText(String desiredHeaderText) {
        Assert.assertEquals(getHeaderText(), desiredHeaderText);
    }

    public String getHeaderText() {
        return driver.findElement(formAuthHeader).getText();
    }


    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);

    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }


    public void checkLoginMessage(String desiredLoginMessage) {

        Assert.assertTrue(getLoginMessage().contains(desiredLoginMessage));
    }

    public String getLoginMessage() {
        return driver.findElement(alertNotification).getText();
    }

    public void pressTheLogin() {
        driver.findElement(loginButton).click();
    }


}
