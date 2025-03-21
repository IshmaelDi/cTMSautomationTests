package TMSstepsDefinitions;

import TMSPageObjects.TMSPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.PageObjects;
import org.openqa.selenium.WebDriver;

public class TMSContract extends PageObject {

    @Steps
    TMSContract tmsContract;
    @Steps
    TMSPage tmsPage;


    @Given("User has loged In")
    public void userHasLogedIn() {
        tmsPage.TMSWebsite();
        tmsPage.LogIn("ishmael.direro@korridor.com", "Ish@cyest#982");
        tmsPage.RememberMe();
        tmsPage.Click();
    }

    @When("I click the Add Contract button")
    public void iClickTheAddContractButton() {
        tmsContract.iClickTheAddContractButton();
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
    public void iClickButton() {
        tmsContract.iClickButton();
    }
}










