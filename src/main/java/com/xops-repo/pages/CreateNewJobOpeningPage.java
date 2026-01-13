package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class CreateNewJobOpeningPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "menuItem")
    private WebElement menuItem;
    @FindBy(id = "jobOpeningPage")
    private WebElement jobOpeningPage;
    @FindBy(id = "addJobOpeningButton")
    private WebElement addJobOpeningButton;
    @FindBy(id = "jobTitleField")
    private WebElement jobTitleField;
    @FindBy(id = "jobDescriptionField")
    private WebElement jobDescriptionField;
    @FindBy(id = "departmentDropdown")
    private WebElement departmentDropdown;
    @FindBy(id = "locationField")
    private WebElement locationField;
    @FindBy(id = "saveButton")
    private WebElement saveButton;
    @FindBy(id = "successMessage")
    private WebElement successMessage;
    @FindBy(id = "errorMessage")
    private WebElement errorMessage;
    @FindBy(id = "jobOpeningListing")
    private WebElement jobOpeningListing;

    public CreateNewJobOpeningPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void clicksOnMenuItem(String action) {
        try {
            elementUtils.clickElement(menuItem);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isJobOpeningPageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(jobOpeningPage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isAddJobOpeningButtonVisible() {
        try {
            return elementUtils.isElementDisplayed(addJobOpeningButton);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void enterJobTitle(String jobTitle) {
        try {
            elementUtils.clearAndSendKeys(jobTitleField, jobTitle);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterJobDescription(String jobDescription) {
        try {
            elementUtils.clearAndSendKeys(jobDescriptionField, jobDescription);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectDepartment(String department) {
        try {
            elementUtils.clickElement(departmentDropdown);
            elementUtils.selectOptionInDropdown(departmentDropdown, department);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterLocation(String location) {
        try {
            elementUtils.clearAndSendKeys(locationField, location);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickSaveButton() {
        try {
            elementUtils.clickElement(saveButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isSuccessMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(successMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isJobOpeningDisplayedInListing() {
        try {
            return elementUtils.isElementDisplayed(jobOpeningListing);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isJobTitleRequiredErrorDisplayed() {
        try {
            String actualError = elementUtils.getElementText(errorMessage);
            String expectedError = "Job Title is required.";
            Assert.assertEquals(actualError, expectedError, "Error message does not match!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void navigateToJobOpeningCreationPage() {
        // Logic to navigate to Job Opening Creation Page
    }

    public void selectSortingOrder() {
        try {
            WebElement sortingOrderElement = driver.findElement(By.id("sortingOrderSelect"));
            ElementUtils.selectOptionInDropdown(sortingOrderElement, "Job Description Length");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isJobDescriptionLengthErrorDisplayed() {
        try {
            WebElement errorElement = driver.findElement(By.id("jobDescriptionLengthError"));
            Assert.assertTrue(ElementUtils.isElementDisplayed(errorElement), "Job Description Length error is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksOnFilterOptions() {
        try {
            WebElement filterOptionsElement = driver.findElement(By.id("filterOptionsButton"));
            ElementUtils.clickElement(filterOptionsElement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksOnNextPageButton() {
        try {
            WebElement nextPageButton = driver.findElement(By.id("nextPageButton"));
            ElementUtils.clickElement(nextPageButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isNextSetOfJobOpeningsDisplayed() {
        try {
            WebElement nextJobOpeningsElement = driver.findElement(By.className("nextJobOpenings"));
            Assert.assertTrue(ElementUtils.isElementDisplayed(nextJobOpeningsElement), "Next set of job openings is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isJobOpeningsListingUpdated() {
        try {
            boolean isUpdated = checkForJobOpeningsUpdate();
            Assert.assertTrue(isUpdated, "Job openings listing is not updated!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isDuplicateJobTitleErrorDisplayed() {
        try {
            WebElement errorElement = driver.findElement(By.id("duplicateJobTitleError"));
            Assert.assertTrue(ElementUtils.isElementDisplayed(errorElement), "Duplicate Job Title error is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectValidDepartment() {
        try {
            WebElement departmentDropdown = driver.findElement(By.id("departmentSelect"));
            ElementUtils.selectOptionInDropdown(departmentDropdown, "Valid Department");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isRedirectedToJobOpeningsListing() {
        try {
            String currentUrl = driver.getCurrentUrl();
            Assert.assertEquals(currentUrl, "localhost/jobOpenings", "Not redirected to Job Openings listing!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isInvalidDepartmentErrorDisplayed() {
        try {
            WebElement errorElement = driver.findElement(By.id("invalidDepartmentError"));
            Assert.assertTrue(ElementUtils.isElementDisplayed(errorElement), "Invalid Department error is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksOnNewlyCreatedJobOpening() {
        try {
            WebElement newlyCreatedJobOpening = driver.findElement(By.cssSelector(".newJobOpening"));
            ElementUtils.clickElement(newlyCreatedJobOpening);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickEditButton() {
        try {
            WebElement editButton = driver.findElement(By.id("editJobButton"));
            ElementUtils.clickElement(editButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isCurrentPageNumberDisplayed() {
        try {
            WebElement pageNumberElement = driver.findElement(By.id("currentPageNumber"));
            Assert.assertTrue(ElementUtils.isElementDisplayed(pageNumberElement), "Current page number is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksOnSortingOptions() {
        try {
            WebElement sortingOptionsElement = driver.findElement(By.id("sortingOptionsButton"));
            ElementUtils.clickElement(sortingOptionsElement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isFilterCriteriaDisplayed() {
        try {
            WebElement filterCriteriaElement = driver.findElement(By.id("filterCriteria"));
            Assert.assertTrue(ElementUtils.isElementDisplayed(filterCriteriaElement), "Filter criteria is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areAllRequiredFieldsPresent() {
        try {
            boolean allFieldsPresent = checkForRequiredFields();
            Assert.assertTrue(allFieldsPresent, "Not all required fields are present!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isJobOpeningCreated() {
        try {
            WebElement successMessageElement = driver.findElement(By.id("jobCreationSuccess"));
            Assert.assertTrue(ElementUtils.isElementDisplayed(successMessageElement), "Job opening was not created successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickJobOpeningsMenuItem() {
        try {
            WebElement jobOpeningsMenuItem = driver.findElement(By.id("jobOpeningsMenuItem"));
            ElementUtils.clickElement(jobOpeningsMenuItem);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isInvalidLocationErrorDisplayed() {
        try {
            WebElement errorElement = driver.findElement(By.id("invalidLocationError"));
            Assert.assertTrue(ElementUtils.isElementDisplayed(errorElement), "Invalid Location error is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isUpdatedJobOpeningDisplayed() {
        try {
            WebElement updatedJobOpeningElement = driver.findElement(By.className("updatedJobOpening"));
            Assert.assertTrue(ElementUtils.isElementDisplayed(updatedJobOpeningElement), "Updated job opening is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterJobDescriptionWithMinCharacters() {
        try {
            WebElement jobDescriptionElement = driver.findElement(By.id("jobDescription"));
            ElementUtils.clearAndSendKeys(jobDescriptionElement, "Minimum description");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isCreateNewJobOpeningFormDisplayed() {
        try {
            WebElement createJobOpeningForm = driver.findElement(By.id("createJobOpeningForm"));
            Assert.assertTrue(ElementUtils.isElementDisplayed(createJobOpeningForm), "Create New Job Opening form is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterValidDetails() {
        try {
            WebElement titleElement = driver.findElement(By.id("jobTitle"));
            ElementUtils.clearAndSendKeys(titleElement, "Valid Job Title");

            WebElement descriptionElement = driver.findElement(By.id("jobDescription"));
            ElementUtils.clearAndSendKeys(descriptionElement, "Valid job description");

            selectValidDepartment();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectDepartmentFromFilter() {
        try {
            WebElement departmentDropdown = driver.findElement(By.id("departmentSelect"));
            ElementUtils.selectOptionInDropdown(departmentDropdown, "IT Department");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leaveRequiredFieldsEmpty() {
        try {
            WebElement titleElement = driver.findElement(By.id("jobTitle"));
            ElementUtils.clearElement(titleElement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clearJobTitleField() {
        try {
            WebElement titleElement = driver.findElement(By.id("jobTitle"));
            ElementUtils.clearElement(titleElement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areAllFieldsVisibleAndAccurate() {
        try {
            boolean allFieldsVisible = checkForFieldVisibility();
            Assert.assertTrue(allFieldsVisible, "Not all fields are visible and accurate!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void modifyJobDescription() {
        try {
            WebElement descriptionElement = driver.findElement(By.id("jobDescription"));
            ElementUtils.clearAndSendKeys(descriptionElement, "Updated job description");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksOnButton() {
        try {
            WebElement submitButton = driver.findElement(By.id("submitJobButton"));
            ElementUtils.clickElement(submitButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areAllRequiredFieldErrorsDisplayed() {
        try {
            WebElement errorElement1 = driver.findElement(By.id("requiredFieldError1"));
            WebElement errorElement2 = driver.findElement(By.id("requiredFieldError2"));

            Assert.assertTrue(ElementUtils.isElementDisplayed(errorElement1), "Required Field Error 1 is not displayed!");
            Assert.assertTrue(ElementUtils.isElementDisplayed(errorElement2), "Required Field Error 2 is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterInvalidLocation() {
        try {
            WebElement locationElement = driver.findElement(By.id("jobLocation"));
            ElementUtils.clearAndSendKeys(locationElement, "Invalid Location");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isSortingOrderIndicated() {
        try {
            WebElement sortingOrderIndicatorElement = driver.findElement(By.id("sortingOrderIndicator"));
            Assert.assertTrue(ElementUtils.isElementDisplayed(sortingOrderIndicatorElement), "Sorting order is not indicated!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillInJobTitle() {
        try {
            WebElement titleElement = driver.findElement(By.id("jobTitle"));
            ElementUtils.clearAndSendKeys(titleElement, "Job Title");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isJobOpeningDisplayedWithFilledFields() {
        try {
            WebElement jobOpeningElement = driver.findElement(By.className("jobOpeningFilled"));
            Assert.assertTrue(ElementUtils.isElementDisplayed(jobOpeningElement), "Job opening with filled fields is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterValidJobTitle() {
        try {
            WebElement titleElement = driver.findElement(By.id("jobTitle"));
            ElementUtils.clearAndSendKeys(titleElement, "Valid Job Title");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isButtonVisibleAndClickable() {
        try {
            WebElement submitButton = driver.findElement(By.id("submitJobButton"));
            Assert.assertTrue(ElementUtils.isElementDisplayed(submitButton), "Submit button is not visible!");
            Assert.assertTrue(submitButton.isEnabled(), "Submit button is not clickable!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksOnCancelButton() {
        try {
            WebElement cancelButton = driver.findElement(By.id("cancelJobButton"));
            ElementUtils.clickElement(cancelButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createJobOpeningWithValidDetails() {
        try {
            enterValidDetails();
            clicksOnButton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isPaginationControlsVisible() {
        try {
            WebElement paginationControlsElement = driver.findElement(By.className("paginationControls"));
            Assert.assertTrue(ElementUtils.isElementDisplayed(paginationControlsElement), "Pagination controls are not visible!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isJobOpeningDisplayedWithCorrectDetails() {
        try {
            WebElement jobOpeningElement = driver.findElement(By.className("jobOpeningCorrectDetails"));
            Assert.assertTrue(ElementUtils.isElementDisplayed(jobOpeningElement), "Job opening is not displayed with correct details!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isJobOpeningsSorted() {
        try {
            boolean isSorted = checkIfJobOpeningsSorted();
            Assert.assertTrue(isSorted, "Job openings are not sorted!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leaveOptionalFieldsEmpty() {
        try {
            WebElement optionalFieldElement = driver.findElement(By.id("optionalField"));
            ElementUtils.clearElement(optionalFieldElement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickApplyFilterButton() {
        try {
            WebElement applyFilterButton = driver.findElement(By.id("applyFilterButton"));
            ElementUtils.clickElement(applyFilterButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickAddJobOpeningButton() {
        try {
            WebElement addJobOpeningButton = driver.findElement(By.id("addJobOpeningButton"));
            ElementUtils.clickElement(addJobOpeningButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterValidJobDescription() {
        try {
            WebElement jobDescriptionElement = driver.findElement(By.id("jobDescription"));
            ElementUtils.clearAndSendKeys(jobDescriptionElement, "A valid job description for testing.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isConfirmationMessageDisplayed() {
        try {
            WebElement confirmationMessageElement = driver.findElement(By.id("confirmationMessage"));
            Assert.assertTrue(ElementUtils.isElementDisplayed(confirmationMessageElement), "Confirmation message is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForFormToLoad() {
        try {
            // Assuming we have a way to wait for the form to load
            waitForElementToBeVisible(By.id("createJobOpeningForm"), 10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areJobOpeningDetailsDisplayedCorrectly() {
        try {
            boolean detailsCorrect = checkJobOpeningDetails();
            Assert.assertTrue(detailsCorrect, "Job opening details are not displayed correctly!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterJobDescriptionWithMaxCharacters() {
        try {
            WebElement jobDescriptionElement = driver.findElement(By.id("jobDescription"));
            ElementUtils.clearAndSendKeys(jobDescriptionElement, "A job description that exceeds the maximum allowed characters... (etc.)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isInvalidJobTitleErrorDisplayed() {
        try {
            WebElement errorElement = driver.findElement(By.id("invalidJobTitleError"));
            Assert.assertTrue(ElementUtils.isElementDisplayed(errorElement), "Invalid Job Title error is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectInvalidDepartment() {
        try {
            WebElement departmentDropdown = driver.findElement(By.id("departmentSelect"));
            ElementUtils.selectOptionInDropdown(departmentDropdown, "Invalid Department");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}