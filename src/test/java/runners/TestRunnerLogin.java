package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = {"src/test/java/featureFiles/_01_ZeroBankLogin.feature"},
                glue = {"stepDefinitions"}
        )

public class TestRunnerLogin extends AbstractTestNGCucumberTests {
}
