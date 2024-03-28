package MyFirstSeleniumProject.stepdefs;

import MyFirstSeleniumProject.pages.SecureAreaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SecureAreaPagedefs {
    SecureAreaPage secureAreaPage = new SecureAreaPage();

    @And("The header of the Secure Area page should be {string}")
    public void theHeaderOfTheSecureAreaPageShouldBe(String desiredValidHeaderText) {
        secureAreaPage.checkValidHeaderText(desiredValidHeaderText);
    }

    @Then("The message {string} is displayed")
    public void theMessageIsDisplayed(String desiredLoginMessage) {
        secureAreaPage.checkLoginMessage(desiredLoginMessage);
    }
}
