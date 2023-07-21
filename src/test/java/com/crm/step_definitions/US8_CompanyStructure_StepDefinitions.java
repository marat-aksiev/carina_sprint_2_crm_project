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

    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    CompanyStructurePage companyStructurePage = new CompanyStructurePage();

    // user navigates to the Employees menu in order to access Company Structure page
    @Given("user clicks on the Employees menu")
    public void userClicksOnTheEmployeesMenu() {
    //    BrowserUtils.clickWithJS(employeesMenu);
       companyStructurePage.employeesMenu.click();
    }

    // Company Structure header verification
    @Then("user sees {string} in the page header")
    public void userSeesInThePageHeader(String expectedText) {
        String actualHeaderText = companyStructurePage.companyStructureHeader.getText();
        Assert.assertEquals(actualHeaderText, expectedText);

    }

    @Then("user does not have add department option")
    public void doesNotHaveAddDepartmentOption(By by) {
        BrowserUtils.verifyElementNotDisplayed(By.xpath("//span[@class='webform-small-button-text']"));



    }

    // HR user navigates to the Add Department button
    @When("user navigates to the Add Department menu and clicks on the button")
    public void userNavigatesToTheAddDepartmentMenuAndClicksOnTheButton() {
        companyStructurePage.addDepartmentButton.click();
    }

    // HR user gets pop-up window to add new department
    @Then("user should see {string} pop-up window")
    public void userShouldSeeAddDepartmentPopUpWindow(String expectedHeaderTitle) {
        String actualHeaderTitleText = companyStructurePage.popUpDepartmentForm.getText();
        Assert.assertEquals(actualHeaderTitleText, expectedHeaderTitle);
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





}
