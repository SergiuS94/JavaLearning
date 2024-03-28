package MyFirstSeleniumProject.pages;

import MyFirstSeleniumProject.utils.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenImagePage extends Base {
    private final By brokenImageHeader = By.cssSelector("#content > div > h3");
    private final By imageElement = By.cssSelector(".example img");

    public void checkHeaderText(String desiredHeaderText) {
        Assert.assertEquals(getHeaderText(), desiredHeaderText);
    }

    public String getHeaderText() {
        return driver.findElement(brokenImageHeader).getText();
    }

    public void checkImages() throws IOException {
        List<WebElement> imageList = getImagesList();
        SoftAssert softAssert = new SoftAssert();
        for (WebElement image : imageList) {
            String imageURL = image.getAttribute("src");
            System.out.println(imageURL);
            softAssert.assertTrue(checkIfImageIsDisplayed(imageURL));
        }
        softAssert.assertAll();
    }

    public boolean checkIfImageIsDisplayed(String imageURL) throws IOException {
        URL url = new URL(imageURL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("HEAD");
        int responseCode = connection.getResponseCode();
        if (responseCode == 200) {
            return true;
        } else
            return false;
    }


    public List<WebElement> getImagesList() {
        return driver.findElements(imageElement);
    }


}
