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

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    WebElement employeesMenu;
    @Given("user navigates to the Employees menu and clicks on it")
    public void userNavigatesToTheEmployeesMenuAndClicksOnIt() {
        js.executeScript("arguments[0].scrollIntoView(true)", employeesMenu);
        employeesMenu.click();
    }

    @When("user navigates to the Add Department menu and clicks on the button")
    public void userNavigatesToTheAddDepartmentMenuAndClicksOnTheButton() {
        WebElement addDepartmentButton  = Driver.getDriver().findElement();
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
