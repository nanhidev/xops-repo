package com.xops-repo.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.xops_repo.pages.ChemicalProppantEmailDelPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class ChemicalProppantEmailDel extends DriverFactory {
ChemicalProppantEmailDelPage chemicalProppantEmailDelPage = new ChemicalProppantEmailDelPage(driver);
@Given("the user is in the Jobs section")
public void the_user_is_in_the_jobs_section() {
chemicalProppantEmailDelPage.navigateToJobsSection();
}
@When("the user selects a current Job from the list")
public void the_user_selects_a_current_job_from_the_list() {
chemicalProppantEmailDelPage.selectCurrentJob();
}
@And("the user chooses a Well associated with the Job")
public void the_user_chooses_a_well_associated_with_the_job() {
chemicalProppantEmailDelPage.chooseWellForJob();
}
@And("the user selects a Stage for the Job")
public void the_user_selects_a_stage_for_the_job() {
chemicalProppantEmailDelPage.selectStageForJob();
}
@And("the user clicks on the Chemical Setup option")
public void the_user_clicks_on_the_chemical_setup_option() {
chemicalProppantEmailDelPage.clickChemicalSetup();
}
@Then("the user is redirected to the Chemical Setup screen")
public void the_user_is_redirected_to_the_chemical_setup_screen() {
chemicalProppantEmailDelPage.isChemicalSetupScreenDisplayed();
}
@And("the selected Job, Well, and Stage are displayed correctly on the Chemical Setup screen")
public void the_selected_job_well_and_stage_are_displayed_correctly_on_the_chemical_setup_screen() {
chemicalProppantEmailDelPage.verifyJobWellStageDisplayed();
}
@When("the user clicks on the Proppant Setup option")
public void the_user_clicks_on_the_proppant_setup_option() {
chemicalProppantEmailDelPage.clickProppantSetup();
}
@Then("the user is redirected to the Proppant Setup screen")
public void the_user_is_redirected_to_the_proppant_setup_screen() {
chemicalProppantEmailDelPage.isProppantSetupScreenDisplayed();
}
@And("the selected Job, Well, and Stage are displayed correctly on the Proppant Setup screen")
public void the_selected_job_well_and_stage_are_displayed_correctly_on_the_proppant_setup_screen() {
chemicalProppantEmailDelPage.verifyJobWellStageDisplayed();
}
@When("the user clicks on the Email Setup option")
public void the_user_clicks_on_the_email_setup_option() {
chemicalProppantEmailDelPage.clickEmailSetup();
}
@Then("the user is redirected to the Email Setup screen")
public void the_user_is_redirected_to_the_email_setup_screen() {
chemicalProppantEmailDelPage.isEmailSetupScreenDisplayed();
}
@And("the selected Job, Well, and Stage are displayed correctly on the Email Setup screen")
public void the_selected_job_well_and_stage_are_displayed_correctly_on_the_email_setup_screen() {
chemicalProppantEmailDelPage.verifyJobWellStageDisplayed();
}
@When("the user clicks on the {string} button")
public void the_user_clicks_on_the_button(String buttonName) {
chemicalProppantEmailDelPage.clickButton(buttonName);
}
@When("the user selects {string} from the chemical dropdown")
public void the_user_selects_from_the_chemical_dropdown(String chemicalName) {
chemicalProppantEmailDelPage.selectChemicalFromDropdown(chemicalName);
}
@When("the user enters a design concentration value of {string}")
public void the_user_enters_a_design_concentration_value_of(String designConcentration) {
chemicalProppantEmailDelPage.enterDesignConcentration(designConcentration);
}
@When("the user enters a designed volume of {string}")
public void the_user_enters_a_designed_volume_of(String designedVolume) {
chemicalProppantEmailDelPage.enterDesignedVolume(designedVolume);
}
@Then("the Acid & Additives entry should be added to the list")
public void the_acid_additives_entry_should_be_added_to_the_list() {
chemicalProppantEmailDelPage.isAcidAdditivesEntryAdded();
}
@And("the entry should persist after the page refresh")
public void the_entry_should_persist_after_the_page_refresh() {
chemicalProppantEmailDelPage.isEntryPersistedAfterRefresh();
}
@And("the correct design concentration {string} and volume {string} should be displayed")
public void the_correct_design_concentration_and_volume_should_be_displayed(String designConcentration, String designedVolume) {
chemicalProppantEmailDelPage.verifyDesignConcentrationAndVolume(designConcentration, designedVolume);
}
@And("no validation errors should occur during the process")
public void no_validation_errors_should_occur_during_the_process() {
chemicalProppantEmailDelPage.hasValidationErrors();
}
@When("the user refreshes the page")
public void the_user_refreshes_the_page() {
chemicalProppantEmailDelPage.refreshPage();
}
@Then("the Slickwater entry should be added to the list")
public void the_slickwater_entry_should_be_added_to_the_list() {
chemicalProppantEmailDelPage.isSlickwaterEntryAdded();
}
@When("the user enters {string} as the design concentration")
public void the_user_enters_as_the_design_concentration(String designConcentration) {
chemicalProppantEmailDelPage.enterDesignConcentration(designConcentration);
}
@When("the user enters {string} as the designed volume")
public void the_user_enters_as_the_designed_volume(String designedVolume) {
chemicalProppantEmailDelPage.enterDesignedVolume(designedVolume);
}
@Then("the system does not add the Proppant")
public void the_system_does_not_add_the_proppant() {
chemicalProppantEmailDelPage.isProppantAdded();
}
@Then("an error message is displayed indicating that the total design volume must be positive")
public void an_error_message_is_displayed_indicating_that_the_total_design_volume_must_be_positive() {
chemicalProppantEmailDelPage.isErrorMessageDisplayed();
}
@Then("the system does not save the vendor")
public void the_system_does_not_save_the_vendor() {
chemicalProppantEmailDelPage.isVendorSaved();
}
@Then("an error message is displayed indicating that the vendor name is required")
public void an_error_message_is_displayed_indicating_that_the_vendor_name_is_required() {
chemicalProppantEmailDelPage.isVendorNameErrorDisplayed();
}
@Then("the system should not create the delivery record")
public void the_system_should_not_create_the_delivery_record() {
chemicalProppantEmailDelPage.isDeliveryRecordCreated();
}
@Then("the user should see an error message indicating that the vendor is required")
public void the_user_should_see_an_error_message_indicating_that_the_vendor_is_required() {
chemicalProppantEmailDelPage.isVendorRequiredErrorDisplayed();
}
@Then("the user should see the success message for adding {string}")
public void the_user_should_see_the_success_message_for_adding(String proppantName) {
chemicalProppantEmailDelPage.isSuccessMessageDisplayed(proppantName);
}
@Then("the user should remain on the Proppant Setup screen")
public void the_user_should_remain_on_the_proppant_setup_screen() {
chemicalProppantEmailDelPage.isProppantSetupScreenDisplayed();
}

@Given("the user fills in the required fields")
public void the_user_fills_in_the_required_fields() {
chemicalProppantEmailDelPage.fillInRequiredFields();
}
@When("the user clicks on the save button for the last entry")
public void the_user_clicks_on_the_save_button_for_the_last_entry() {
chemicalProppantEmailDelPage.clickSaveButtonForLastEntry();
}
@Then("all proppants should be added to the list")
public void all_proppants_should_be_added_to_the_list() {
chemicalProppantEmailDelPage.areAllProppantsAdded();
}
@When("the user selects a po from the dropdown")
public void the_user_selects_a_po_from_the_dropdown() {
chemicalProppantEmailDelPage.selectPOFromDropdown();
}
@Then("the user remains on the chemical setup screen")
public void the_user_remains_on_the_chemical_setup_screen() {
chemicalProppantEmailDelPage.isOnChemicalSetupScreen();
}
@When("the user enters {string} as a total design volume")
public void the_user_enters_as_a_total_design_volume(String totalDesignVolume) {
chemicalProppantEmailDelPage.enterTotalDesignVolume(totalDesignVolume);
}
@When("the user clicks on the save button")
public void the_user_clicks_on_the_save_button() {
chemicalProppantEmailDelPage.clickSaveButton();
}
@When("the user enters the po number")
public void the_user_enters_the_po_number() {
chemicalProppantEmailDelPage.enterPONumber();
}
@When("the user selects {string} from the dropdown")
public void the_user_selects_from_the_dropdown(String option) {
chemicalProppantEmailDelPage.selectFromDropdown(option);
}
@When("the user clicks on the meeting id field")
public void the_user_clicks_on_the_meeting_id_field() {
chemicalProppantEmailDelPage.clickMeetingIdField();
}
@When("the user enters {string}")
public void the_user_enters(String meetingId) {
chemicalProppantEmailDelPage.enterMeetingId(meetingId);
}
@When("the user selects {string}")
public void the_user_selects(String vendor) {
chemicalProppantEmailDelPage.selectVendor(vendor);
}
@When("the user leaves the vendor name field empty")
public void the_user_leaves_the_vendor_name_field_empty() {
chemicalProppantEmailDelPage.leaveVendorNameFieldEmpty();
}
@When("the user clicks on the add chemical button")
public void the_user_clicks_on_the_add_chemical_button() {
chemicalProppantEmailDelPage.clickAddChemicalButton();
}
@When("the user selects the proppant name {string} from the dropdown")
public void the_user_selects_the_proppant_name_from_the_dropdown(String proppantName) {
chemicalProppantEmailDelPage.selectProppantName(proppantName);
}
@Then("each vendor should display the correct name po number")
public void each_vendor_should_display_the_correct_name_po_number() {
chemicalProppantEmailDelPage.areVendorsDisplayingCorrectPONumber();
}
@Then("appropriate error messages are displayed for missing fields")
public void appropriate_error_messages_are_displayed_for_missing_fields() {
chemicalProppantEmailDelPage.areErrorMessagesDisplayed();
}
@When("the user enters a po number {string}")
public void the_user_enters_a_po_number(String poNumber) {
chemicalProppantEmailDelPage.enterPONumber(poNumber);
}
@Then("the user remains on the proppant setup screen")
public void the_user_remains_on_the_proppant_setup_screen() {
chemicalProppantEmailDelPage.isOnProppantSetupScreen();
}
@Then("the delivery record should be added successfully")
public void the_delivery_record_should_be_added_successfully() {
chemicalProppantEmailDelPage.isDeliveryRecordAdded();
}
@Then("the second chemical is added the form resets for new entry")
public void the_second_chemical_is_added_the_form_resets_for_new_entry() {
chemicalProppantEmailDelPage.isFormResetForNewEntry();
}
@When("i clickElement on the proppant name dropdown")
public void i_click_on_the_proppant_name_dropdown() {
chemicalProppantEmailDelPage.clickProppantNameDropdown();
}
@When("i clickElement on the vendor type dropdown")
public void i_click_on_the_vendor_type_dropdown() {
chemicalProppantEmailDelPage.clickVendorTypeDropdown();
}
@When("the user enters a valid {string}, {string}, {string}, {string}")
public void the_user_enters_a_valid(String field1, String field2, String field3, String field4) {
chemicalProppantEmailDelPage.enterValidFields(field1, field2, field3, field4);
}
@When("the user enters {string}, {string}, {string}, {string}")
public void the_user_enters(String field1, String field2, String field3, String field4) {
chemicalProppantEmailDelPage.enterFields(field1, field2, field3, field4);
}
@When("the user attempts to clickElement on the add proppant button again")
public void the_user_attempts_to_click_on_the_add_proppant_button_again() {
chemicalProppantEmailDelPage.attemptToClickAddProppantButtonAgain();
}
@Then("the proppant name dropdown displays all available proppants")
public void the_proppant_name_dropdown_displays_all_available_proppants() {
chemicalProppantEmailDelPage.isProppantNameDropdownDisplayingAllAvailableProppants();
}
@When("the user leaves the chemical name field empty")
public void the_user_leaves_the_chemical_name_field_empty() {
chemicalProppantEmailDelPage.leaveChemicalNameFieldEmpty();
}
@When("the user leaves the designed volume field empty")
public void the_user_leaves_the_designed_volume_field_empty() {
chemicalProppantEmailDelPage.leaveDesignedVolumeFieldEmpty();
}
@When("the user repeats the above steps for the next proppant")
public void the_user_repeats_the_above_steps_for_the_next_proppant() {
chemicalProppantEmailDelPage.repeatStepsForNextProppant();
}
@Then("the system does not add the chemical")
public void the_system_does_not_add_the_chemical() {
chemicalProppantEmailDelPage.isChemicalAdded();
}
@Then("the entries should persist after the page refresh")
public void the_entries_should_persist_after_the_page_refresh() {
chemicalProppantEmailDelPage.doEntriesPersistAfterRefresh();
}
@When("the user selects a vendor from the dropdown")
public void the_user_selects_a_vendor_from_the_dropdown() {
chemicalProppantEmailDelPage.selectVendorFromDropdown();
}
@When("the user clicks save")
public void the_user_clicks_save() {
chemicalProppantEmailDelPage.clickSave();
}
@When("the user clicks save & new")
public void the_user_clicks_save_new() {
chemicalProppantEmailDelPage.clickSaveAndNew();
}
@Then("the vendor type dropdown displays all available vendor types")
public void the_vendor_type_dropdown_displays_all_available_vendor_types() {
chemicalProppantEmailDelPage.isVendorTypeDropdownDisplayingAllAvailableVendorTypes();
}
@Then("the entry persists after the page refresh")
public void the_entry_persists_after_the_page_refresh() {
chemicalProppantEmailDelPage.doesEntryPersistAfterRefresh();
}
@When("the user selects the vendor type {string}")
public void the_user_selects_the_vendor_type(String vendorType) {
chemicalProppantEmailDelPage.selectVendorType(vendorType);
}
@Then("there are no validation errors during the process")
public void there_are_no_validation_errors_during_the_process() {
chemicalProppantEmailDelPage.areValidationErrorsPresent();
}
@Then("each proppant should display the correct name design volume")
public void each_proppant_should_display_the_correct_name_design_volume() {
chemicalProppantEmailDelPage.areProppantsDisplayingCorrectNameAndDesignVolume();
}
@Then("all entered details should be displayed correctly")
public void all_entered_details_should_be_displayed_correctly() {
chemicalProppantEmailDelPage.areAllEnteredDetailsDisplayedCorrectly();
}
@When("the user selects a vendor type {string}")
public void the_user_selects_a_vendor_type(String vendorType) {
chemicalProppantEmailDelPage.selectVendorType(vendorType);
}
@When("the user clicks on the add proppant button")
public void the_user_clicks_on_the_add_proppant_button() {
chemicalProppantEmailDelPage.clickAddProppantButton();
}
@Then("the delivery record is added to the list")
public void the_delivery_record_is_added_to_the_list() {
chemicalProppantEmailDelPage.isDeliveryRecordAddedToList();
}
@Given("i open the proppant setup screen")
public void i_open_the_proppant_setup_screen() {
chemicalProppantEmailDelPage.openProppantSetupScreen();
}
@Then("all entered details are displayed correctly")
public void all_entered_details_are_displayed_correctly() {
chemicalProppantEmailDelPage.areAllEnteredDetailsDisplayedCorrectly();
}
@When("the user leaves the vendor field empty")
public void the_user_leaves_the_vendor_field_empty() {
chemicalProppantEmailDelPage.leaveVendorFieldEmpty();
}
@Then("the last entry is saved successfully")
public void the_last_entry_is_saved_successfully() {
chemicalProppantEmailDelPage.isLastEntrySavedSuccessfully();
}
@When("the user enters {string} as the total design volume")
public void the_user_enters_as_the_total_design_volume(String totalDesignVolume) {
chemicalProppantEmailDelPage.enterTotalDesignVolume(totalDesignVolume);
}
@When("the user enters the vendor name")
public void the_user_enters_the_vendor_name() {
chemicalProppantEmailDelPage.enterVendorName();
}
@When("the user clicks on the add vendor button")
public void the_user_clicks_on_the_add_vendor_button() {
chemicalProppantEmailDelPage.clickAddVendorButton();
}
@When("i clickElement on the chemical name dropdown")
public void i_click_on_the_chemical_name_dropdown() {
chemicalProppantEmailDelPage.clickChemicalNameDropdown();
}
@Then("all vendors should be added to the list")
public void all_vendors_should_be_added_to_the_list() {
chemicalProppantEmailDelPage.areAllVendorsAddedToList();
}
@When("the user selects a chemical type from the dropdown")
public void the_user_selects_a_chemical_type_from_the_dropdown() {
chemicalProppantEmailDelPage.selectChemicalTypeFromDropdown();
}
@Then("the new meeting id persists after the page refresh")
public void the_new_meeting_id_persists_after_the_page_refresh() {
chemicalProppantEmailDelPage.doesMeetingIdPersistAfterRefresh();
}
@Then("no validation errors occur during the process")
public void no_validation_errors_occur_during_the_process() {
chemicalProppantEmailDelPage.areValidationErrorsPresent();
}
@Then("the user should remain on the chemical delivery tracking screen")
public void the_user_should_remain_on_the_chemical_delivery_tracking_screen() {
chemicalProppantEmailDelPage.isOnChemicalDeliveryTrackingScreen();
}
@Then("the first chemical is saved successfully")
public void the_first_chemical_is_saved_successfully() {
chemicalProppantEmailDelPage.isFirstChemicalSavedSuccessfully();
}
@Then("no errors occur during the loading of dropdown options")
public void no_errors_occur_during_the_loading_of_dropdown_options() {
chemicalProppantEmailDelPage.areErrorsDuringDropdownLoading();
}
@Then("the user remains on the email setup screen")
public void the_user_remains_on_the_email_setup_screen() {
chemicalProppantEmailDelPage.isOnEmailSetupScreen();
}
@When("the user clicks on the add delivery record button")
public void the_user_clicks_on_the_add_delivery_record_button() {
chemicalProppantEmailDelPage.clickAddDeliveryRecordButton();
}
@Given("i open the email setup screen")
public void i_open_the_email_setup_screen() {
chemicalProppantEmailDelPage.openEmailSetupScreen();
}
@Then("the chemical name dropdown displays all available chemicals")
public void the_chemical_name_dropdown_displays_all_available_chemicals() {
chemicalProppantEmailDelPage.isChemicalNameDropdownDisplayingAllAvailableChemicals();
}
@Then("the meeting id is updated successfully")
public void the_meeting_id_is_updated_successfully() {
chemicalProppantEmailDelPage.isMeetingIdUpdatedSuccessfully();
}
@Then("the user should see an error message")
public void the_user_should_see_an_error_message() {
chemicalProppantEmailDelPage.isErrorMessageDisplayed();
}
}