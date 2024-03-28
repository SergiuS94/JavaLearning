package MyFirstSeleniumProject.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"MyFirstSeleniumProject.stepdefs","MyFirstSeleniumProject"},
        plugin = {"pretty", "html:target/cucumber"}
//        tags = {"not @Ignore","@Run"}
)
public class TestRunner {
}
