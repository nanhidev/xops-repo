package com.xops_repo.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.xops_repo.pages.UploadNewCandidateProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class UploadNewCandidateProfile extends DriverFactory {
UploadNewCandidateProfilePage uploadNewCandidateProfilePage = new UploadNewCandidateProfilePage(driver);
@Given("the recruiter is on the Profile section")
public void the_recruiter_is_on_the_profile_section() {
uploadNewCandidateProfilePage.navigateToProfileSection();
}
@When("the recruiter clicks on the upload icon")
public void the_recruiter_clicks_on_the_upload_icon() {
uploadNewCandidateProfilePage.clickUploadIcon();
}
@When("the recruiter browses and selects a valid candidate profile file {string}")
public void the_recruiter_browses_and_selects_a_valid_candidate_profile_file(String candidateProfileFile) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(candidateProfileFile);
}
@When("the recruiter clicks on the Upload button")
public void the_recruiter_clicks_on_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButton();
}
@When("the recruiter waits for the upload process to complete")
public void the_recruiter_waits_for_the_upload_process_to_complete() {
uploadNewCandidateProfilePage.waitForUploadToComplete();
}
@Then("a success confirmation message is displayed to the user")
public void a_success_confirmation_message_is_displayed_to_the_user() {
uploadNewCandidateProfilePage.isSuccessMessageDisplayed();
}
@Then("both profiles are listed in the Profile section")
public void both_profiles_are_listed_in_the_profile_section() {
uploadNewCandidateProfilePage.areProfilesListed();
}
@Then("the system should display an error message indicating the file type is not supported")
public void the_system_should_display_an_error_message_indicating_the_file_type_is_not_supported() {
uploadNewCandidateProfilePage.isErrorMessageDisplayed();
}
@Then("an error message is displayed indicating the file exceeds the maximum size limit")
public void an_error_message_is_displayed_indicating_the_file_exceeds_the_maximum_size_limit() {
uploadNewCandidateProfilePage.isSizeLimitErrorDisplayed();
}
@Then("the user should see an error message indicating that no file was selected")
public void the_user_should_see_an_error_message_indicating_that_no_file_was_selected() {
uploadNewCandidateProfilePage.isNoFileSelectedErrorDisplayed();
}
@Then("an error message should be displayed indicating a network failure occurred")
public void an_error_message_should_be_displayed_indicating_a_network_failure_occurred() {
uploadNewCandidateProfilePage.isNetworkFailureErrorDisplayed();
}
@Then("an error message is displayed indicating the upload process timed out")
public void an_error_message_is_displayed_indicating_the_upload_process_timed_out() {
uploadNewCandidateProfilePage.isTimeoutErrorDisplayed();
}
@Then("an error message is displayed indicating the file is corrupted and cannot be uploaded")
public void an_error_message_is_displayed_indicating_the_file_is_corrupted_and_cannot_be_uploaded() {
uploadNewCandidateProfilePage.isCorruptedFileErrorDisplayed();
}
@When("the recruiter browses and selects a valid candidate profile file with special characters in the filename {string}")
public void the_recruiter_browses_and_selects_a_valid_candidate_profile_file_with_special_characters_in_the_filename(String candidateProfileFile) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(candidateProfileFile);
}
@When("the recruiter browses and selects a valid candidate profile file with a very short filename {string}")
public void the_recruiter_browses_and_selects_a_valid_candidate_profile_file_with_a_very_short_filename(String filename) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(filename);
}
@When("the recruiter browses and selects a valid candidate profile file with spaces in the filename {string}")
public void the_recruiter_browses_and_selects_a_valid_candidate_profile_file_with_spaces_in_the_filename(String filename) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(filename);
}

