package TMSstepsDefinitions;

import TMSPageObjects.TMSContract;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class contractSteps extends PageObject{

    // Add Methods to reference TMS PageObjects
    @Steps
    TMSContract tmsContract;

    // Add actual test implementation.

    // Referencing Login Actions/Methods
    @Given("User has successfully logged In with valid credentials")
    public void successfully_logged_in() {
        tmsContract.TMSWebsite();
        tmsContract.LogIn("Ishmael.direro@korridor.com", "Ish@cyest#982");
        tmsContract.inRadioButtonGroup();
        tmsContract.ClickLogin();
    }

    @Then("User is on Landing to select Tenant")
    public void userIsOnLandingToSelectTenant() throws InterruptedException {
        tmsContract.SelectDemo();
    }

    @And("User is directed to dashboard and click Contract Button")
    public void userIsDirectedToDashboardAndClickContractButton() {
        tmsContract.Contract();
    }

    @Then("User click the AddContract button")
    public void userClickTheAddContractButton() {
        tmsContract.AddContract();
    }

    @Then("I fill in the contract details {string}, {string},{string}.")
    public void contract_details(String ContractName, String DeliveryType, String Quantity) throws InterruptedException {
        tmsContract.ContractName(ContractName);
        tmsContract.Delivery(DeliveryType);
        tmsContract.inRadioButtonGroup(Quantity);
    }

    @And("AddONE {string},{string},{string},{string},{string}.")
    public void addone(String StartsOnDate, String EndOnDate, String NumberofLoads, String AverageLoad, String TripsRequired) throws InterruptedException {
        tmsContract.EnterStartOn(StartsOnDate);
        tmsContract.EnterEndOn(EndOnDate);
        tmsContract.EnterEvarageLoad(NumberofLoads);
        tmsContract.EnterEvarageLoad(AverageLoad);
        tmsContract.EnterTripRequired(TripsRequired);
    }

    @And("AddTWO {string},{string},{string},{string}.")
    public void addtwoString (String ReferenceNumber, String ContractCurrency, String ContractValue, String Notes) throws InterruptedException {
        tmsContract.EnterReference(ReferenceNumber);
        tmsContract.SelectContractCurrency(ContractCurrency);
        tmsContract.ContractValue(ContractValue);
        tmsContract.EnterNotes(Notes);
    }

    @And("AddTHREE {string},{string}, {string},{string}.")
    public void addthree(String Customer, String PaymentTerm, String ProductDescription, String Route) throws InterruptedException {
        tmsContract.SelectCustomer(Customer);
        tmsContract.SelectPaymentTerm(PaymentTerm);
        tmsContract.SelectRoute(Route);
    }

    @Then("I click Contract Save button")
    public void iClickContractSaveButton() {
        tmsContract.ClickContractSaveButton();
    }
}
