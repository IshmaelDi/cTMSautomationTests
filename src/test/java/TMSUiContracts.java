import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TMSUiContracts {
    @Given("I am on the {string} page")
    public void iAmOnThePage(String arg0) {

    }

    @When("I click the {string} button")
    public void iClickTheButton(String arg0) {

    }

    @And("I fill in the contract details {string}, {string},{string}.")
    public void iFillInTheContractDetailsContractNameDeliveryTypeQuantity() {
    }

    @And("Add {string},{string},{string},{string},{string}.")
    public void addStartsOnEndOnNumberOfLoadsAverageLoadTripsRequired() {
    }

    @And("Add {string},{string},{string},{string}.")
    public void addReferenceNumberContractCurrencyContractValueNotes() {
    }

    @And("Add {string},{string}, {string},{string}.")
    public void addCustomerPaymentTermProductDescriptionRoute() {
    }

    @Then("I click {string} button")
    public void iClickButton(String arg0) {
    }
}
