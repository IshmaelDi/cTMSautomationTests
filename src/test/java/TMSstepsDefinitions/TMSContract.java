package TMSstepsDefinitions;

import TMSPageObjects.TMSPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class TMSContract extends PageObject {

    @Steps
    TMSContract tmsContract;
    TMSPage tmsPage;

    @Given("I am on the {string} page")
    public void iAmOnThePage(String arg0) {
        tmsContract.iAmOnThePage(arg0);



    }

    @When("I click the {string} button")
    public void iClickTheButton(String arg0) {
        tmsContract.iClickTheButton(arg0);

    }

    @And("I fill in the contract details {string}, {string},{string}.")
    public void iFillInTheContractDetailsContractNameDeliveryTypeQuantity() {
        tmsContract.iFillInTheContractDetailsContractNameDeliveryTypeQuantity();
        tmsContract.iFillInTheContractDetailsContractNameDeliveryTypeQuantity();
        tmsContract.iFillInTheContractDetailsContractNameDeliveryTypeQuantity();
    }

    @And("Add {string},{string},{string},{string},{string}.")
    public void addStartsOnEndOnNumberOfLoadsAverageLoadTripsRequired() {
        tmsContract.addStartsOnEndOnNumberOfLoadsAverageLoadTripsRequired();
        tmsContract.addStartsOnEndOnNumberOfLoadsAverageLoadTripsRequired();
        tmsContract.addStartsOnEndOnNumberOfLoadsAverageLoadTripsRequired();
        tmsContract.addStartsOnEndOnNumberOfLoadsAverageLoadTripsRequired();
        tmsContract.addStartsOnEndOnNumberOfLoadsAverageLoadTripsRequired();
    }

    @And("Add {string},{string},{string},{string}.")
    public void addReferenceNumberContractCurrencyContractValueNotes() {
        tmsContract.addReferenceNumberContractCurrencyContractValueNotes();
        tmsContract.addReferenceNumberContractCurrencyContractValueNotes();
        tmsContract.addReferenceNumberContractCurrencyContractValueNotes();
        tmsContract.addReferenceNumberContractCurrencyContractValueNotes();
    }

    @And("Add {string},{string}, {string},{string}.")
    public void addCustomerPaymentTermProductDescriptionRoute() {
        tmsContract.addCustomerPaymentTermProductDescriptionRoute();
        tmsContract.addCustomerPaymentTermProductDescriptionRoute();
        tmsContract.addCustomerPaymentTermProductDescriptionRoute();
        tmsContract.addCustomerPaymentTermProductDescriptionRoute();
    }

    @Then("I click {string} button")
    public void iClickButton(String arg0) {
        tmsContract.iClickTheButton(arg0);
    }


}
