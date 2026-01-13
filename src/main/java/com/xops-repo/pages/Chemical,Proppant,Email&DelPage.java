package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class ChemicalProppantEmailDelPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    public ChemicalProppantEmailDelPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "jobsSection")
    private WebElement jobsSection;
    @FindBy(id = "currentJobDropdown")
    private WebElement currentJobDropdown;
    @FindBy(id = "wellDropdown")
    private WebElement wellDropdown;
    @FindBy(id = "stageDropdown")
    private WebElement stageDropdown;
    @FindBy(id = "chemicalSetupButton")
    private WebElement chemicalSetupButton;
    @FindBy(id = "proppantSetupButton")
    private WebElement proppantSetupButton;
    @FindBy(id = "emailSetupButton")
    private WebElement emailSetupButton;
    @FindBy(id = "designConcentrationInput")
    private WebElement designConcentrationInput;
    @FindBy(id = "designedVolumeInput")
    private WebElement designedVolumeInput;
    @FindBy(id = "successMessage")
    private WebElement successMessage;
    @FindBy(id = "errorMessage")
    private WebElement errorMessage;
    @FindBy(id = "acidAdditivesEntry")
    private WebElement acidAdditivesEntry;
    @FindBy(id = "slickwaterEntry")
    private WebElement slickwaterEntry;

    public void navigateToJobsSection() {
        elementUtils.clickElement(jobsSection);
    }

    public void selectCurrentJob() {
        elementUtils.clickElement(currentJobDropdown);
    }

    public void chooseWellForJob() {
        elementUtils.clickElement(wellDropdown);
    }

    public void selectStageForJob() {
        elementUtils.clickElement(stageDropdown);
    }

    public void clickChemicalSetup() {
        elementUtils.clickElement(chemicalSetupButton);
    }

    public void clickProppantSetup() {
        elementUtils.clickElement(proppantSetupButton);
    }

    public void clickEmailSetup() {
        elementUtils.clickElement(emailSetupButton);
    }

    public void enterDesignConcentration(String designConcentration) {
        elementUtils.clearAndSendKeys(designConcentrationInput, designConcentration);
    }

    public void enterDesignedVolume(String designedVolume) {
        elementUtils.clearAndSendKeys(designedVolumeInput, designedVolume);
    }

    public void isAcidAdditivesEntryAdded() {
        Assert.assertTrue("Acid & Additives entry not found!", elementUtils.isElementDisplayed(acidAdditivesEntry));
    }

    public void isSlickwaterEntryAdded() {
        Assert.assertTrue("Slickwater entry not found!", elementUtils.isElementDisplayed(slickwaterEntry));
    }

    public void isErrorMessageDisplayed() {
        Assert.assertTrue("Error message not displayed!", elementUtils.isElementDisplayed(errorMessage));
    }

    public void isSuccessMessageDisplayed(String proppantName) {
        String actualMessage = elementUtils.getElementText(successMessage);
        Assert.assertEquals("Success message does not match!", "Successfully added " + proppantName, actualMessage);
    }

    public void hasValidationErrors() {
        WebElement errorElement = driver.findElement(By.id("validationErrors"));
        Assert.assertTrue("Validation errors are not displayed!", elementUtils.isElementDisplayed(errorElement));
    }

    public void isOnEmailSetupScreen() {
        WebElement emailSetupElement = driver.findElement(By.id("emailSetupScreen"));
        Assert.assertTrue("Not on Email Setup Screen!", elementUtils.isElementDisplayed(emailSetupElement));
    }

    public void clickChemicalNameDropdown() {
        WebElement chemicalDropdown = driver.findElement(By.id("chemicalNameDropdown"));
        elementUtils.clickElement(chemicalDropdown);
    }

    public void isProppantSetupScreenDisplayed() {
        WebElement proppantSetupElement = driver.findElement(By.id("proppantSetupScreen"));
        Assert.assertTrue("Proppant Setup Screen is not displayed!", elementUtils.isElementDisplayed(proppantSetupElement));
    }

    public void enterVendorName(String vendorName) {
        WebElement vendorNameField = driver.findElement(By.id("vendorNameField"));
        elementUtils.clearAndSendKeys(vendorNameField, vendorName);
    }

    public void enterValidFields(String fieldName, String value) {
        WebElement fieldElement = driver.findElement(By.id(fieldName));
        elementUtils.clearAndSendKeys(fieldElement, value);
    }

    public void isOnProppantSetupScreen() {
        WebElement proppantSetupScreenElement = driver.findElement(By.id("proppantSetupScreen"));
        Assert.assertTrue("Not on Proppant Setup Screen!", elementUtils.isElementDisplayed(proppantSetupScreenElement));
    }

    public void repeatStepsForNextProppant() {
        WebElement nextProppantButton = driver.findElement(By.id("nextProppantButton"));
        elementUtils.clickElement(nextProppantButton);
    }

    public void doEntriesPersistAfterRefresh() {
        driver.navigate().refresh();
        WebElement persistedValueElement = driver.findElement(By.id("persistedValue"));
        String actualValue = persistedValueElement.getText();
        Assert.assertEquals(actualValue, "Expected Value", "Entries do not persist after refresh!");
    }

    public void isVendorTypeDropdownDisplayingAllAvailableVendorTypes() {
        WebElement vendorTypeDropdown = driver.findElement(By.id("vendorTypeDropdown"));
        Assert.assertTrue("Vendor Type Dropdown is not displaying!", elementUtils.isElementDisplayed(vendorTypeDropdown));
    }

    public void isVendorSaved() {
        WebElement savedVendorMessage = driver.findElement(By.id("savedVendorMessage"));
        Assert.assertTrue("Vendor is not saved successfully!", elementUtils.isElementDisplayed(savedVendorMessage));
    }

    public void clickAddProppantButton() {
        WebElement addProppantButton = driver.findElement(By.id("addProppantButton"));
        elementUtils.clickElement(addProppantButton);
    }

    public void selectChemicalTypeFromDropdown(String chemicalType) {
        WebElement chemicalTypeDropdown = driver.findElement(By.id("chemicalTypeDropdown"));
        elementUtils.selectOptionInDropdown(chemicalTypeDropdown, chemicalType);
    }

    public void verifyJobWellStageDisplayed() {
        WebElement jobWellStageElement = driver.findElement(By.id("jobWellStage"));
        Assert.assertTrue("Job Well Stage is not displayed!", elementUtils.isElementDisplayed(jobWellStageElement));
    }

    public void clickSave() {
        WebElement saveButton = driver.findElement(By.id("saveButton"));
        elementUtils.clickElement(saveButton);
    }

    public void isChemicalNameDropdownDisplayingAllAvailableChemicals() {
        WebElement chemicalNameDropdown = driver.findElement(By.id("chemicalNameDropdown"));
        Assert.assertTrue("Chemical Name Dropdown is not displaying all chemicals!", elementUtils.isElementDisplayed(chemicalNameDropdown));
    }

    public void selectPOFromDropdown(String poValue) {
        WebElement poDropdown = driver.findElement(By.id("poDropdown"));
        elementUtils.selectOptionInDropdown(poDropdown, poValue);
    }

    public void clickAddChemicalButton() {
        WebElement addChemicalButton = driver.findElement(By.id("addChemicalButton"));
        elementUtils.clickElement(addChemicalButton);
    }

    public void verifyDesignConcentrationAndVolume(String expectedConcentration, String expectedVolume) {
        WebElement concentrationElement = driver.findElement(By.id("designConcentration"));
        WebElement volumeElement = driver.findElement(By.id("designVolume"));
        String actualConcentration = concentrationElement.getText();
        String actualVolume = volumeElement.getText();
        Assert.assertEquals(actualConcentration, expectedConcentration, "Concentration does not match!");
        Assert.assertEquals(actualVolume, expectedVolume, "Volume does not match!");
    }

    public void selectChemicalFromDropdown(String chemicalName) {
        WebElement chemicalDropdown = driver.findElement(By.id("chemicalDropdown"));
        elementUtils.selectOptionInDropdown(chemicalDropdown, chemicalName);
    }

    public void isOnChemicalDeliveryTrackingScreen() {
        WebElement chemicalDeliveryTrackingElement = driver.findElement(By.id("chemicalDeliveryTrackingScreen"));
        Assert.assertTrue("Not on Chemical Delivery Tracking Screen!", elementUtils.isElementDisplayed(chemicalDeliveryTrackingElement));
    }

    public void leaveChemicalNameFieldEmpty() {
        WebElement chemicalNameField = driver.findElement(By.id("chemicalNameField"));
        elementUtils.clearElement(chemicalNameField);
    }

    public void isMeetingIdUpdatedSuccessfully() {
        WebElement meetingIdElement = driver.findElement(By.id("meetingId"));
        Assert.assertTrue("Meeting ID is not updated successfully!", elementUtils.isElementDisplayed(meetingIdElement));
    }

    ublic void areErrorsDuringDropdownLoadingDisplayed() {
        WebElement errorElement = driver.findElement(By.id("dropdownErrorMessages"));
        Assert.assertTrue("Errors during dropdown loading are not displayed!", elementUtils.isElementDisplayed(errorElement));
    }

    public void isDeliveryRecordAddedToList() {
        WebElement deliveryRecordElement = driver.findElement(By.id("deliveryRecord"));
        Assert.assertTrue("Delivery record is not added to the list!", elementUtils.isElementDisplayed(deliveryRecordElement));
    }

    public void enterPONumber(String poNumber) {
        WebElement poNumberField = driver.findElement(By.id("poNumberField"));
        elementUtils.clearAndSendKeys(poNumberField, poNumber);
    }

    public void selectProppantName(String proppantName) {
        WebElement proppantDropdown = driver.findElement(By.id("proppantDropdown"));
        elementUtils.selectOptionInDropdown(proppantDropdown, proppantName);
    }

    public void areVendorsDisplayingCorrectPONumber() {
        WebElement vendorPONumberElement = driver.findElement(By.id("vendorPONumber"));
        String actualPONumber = vendorPONumberElement.getText();
        Assert.assertEquals(actualPONumber, "Expected PONumber", "PONumber does not match!");
    }

    public void selectFromDropdown(String dropdownId, String option) {
        WebElement dropdownElement = driver.findElement(By.id(dropdownId));
        elementUtils.selectOptionInDropdown(dropdownElement, option);
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }

    public void clickVendorTypeDropdown() {
        WebElement vendorTypeDropdown = driver.findElement(By.id("vendorTypeDropdown"));
        elementUtils.clickElement(vendorTypeDropdown);
    }

    public void isChemicalSetupScreenDisplayed() {
        WebElement chemicalSetupElement = driver.findElement(By.id("chemicalSetupScreen"));
        Assert.assertTrue("Chemical Setup Screen is not displayed!", elementUtils.isElementDisplayed(chemicalSetupElement));
    }

    public void areErrorMessagesDisplayed() {
        WebElement errorMessagesElement = driver.findElement(By.id("errorMessages"));
        Assert.assertTrue("Error messages are not displayed!", elementUtils.isElementDisplayed(errorMessagesElement));
    }

    public void selectVendorType(String vendorType) {
        WebElement vendorTypeDropdown = driver.findElement(By.id("vendorTypeDropdown"));
        elementUtils.selectOptionInDropdown(vendorTypeDropdown, vendorType);
    }

    public void isDeliveryRecordAdded() {
        WebElement deliveryRecordElement = driver.findElement(By.id("deliveryRecordAdded"));
        Assert.assertTrue("Delivery record is not added!", elementUtils.isElementDisplayed(deliveryRecordElement));
    }

    public void areAllProppantsAdded() {
        WebElement proppantsListElement = driver.findElement(By.id("proppantsList"));
        Assert.assertTrue("Not all proppants are added!", elementUtils.isElementDisplayed(proppantsListElement));
    }

    public void isProppantAdded() {
        WebElement proppantAddedElement = driver.findElement(By.id("proppantAdded"));
        Assert.assertTrue("Proppant is not added!", elementUtils.isElementDisplayed(proppantAddedElement));
    }

    public void clickSaveButtonForLastEntry() {
        WebElement lastEntrySaveButton = driver.findElement(By.id("lastEntrySaveButton"));
        elementUtils.clickElement(lastEntrySaveButton);
    }

    public void enterTotalDesignVolume(String volume) {
        WebElement totalDesignVolumeField = driver.findElement(By.id("totalDesignVolumeField"));
        elementUtils.clearAndSendKeys(totalDesignVolumeField, volume);
    }

    public void isFormResetForNewEntry() {
        WebElement resetFormElement = driver.findElement(By.id("resetFormConfirmation"));
        Assert.assertTrue("Form is not reset for new entry!", elementUtils.isElementDisplayed(resetFormElement));
    }

    public void openEmailSetupScreen() {
        WebElement emailSetupButton = driver.findElement(By.id("openEmailSetupButton"));
        elementUtils.clickElement(emailSetupButton);
    }

    public void isVendorNameErrorDisplayed() {
        WebElement vendorNameError = driver.findElement(By.id("vendorNameError"));
        Assert.assertTrue("Vendor Name error is not displayed!", elementUtils.isElementDisplayed(vendorNameError));
    }

    public void clickMeetingIdField() {
        WebElement meetingIdField = driver.findElement(By.id("meetingIdField"));
        elementUtils.clickElement(meetingIdField);
    }

    public void doesMeetingIdPersistAfterRefresh() {
        String expectedMeetingId = "Expected Meeting ID"; // replace with actual expected value
        driver.navigate().refresh();
        WebElement meetingIdElement = driver.findElement(By.id("meetingId"));
        String actualMeetingId = meetingIdElement.getText();
        Assert.assertEquals(actualMeetingId, expectedMeetingId, "Meeting ID does not persist after refresh!");
    }

    public void enterFields(String fieldName, String value) {
        WebElement fieldElement = driver.findElement(By.id(fieldName));
        elementUtils.clearAndSendKeys(fieldElement, value);
    }

    public void isChemicalAdded() {
        WebElement chemicalAddedMessage = driver.findElement(By.id("chemicalAddedMessage"));
        Assert.assertTrue("Chemical is not added!", elementUtils.isElementDisplayed(chemicalAddedMessage));
    }

    public void isLastEntrySavedSuccessfully() {
        WebElement lastEntrySavedMessage = driver.findElement(By.id("lastEntrySavedMessage"));
        Assert.assertTrue("Last entry is not saved successfully!", elementUtils.isElementDisplayed(lastEntrySavedMessage));
    }

    public void leaveVendorNameFieldEmpty() {
        WebElement vendorNameField = driver.findElement(By.id("vendorNameField"));
        elementUtils.clearElement(vendorNameField);
    }

    public void areProppantsDisplayingCorrectNameAndDesignVolume() {
        WebElement proppantsTableElement = driver.findElement(By.id("proppantsTable"));
        Assert.assertTrue("Proppants are not displaying correct names and design volumes!", elementUtils.isElementDisplayed(proppantsTableElement));
    }

    public void fillInRequiredFields() {
        enterVendorName("Sample Vendor");
        enterTotalDesignVolume("1000");
    }

    public void clickButton(String buttonId) {
        WebElement buttonElement = driver.findElement(By.id(buttonId));
        elementUtils.clickElement(buttonElement);
    }

    public void areValidationErrorsPresent() {
        WebElement validationErrorsElement = driver.findElement(By.id("validationErrors"));
        Assert.assertTrue("Validation errors are not present!", elementUtils.isElementDisplayed(validationErrorsElement));
    }

    public void isFirstChemicalSavedSuccessfully() {
        WebElement firstChemicalSavedMessage = driver.findElement(By.id("firstChemicalSavedMessage"));
        Assert.assertTrue("First chemical is not saved successfully!", elementUtils.isElementDisplayed(firstChemicalSavedMessage));
    }

    public void clickSaveAndNew() {
        WebElement saveAndNewButton = driver.findElement(By.id("saveAndNewButton"));
        elementUtils.clickElement(saveAndNewButton);
    }

    public void clickAddDeliveryRecordButton() {
        WebElement addDeliveryRecordButton = driver.findElement(By.id("addDeliveryRecordButton"));
        elementUtils.clickElement(addDeliveryRecordButton);
    }

    public void enterMeetingId(String meetingId) {
        WebElement meetingIdField = driver.findElement(By.id("meetingIdField"));
        elementUtils.clearAndSendKeys(meetingIdField, meetingId);
    }

    public void isVendorRequiredErrorDisplayed() {
        WebElement vendorRequiredError = driver.findElement(By.id("vendorRequiredError"));
        Assert.assertTrue("Vendor required error is not displayed!", elementUtils.isElementDisplayed(vendorRequiredError));
    }

    public void leaveDesignedVolumeFieldEmpty() {
        WebElement designedVolumeField = driver.findElement(By.id("designedVolumeField"));
        elementUtils.clearElement(designedVolumeField);
    }

    public void isEntryPersistedAfterRefresh() {
        String expectedEntryValue = "Expected Value"; // replace with actual expected value
        driver.navigate().refresh();
        WebElement persistedEntryElement = driver.findElement(By.id("persistedEntry"));
        String actualEntryValue = persistedEntryElement.getText();
        Assert.assertEquals(actualEntryValue, expectedEntryValue, "Entry does not persist after refresh!");
    }

    public void openProppantSetupScreen() {
        WebElement proppantSetupButton = driver.findElement(By.id("openProppantSetupButton"));
        elementUtils.clickElement(proppantSetupButton);
    }

    public void leaveVendorFieldEmpty() {
        WebElement vendorField = driver.findElement(By.id("vendorField"));
        elementUtils.clearElement(vendorField);
    }

    public void clickSaveButton() {
        WebElement saveButton = driver.findElement(By.id("saveButton"));
        elementUtils.clickElement(saveButton);
    }

    public void attemptToClickAddProppantButtonAgain() {
        WebElement addProppantButton = driver.findElement(By.id("addProppantButton"));
        elementUtils.clickElement(addProppantButton);
    }

    public void isDeliveryRecordCreated() {
        WebElement deliveryRecordCreatedMessage = driver.findElement(By.id("deliveryRecordCreatedMessage"));
        Assert.assertTrue("Delivery record is not created!", elementUtils.isElementDisplayed(deliveryRecordCreatedMessage));
    }

    public void isEmailSetupScreenDisplayed() {
        WebElement emailSetupScreenElement = driver.findElement(By.id("emailSetupScreen"));
        Assert.assertTrue("Email Setup Screen is not displayed!", elementUtils.isElementDisplayed(emailSetupScreenElement));
    }

    public void isProppantNameDropdownDisplayingAllAvailableProppants() {
        WebElement proppantNameDropdown = driver.findElement(By.id("proppantNameDropdown"));
        Assert.assertTrue("Proppant Name Dropdown is not displaying all available proppants!", elementUtils.isElementDisplayed(proppantNameDropdown));
    }

    public void areAllVendorsAddedToList() {
        WebElement vendorListElement = driver.findElement(By.id("vendorList"));
        Assert.assertTrue("Not all vendors are added to the list!", elementUtils.isElementDisplayed(vendorListElement));
    }

    public void areAllEnteredDetailsDisplayedCorrectly() {
        WebElement detailsElement = driver.findElement(By.id("enteredDetails"));
        Assert.assertTrue("All entered details are not displayed correctly!", elementUtils.isElementDisplayed(detailsElement));
    }

    public void clickAddVendorButton() {
        WebElement addVendorButton = driver.findElement(By.id("addVendorButton"));
        elementUtils.clickElement(addVendorButton);
    }

    public void selectVendor(String vendorName) {
        WebElement vendorDropdown = driver.findElement(By.id("vendorDropdown"));
        elementUtils.selectOptionInDropdown(vendorDropdown, vendorName);
    }

    public void clickProppantNameDropdown() {
        WebElement proppantDropdown = driver.findElement(By.id("proppantNameDropdown"));
        elementUtils.clickElement(proppantDropdown);
    }

    public void selectVendorFromDropdown(String vendorName) {
        WebElement vendorDropdown = driver.findElement(By.id("vendorDropdown"));
        elementUtils.selectOptionInDropdown(vendorDropdown, vendorName);
    }

    public void isOnChemicalSetupScreen() {
        WebElement chemicalSetupScreenElement = driver.findElement(By.id("chemicalSetupScreen"));
        Assert.assertTrue("Not on Chemical Setup Screen!", elementUtils.isElementDisplayed(chemicalSetupScreenElement));
    }
}