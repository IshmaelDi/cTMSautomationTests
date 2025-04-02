package TMSstepsDefinitions;

import TMSPageObjects.TMSPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class orderSteps extends PageObject {

    @Steps
    TMSPage tmsPage;


    @Given("User has valid data to create an order")
    public void user_has_valid_data_to_create_an_order() {
        tmsPage.TMSWebsite();
        tmsPage.LogIn("ishmael.direro@korridor.com", "Ish@cyest#982");
        tmsPage.RememberMe();
        tmsPage.ClickLogin();
    }
    @And("User navigates to the Dashboard page")
    public void user_navigates_to_the_Dashboard_page() throws InterruptedException {
        tmsPage.SelectDemo();
        tmsPage.Order();
    }
    @And("User clicks the Create Order button")
    public void user_clicks_the_Create_Order_button() throws InterruptedException {
        tmsPage.CreateOrder();
    }
    @And("User fills in the Order Information with: {string}, {string}, {string}, {string}, {string}, {string},{string}, {string}, {string}")
    public void userFillsInTheOrderInformationWithOrderIdPONumberCustomerRouteProductProductDescDeliveryTypeQuantitySlotTime(String orderData, String string) throws InterruptedException {
        tmsPage.EnterOrderId(orderData);
        tmsPage.EnterPONumber(string);
        tmsPage.SelectCustomer("SIM001 - Simone Sims");
        tmsPage.SelectRoute("000001 - Zinja Mguni");
        tmsPage.SelectProduct("Product");
        tmsPage.EnterProductDesc("Order Successfully Created 01");
        tmsPage.SelectDeliveryType("DeliveryType");
        tmsPage.EnterQuantity("20");
        tmsPage.EnterSlotTime("SlotTime");
    }
    @When("User clicks the Save button")
    public void user_clicks_the_Save_button() throws InterruptedException {
        tmsPage.ClickSaveButton();
    }
    @And("User navigates to Edit mode")
    public void user_navigates_to_Edit_mode() throws InterruptedException {
        tmsPage.CLICKEDIT();
    }

   @Then("User clicks the Authorize button")
    public void user_clicks_the_Authorize_button() throws InterruptedException {
       tmsPage.AuthClick();
    }



}
