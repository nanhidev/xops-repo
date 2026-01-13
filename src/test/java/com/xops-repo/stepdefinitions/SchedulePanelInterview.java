package com.xops-repo.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.xops-repo.pages.SchedulePanelInterviewPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SchedulePanelInterview extends DriverFactory {
SchedulePanelInterviewPage schedulePanelInterviewPage = new SchedulePanelInterviewPage(driver);
@Given("the user is on the Schedule Interview section")
public void the_user_is_on_the_schedule_interview_section() {
schedulePanelInterviewPage.navigateToScheduleInterviewSection();
}
@When("the user clicks on Create Interview")
public void the_user_clicks_on_create_interview() {
schedulePanelInterviewPage.clickCreateInterview();
}
// DUPLICATE: @When("the user selects {string} from the dropdown")
public void the_user_selects_from_the_dropdown(String jobOpening) {
schedulePanelInterviewPage.selectJobOpening(jobOpening);
}
@When("the user selects {string} from the available options")
public void the_user_selects_from_the_available_options(String location) {
schedulePanelInterviewPage.selectLocation(location);
}
@When("the user enters {string} and selects the candidate")
public void the_user_enters_and_selects_the_candidate(String candidateEmail) {
schedulePanelInterviewPage.enterCandidateEmail(candidateEmail);
}
@When("the user chooses the {string} option")
public void the_user_chooses_the_option(String panelInterview) {
schedulePanelInterviewPage.choosePanelInterviewOption(panelInterview);
}
@When("the user selects the Interview Date {string} and Start Time {string}")
public void the_user_selects_the_interview_date_and_start_time(String interviewDate, String startTime) {
schedulePanelInterviewPage.selectInterviewDateAndStartTime(interviewDate, startTime);
}
@When("the user selects {string} and Interview Round {string}")
public void the_user_selects_and_interview_round(String attendees, String interviewRound) {
schedulePanelInterviewPage.selectAttendeesAndInterviewRound(attendees, interviewRound);
}
@When("the user selects the Interview Provider {string}")
public void the_user_selects_the_interview_provider(String interviewProvider) {
schedulePanelInterviewPage.selectInterviewProvider(interviewProvider);
}
@When("the user clicks on Next")
public void the_user_clicks_on_next() {
schedulePanelInterviewPage.clickNext();
}
@When("the user attaches {string}")
public void the_user_attaches(String requiredFiles) {
schedulePanelInterviewPage.attachFiles(requiredFiles);
}
@When("the user clicks on Confirm and Send")
public void the_user_clicks_on_confirm_and_send() {
schedulePanelInterviewPage.clickConfirmAndSend();
}
@Then("the system displays a confirmation message for the scheduled interview")
public void the_system_displays_a_confirmation_message_for_the_scheduled_interview() {
schedulePanelInterviewPage.isConfirmationMessageDisplayed();
}
@Then("all optional fields are saved and displayed correctly in the interview details")
public void all_optional_fields_are_saved_and_displayed_correctly_in_the_interview_details() {
schedulePanelInterviewPage.areOptionalFieldsDisplayedCorrectly();
}
@Then("notifications are sent to all participants with the additional information included")
public void notifications_are_sent_to_all_participants_with_the_additional_information_included() {
schedulePanelInterviewPage.areNotificationsSent();
}
@Then("the interview appears in the calendar of all attendees with all details")
public void the_interview_appears_in_the_calendar_of_all_attendees_with_all_details() {
schedulePanelInterviewPage.isInterviewInCalendar();
}
@Then("the candidate receives an email notification with all details")
public void the_candidate_receives_an_email_notification_with_all_details() {
schedulePanelInterviewPage.isCandidateEmailNotificationReceived();
}
@Then("the recruiter can view the scheduled interview in their dashboard with all information")
public void the_recruiter_can_view_the_scheduled_interview_in_their_dashboard_with_all_information() {
schedulePanelInterviewPage.isInterviewVisibleInDashboard();
}
@When("the recruiter selects a scheduled panel interview to edit")
public void the_recruiter_selects_a_scheduled_panel_interview_to_edit() {
schedulePanelInterviewPage.selectScheduledInterviewToEdit();
}
@When("the recruiter clicks on Edit Interview")
public void the_recruiter_clicks_on_edit_interview() {
schedulePanelInterviewPage.clickEditInterview();
}
@When("the recruiter makes changes to the Interview Date, Start Time, or Attendees")
public void the_recruiter_makes_changes_to_the_interview_date_start_time_or_attendees() {
schedulePanelInterviewPage.makeChangesToInterviewDetails();
}
@When("the recruiter clicks on Save Changes")
public void the_recruiter_clicks_on_save_changes() {
schedulePanelInterviewPage.clickSaveChanges();
}
@Then("the system displays a confirmation message indicating that the interview has been updated")
public void the_system_displays_a_confirmation_message_indicating_that_the_interview_has_been_updated() {
schedulePanelInterviewPage.isUpdateConfirmationMessageDisplayed();
}
@Then("the updated interview details are reflected in the system")
public void the_updated_interview_details_are_reflected_in_the_system() {
schedulePanelInterviewPage.areUpdatedDetailsReflected();
}
@Then("notifications are sent to all attendees regarding the changes")
public void notifications_are_sent_to_all_attendees_regarding_the_changes() {
schedulePanelInterviewPage.areChangeNotificationsSent();
}
@Then("the candidate receives an email notification with updated interview details")
public void the_candidate_receives_an_email_notification_with_updated_interview_details() {
schedulePanelInterviewPage.isCandidateUpdateEmailNotificationReceived();
}
@Then("the recruiter can view the updated interview in their dashboard")
public void the_recruiter_can_view_the_updated_interview_in_their_dashboard() {
schedulePanelInterviewPage.isUpdatedInterviewVisibleInDashboard();
}
@When("the user checks the email inbox of {string}")
public void the_user_checks_the_email_inbox_of(String attendee) {
schedulePanelInterviewPage.checkEmailInbox(attendee);
}
@Then("the attendee receives an email notification with the interview details")
public void the_attendee_receives_an_email_notification_with_the_interview_details() {
schedulePanelInterviewPage.isAttendeeEmailNotificationReceived();
}
@Then("the email contains the correct Interview Date, Start Time, and Location")
public void the_email_contains_the_correct_interview_date_start_time_and_location() {
schedulePanelInterviewPage.isEmailContentCorrect();
}
@Then("the email includes a calendar invite for the interview")
public void the_email_includes_a_calendar_invite_for_the_interview() {
schedulePanelInterviewPage.isCalendarInviteIncluded();
}
@When("the recruiter selects a scheduled panel interview to cancel")
public void the_recruiter_selects_a_scheduled_panel_interview_to_cancel() {
schedulePanelInterviewPage.selectScheduledInterviewToCancel();
}
@When("the recruiter clicks on Cancel Interview")
public void the_recruiter_clicks_on_cancel_interview() {
schedulePanelInterviewPage.clickCancelInterview();
}
@When("the recruiter confirms the cancellation")
public void the_recruiter_confirms_the_cancellation() {
schedulePanelInterviewPage.confirmCancellation();
}
@Then("the system displays a confirmation message indicating that the interview has been canceled")
public void the_system_displays_a_confirmation_message_indicating_that_the_interview_has_been_canceled() {
schedulePanelInterviewPage.isCancellationConfirmationMessageDisplayed();
}
@Then("the interview is removed from the scheduled interviews list")
public void the_interview_is_removed_from_the_scheduled_interviews_list() {
schedulePanelInterviewPage.isInterviewRemovedFromList();
}
@Then("notifications are sent to all attendees regarding the cancellation")
public void notifications_are_sent_to_all_attendees_regarding_the_cancellation() {
schedulePanelInterviewPage.areCancellationNotificationsSent();
}
@Then("the candidate receives an email notification about the cancellation")
public void the_candidate_receives_an_email_notification_about_the_cancellation() {
schedulePanelInterviewPage.isCandidateCancellationEmailReceived();
}
@When("the user leaves the Job Opening field empty")
public void the_user_leaves_the_job_opening_field_empty() {
schedulePanelInterviewPage.leaveJobOpeningFieldEmpty();
}
@Then("the system displays an error message indicating that the Job Opening must be selected")
public void the_system_displays_an_error_message_indicating_that_the_job_opening_must_be_selected() {
schedulePanelInterviewPage.isJobOpeningErrorMessageDisplayed();
}
@Then("the user remains on the scheduling page")
public void the_user_remains_on_the_scheduling_page() {
schedulePanelInterviewPage.isOnSchedulingPage();
}
@Then("no interview is scheduled")
public void no_interview_is_scheduled() {
schedulePanelInterviewPage.isInterviewScheduled();
}
@When("the user leaves the Candidate field empty")
public void the_user_leaves_the_candidate_field_empty() {
schedulePanelInterviewPage.leaveCandidateFieldEmpty();
}
@Then("the system displays an error message indicating that a Candidate must be selected")
public void the_system_displays_an_error_message_indicating_that_a_candidate_must_be_selected() {
schedulePanelInterviewPage.isCandidateErrorMessageDisplayed();
}
@When("the user leaves the Interview Date field empty")
public void the_user_leaves_the_interview_date_field_empty() {
schedulePanelInterviewPage.leaveInterviewDateFieldEmpty();
}
@Then("the system displays an error message indicating that an Interview Date must be selected")
public void the_system_displays_an_error_message_indicating_that_an_interview_date_must_be_selected() {
schedulePanelInterviewPage.isInterviewDateErrorMessageDisplayed();
}
@When("the user leaves the Start Time field empty")
public void the_user_leaves_the_start_time_field_empty() {
schedulePanelInterviewPage.leaveStartTimeFieldEmpty();
}
@Then("the system displays an error message indicating that a Start Time must be selected")
public void the_system_displays_an_error_message_indicating_that_a_start_time_must_be_selected() {
schedulePanelInterviewPage.isStartTimeErrorMessageDisplayed();
}
@When("the user leaves the Attendees field empty")
public void the_user_leaves_the_attendees_field_empty() {
schedulePanelInterviewPage.leaveAttendeesFieldEmpty();
}
@Then("the system displays an error message indicating that at least one Attendee must be selected")
public void the_system_displays_an_error_message_indicating_that_at_least_one_attendee_must_be_selected() {
schedulePanelInterviewPage.isAttendeeErrorMessageDisplayed();
}
@When("the user selects a past Interview Date {string}")
public void the_user_selects_a_past_interview_date(String interviewDate) {
schedulePanelInterviewPage.selectPastInterviewDate(interviewDate);
}
@Then("the system displays an error message indicating that the Interview Date cannot be in the past")
public void the_system_displays_an_error_message_indicating_that_the_interview_date_cannot_be_in_the_past() {
schedulePanelInterviewPage.isPastDateErrorMessageDisplayed();
}
@When("the user enters an invalid email format for the Candidate {string}")
public void the_user_enters_an_invalid_email_format_for_the_candidate(String email) {
schedulePanelInterviewPage.enterInvalidCandidateEmail(email);
}
@Then("the system displays an error message indicating that the email format is invalid")
public void the_system_displays_an_error_message_indicating_that_the_email_format_is_invalid() {
schedulePanelInterviewPage.isInvalidEmailFormatErrorMessageDisplayed();
}
@When("the user enters a candidate email address {string}")
public void the_user_enters_a_candidate_email_address(String email) {
schedulePanelInterviewPage.enterCandidateEmail(email);
}
@Then("the system should accept the email address without errors")
public void the_system_should_accept_the_email_address_without_errors() {
schedulePanelInterviewPage.isEmailAccepted();
}
@Then("the interview can be scheduled successfully")
public void the_interview_can_be_scheduled_successfully() {
schedulePanelInterviewPage.isInterviewScheduledSuccessfully();
}
@Then("notifications are sent to all participants")
public void notifications_are_sent_to_all_participants() {
schedulePanelInterviewPage.areNotificationsSentToParticipants();
}

@Given("the user enters the candidate's email address {string}")
public void the_user_enters_the_candidates_email_address(String candidateEmail) {
schedulePanelInterviewPage.enterCandidateEmailAddress(candidateEmail);
}
@When("the recruiter chooses the panel interview option")
public void the_recruiter_chooses_the_panel_interview_option() {
schedulePanelInterviewPage.choosePanelInterviewOption();
}
@When("the user selects a start time")
public void the_user_selects_a_start_time() {
schedulePanelInterviewPage.selectStartTime();
}
@When("I clickElement on create interview")
public void i_click_on_create_interview() {
schedulePanelInterviewPage.clickCreateInterview();
}
@When("the user selects the interview date {string} start time {string} that overlaps with an existing interview")
public void the_user_selects_the_interview_date_start_time_that_overlaps_with_an_existing_interview(String interviewDate, String startTime) {
schedulePanelInterviewPage.selectInterviewDate(interviewDate);
schedulePanelInterviewPage.selectStartTime(startTime);
}
@When("the user selects the interview date {string}")
public void the_user_selects_the_interview_date(String interviewDate) {
schedulePanelInterviewPage.selectInterviewDate(interviewDate);
}
@When("the recruiter chooses the {string}")
public void the_recruiter_chooses_the(String option) {
schedulePanelInterviewPage.chooseOption(option);
}
@When("the user selects the start time as {string}")
public void the_user_selects_the_start_time_as(String startTime) {
schedulePanelInterviewPage.selectStartTime(startTime);
}
@When("the recruiter attaches {string}")
public void the_recruiter_attaches(String file) {
schedulePanelInterviewPage.attachFile(file);
}
@When("the user selects a location from the available options")
public void the_user_selects_a_location_from_the_available_options() {
schedulePanelInterviewPage.selectLocation();
}
@Then("the candidate receives an email notification with interview details")
public void the_candidate_receives_an_email_notification_with_interview_details() {
schedulePanelInterviewPage.isEmailNotificationReceived();
}
@When("the recruiter clicks on next")
public void the_recruiter_clicks_on_next() {
schedulePanelInterviewPage.clickNext();
}
@Then("the interview appears in the calendar of all attendees")
public void the_interview_appears_in_the_calendar_of_all_attendees() {
schedulePanelInterviewPage.isInterviewInCalendar();
}
@When("the user enters the candidate's email address as {string} and selects the candidate")
public void the_user_enters_the_candidates_email_address_and_selects_the_candidate(String candidateEmail) {
schedulePanelInterviewPage.enterCandidateEmailAddress(candidateEmail);
schedulePanelInterviewPage.selectCandidate();
}
@Then("the recruiter can view the scheduled interview in their dashboard")
public void the_recruiter_can_view_the_scheduled_interview_in_their_dashboard() {
schedulePanelInterviewPage.isInterviewVisibleInDashboard();
}
@Then("the system accepts the email address without errors")
public void the_system_accepts_the_email_address_without_errors() {
schedulePanelInterviewPage.isEmailAccepted();
}
@When("the recruiter clicks on confirm send")
public void the_recruiter_clicks_on_confirm_send() {
schedulePanelInterviewPage.clickConfirmSend();
}
@Then("the system should display a confirmation message for the scheduled interview")
public void the_system_should_display_a_confirmation_message_for_the_scheduled_interview() {
schedulePanelInterviewPage.isConfirmationMessageDisplayed();
}
@Then("the system displays an error message indicating that the interview time overlaps with an existing interview")
public void the_system_displays_an_error_message_indicating_that_the_interview_time_overlaps_with_an_existing_interview() {
schedulePanelInterviewPage.isOverlapErrorMessageDisplayed();
}
@When("the recruiter selects {string} as the minimum number of attendees allowed")
public void the_recruiter_selects_as_the_minimum_number_of_attendees_allowed(String minAttendees) {
schedulePanelInterviewPage.selectMinAttendees(minAttendees);
}
@When("I fill in optional fields {string} {string}")
public void i_fill_in_optional_fields(String field1, String field2) {
schedulePanelInterviewPage.fillInOptionalFields(field1, field2);
}
@When("the user selects the interview date as {string}")
public void the_user_selects_the_interview_date_as(String interviewDate) {
schedulePanelInterviewPage.selectInterviewDate(interviewDate);
}
@When("I attach required files {string}")
public void i_attach_required_files(String file) {
schedulePanelInterviewPage.attachRequiredFiles(file);
}
@When("the recruiter selects {string} from the dropdown")
public void the_recruiter_selects_from_the_dropdown(String option) {
schedulePanelInterviewPage.selectFromDropdown(option);
}
@When("the user selects a job opening from the dropdown")
public void the_user_selects_a_job_opening_from_the_dropdown() {
schedulePanelInterviewPage.selectJobOpening();
}
@When("the recruiter enters {string} and selects the candidate")
public void the_recruiter_enters_and_selects_the_candidate(String candidateEmail) {
schedulePanelInterviewPage.enterCandidateEmailAddress(candidateEmail);
schedulePanelInterviewPage.selectCandidate();
}
@When("the recruiter selects {string} from the available options")
public void the_recruiter_selects_from_the_available_options(String option) {
schedulePanelInterviewPage.selectFromAvailableOptions(option);
}
}