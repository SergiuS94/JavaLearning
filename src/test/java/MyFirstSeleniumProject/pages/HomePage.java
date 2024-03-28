package MyFirstSeleniumProject.pages;

import MyFirstSeleniumProject.utils.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends Base {
    private final By homePageHeader = By.cssSelector("#content > h1");
    private final By homePageList = By.cssSelector("#content > ul > li");


    public String getHeaderText() {
        return driver.findElement(homePageHeader).getText();
    }

    public void checkHeaderText(String desiredText) {
        String homePageHeaderText = getHeaderText();
        Assert.assertEquals(desiredText, homePageHeaderText);
    }

    public void openHomePage() throws InterruptedException {
        driver.get(System.getProperty("default.url"));
        Thread.sleep(5000);
    }

    public void checkPageElements(ArrayList<Integer> ids, ArrayList<String> value) {
        List<WebElement> listPageElements = getPageElements();
        SoftAssert softAssert = new SoftAssert();
        for (int id : ids) {
            softAssert.assertEquals(getPageElementText(listPageElements, id - 1), value.get(id - 1));
            //System.out.println(getPageElementText(listPageElements,id-1 ) +" "+value.get(id-1));
        }
        softAssert.assertAll();
    }

    public List<WebElement> getPageElements() {
        List<WebElement> pagesList;
        pagesList = driver.findElements(homePageList);
        return pagesList;

        // return driver.findElements(homePageList);
    }

    public String getPageElementText(List<WebElement> pageList, int id) {
        return pageList.get(id).getText();


    }

    public void navigateToPage(String pageName){
        driver.findElement(By.linkText(pageName)).click();
    }

    public void checkTheFirstTwoElements(String element1, String element2) {
        List<WebElement> listPageElements = getPageElements();
        String element1Text = getPageElementText(listPageElements,0);
        String element2Text = getPageElementText(listPageElements,1);
//        Assert.assertEquals(element1,element1Text);
//        Assert.assertEquals(element2,element2Text);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(element1,element1Text);
        softAssert.assertEquals(element2,element2Text);
        System.out.println("Blana1");
        softAssert.assertAll();
        System.out.println("Blana2");


    }
}
