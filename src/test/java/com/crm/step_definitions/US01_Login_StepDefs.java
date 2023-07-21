package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.CrmUtils;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US01_Login_StepDefs {

        LoginPage loginPage = new LoginPage();

        @Given("user is on the login page")
        public void user_is_on_the_login_page() {
                Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        }


        @When("user enters valid {string} and valid {string}")
        public void user_enters_valid_credentials(String username, String password) {
                loginPage.login(username,password);
        }


        @Then("the user should be able to login and redirected homepage")
        public void user_can_login_and_redirects_to_homepage() {
                String actualTitle = Driver.getDriver().getCurrentUrl();
                String expectedTitle = "https://qa.agileprocrm.com/stream/?login=yes";
                Assert.assertEquals("Title verification failed", expectedTitle, actualTitle);

        }



        @When("user enters invalid {string} or invalid {string}")
        public void user_enters_invalid_or_invalid(String username, String password) {
                loginPage.login(username, password);


        }

        @Then("verify that {string} error message is displayed")
        public void verify_that_error_message_is_displayed(String string) {
                String actualErrorMessage = loginPage.errorMessage.getText();
                String expectedErrorMessage = "Incorrect login or password";

                Assert.assertEquals("error verification failed",expectedErrorMessage,actualErrorMessage);

        }

        @When("the user leaves the {string} or  {string} field empty")
        public void the_user_leaves_the_username_or_password_field_empty(String username, String password) {
                loginPage.login(username,password);
        }
        @Then("verify that the {string} error message is displayed")
        public void verify_that_the_error_message_is_displayed(String string) {
                String actualErrorMessage = loginPage.errorMessage.getText();
                String expectedErrorMessage = "Please fill out this field";

                Assert.assertEquals("Error verification failed",expectedErrorMessage,actualErrorMessage);
        }


        @Then("the user should be able to see the {string} link")
        public void the_user_should_be_able_to_see_the_rememberMeLink(String string) {
                String actualText = loginPage.rememberMeCheckBox.getText();
                String expectedText =  "Remember me on this computer";

        }
        @Then("the {string} link should be clickable")
       public void the_link_should_be_clickable(String string) {
                loginPage.rememberMeCheckBox.click();
                 }


        @Then("the password should appear in bullet signs by default")
        public void the_password_should_appear_in_bullet_signs_by_default() {
                String actualPasswordType = loginPage.password.getAttribute("type");
                String expectedPasswordType = "password";
                Assert.assertEquals("Password type verification failed",expectedPasswordType,actualPasswordType);


        }
//Alik's
        @And("user enters valid credentials for user role {string}")
        public void userEntersValidCredentialsForUserRole(String userRole) {
                String userName = CrmUtils.getUserNameByRole(userRole);
                String password = CrmUtils.getPasswordByRole(userRole);
                loginPage.login(userName,password);
        }
}












