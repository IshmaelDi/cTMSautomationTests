package TMSstepsDefinitions;

import TMSPageObjects.TMSPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class TMSContract extends PageObject {

    // Add Annotation to reference TMS PageObjects
    @Steps
    TMSContract tmsContract;
    @Steps
    TMSPage tmsPage;

    // Add actual test implementation.

    // Referencing Login Actions
    @Given("User has successfully logged In with valid credentials")
    public void user_has_successfully_logged_in_with_valid_credentials() {
        tmsPage.TMSWebsite();
        tmsPage.LogIn("ishmael.direro@korridor.com", "Ish@cyest#982");
        tmsPage.RememberMe();
        tmsPage.ClickLogin();
        // tmsContract.tmsPage.ClickLogin();
    }

    @Then("User is on Landing to select {string}")
    public void Tenant(String Tenant) {
        tmsContract.Tenant(Tenant);
    }

    @And("User is directed to dashboard and click {string} Button")
    public void Contract(String Contract) {
        tmsContract.Contract(Contract);
    }

    @Then("User click the {string} button")
    public void AddContract(String AddContract) {
        tmsContract.AddContract(AddContract);
    }

    @Then("I fill in the contract details {string}, {string},{string}.")
    public void contract_details(String ContractName, String DeliveryType, String Quantity) {
        tmsContract.contract_details(ContractName, DeliveryType, Quantity);


    }

    @And("AddONE {string},{string},{string},{string},{string}.")
    public void addone(String StartsOnDate, String EndOnDate, String NumberofLoads, String AverageLoad, String TripsRequired) {
        tmsContract.addone(StartsOnDate, EndOnDate, NumberofLoads, AverageLoad, TripsRequired);
    }

    @And("AddTWO {string},{string},{string},{string}.")
    public void addtwoString (String ReferenceNumber, String ContractCurrency, String ContractValue, String Notes) {
        tmsContract.addtwoString(ReferenceNumber, ContractCurrency, ContractValue, Notes);
    }

    @And("AddTHREE {string},{string}, {string},{string}.")
    public void addthree(String Customer, String PaymentTerm, String ProductDescription, String Route) {
        tmsContract.addthree(Customer, PaymentTerm, ProductDescription, Route);
    }

    @Then("I click Contract Save button")
    public void iClickContractSaveButton() {
        tmsContract.iClickContractSaveButton();
    }
}
