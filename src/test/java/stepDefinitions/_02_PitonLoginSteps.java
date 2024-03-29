package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages._02_PitonLoginPage;
import utilities.GWD;

public class _02_PitonLoginSteps {

    _02_PitonLoginPage plp = new _02_PitonLoginPage();
    @Given("Navigate to Piton")
    public void navigateToPiton() {
        GWD.getDriver().get("https://e2e-assessment.piton.com.tr/");
    }

    @When("The login form should appear")
    public void theLoginFormShouldAppear() {
        plp.verifyContainsText(plp.loginForm, "Event Manager Login");
    }

    @When("Click the login button")
    public void clickTheLoginButton() {
        plp.myClick(plp.loginButton);
    }
}
