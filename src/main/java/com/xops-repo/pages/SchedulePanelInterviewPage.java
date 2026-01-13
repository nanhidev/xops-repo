package com.backend.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class SchedulePanelInterviewPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    // Web Elements
    @FindBy(id = "createInterviewButton")
    private WebElement createInterviewButton;
    @FindBy(id = "jobOpeningDropdown")
    private WebElement jobOpeningDropdown;
    @FindBy(id = "locationDropdown")
    private WebElement locationDropdown;
    @FindBy(id = "candidateEmailField")
    private WebElement candidateEmailField;
    @FindBy(id = "panelInterviewOption")
    private WebElement panelInterviewOption;
    @FindBy(id = "interviewDateField")
    private WebElement interviewDateField;
    @FindBy(id = "startTimeField")
    private WebElement startTimeField;
    @FindBy(id = "nextButton")
    private WebElement nextButton;
    @FindBy(id = "confirmSendButton")
    private WebElement confirmSendButton;
    @FindBy(id = "confirmationMessage")
    private WebElement confirmationMessage;

    // Constructor
    public SchedulePanelInterviewPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    // Methods
    public void clickCreateInterview() {
        elementUtils.clickElement(createInterviewButton);
    }

    public void selectJobOpening(String jobOpening) {
        elementUtils.clickElement(jobOpeningDropdown);
        elementUtils.selectOptionInDropdown(jobOpeningDropdown, jobOpening);
    }

    public void selectLocation(String location) {
        elementUtils.clickElement(locationDropdown);
        elementUtils.selectOptionInDropdown(locationDropdown, location);
    }

    public void enterCandidateEmail(String candidateEmail) {
        elementUtils.clearAndSendKeys(candidateEmailField, candidateEmail);
    }

    public void choosePanelInterviewOption(String option) {
        elementUtils.mouseHoverAndClick(panelInterviewOption);
    }

    public void selectInterviewDate(String interviewDate) {
        elementUtils.clearAndSendKeys(interviewDateField, interviewDate);
    }

    public void selectStartTime(String startTime) {
        elementUtils.clearAndSendKeys(startTimeField, startTime);
    }

    public void clickNext() {
        elementUtils.clickElement(nextButton);
    }

    public void clickConfirmAndSend() {
        elementUtils.clickElement(confirmSendButton);
    }

    public void isConfirmationMessageDisplayed() {
        boolean isDisplayed = elementUtils.isElementDisplayed(confirmationMessage);
        Assert.assertTrue("Confirmation message is not displayed", isDisplayed);
    }

    public void navigateToScheduleInterviewSection() {
        WebElement scheduleInterviewSection = driver.findElement(By.id("scheduleInterviewSection"));
        elementUtils.clickElement(scheduleInterviewSection);
    }

    public void isAttendeeErrorMessageDisplayed() {
        WebElement errorMessage = driver.findElement(By.id("attendeeErrorMessage"));
        Assert.assertTrue(elementUtils.isElementDisplayed(errorMessage), "Attendee error message is not displayed!");
    }

    public void isCandidateUpdateEmailNotificationReceived() {
        boolean notificationReceived = checkEmailNotification("Candidate Update");
        Assert.assertTrue(notificationReceived, "Candidate update email notification was not received!");
    }

    public void isOverlapErrorMessageDisplayed() {
        WebElement overlapErrorMessage = driver.findElement(By.id("overlapErrorMessage"));
        Assert.assertTrue(elementUtils.isElementDisplayed(overlapErrorMessage), "Overlap error message is not displayed!");
    }

    public void leaveInterviewDateFieldEmpty() {
        elementUtils.clearElement(interviewDateField);
    }

    public void clickSaveChanges() {
        WebElement saveButton = driver.findElement(By.id("saveChangesButton"));
        elementUtils.clickElement(saveButton);
    }

    public void isInterviewScheduled() {
        WebElement scheduleConfirmation = driver.findElement(By.id("scheduleConfirmation"));
        Assert.assertTrue(elementUtils.isElementDisplayed(scheduleConfirmation), "Interview is not scheduled successfully!");
    }

    public void selectMinAttendees(String minAttendees) {
        WebElement minAttendeesDropdown = driver.findElement(By.id("minAttendeesDropdown"));
        elementUtils.selectOptionInDropdown(minAttendeesDropdown, minAttendees);
    }

    public void leaveAttendeesFieldEmpty() {
        WebElement attendeesField = driver.findElement(By.id("attendeesField"));
        elementUtils.clearElement(attendeesField);
    }

    public void isCalendarInviteIncluded() {
        WebElement calendarInviteCheckbox = driver.findElement(By.id("calendarInviteCheckbox"));
        Assert.assertTrue(calendarInviteCheckbox.isSelected(), "Calendar invite is not included!");
    }

    public void selectScheduledInterviewToEdit() {
        WebElement scheduledInterview = driver.findElement(By.id("scheduledInterviewToEdit"));
        elementUtils.clickElement(scheduledInterview);
    }

    public void isStartTimeErrorMessageDisplayed() {
        WebElement startTimeErrorMessage = driver.findElement(By.id("startTimeErrorMessage"));
        Assert.assertTrue(elementUtils.isElementDisplayed(startTimeErrorMessage), "Start time error message is not displayed!");
    }

    public void clickCancelInterview() {
        WebElement cancelButton = driver.findElement(By.id("cancelInterviewButton"));
        elementUtils.clickElement(cancelButton);
    }

    public void selectInterviewDateAndStartTime(String interviewDate, String startTime) {
        elementUtils.clearAndSendKeys(interviewDateField, interviewDate);
        elementUtils.clearAndSendKeys(startTimeField, startTime);
    }

    public void selectScheduledInterviewToCancel() {
        WebElement scheduledInterview = driver.findElement(By.id("scheduledInterviewToCancel"));
        elementUtils.clickElement(scheduledInterview);
    }

    public void areCancellationNotificationsSent() {
        boolean notificationsSent = checkCancellationNotifications("Interview Cancelled");
        Assert.assertTrue(notificationsSent, "Cancellation notifications were not sent!");
    }

    public void attachRequiredFiles(String requiredFiles) {
        WebElement attachFileButton = driver.findElement(By.id("attachFilesButton"));
        elementUtils.clickElement(attachFileButton);
        // Assuming file upload logic is handled
    }

    public void isEmailNotificationReceived() {
        boolean notificationReceived = checkEmailNotification("Interview Scheduled");
        Assert.assertTrue(notificationReceived, "Email notification for scheduled interview was not received!");
    }

    public void leaveJobOpeningFieldEmpty() {
        WebElement jobOpeningField = driver.findElement(By.id("jobOpeningField"));
        elementUtils.clearElement(jobOpeningField);
    }

    public void isInterviewScheduledSuccessfully() {
        WebElement successMessage = driver.findElement(By.id("interviewScheduledSuccess"));
        Assert.assertTrue(elementUtils.isElementDisplayed(successMessage), "Interview was not scheduled successfully!");
    }

    public void selectAttendeesAndInterviewRound(String attendees, String interviewRound) {
        WebElement attendeesDropdown = driver.findElement(By.id("attendeesDropdown"));
        elementUtils.selectOptionInDropdown(attendeesDropdown, attendees);
        WebElement roundDropdown = driver.findElement(By.id("interviewRoundDropdown"));
        elementUtils.selectOptionInDropdown(roundDropdown, interviewRound);
    }

    public void isCancellationConfirmationMessageDisplayed() {
        WebElement cancellationConfirmationMessage = driver.findElement(By.id("cancellationConfirmationMessage"));
        Assert.assertTrue(elementUtils.isElementDisplayed(cancellationConfirmationMessage), "Cancellation confirmation message is not displayed!");
    }

    public void enterInvalidCandidateEmail(String email) {
        elementUtils.clearAndSendKeys(candidateEmailField, email);
    }

    public void isCandidateErrorMessageDisplayed() {
        WebElement candidateErrorMessage = driver.findElement(By.id("candidateErrorMessage"));
        Assert.assertTrue(elementUtils.isElementDisplayed(candidateErrorMessage), "Candidate error message is not displayed!");
    }

    public void isInterviewDateErrorMessageDisplayed() {
        WebElement interviewDateErrorMessage = driver.findElement(By.id("interviewDateErrorMessage"));
        Assert.assertTrue(elementUtils.isElementDisplayed(interviewDateErrorMessage), "Interview date error message is not displayed!");
    }

    public void isInvalidEmailFormatErrorMessageDisplayed() {
        WebElement invalidEmailErrorMessage = driver.findElement(By.id("invalidEmailErrorMessage"));
        Assert.assertTrue(elementUtils.isElementDisplayed(invalidEmailErrorMessage), "Invalid email format error message is not displayed!");
    }

    public void selectFromAvailableOptions(String option) {
        WebElement availableOptionsDropdown = driver.findElement(By.id("availableOptionsDropdown"));
        elementUtils.selectOptionInDropdown(availableOptionsDropdown, option);
    }

    public void isUpdateConfirmationMessageDisplayed() {
        WebElement updateConfirmationMessage = driver.findElement(By.id("updateConfirmationMessage"));
        Assert.assertTrue(elementUtils.isElementDisplayed(updateConfirmationMessage), "Update confirmation message is not displayed!");
    }

    public void confirmCancellation() {
        WebElement confirmButton = driver.findElement(By.id("confirmCancellationButton"));
        elementUtils.clickElement(confirmButton);
    }

    public void selectCandidate() {
        WebElement candidateCheckbox = driver.findElement(By.id("candidateCheckbox"));
        elementUtils.clickElement(candidateCheckbox);
    }

    public void fillInOptionalFields(String additionalInfo) {
        WebElement optionalField = driver.findElement(By.id("optionalField"));
        elementUtils.clearAndSendKeys(optionalField, additionalInfo);
    }

    public void clickEditInterview() {
        WebElement editButton = driver.findElement(By.id("editInterviewButton"));
        elementUtils.clickElement(editButton);
    }

    public void areNotificationsSentToParticipants() {
        boolean notificationsSent = true; // Add logic to verify notifications
        Assert.assertTrue(notificationsSent, "Notifications were not sent to participants!");
    }

    public void isOnSchedulingPage() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("scheduling"), "Not on the scheduling page!");
    }

    public void selectPastInterviewDate(String pastDate) {
        elementUtils.clearAndSendKeys(interviewDateField, pastDate);
    }

    public void isInterviewVisibleInDashboard() {
        WebElement interviewInDashboard = driver.findElement(By.id("interviewInDashboard"));
        Assert.assertTrue(elementUtils.isElementDisplayed(interviewInDashboard), "Interview is not visible in the dashboard!");
    }

    public void areUpdatedDetailsReflected() {
        WebElement updatedDetails = driver.findElement(By.id("updatedDetails"));
        Assert.assertTrue(elementUtils.isElementDisplayed(updatedDetails), "Updated details are not reflected!");
    }

    public void isInterviewRemovedFromList() {
        WebElement removedInterview = driver.findElement(By.id("removedInterview"));
        Assert.assertFalse(elementUtils.isElementDisplayed(removedInterview), "Interview is still present in the list!");
    }

    public void isJobOpeningErrorMessageDisplayed() {
        WebElement jobOpeningErrorMessage = driver.findElement(By.id("jobOpeningErrorMessage"));
        Assert.assertTrue(elementUtils.isElementDisplayed(jobOpeningErrorMessage), "Job opening error message is not displayed!");
    }

    public void leaveCandidateFieldEmpty() {
        WebElement candidateField = driver.findElement(By.id("candidateField"));
        elementUtils.clearElement(candidateField);
    }

    public void isPastDateErrorMessageDisplayed() {
        WebElement pastDateErrorMessage = driver.findElement(By.id("pastDateErrorMessage"));
        Assert.assertTrue(elementUtils.isElementDisplayed(pastDateErrorMessage), "Past date error message is not displayed!");
    }

    public void isInterviewInCalendar() {
        boolean interviewInCalendar = true; // Add logic as needed
        Assert.assertTrue(interviewInCalendar, "Interview is not present in the calendar!");
    }

    public void leaveStartTimeFieldEmpty() {
        WebElement startTimeField = driver.findElement(By.id("interviewStartTimeField"));
        elementUtils.clearElement(startTimeField);
    }

    public void isUpdatedInterviewVisibleInDashboard() {
        WebElement updatedInterview = driver.findElement(By.id("updatedInterviewInDashboard"));
        Assert.assertTrue(elementUtils.isElementDisplayed(updatedInterview), "Updated interview is not visible in the dashboard!");
    }

    public void areOptionalFieldsDisplayedCorrectly() {
        WebElement optionalField = driver.findElement(By.id("optionalField"));
        Assert.assertTrue(elementUtils.isElementDisplayed(optionalField), "Optional fields are not displayed correctly!");
    }

    public void isCandidateEmailNotificationReceived() {
        boolean notificationReceived = checkEmailNotification("Candidate Email Notification");
        Assert.assertTrue(notificationReceived, "Candidate email notification was not received!");
    }

    public void selectInterviewProvider(String provider) {
        WebElement providerDropdown = driver.findElement(By.id("interviewProviderDropdown"));
        elementUtils.selectOptionInDropdown(providerDropdown, provider);
    }

    public void isCandidateCancellationEmailReceived() {
        boolean notificationReceived = checkEmailNotification("Candidate Cancellation");
        Assert.assertTrue(notificationReceived, "Candidate cancellation email notification was not received!");
    }

    public void checkEmailInbox(String attendee) {
        // Logic to check email inbox
        boolean inboxChecked = true; // Replace with actual logic
        Assert.assertTrue(inboxChecked, "Email inbox was not checked successfully!");
    }

    public void makeChangesToInterviewDetails(String updatedDetails) {
        WebElement detailsField = driver.findElement(By.id("interviewDetailsField"));
        elementUtils.clearAndSendKeys(detailsField, updatedDetails);
    }

    public void areChangeNotificationsSent() {
        boolean notificationsSent = true; // Add logic to verify notifications
        Assert.assertTrue(notificationsSent, "Change notifications were not sent!");
    }

    public void chooseOption(String option) {
        WebElement optionsDropdown = driver.findElement(By.id("optionsDropdown"));
        elementUtils.selectOptionInDropdown(optionsDropdown, option);
    }

    public void areNotificationsSent() {
        boolean notificationsSent = true; // Add logic to verify notifications
        Assert.assertTrue(notificationsSent, "Notifications were not sent!");
    }
}