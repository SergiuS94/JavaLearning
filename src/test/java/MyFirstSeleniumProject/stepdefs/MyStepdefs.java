package MyFirstSeleniumProject.stepdefs;

import MyFirstSeleniumProject.pages.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static MyFirstSeleniumProject.utils.Base.kill;

public class MyStepdefs {

    HomePage homePage = new HomePage();

    @Given("when I navigate to the home page")
    public void whenINavigateToTheHomePage() throws InterruptedException {
        homePage.openHomePage();
    }

    @When("I click {string} link")
    public void iClickLink(String pageName){
        homePage.navigateToPage(pageName);
    }

    @Then("the header should be {string}")
    public void theHeaderShouldBe(String desiredHeaderText) {

        homePage.checkHeaderText(desiredHeaderText);
    }

    @And("I close the App")
    public void iCloseTheApp() {
        kill();
    }


    @Given("I navigate to the home page")
    public void iNavigateToTheHomePage() {

    }

    @When("I enter username {string}")
    public void iEnterUsername(String username) {
    }

    @Then("I enter <something> on the <field>")
    public void iEnterSomethingOnTheField() {

    }

    @Then("the following elements of the list have to correct value")
    public void theFollowingElementsOfTheListHaveToCorrectValue(DataTable table) {
        List<Map<String, String>> rows = table.asMaps(String.class, String.class);
        ArrayList<Integer> ids = new ArrayList<>();
        ArrayList<String> values = new ArrayList<>();
        for (Map<String, String> row : rows) {
            ids.add(Integer.valueOf(row.get("id")));
            values.add(row.get("value"));
        }
//        System.out.println(ids);
//        System.out.println(values);
        homePage.checkPageElements(ids, values);
    }

    @Then("the first two elements are {string} {string}")
    public void theFirstTwoElementsAre(String element1, String element2) {
        homePage.checkTheFirstTwoElements(element1, element2);
    }
}
