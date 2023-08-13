package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.Hasta_Kayit_Page_M;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HastaKayit_StepDefinitions_M {


    Actions actions = new Actions(Driver.getDriver());
    Hasta_Kayit_Page_M mPage = new Hasta_Kayit_Page_M();


    @And("User chooses the {string}")
    public void userChoosesThe(String nationality) {
        Select select = new Select(mPage.nationalityDropdown);
        select.selectByVisibleText(ConfigReader.getProperty(nationality));
    }

    @And("User clicks Patient Type box and Choose Button on dual citizens")
    public void userClicksPatientTypeBoxAndChooseButtonOnDualCitizens() {
        actions.moveToElement(mPage.patientType).click().perform();
        mPage.dualCitizensChooseButton.click();
    }

    @And("User clicks Gender box and chooses the {string}")
    public void userClicksGenderBoxAndChoosesThe(String gender) {
        Select select = new Select(mPage.genderDropdown);
        select.selectByVisibleText(ConfigReader.getProperty(gender));
    }

    @And("User enters {string} and {string}")
    public void userEntersAnd(String passportId, String passportNo) {
        ReusableMethods.waitForVisibility(mPage.pasaportIdSearchBox, 15);
        actions.moveToElement(mPage.pasaportIdSearchBox)
                .click()
                .sendKeys(ConfigReader.getProperty(passportId))
                .click(mPage.pasaportNoSearchBox2)
                .sendKeys(ConfigReader.getProperty(passportNo)).perform();
    }

    @And("User clicks the Save button")
    public void userClicksTheSaveButton() {
        mPage.saveButton.click();
    }


    @Then("User verifies that the institution Information Warning Message is displayed")
    public void userVerifiesThatTheInstitutionInformationWarningMessageIsDisplayed() {
        ReusableMethods.waitForVisibility(mPage.institutionInformationWarningMessage, 10);
        ReusableMethods.getElementText(mPage.institutionInformationWarningMessage);
        Assert.assertTrue(mPage.institutionInformationWarningMessage.isDisplayed());
    }


    @And("User enters {string} in name box")
    public void userEntersInNameBox(String name) {
        mPage.nameSearchBox.sendKeys(ConfigReader.getProperty(name));
    }

    @And("User enters {string} in surname box")
    public void userEntersInSurnameBox(String surname) {
        actions.moveToElement(mPage.surnameSearchBox).sendKeys(ConfigReader.getProperty(surname));
    }

    @And("User enters {string} in mobile phone number box")
    public void userEntersInMobilePhoneNumberBox(String mobilePhoneNumber) {
        ReusableMethods.waitForVisibility(mPage.mobilePhoneNumber, 10);
        mPage.mobilePhoneNumber.sendKeys(ConfigReader.getProperty(mobilePhoneNumber));
    }

    @And("User enters {string} in TC ID box")
    public void userEntersInTCIDBox(String TC) {
        mPage.TCsearchBox.sendKeys(ConfigReader.getProperty(TC));
    }


    @And("User enters {string} in date of birth box")
    public void userEntersInDateOfBirthBox(String dateOfBirth) {
        actions.moveToElement(mPage.dateOfBirthSearchBox).click().sendKeys(ConfigReader.getProperty(dateOfBirth))
                .sendKeys(Keys.ENTER).perform();

    }

    @Then("User verifies that the message of transaction Successful Warning Message is displayed")
    public void userVerifiesThatTheMessageOfTransactionSuccessfulWarningMessageIsDisplayed() {
        ReusableMethods.waitForVisibility(mPage.transactionSuccessfulWarningMessage, 10);
        ReusableMethods.getElementText(mPage.transactionSuccessfulWarningMessage);
        Assert.assertTrue(mPage.transactionSuccessfulWarningMessage.isDisplayed());


    }


    @Then("User verifies that Passport Id is requested")
    public void userVerifiesThatPassportIdIsRequested() {
        String passportName = "Pasaport Id";
        String passportNo = "Pasaport No";
        String allocationNumberBoxName = ReusableMethods.getElementText(mPage.allocationNumberBoxName);
        String reportCardSerialNoBoxName = ReusableMethods.getElementText(mPage.reportCardSerialNoBoxName);
        Assert.assertEquals(allocationNumberBoxName,passportName);


    }

    @Then("User verifies that Passport No is requested")
    public void userVerifiesThatPassportNoIsRequested() {
        String passportName = "Pasaport Id";
        String passportNo = "Pasaport No";
        String allocationNumberBoxName = ReusableMethods.getElementText(mPage.allocationNumberBoxName);
        String reportCardSerialNoBoxName = ReusableMethods.getElementText(mPage.reportCardSerialNoBoxName);
        Assert.assertEquals(reportCardSerialNoBoxName,passportNo);
    }

    @Then("User Logs out")
    public void userLogsOut() {
        mPage.closeButton.click();
        System.out.println("close buttona tıklanıd");
       //  mPage.noItem.click();
       //  System.out.println("no item tıklandı");
       // actions.moveToElement(mPage.user).perform();
       // ReusableMethods.waitFor(3);

    }
}
