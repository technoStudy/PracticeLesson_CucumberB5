package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                tags = "@Regression and @Smoke",
                features = {"src/test/java/featureFiles"},
                glue = {"stepDefinitions"}
        )

public class TestRunnerWithTest extends AbstractTestNGCucumberTests {
}
