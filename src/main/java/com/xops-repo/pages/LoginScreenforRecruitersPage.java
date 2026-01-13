package com.backend.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginScreenforRecruitersPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "emailField")
    private WebElement emailField;

    @FindBy(id = "passwordField")
    private WebElement passwordField;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(id = "showPassword")
    private WebElement showPasswordButton;

    @FindBy(id = "errorMessage")
    private WebElement errorMessage;

    @FindBy(id = "dashboard")
    private WebElement dashboard;

    @FindBy(id = "emailErrorMessage")
    private WebElement emailErrorMessage;

    @FindBy(id = "passwordErrorMessage")
    private WebElement passwordErrorMessage;

    @FindBy(id = "hide-password-btn")
    private WebElement hidePasswordButton;

    public LoginScreenforRecruitersPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToLoginScreen() {
        driver.get("http://localhost");
    }

    public void enterEmail(String email) {
        try {
            elementUtils.clearAndSendKeys(emailField, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterPassword(String password) {
        try {
            elementUtils.clearAndSendKeys(passwordField, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickLoginButton() {
        try {
            elementUtils.clickElement(loginButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isDashboardDisplayed() {
        try {
            return elementUtils.isElementDisplayed(dashboard);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isLoginButtonEnabled() {
        try {
            return loginButton.isEnabled();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickShowPassword() {
        try {
            elementUtils.clickElement(showPasswordButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickHidePassword() {
        try {
            elementUtils.clickElement(hidePasswordButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isPasswordVisible() {
        try {
            return passwordField.getAttribute("type").equals("text");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public String getErrorMessage() {
        try {
            return elementUtils.getElementText(errorMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean isLoginScreenDisplayed() {
        try {
            return elementUtils.isElementDisplayed(emailField);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public String getEmailErrorMessage() {
        try {
            return elementUtils.getElementText(emailErrorMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getPasswordErrorMessage() {
        try {
            return elementUtils.getElementText(passwordErrorMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getEnteredEmail() {
        try {
            return elementUtils.getElementText(emailField);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getEnteredPassword() {
        try {
            return elementUtils.getElementText(passwordField);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void leaveEmailFieldEmpty() {
        try {
            elementUtils.clearElement(emailField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leavePasswordFieldEmpty() {
        try {
            elementUtils.clearElement(passwordField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isEmailCorrectlyEntered(String expectedEmail) {
        try {
            String actualEmail = getEnteredEmail();
            return actualEmail.equals(expectedEmail);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isPasswordCorrectlyEntered(String expectedPassword) {
        try {
            String actualPassword = getEnteredPassword();
            return actualPassword.equals(expectedPassword);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isDashboardLoaded() {
        // Implement logic to check if the dashboard has loaded successfully
        return true; // Placeholder return
    }
}