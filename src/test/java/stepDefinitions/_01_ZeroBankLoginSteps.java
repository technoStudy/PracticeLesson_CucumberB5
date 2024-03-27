package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages._01_ZeroBankLoginPage;
import utilities.GWD;

public class _01_ZeroBankLoginSteps {

    _01_ZeroBankLoginPage zbLogin = new _01_ZeroBankLoginPage();

    @Given("Navigate to the website")
    public void navigateToTheWebsite() {
        GWD.getDriver().get("http://zero.webappsecurity.com/login.html");
    }

    @And("Enter username that as {string} and password that as {string}")
    public void enterUsernameThatAsAndPasswordThatAs(String username, String password) {
        zbLogin.mySendKeys(zbLogin.username, username);
        zbLogin.mySendKeys(zbLogin.password, password);
    }

    @When("Click login button")
    public void clickLoginButton() {
        zbLogin.myClick(zbLogin.signInButton);
        GWD.getDriver().navigate().back();
    }

    @Then("Verify that user logged in")
    public void verifyThatUserLoggedIn() {
        Assert.assertTrue(zbLogin.userIcon.isEnabled());
    }
}
