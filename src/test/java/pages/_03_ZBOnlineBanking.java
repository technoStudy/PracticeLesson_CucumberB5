package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

public class _03_ZBOnlineBanking extends Parent {

    public _03_ZBOnlineBanking() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(id = "onlineBankingMenu")
    public WebElement onlineBankingLink;

    @FindBy(id = "pay_bills_link")
    public WebElement payBillsLink;

    @FindBy(linkText = "Add New Payee")
    public WebElement addNewPayeeLink;

    @FindBy(id = "np_new_payee_name")
    public WebElement newPayeeName;

    @FindBy(id = "np_new_payee_address")
    public WebElement newPayeeAddress;

    @FindBy(id = "np_new_payee_account")
    public WebElement newPayeeAccount;

    @FindBy(id = "np_new_payee_details")
    public WebElement newPayeeDetails;

    @FindBy(id = "add_new_payee")
    public WebElement addButton;

    @FindBy(id = "alert_content")
    public WebElement successMessage;

    public WebElement getWebElement(String stringElement) {
        switch (stringElement) {
            case "onlineBankingLink":
                return this.onlineBankingLink;
            case "payBillsLink":
                return this.payBillsLink;
            case "addNewPayeeLink":
                return this.addNewPayeeLink;
            case "newPayeeName":
                return this.newPayeeName;
            case "newPayeeAddress":
                return this.newPayeeAddress;
            case "newPayeeAccount":
                return this.newPayeeAccount;
            case "newPayeeDetails":
                return this.newPayeeDetails;
        }
        return null;
    }
}
