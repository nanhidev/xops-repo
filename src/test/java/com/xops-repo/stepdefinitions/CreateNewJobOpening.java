package com.xops-repo.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.xops-repo.pages.CreateNewJobOpeningPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CreateNewJobOpening extends DriverFactory {
CreateNewJobOpeningPage createNewJobOpeningPage = new CreateNewJobOpeningPage(driver);
@Given("the user is logged into the application")
public void the_user_is_logged_into_the_application() {
driver = DriverFactory.getDriver();
}
@When("the user clicks on the {string} menu item in the application")
public void the_user_clicks_on_menu_item_in_the_application(String action) {
createNewJobOpeningPage.clicksOnMenuItem(action);
}
@Then("the Job Opening page is displayed")
public void the_job_opening_page_is_displayed() {
createNewJobOpeningPage.isJobOpeningPageDisplayed();
}
@And("the {string} button is visible and clickable")
public void the_button_is_visible_and_clickable(String button) {
createNewJobOpeningPage.isButtonVisibleAndClickable(button);
}
// DUPLICATE: @When("the user clicks on the {string} button")
public void the_user_clicks_on_button(String button) {
createNewJobOpeningPage.clicksOnButton(button);
}
@And("the user waits for the Create New Job Opening form to load")
public void the_user_waits_for_create_new_job_opening_form_to_load() {
createNewJobOpeningPage.waitForFormToLoad();
}
@Then("the Create New Job Opening form is displayed")
public void the_create_new_job_opening_form_is_displayed() {
createNewJobOpeningPage.isCreateNewJobOpeningFormDisplayed();
}
@And("all required fields are present")
public void all_required_fields_are_present() {
createNewJobOpeningPage.areAllRequiredFieldsPresent();
}
@Given("the user enters a valid Job Title {string}")
public void the_user_enters_a_valid_job_title(String jobTitle) {
createNewJobOpeningPage.enterJobTitle(jobTitle);
}
@And("the user enters a valid Job Description {string}")
public void the_user_enters_a_valid_job_description(String jobDescription) {
createNewJobOpeningPage.enterJobDescription(jobDescription);
}
@And("the user selects a valid Department {string}")
public void the_user_selects_a_valid_department(String department) {
createNewJobOpeningPage.selectDepartment(department);
}
@And("the user enters a valid Location {string}")
public void the_user_enters_a_valid_location(String location) {
createNewJobOpeningPage.enterLocation(location);
}
@When("the user clicks the {string} button")
public void the_user_clicks_the_button(String button) {
createNewJobOpeningPage.clicksOnButton(button);
}
@Then("a success message is displayed confirming the job opening creation")
public void a_success_message_is_displayed_confirming_the_job_opening_creation() {
createNewJobOpeningPage.isSuccessMessageDisplayed();
}
@And("the new job opening appears in the Job Openings listing")
public void the_new_job_opening_appears_in_the_job_openings_listing() {
createNewJobOpeningPage.isJobOpeningDisplayedInListing();
}
@Given("the job title field is empty")
public void the_job_title_field_is_empty() {
createNewJobOpeningPage.clearJobTitleField();
}
@Then("an error message should be displayed indicating that the Job Title is required")
public void an_error_message_should_be_displayed_indicating_that_the_job_title_is_required() {
createNewJobOpeningPage.isJobTitleRequiredErrorDisplayed();
}
@And("the job opening is not created")
public void the_job_opening_is_not_created() {
createNewJobOpeningPage.isJobOpeningCreated();
}
@Given("the user is on the Job Opening Creation Page")
public void the_user_is_on_the_job_opening_creation_page() {
createNewJobOpeningPage.navigateToJobOpeningCreationPage();
}
@Given("the user enters valid details in the form")
public void the_user_enters_valid_details_in_the_form() {
createNewJobOpeningPage.enterValidDetails();
}
@When("the user clicks the Cancel button")
public void the_user_clicks_the_cancel_button() {
createNewJobOpeningPage.clicksOnCancelButton();
}
@Then("the user should be redirected back to the Job Openings listing")
public void the_user_should_be_redirected_back_to_the_job_openings_listing() {
createNewJobOpeningPage.isRedirectedToJobOpeningsListing();
}
@Then("no new job opening should be created")
public void no_new_job_opening_should_be_created() {
createNewJobOpeningPage.isJobOpeningCreated();
}
@When("the user clicks on the newly created job opening")
public void the_user_clicks_on_the_newly_created_job_opening() {
createNewJobOpeningPage.clicksOnNewlyCreatedJobOpening();
}
@Then("the job opening details are displayed correctly")
public void the_job_opening_details_are_displayed_correctly() {
createNewJobOpeningPage.areJobOpeningDetailsDisplayedCorrectly();
}
@And("all fields (Job Title, Job Description, Department, Location) are visible and accurate")
public void all_fields_are_visible_and_accurate() {
createNewJobOpeningPage.areAllFieldsVisibleAndAccurate();
}
@When("the user clicks on the filter options")
public void the_user_clicks_on_the_filter_options() {
createNewJobOpeningPage.clicksOnFilterOptions();
}
@And("the user selects {string} from the filter dropdown")
public void the_user_selects_from_the_filter_dropdown(String department) {
createNewJobOpeningPage.selectDepartmentFromFilter(department);
}
@Then("the Job Openings listing updates to show only job openings that match the selected Department")
public void the_job_openings_listing_updates_to_show_only_job_openings_that_match_the_selected_department() {
createNewJobOpeningPage.isJobOpeningsListingUpdated();
}
@And("the filter criteria are displayed on the page")
public void the_filter_criteria_are_displayed_on_the_page() {
createNewJobOpeningPage.isFilterCriteriaDisplayed();
}
@When("the user clicks on the sorting options")
public void the_user_clicks_on_the_sorting_options() {
createNewJobOpeningPage.clicksOnSortingOptions();
}
@And("the user selects the sorting order")
public void the_user_selects_the_sorting_order() {
createNewJobOpeningPage.selectSortingOrder();
}
@Then("the Job Openings listing updates to show job openings sorted by the selected criteria")
public void the_job_openings_listing_updates_to_show_job_openings_sorted_by_the_selected_criteria() {
createNewJobOpeningPage.isJobOpeningsSorted();
}
@And("the sorting order is visually indicated on the page")
public void the_sorting_order_is_visually_indicated_on_the_page() {
createNewJobOpeningPage.isSortingOrderIndicated();
}
@Given("the user observes the pagination controls at the bottom of the listing")
public void the_user_observes_the_pagination_controls_at_the_bottom_of_the_listing() {
createNewJobOpeningPage.isPaginationControlsVisible();
}
@When("the user clicks on the next page button")
public void the_user_clicks_on_the_next_page_button() {
createNewJobOpeningPage.clicksOnNextPageButton();
}
@Then("the Job Openings listing updates to show the next set of job openings")
public void the_job_openings_listing_updates_to_show_the_next_set_of_job_openings() {
createNewJobOpeningPage.isNextSetOfJobOpeningsDisplayed();
}
@And("the pagination controls reflect the current page number")
public void the_pagination_controls_reflect_the_current_page_number() {
createNewJobOpeningPage.isCurrentPageNumberDisplayed();
}
@When("I create a new job opening with valid details")
public void i_create_a_new_job_opening_with_valid_details() {
createNewJobOpeningPage.createJobOpeningWithValidDetails();
}
@Then("a confirmation message is displayed indicating the job opening was created successfully")
public void a_confirmation_message_is_displayed_indicating_the_job_opening_was_created_successfully() {
createNewJobOpeningPage.isConfirmationMessageDisplayed();
}
@Given("the user enters {string} as the Job Title")
public void the_user_enters_as_the_job_title(String jobTitle) {
createNewJobOpeningPage.enterJobTitle(jobTitle);
}
@And("the user fills in {string} as the Job Description")
public void the_user_fills_in_as_the_job_description(String jobDescription) {
createNewJobOpeningPage.enterJobDescription(jobDescription);
}
@And("the user enters {string} as the Location")
public void the_user_enters_as_the_location(String location) {
createNewJobOpeningPage.enterLocation(location);
}
@Then("an error message is displayed indicating that the Job Title already exists")
public void an_error_message_is_displayed_indicating_that_the_job_title_already_exists() {
createNewJobOpeningPage.isDuplicateJobTitleErrorDisplayed();
}
@Then("an error message is displayed indicating that the Job Description exceeds the maximum length")
public void an_error_message_is_displayed_indicating_that_the_job_description_exceeds_the_maximum_length() {
createNewJobOpeningPage.isJobDescriptionLengthErrorDisplayed();
}
@Then("an error message is displayed indicating that the Location format is invalid")
public void an_error_message_is_displayed_indicating_that_the_location_format_is_invalid() {
createNewJobOpeningPage.isInvalidLocationErrorDisplayed();
}
@Then("an error message is displayed indicating that the selected Department is invalid")
public void an_error_message_is_displayed_indicating_that_the_selected_department_is_invalid() {
createNewJobOpeningPage.isInvalidDepartmentErrorDisplayed();
}
@Then("an error message is displayed indicating that the Job Title contains invalid characters")
public void an_error_message_is_displayed_indicating_that_the_job_title_contains_invalid_characters() {
createNewJobOpeningPage.isInvalidJobTitleErrorDisplayed();
}
@Then("error messages are displayed for all required fields indicating they must be filled")
public void error_messages_are_displayed_for_all_required_fields_indicating_they_must_be_filled() {
createNewJobOpeningPage.areAllRequiredFieldErrorsDisplayed();
}

@Given("the add job opening button is visible clickable")
public void the_add_job_opening_button_is_visible_clickable() {
createNewJobOpeningPage.isAddJobOpeningButtonVisible();
}
@When("the user fills in {string}")
public void the_user_fills_in(String jobTitle) {
createNewJobOpeningPage.fillInJobTitle(jobTitle);
}
@Then("the new job opening appears in the job openings listing with only the filled fields")
public void the_new_job_opening_appears_in_the_job_openings_listing_with_only_the_filled_fields() {
createNewJobOpeningPage.isJobOpeningDisplayedWithFilledFields();
}
@Then("the user is redirected to the job openings listing")
public void the_user_is_redirected_to_the_job_openings_listing() {
createNewJobOpeningPage.isRedirectedToJobOpeningsListing();
}
@When("the user clicks the save button")
public void the_user_clicks_the_save_button() {
createNewJobOpeningPage.clickSaveButton();
}
@When("the user clicks on the add job opening button")
public void the_user_clicks_on_the_add_job_opening_button() {
createNewJobOpeningPage.clickAddJobOpeningButton();
}
@When("the user enters {string} as the job description")
public void the_user_enters_as_the_job_description(String jobDescription) {
createNewJobOpeningPage.enterJobDescription(jobDescription);
}
@When("the admin enters a valid job description")
public void the_admin_enters_a_valid_job_description() {
createNewJobOpeningPage.enterValidJobDescription();
}
// DUPLICATE: @When("the user selects {string}")
public void the_user_selects(String department) {
createNewJobOpeningPage.selectDepartment(department);
}
@When("i enter a job description with the maximum allowed characters {string}")
public void i_enter_a_job_description_with_the_maximum_allowed_characters(String jobDescription) {
createNewJobOpeningPage.enterJobDescriptionWithMaxCharacters(jobDescription);
}
@When("the user enters a job description with the minimum allowed characters as {string}")
public void the_user_enters_a_job_description_with_the_minimum_allowed_characters_as(String jobDescription) {
createNewJobOpeningPage.enterJobDescriptionWithMinCharacters(jobDescription);
}
@When("the user enters a job description {string}")
public void the_user_enters_a_job_description(String jobDescription) {
createNewJobOpeningPage.enterJobDescription(jobDescription);
}
@When("i leave optional fields empty")
public void i_leave_optional_fields_empty() {
createNewJobOpeningPage.leaveOptionalFieldsEmpty();
}
@When("i enter a valid location {string}")
public void i_enter_a_valid_location(String location) {
createNewJobOpeningPage.enterLocation(location);
}
@When("the user selects {string} as the department")
public void the_user_selects_as_the_department(String department) {
createNewJobOpeningPage.selectDepartment(department);
}
@Then("the updated job opening details are reflected in the job openings listing")
public void the_updated_job_opening_details_are_reflected_in_the_job_openings_listing() {
createNewJobOpeningPage.isUpdatedJobOpeningDisplayed();
}
@Then("the new job opening appears in the job openings listing with the correct details")
public void the_new_job_opening_appears_in_the_job_openings_listing_with_the_correct_details() {
createNewJobOpeningPage.isJobOpeningDisplayedWithCorrectDetails();
}
@Then("a success message is displayed confirming the job opening update")
public void a_success_message_is_displayed_confirming_the_job_opening_update() {
createNewJobOpeningPage.isSuccessMessageDisplayed();
}
@When("the user clicks the apply filter button")
public void the_user_clicks_the_apply_filter_button() {
createNewJobOpeningPage.clickApplyFilterButton();
}
@When("the user clicks the edit button")
public void the_user_clicks_the_edit_button() {
createNewJobOpeningPage.clickEditButton();
}
@When("i select an invalid department")
public void i_select_an_invalid_department() {
createNewJobOpeningPage.selectInvalidDepartment();
}
@When("the user leaves all required fields empty")
public void the_user_leaves_all_required_fields_empty() {
createNewJobOpeningPage.leaveRequiredFieldsEmpty();
}
@When("i select a valid department {string}")
public void i_select_a_valid_department(String department) {
createNewJobOpeningPage.selectDepartment(department);
}
@When("the admin enters an invalid location")
public void the_admin_enters_an_invalid_location() {
createNewJobOpeningPage.enterInvalidLocation();
}
@When("the user modifies the job description")
public void the_user_modifies_the_job_description() {
createNewJobOpeningPage.modifyJobDescription();
}
@When("i enter {string}")
public void i_enter(String jobTitle) {
createNewJobOpeningPage.fillInJobTitle(jobTitle);
}
@When("i enter a valid job title {string}")
public void i_enter_a_valid_job_title(String jobTitle) {
createNewJobOpeningPage.enterValidJobTitle(jobTitle);
}
@When("the user clicks on the job openings menu item in the application")
public void the_user_clicks_on_the_job_openings_menu_item_in_the_application() {
createNewJobOpeningPage.clickJobOpeningsMenuItem();
}
@When("the admin clicks the save button")
public void the_admin_clicks_the_save_button() {
createNewJobOpeningPage.clickSaveButton();
}
@When("the admin selects a valid department")
public void the_admin_selects_a_valid_department() {
createNewJobOpeningPage.selectValidDepartment();
}
}