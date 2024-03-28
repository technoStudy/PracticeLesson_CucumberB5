package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

public class _02_PitonLoginPage extends Parent {

    public _02_PitonLoginPage() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css = "[class='login-header']")
    public WebElement loginForm;

    @FindBy(css = "[class='mat-button-wrapper']")
    public WebElement loginButton;


}
