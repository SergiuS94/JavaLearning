package MyFirstSeleniumProject.pages;

import MyFirstSeleniumProject.utils.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class InputsPage extends Base {


    private final By inputPageHeader = By.cssSelector("#content > div > div > h3");
    private final By textBoxField = By.cssSelector("#content > div > div > div > input[type=number]");

    public void checkHeaderText(String desiredHeaderText) {
        Assert.assertEquals(getHeaderText(), desiredHeaderText);
    }

    public String getHeaderText() {

        return driver.findElement(inputPageHeader).getText();

    }

    public void typeInTextbox(String inputValue) {
        driver.findElement(textBoxField).sendKeys(inputValue);
    }

    public String getTextBoxValue() {
        return driver.findElement(textBoxField).getAttribute("value");
    }

    public void checkTextBoxText(String expectedValue) {
        Assert.assertEquals(expectedValue, getTextBoxValue());
    }

    public void whenIPressAKey(String button) {
        switch (button.toLowerCase()) {
            case "up": {
                driver.findElement(textBoxField).sendKeys(Keys.ARROW_UP);
                break;
            }
            case "down": {
                driver.findElement(textBoxField).sendKeys(Keys.ARROW_DOWN);
                break;
            }
        }

    }
}