@Given("I clickElement on the upload icon")
public void i_click_on_the_upload_icon() {
uploadNewCandidateProfilePage.clickUploadIcon();
}
@When("the user clicks on the upload button")
public void the_user_clicks_on_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButton();
}
@When("the recruiter browses selects a valid candidate profile file with spaces in the filename")
public void the_recruiter_browses_selects_a_valid_candidate_profile_file_with_spaces_in_the_filename() {
uploadNewCandidateProfilePage.browseAndSelectFileWithSpaces();
}
@When("the recruiter browses selects the {string}")
public void the_recruiter_browses_selects_the(String fileName) {
uploadNewCandidateProfilePage.browseAndSelectFile(fileName);
}
@Then("the upload process does not complete successfully")
public void the_upload_process_does_not_complete_successfully() {
uploadNewCandidateProfilePage.isUploadSuccessful();
}
@When("the user clicks on the upload (cloud) icon")
public void the_user_clicks_on_the_upload_cloud_icon() {
uploadNewCandidateProfilePage.clickUploadCloudIcon();
}
@When("the user browses selects a valid candidate profile file with a .doc extension")
public void the_user_browses_selects_a_valid_candidate_profile_file_with_a_doc_extension() {
uploadNewCandidateProfilePage.browseAndSelectDocFile();
}
@When("the recruiter browses selects a valid candidate profile file with text in spanish")
public void the_recruiter_browses_selects_a_valid_candidate_profile_file_with_text_in_spanish() {
uploadNewCandidateProfilePage.browseAndSelectSpanishTextFile();
}
@Then("the upload process does not initiate")
public void the_upload_process_does_not_initiate() {
uploadNewCandidateProfilePage.isUploadInitiated();
}
@Given("the network failure is simulated")
public void the_network_failure_is_simulated() {
uploadNewCandidateProfilePage.simulateNetworkFailure();
}
@Then("the recruiter waits for the upload to complete confirms success")
public void the_recruiter_waits_for_the_upload_to_complete_confirms_success() {
uploadNewCandidateProfilePage.waitForUploadToComplete();
uploadNewCandidateProfilePage.isUploadSuccessful();
}
@When("the user browses selects a valid candidate profile file")
public void the_user_browses_selects_a_valid_candidate_profile_file() {
uploadNewCandidateProfilePage.browseAndSelectValidFile();
}
@When("the user browses selects a file that exceeds the size limit")
public void the_user_browses_selects_a_file_that_exceeds_the_size_limit() {
uploadNewCandidateProfilePage.browseAndSelectLargeFile();
}
@When("the user browses selects a valid candidate profile file with special characters in the filename")
public void the_user_browses_selects_a_valid_candidate_profile_file_with_special_characters_in_the_filename() {
uploadNewCandidateProfilePage.browseAndSelectFileWithSpecialCharacters();
}
@When("the user simulates a timeout during the upload process")
public void the_user_simulates_a_timeout_during_the_upload_process() {
uploadNewCandidateProfilePage.simulateTimeout();
}
@When("the user does not select any file")
public void the_user_does_not_select_any_file() {
uploadNewCandidateProfilePage.doesNotSelectFile();
}
@When("the user browses selects a corrupted candidate profile file")
public void the_user_browses_selects_a_corrupted_candidate_profile_file() {
uploadNewCandidateProfilePage.browseAndSelectCorruptedFile();
}
@When("the user browses selects a valid candidate profile file with a very short filename")
public void the_user_browses_selects_a_valid_candidate_profile_file_with_a_very_short_filename() {
uploadNewCandidateProfilePage.browseAndSelectShortFilenameFile();
}
@When("the user browses selects a valid candidate profile file with a long filename")
public void the_user_browses_selects_a_valid_candidate_profile_file_with_a_long_filename() {
uploadNewCandidateProfilePage.browseAndSelectLongFilenameFile();
}
@When("the user browses selects an unsupported file type {string}")
public void the_user_browses_selects_an_unsupported_file_type(String fileType) {
uploadNewCandidateProfilePage.browseAndSelectUnsupportedFileType(fileType);
}
@When("the recruiter browses selects a valid candidate profile file of 2mb")
public void the_recruiter_browses_selects_a_valid_candidate_profile_file_of_2mb() {
uploadNewCandidateProfilePage.browseAndSelectFileOf2MB();
}
@Then("a success confirmation message should be displayed to the user")
public void a_success_confirmation_message_should_be_displayed_to_the_user() {
uploadNewCandidateProfilePage.isSuccessMessageDisplayed();
}
@Given("I wait for the upload process to complete")
public void i_wait_for_the_upload_process_to_complete() {
uploadNewCandidateProfilePage.waitForUploadProcessToComplete();
}
@When("the recruiter repeats the above steps for a second valid candidate profile file")
public void the_recruiter_repeats_the_above_steps_for_a_second_valid_candidate_profile_file() {
uploadNewCandidateProfilePage.repeatUploadStepsForSecondFile();
}
@When("I clickElement on the upload button")
public void i_click_on_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButton();
}
}