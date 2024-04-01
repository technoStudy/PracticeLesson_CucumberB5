package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages._03_ZBOnlineBanking;

import java.util.List;

public class _03_ZBAddNewPayeeSteps {

    _03_ZBOnlineBanking zbOnlineBanking=new _03_ZBOnlineBanking();
    @When("Click on the element in ZBOnlineBanking")
    public void clickOnTheElementInZBOnlineBanking(DataTable links) {

        List<String> linksList=links.asList(String.class);

        for (int i = 0; i < linksList.size(); i++) {
            String link= linksList.get(i);
            WebElement element=zbOnlineBanking.getWebElement(link);
            zbOnlineBanking.myClick(element);
        }
    }

    @And("User sending name, address, account and details in ZBOnlineBanking")
    public void userSendingNameAddressAccountAndDetailsInZBOnlineBanking(DataTable dataTable) {

        List<List<String>> items = dataTable.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            List<String> item = items.get(i);
            WebElement element = zbOnlineBanking.getWebElement(item.get(0));
            String text = item.get(1);
            zbOnlineBanking.mySendKeys(element, text);
        }
    }

    @Then("Verify that the transaction was successfully")
    public void verifyThatTheTransactionWasSuccessfully() {
    }
}
