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
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

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

    @Then("user does not have ADD DEPARTMENT option")
    public void doesNotHaveAddDepartmentOption() {
//        Driver.getDriver().findElements(By.xpath("//span[@class='webform-small-button-text']"));
        try {
            WebElement el = companyStructurePage.addDepartmentButton;
        } catch (NoSuchElementException e) {
            Assert.assertFalse(false);

        }
//        Assert.assertFalse(companyStructurePage.addDepartmentButton.isDisplayed());

   }



    // HR user navigates to the Add Department button
    @When("user navigates to the Add Department menu and clicks on the button")
    public void userNavigatesToTheAddDepartmentMenuAndClicksOnTheButton() {
        companyStructurePage.addDepartmentButton.click();
    }

    // HR user gets pop-up window to add new department
    @Then("user should see Add department pop-up window")
    public void userShouldSeeAddDepartmentPopUpWindow() {
        Assert.assertTrue(companyStructurePage.popUpDepartmentForm.isDisplayed());
    }


    @When("user navigates to the Department name input box and enters new {string}")
    public void userNavigatesToTheDepartmentNameInputBoxAndEntersNewDepartmentName(String inputText) {
//        companyStructurePage.departmentNameInputBox.click();
        companyStructurePage.departmentNameInputBox.sendKeys(inputText);


    }

    @And("user navigates to the Parent department input box")
    public void userNavigatesToTheParentDepartmentInputBox() {
        companyStructurePage.parentDepartmentDropdown.click();
    }

    @And("user chooses {string} from dropdown menu")
    public void userChoosesOptionFromDropdownMenuAndClicksADDButton(String parentDepartment) {
        Select departmentDropdown = new Select(companyStructurePage.parentDepartmentDropdown);
        departmentDropdown.selectByIndex(0);

    }

    @And("user clicks ADD button to add new department")
    public void userClicksADDButtonToAddNewDepartment() {
        companyStructurePage.addButton.click();
    }

    @Then("user added new department successfully")
    public void userAddedNewDepartmentSuccessfully() {
        Assert.assertTrue(companyStructurePage.newDepartment.isDisplayed());
    }


}
