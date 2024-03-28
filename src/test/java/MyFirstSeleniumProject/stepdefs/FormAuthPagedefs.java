package MyFirstSeleniumProject.stepdefs;

import MyFirstSeleniumProject.pages.FormAuthPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class FormAuthPagedefs {
    FormAuthPage formAuthPage = new FormAuthPage();

    @Then("The header from the page should be {string}")
    public void theHeaderFromThePageShouldBe(String desiredHeaderText)
    {
        formAuthPage.checkHeaderText(desiredHeaderText);
    }

    @And("I press the {string} button")
    public void iPressTheButton(String button) {
        formAuthPage.pressTheLogin();
    }

    @Then("the message {string} is displayed")
    public void theMessageIsDisplayed(String desiredLoginMessage) {
        formAuthPage.checkLoginMessage(desiredLoginMessage);
    }


    @And("I type an invalid {string} or {string}")
    public void iTypeAnInvalidOr(String username, String password) {
        formAuthPage.enterUsername(username);
        formAuthPage.enterPassword(password);
    }

    @And("I type a valid {string} and {string}")
    public void iTypeAValidAnd(String username, String password) {
        formAuthPage.enterUsername(username);
        formAuthPage.enterPassword(password);
    }

}
