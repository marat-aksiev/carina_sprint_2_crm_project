package com.crm.step_definitions;

import com.crm.pages.CompanyStructurePage;
import com.crm.pages.LoginPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US8_CompanyStructure_StepDefinitions {

    CompanyStructurePage companyStructurePage = new CompanyStructurePage();
    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));


    WebElement employeesMenu;
    @Given("user navigates to the Employees menu and clicks on it")
    public void userNavigatesToTheEmployeesMenuAndClicksOnIt() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)", employeesMenu);
        employeesMenu.click();
    }

    @When("user navigates to the Add Department menu and clicks on the button")
    public void userNavigatesToTheAddDepartmentMenuAndClicksOnTheButton() {
        companyStructurePage.addDepartmentButton.click();
    }

    @Then("user should see Add department pop-up window")
    public void userShouldSeeAddDepartmentPopUpWindow() {
        companyStructurePage.popUpDepartmentForm.getText();


    }

    @When("user clicks on Select from structure text")
    public void userClicksOnSelectFromStructureText() {
        companyStructurePage.selectFromStructure.click();
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

    @When("user is directed to the {string} page")
    public void userIsDirectedToTheCompanyStructurePage(String expectedText) {
        String actualHeaderText = companyStructurePage.companyStructureHeader.getText();
        Assert.assertEquals(actualHeaderText, expectedText);

    }

    @When("{string} is directed to the Company Structure page")
    public void isDirectedToTheCompanyStructurePage(String expectedText) {
        String actualHeaderText = companyStructurePage.companyStructureHeader.getText();
        Assert.assertEquals(actualHeaderText, expectedText);
    }

    @Then("{string} does not have Add Department option")
    public void doesNotHaveAddDepartmentOption(String arg0) {
    }

    @Then("{string} should see Company Structure page")
    public void shouldSeeCompanyStructurePage(String arg0) {
    }
}
