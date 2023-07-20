package com.crm.step_definitions;

import com.crm.pages.CompanyStructurePage;
import com.crm.pages.LoginPage;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US8_CompanyStructure_StepDefinitions {

    CompanyStructurePage companyStructurePage = new CompanyStructurePage();
    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

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

    WebElement employeesMenu;
    @Given("user navigates to the Employees menu and clicks on it")
    public void userNavigatesToTheEmployeesMenuAndClicksOnIt() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)", employeesMenu);
        employeesMenu.click();
    }

    @When("user navigates to the Add Department menu and clicks on the button")
    public void userNavigatesToTheAddDepartmentMenuAndClicksOnTheButton() {

    }

    @Then("user should see Add department pop-up window")
    public void userShouldSeeAddDepartmentPopUpWindow() {
    }

    @When("user clicks on Select from structure text")
    public void userClicksOnSelectFromStructureText() {
    }

    @And("user clicks on Company option")
    public void userClicksOnCompanyOption() {
    }

    @Then("user adds details of new department")
    public void userAddsDetailsOfNewDepartment() {
    }

    @When("user clicks anywhere on pop-up window")
    public void userClicksAnywhereOnPopUpWindow() {
    }

    @And("user should see ADD and CLOSE buttons")
    public void userShouldSeeADDAndCLOSEButtons() {
    }

    @And("user clicks ADD button")
    public void userClicksADDButton() {
    }

    @Then("user added new department successfully")
    public void userAddedNewDepartmentSuccessfully() {
    }

    @When("user is directed to the Company Structure page")
    public void userIsDirectedToTheCompanyStructurePage() {
    }

    @Then("user does not have Add Department option")
    public void userDoesNotHaveAddDepartmentOption() {
    }

    @Then("user should see Company Structure page")
    public void userShouldSeeCompanyStructurePage() {
    }
}
