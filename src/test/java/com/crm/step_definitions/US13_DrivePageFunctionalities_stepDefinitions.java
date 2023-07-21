package com.crm.step_definitions;

import com.crm.pages.DrivePage;
import com.crm.pages.LoginPage;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US13_DrivePageFunctionalities_stepDefinitions {
    // Creating instances of LoginPage and DrivePage classes
    private LoginPage loginPage = new LoginPage();
    private DrivePage drivePage = new DrivePage();

    // Step: User enters valid credentials and clicks the login button
    @When("user enters valid {string} and valid {string} and press login button")
    public void user_enters_valid_and_valid_and_press_login_button(String userName, String password) {
        loginPage.login(userName, password); // Call the login method of LoginPage with provided credentials
    }

    // Step: User should be able to login and redirected to the homepage
    @Then("user should be able to login and redirected to the homepage")
    public void user_should_be_able_to_login_and_redirected_to_the_homepage() {
        String actualTitle = Driver.getDriver().getCurrentUrl(); // Get the current URL of the page
        Assert.assertTrue(actualTitle.contains("qa.agileprocrm.com")); // Assert that the URL contains "qa.agileprocrm.com"
    }

    // Step: User clicks on a specific navigation link
    @Then("user click on the {string} navigation link")
    public void user_click_on_the_navigation_link(String navLink) {
        // Iterate through the navigation links on the Drive page
        for (WebElement eachLink : drivePage.navigationLinks) {
            // Check if the link's text contains the specified 'navLink'
            if (eachLink.getText().contains(navLink)){
                eachLink.click(); // If found, click on the link and break the loop
                break;
            }
        }
    }

    // Step: User should be able to see the following modules in the Drive navigation menu
    @Then("the user should be able to see the following modules in the Drive navigation menu:")
    public void the_user_should_be_able_to_see_the_following_modules_in_the_drive_navigation_menu(List<String> modulesExpected) {
        // Get all the modules listed in the Drive navigation menu
        List<WebElement> modulesWebElements = drivePage.myDriveModules;
        // Create a list to store the actual module names
        List<String> modulesActual = new ArrayList<>();
        for (int i = 0; i < modulesWebElements.size() - 1; i++) {
            String text = modulesWebElements.get(i).getText();
            modulesActual.add(text); // Add each module name to the 'modulesActual' list
        }

        // Assert that the expected modules match the actual modules
        Assert.assertEquals(modulesExpected, modulesActual);
    }
}
