package MyFirstSeleniumProject.stepdefs;

import MyFirstSeleniumProject.pages.BrokenImagePage;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class BrokenImagesPagedefs {
    BrokenImagePage brokenImagePage = new BrokenImagePage();

    @Then("The header from broken Images page should be {string}")
    public void theHeaderFromThePageShouldBe(String desiredHeaderText) {
        brokenImagePage.checkHeaderText(desiredHeaderText);
    }


    @Then("I check if all images are displayed")
    public void iCheckIfAllImagesAreDisplayed() throws IOException {
        brokenImagePage.checkImages();
    }
}
