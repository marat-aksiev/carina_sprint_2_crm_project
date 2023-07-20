package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class CompanyStructure_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    @Given("user is logged in as HR user")
    public void isLoggedInAsHRUser() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login(ConfigurationReader.getProperty("hr_username"), ConfigurationReader.getProperty("hr_password"));
        loginPage.loginButton.click();
    }

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    WebElement employeesMenu;
    @When("user navigates to the {string} menu")
    public void navigatesToTheMenu(String addDepartmentButton) {
        js.executeScript("arguments[0].scrollIntoView(true)", employeesMenu);
        employeesMenu.click();
    }

    @And("user clicks on {string} button")
    public void clicksOnButton(String employeesMenu) {

    }

    @And("user should see a pop-up window")
    public void shouldSeeAPopUpWindow(String arg0) {
    }

    @When("user clicks on {string} text")
    public void clicksOnText(String arg0, String arg1) {
    }

    @And("user clicks on {string} option")
    public void clicksOnOption(String arg0, String arg1) {
    }

    @And("user adds details of new department")
    public void addsDetailsOfNewDepartment(String arg0) {
    }

    @And("user clicks anywhere on pop-up window")
    public void clicksAnywhereOnPopUpWindow(String arg0) {
    }

    @And("user should see {string} and {string} buttons")
    public void shouldSeeAndButtons(String arg0, String arg1, String arg2) {
    }

    @And("user clicks {string} button")
    public void clicksButton(String arg0, String arg1) {
    }

    @Then("user added new department successfully")
    public void addedNewDepartmentSuccessfully(String arg0) {
    }

    @Given("user is logged in as Helpdesk user")
    public void isLoggedInAsHelpdeskUser(String arg0) {
    }

    @And("user clicks on {string} menu button")
    public void clicksOnMenuButton(String arg0, String arg1) {
    }

    @And("user is directed to the {string} page")
    public void isDirectedToThePage(String arg0, String arg1) {
    }

    @Then("user does not have {string} option")
    public void doesNotHaveOption(String arg0, String arg1) {
    }

    @Given("the user is logged in as a {string}>")
    public void theUserIsLoggedInAsA(String arg0) {
    }

    @And("user navigates to the {string} menu")
    public void userNavigatesToTheMenu(String arg0) {
    }

    @Then("user should see {string} page")
    public void userShouldSeePage(String arg0) {
    }
}
