package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import stepdefinitions.StepDefinitions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\mrkun\\CucumberBDDFramework\\src\\test\\java\\feature\\Register.feature ",
        glue = {"stepdefinitions"}
)

public class TestRunner {
}
