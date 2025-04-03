package TMSPageObjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class TMSContract extends PageObject {

    // Login IN elements
    String Url = "https://korridor.crownsoftware.co.za/";
    String UserNameXpath = "//input[@id='Input_Email']";
    String PasswordXpath = "//input[@id='Input_Password']";
    String RememberMeXpath = "//input[@type='checkbox']";
    String LoginButtonXpath = "//button[normalize-space()='Log In']";

    // Landing Page Elements
     String TenantDropXpath2 = "(//select[@name='tenantId'])[1]";

    // Dashboard Buttons Elements
    String ContractXpath = "(//span[normalize-space()='Contracts'])[1]";
    String AddContractXpath = "(//a[normalize-space()='Add Contract'])[1]";

    // Contract Details
    String NameXpath = "(//input[@id='name'])[1]";
    String DeliveryXpath = "(//select[@title='DeliveryType'])[1]";
    String StartOnXpath = "(//input[@id='StartsOn'])[1]";
    String EndOnXpath = "(//input[@id='EndsOn'])[1]";
    String EvarageLoadXpath = "(//input[@placeholder='Average Load...'])[1]";
    String NUmberLoadXpath = "(//input[@placeholder='Number of Loads...'])[1]";
    String TripRequiredXpath = "(//input[@placeholder='Trips Required...'])[1]";
    String ReferenceXpath = "(//input[@placeholder='Reference Number...'])[1]";
    String ContractCurrencyXpath = "(//select[@title='ContractCurrency'])[1]";
    String ContractValueXpath = "(//input[@placeholder='Contract Value...'])[1]";
    String NotesXpath = "(//input[@placeholder='Notes...'])[1]";
    String CustomerXpath = "(//select[@title='CustomerId'])[1]";
    String PaymentTermXpath = "(//select[@title='PaymentTermId'])[1]";
    String ProductXpath = "//*[@id=\"uberForm\"]/section[2]/div[2]/div/div[15]/select";
    String ProductDescriptXpath = "(//input[@placeholder='Product Description...'])[1]";
    String RouteXpath = "(//select[@title='RouteId'])[1]";
    String SaveXpath = "(//input[@value='Save'])[1]";

    // Contract Methods
    @Step("User access TMS Website")
    public void TMSWebsite() {
        getDriver().get(Url);
        getDriver().manage().window().maximize();
    }
    @Step("User captures valid Login Credentials")
    public void LogIn(String UserName, String Password) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        wait.until(elementToBeClickable(By.xpath(UserNameXpath))).sendKeys(UserName);
        wait.until(elementToBeClickable(By.xpath(PasswordXpath))).sendKeys(Password);
    }
    @Step("User clik RememberMeRadioButton")
    public void RememberMe() {
        $(By.xpath(RememberMeXpath)).click();
    }
    @Step("User click LoginButton")
    public void ClickLogin() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(elementToBeClickable(By.xpath(LoginButtonXpath))).click();
    }
    @Step("User select Demo on Tenant")
    public void SelectDemo() throws InterruptedException {
        Thread.sleep(1000);

        // Locate Dropdown Element
        WebElement Drop = getDriver().findElement(By.id("dropdownTenant"));
        Drop.click();
        // Find all options inside the dropdown
        List<WebElement> options = getDriver().findElements(By.xpath("//ul[@class='dropdown-menu']/li"));
        // Value to select
        String valueToSelect = "5";

        // Create Actions class instance
        Actions actions = new Actions(getDriver());

        // Loop through options and move to the desired one
        for (WebElement option : options) {
            if (option.getText().equals(valueToSelect)) {
                // Move and click
                actions.moveToElement(option).click().perform();
                break;
            }
        }

    }

    @Step("User Click Contract Button ")
    public  void Contract() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        WebElement Contract = wait.until(elementToBeClickable(By.xpath(ContractXpath)));
        Contract.click();
    }
    @Step("User click Add Contract Button")
    public  void AddContract() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        WebElement AddContract = wait.until(elementToBeClickable(By.xpath(AddContractXpath)));
        AddContract.click();
    }
    // Add Contract Information Details
    @Step("User Captures Contract Details")
    public  void ContractName(String ContractName) throws InterruptedException {

        Thread.sleep(1000);

        WebElement txt = getDriver().findElement(By.xpath("//*[@id=\"uberForm\"]/section[2]/div[2]/div/div[1]/input"));
        txt.click();
        txt.clear();
        txt.sendKeys(ContractName);
    }

    @Step("User select Delivery Type")
    public  void Delivery(String s) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        WebElement delivery01 = wait.until(elementToBeClickable(By.xpath(DeliveryXpath)));
        Select selectObject = new Select(delivery01);
        selectObject.selectByValue("1");
    }

    @Step("User QTY Date")
    public  void QTY(String s) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        WebElement Quantity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='Quantity...'])[1]")));
        Quantity.sendKeys("7");

    }

    @Step("User EnterStartOn Date")
    public  void EnterStartOn(String s) throws InterruptedException {
        Thread.sleep(1000);
        WebElement StartOn = getDriver().findElement(By.xpath(StartOnXpath));
        StartOn.click();
        StartOn.clear();
        StartOn.sendKeys("2025-04-03");


        //$(StartOnXpath).sendKeys("2025-03-21");
    }
    public  void EnterEndOn(String s) throws InterruptedException {

        Thread.sleep(1000);
        WebElement EndOn = getDriver().findElement(By.xpath(EndOnXpath));
        EndOn.click();
        EndOn.clear();
        EndOn.sendKeys("2025-04-03");

        //$(EndOnXpath).sendKeys("2025-03-21");
    }

    public  void EnterEvarageLoad(String s) throws InterruptedException {
        Thread.sleep(1000);
        $(EvarageLoadXpath).sendKeys("5");
    }

    public  void EnterNUmberLoad(String s) throws InterruptedException {
        Thread.sleep(1000);
        WebElement NUmberLoad = getDriver().findElement(By.xpath(NUmberLoadXpath));
        NUmberLoad.click();
        NUmberLoad.clear();
        NUmberLoad.sendKeys("10");

        //$(NUmberLoadXpath).sendKeys("10");
    }

    public  void EnterTripRequired(String s) throws InterruptedException {

        Thread.sleep(1000);
        WebElement TripRequired = getDriver().findElement(By.xpath(TripRequiredXpath));
        TripRequired.click();
        TripRequired.clear();
        TripRequired.sendKeys("2");

        //$(TripRequiredXpath).sendKeys("2");
    }

    public  void EnterReference(String s) throws InterruptedException {

        Thread.sleep(1000);
        WebElement Reference = getDriver().findElement(By.xpath(ReferenceXpath));
        Reference.click();
        Reference.clear();
        Reference.sendKeys("Test01");

        //$(ReferenceXpath).sendKeys("Test01");
    }
    public  void SelectContractCurrency(String s) throws InterruptedException {
        // Locate Dropdown Element
        WebElement CurrencyDrop = getDriver().findElement(By.className("control-label"));
        CurrencyDrop.click();

        // Find all options inside the dropdown
        List<WebElement> options = getDriver().findElements(By.xpath("//select[@title='ContractCurrency']"));

        // Value to select
        String textToSelect = "Angolan Kwanza";

        // Create Actions class instance
        Actions actions = new Actions(getDriver());

        // Loop through options and move to the desired one
        for (WebElement option : options) {
            if (option.getText().equals(textToSelect)) {

                // Move and click
                actions.moveToElement(option).click().perform();
                break;
            }
        }

    }

    public void ContractValue (String s) {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
            WebElement ContractV = getDriver().findElement(By.xpath("//*[@id=\"uberForm\"]/section[2]/div[2]/div/div[1]/input"));
            ContractV.click();
            ContractV.clear();
            ContractV.sendKeys("10");
     }

     public void EnterNotes (String s) throws InterruptedException {

            Thread.sleep(1000);
            WebElement Note = getDriver().findElement(By.xpath(NotesXpath));
            Note.click();
            Note.clear();
            Note.sendKeys("Ishmael Direro");

           // $(NotesXpath).sendKeys("Ishmael Direro");
        }

        public void SelectCustomer (String s){
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
            WebElement delivery01 = wait.until(elementToBeClickable(By.xpath(CustomerXpath)));
            Select selectObject = new Select(delivery01);
            selectObject.selectByValue("1");
        }
        public void SelectPaymentTerm (String s) throws InterruptedException {

            Thread.sleep(1000);
            WebElement PaymentTerm = getDriver().findElement(By.xpath(PaymentTermXpath));
            PaymentTerm.click();

            PaymentTerm.sendKeys("Cash in advance");

            //$(PaymentTermXpath).sendKeys("Cash in advance");
        }

        public void EnterProductDescript (String s){
            $(ProductDescriptXpath).sendKeys("Testing");
        }

        public void SelectRoute (String s){

            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
            WebElement Route = wait.until(elementToBeClickable(By.xpath(RouteXpath)));
            Select selectObject = new Select(Route);
            selectObject.selectByValue("1");
        }
        public void ClickContractSaveButton () {
            $(SaveXpath).click();
        }
        public void inRadioButtonGroup () {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(0));
            wait.until(elementToBeClickable(By.xpath("//input[@type='checkbox']"))).click();
        }

    }

