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

public class B29G11255_DrivePageFunctionalities_stepDefinitions {
    private LoginPage loginPage = new LoginPage();
    private DrivePage drivePage = new DrivePage();


    @When("user enters valid {string} and valid {string} and press login button")
    public void user_enters_valid_and_valid_and_press_login_button(String userName, String password) {
        loginPage.login(userName,password);
    }

    @Then("user should be able to login and redirected to the homepage")
    public void user_should_be_able_to_login_and_redirected_to_the_homepage() {
        String actualTittle = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualTittle.contains("qa.agileprocrm.com"));
    }

    @Then("user click on the {string} navigation link")
    public void user_click_on_the_navigation_link(String driver) {
        drivePage.DriveNavigationLink.click();
    }

    @Then("the user should be able to see the following modules in the Drive navigation menu:")
    public void the_user_should_be_able_to_see_the_following_modules_in_the_drive_navigation_menu(List<String> modulesExpected) {
        List<WebElement> modulesWebElements = drivePage.myDriveModules;
        int lastIndex = modulesWebElements.size() - 1;
        modulesWebElements.remove(lastIndex);
        List<String> modulesActual=new ArrayList<>();
        for (int i = 0; i < modulesWebElements.size()-1; i++) {
            String text=modulesWebElements.get(i).getText();
            modulesActual.add(text);
        }

        Assert.assertEquals(modulesExpected, modulesActual);
    }
}
