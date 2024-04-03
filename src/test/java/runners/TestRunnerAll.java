package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = {"src/test/java/featureFiles"},
                glue = {"stepDefinitions"},
                dryRun = false
        )

public class TestRunnerAll extends AbstractTestNGCucumberTests {
}
