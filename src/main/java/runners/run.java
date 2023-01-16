package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/crocodile.feature",
        glue = {"stepDefinitions"},
        tags = "@datadriven"
)
public class run extends AbstractTestNGCucumberTests {

}
