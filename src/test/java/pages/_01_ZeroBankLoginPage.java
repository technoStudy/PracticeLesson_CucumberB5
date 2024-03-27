package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

public class _01_ZeroBankLoginPage extends Parent{

    public _01_ZeroBankLoginPage() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(id="user_login")
    public WebElement username;

    @FindBy(id="user_password")
    public WebElement password;

    @FindBy(name="submit")
    public WebElement signInButton;


    @FindBy(css = "[class='icon-user']")
    public WebElement userIcon;



}
