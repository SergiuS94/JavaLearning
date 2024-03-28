package MyFirstSeleniumProject.stepdefs;

import MyFirstSeleniumProject.pages.HomePage;
import MyFirstSeleniumProject.pages.InputsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InputsPagedefs {
    HomePage homePage = new HomePage();
    InputsPage inputsPage = new InputsPage();




    @Then("the header from the page should be {string}")
    public void theHeaderFromThePageShouldBe(String desiredHeaderText) {
        inputsPage.checkHeaderText(desiredHeaderText);

    }

    @When("I type {string}")
    public void iType(String inputValue) throws InterruptedException {
        inputsPage.typeInTextbox(inputValue);
        Thread.sleep(300);
    }

    @Then("The texbox contains {string}")
    public void theTexboxContains(String expedValue) {
        inputsPage.checkTextBoxText(expedValue);
    }

    @When("I click {string} button")
    public void iClickUpButton(String button) {

        inputsPage.whenIPressAKey(button);
    }
}
