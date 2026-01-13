package com.xops-repo.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.xops_repo.pages.LoginScreenforRecruitersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginScreenforRecruiters extends DriverFactory {
LoginScreenforRecruitersPage loginPage = new LoginScreenforRecruitersPage(driver);
@Given("the user is on the Login Screen")
public void the_user_is_on_the_login_screen() {
driver = DriverFactory.getDriver();
loginPage.navigateToLoginScreen();
}
@When("I enter {string} in the Email ID field")
public void i_enter_email_in_the_email_id_field(String email) {
loginPage.enterEmail(email);
}
@When("I enter {string} in the Password field")
public void i_enter_password_in_the_password_field(String password) {
loginPage.enterPassword(password);
}
@When("I click the Login button")
public void i_click_the_login_button() {
loginPage.clickLoginButton();
}
@Then("the user should be redirected to the dashboard")
public void the_user_should_be_redirected_to_the_dashboard() {
"User is not redirected to the dashboard", loginPage.isDashboardDisplayed();
}
@Then("the Login button should be enabled")
public void the_login_button_should_be_enabled() {
"Login button is not enabled", loginPage.isLoginButtonEnabled();
}
@When("I click the 'Show Password' option")
public void i_click_the_show_password_option() {
loginPage.clickShowPassword();
}
@Then("the password should be visible")
public void the_password_should_be_visible() {
"Password is not visible", loginPage.isPasswordVisible();
}
@Then("the password should be hidden")
public void the_password_should_be_hidden() {
"Password is still visible", loginPage.isPasswordVisible();
}
@Then("an error message {string} is displayed")
public void an_error_message_is_displayed(String errorMessage) {
Assert.assertEquals("Error message does not match", errorMessage, loginPage.getErrorMessage());
}
@Then("the user remains on the login screen")
public void the_user_remains_on_the_login_screen() {
"User is not on the login screen", loginPage.isLoginScreenDisplayed();
}
@Then("the Login button should be disabled")
public void the_login_button_should_be_disabled() {
"Login button is not disabled", loginPage.isLoginButtonEnabled();
}
@When("the user leaves the Email ID field empty")
public void the_user_leaves_the_email_id_field_empty() {
loginPage.leaveEmailFieldEmpty();
}
@When("the user leaves the Password field empty")
public void the_user_leaves_the_password_field_empty() {
loginPage.leavePasswordFieldEmpty();
}
@Then("the email ID is correctly entered")
public void the_email_id_is_correctly_entered() {
"Email ID is not correctly entered", loginPage.isEmailCorrectlyEntered();
}
@Then("the password is incorrectly entered")
public void the_password_is_incorrectly_entered() {
"Password is incorrectly entered", loginPage.isPasswordCorrectlyEntered();
}
// DUPLICATE: @When("I enter {string} in the Email ID field")
public void i_enter_invalid_email_in_the_email_id_field(String email) {
loginPage.enterEmail(email);
}
// DUPLICATE: @When("I enter {string} in the Password field")
public void i_enter_invalid_password_in_the_password_field(String password) {
loginPage.enterPassword(password);
}
@Then("the user should see an error message {string}")
public void the_user_should_see_an_error_message(String errorMessage) {
Assert.assertEquals("Error message does not match", errorMessage, loginPage.getErrorMessage());
}
@Then("the user should see the error message {string}")
public void the_user_should_see_the_error_message(String errorMessage) {
Assert.assertEquals("Error message does not match", errorMessage, loginPage.getErrorMessage());
}
//    @Then("the user should be redirected to the dashboard")
//    @When("I enter {string} in the Email ID field")
//    @When("I enter {string} in the Password field")

@Given("I open the application in {string}")
public void i_open_the_application_in(String url) {
driver = DriverFactory.getDriver();
driver.get(url);
}
@When("I enter {string} in the password field")
public void i_enter_in_the_password_field(String password) {
loginPage.enterPassword(password);
}
@When("I enter a valid email id {string}")
public void i_enter_a_valid_email_id(String validEmail) {
loginPage.enterEmail(validEmail);
}
@When("I enter a valid password {string}")
public void i_enter_a_valid_password(String validPassword) {
loginPage.enterPassword(validPassword);
}
@When("I leave the password field empty")
public void i_leave_the_password_field_empty() {
loginPage.leavePasswordFieldEmpty();
}
@When("I clickElement on the 'show password' option")
public void i_click_on_the_show_password_option() {
loginPage.clickShowPassword();
}
@When("I clickElement on the 'hide password' option")
public void i_click_on_the_hide_password_option() {
loginPage.clickHidePassword();
}
@When("the user clicks the login button")
public void the_user_clicks_the_login_button() {
loginPage.clickLoginButton();
}
@Then("the user should see an error message 'please enter your email id.'")
public void the_user_should_see_an_error_message_please_enter_your_email_id() {
Assert.assertEquals("please enter your email id.", loginPage.getEmailErrorMessage());
}
@Then("the user should see the error message 'please enter your password.'")
public void the_user_should_see_the_error_message_please_enter_your_password() {
Assert.assertEquals("please enter your password.", loginPage.getPasswordErrorMessage());
}
@Then("the error message 'incorrect email id or password.' is displayed")
public void the_error_message_incorrect_email_id_or_password_is_displayed() {
Assert.assertEquals("incorrect email id or password.", loginPage.getLoginErrorMessage());
}
@Then("an error message 'please enter a valid email id.' is displayed")
public void an_error_message_please_enter_a_valid_email_id_is_displayed() {
Assert.assertEquals("please enter a valid email id.", loginPage.getEmailErrorMessage());
}
@Then("an error message 'password must be at least 6 characters long.' is displayed")
public void an_error_message_password_must_be_at_least_6_characters_long_is_displayed() {
Assert.assertEquals("password must be at least 6 characters long.", loginPage.getPasswordErrorMessage());
}
@Then("the user is redirected to the dashboard in {string}")
public void the_user_is_redirected_to_the_dashboard_in(String expectedUrl) {
Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
}
@Then("the dashboard should load without errors")
public void the_dashboard_should_load_without_errors() {
loginPage.isDashboardLoaded();
}
@Then("the user should remain on the login screen")
public void the_user_should_remain_on_the_login_screen() {
loginPage.isLoginScreenDisplayed();
}
@Then("the email id should be correctly entered")
public void the_email_id_should_be_correctly_entered() {
Assert.assertEquals(loginPage.getEnteredEmail(), loginPage.getExpectedEmail());
}
@Then("the password should be correctly entered")
public void the_password_should_be_correctly_entered() {
Assert.assertEquals(loginPage.getEnteredPassword(), loginPage.getExpectedPassword());
}
}
}