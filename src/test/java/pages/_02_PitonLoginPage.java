package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

import java.util.Stack;

public class _02_PitonLoginPage extends Parent {

    public _02_PitonLoginPage() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css = "[class='login-header']")
    public WebElement loginForm;

    @FindBy(css = "[class='mat-button-wrapper']")
    public WebElement loginButton;

    @FindBy(id = "mat-error-0")
    public WebElement userNameError;

    @FindBy(id = "mat-error-1")
    public WebElement passwordError;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public  WebElement password;


    WebElement myElement;

    public void findAndClick(String element){
        switch (element){
            case "loginButton" : myElement = loginButton;break;

        }
        myClick(myElement);

    }

    public  void findAndSendKeys (String element, String text){

        switch (element){
            case "UserName" : myElement = userName;break;
            case "Password" : myElement = password;break;
        }
        mySendKeys(myElement,text);


    }


}
