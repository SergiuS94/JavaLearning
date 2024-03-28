package MyFirstSeleniumProject.pages;

import MyFirstSeleniumProject.utils.Base;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SecureAreaPage extends Base {
    private final By validHeader = By.cssSelector("#content > div > h2");
    private final By alertNotification = By.cssSelector("#flash");


    public void checkLoginMessage(String desiredLoginMessage) {

        Assert.assertTrue(getLoginMessage().contains(desiredLoginMessage));

    }

    public String getLoginMessage() {
        return driver.findElement(alertNotification).getText();
    }

    public String getValidHeaderText() {
        return driver.findElement(validHeader).getText();
    }

    public void checkValidHeaderText(String desiredValidHeaderText) {
        Assert.assertEquals(getValidHeaderText(), desiredValidHeaderText);
    }
}
