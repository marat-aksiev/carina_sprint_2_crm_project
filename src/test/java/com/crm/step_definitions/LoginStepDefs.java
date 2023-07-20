package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginStepDefs {

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
                String actualTitle = Driver.getDriver().getTitle();
                String expectedTitle = "(1) Portal";
                Assert.assertEquals("Title verification failed", expectedTitle, actualTitle);

        }
}








