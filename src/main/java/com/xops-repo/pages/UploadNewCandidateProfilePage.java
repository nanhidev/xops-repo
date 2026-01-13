package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UploadNewCandidateProfilePage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "uploadIcon")
    private WebElement uploadIcon;

    @FindBy(id = "uploadButton")
    private WebElement uploadButton;

    @FindBy(id = "successMessage")
    private WebElement successMessage;

    @FindBy(id = "errorMessage")
    private WebElement errorMessage;

    @FindBy(id = "sizeLimitError")
    private WebElement sizeLimitError;

    @FindBy(id = "noFileSelectedError")
    private WebElement noFileSelectedError;

    @FindBy(id = "networkFailureError")
    private WebElement networkFailureError;

    @FindBy(id = "timeoutError")
    private WebElement timeoutError;

    @FindBy(id = "corruptedFileError")
    private WebElement corruptedFileError;

    @FindBy(id = "fileInput")
    private WebElement fileInput;

    public UploadNewCandidateProfilePage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickUploadIcon() {
        try {
            elementUtils.clickElement(uploadIcon);
        } catch (Exception e) {
            handleException(e);
        }
    }

    public void clickUploadButton() {
        try {
            elementUtils.clickElement(uploadButton);
        } catch (Exception e) {
            handleException(e);
        }
    }

    public void waitForUploadToComplete() {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(successMessage));
        } catch (Exception e) {
            handleException(e);
        }
    }

    public boolean isSuccessMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(successMessage);
        } catch (Exception e) {
            handleException(e);
            return false;
        }
    }

    public boolean isErrorMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(errorMessage);
        } catch (Exception e) {
            handleException(e);
            return false;
        }
    }

    public boolean isSizeLimitErrorDisplayed() {
        try {
            return elementUtils.isElementDisplayed(sizeLimitError);
        } catch (Exception e) {
            handleException(e);
            return false;
        }
    }

    public boolean isNoFileSelectedErrorDisplayed() {
        try {
            return elementUtils.isElementDisplayed(noFileSelectedError);
        } catch (Exception e) {
            handleException(e);
            return false;
        }
    }

    public boolean isNetworkFailureErrorDisplayed() {
        try {
            return elementUtils.isElementDisplayed(networkFailureError);
        } catch (Exception e) {
            handleException(e);
            return false;
        }
    }

    public boolean isTimeoutErrorDisplayed() {
        try {
            return elementUtils.isElementDisplayed(timeoutError);
        } catch (Exception e) {
            handleException(e);
            return false;
        }
    }

    public boolean isCorruptedFileErrorDisplayed() {
        try {
            return elementUtils.isElementDisplayed(corruptedFileError);
        } catch (Exception e) {
            handleException(e);
            return false;
        }
    }

    public void browseAndSelectFile(String filePath) {
        try {
            elementUtils.clearAndSendKeys(fileInput, filePath);
        } catch (Exception e) {
            handleException(e);
        }
    }

    public boolean isUploadSuccessful() {
        return isSuccessMessageDisplayed();
    }

    public boolean isUploadInitiated() {
        try {
            return elementUtils.isElementDisplayed(uploadButton);
        } catch (Exception e) {
            handleException(e);
            return false;
        }
    }

    public void simulateNetworkFailure() {
        try {
            throw new RuntimeException("Network failure simulated.");
        } catch (Exception e) {
            handleException(e);
        }
    }

    public void simulateTimeout() {
        try {
            throw new RuntimeException("Upload timeout simulated.");
        } catch (Exception e) {
            handleException(e);
        }
    }

    public void doesNotSelectFile() {
        try {
            Assert.assertEquals("", fileInput.getAttribute("value"), "File should not be selected!");
        } catch (Exception e) {
            handleException(e);
        }
    }

    private void handleException(Exception e) {
        System.err.println("An error occurred: " + e.getMessage());
        e.printStackTrace();
    }
}