package com.crm.step_definitions;

import com.crm.pages.CompanyStructurePage;
import com.crm.pages.LoginPage;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class US07_CompanyStructure_StepDefs {
    CompanyStructurePage companyStructurePage = new CompanyStructurePage();
    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @When("user clicks on Employees menu on login page")
    public void user_clicks_on_employees_menu_on_login_page() {
        companyStructurePage.employeesTab.click();
    }
    @Then("Following options are accessible on company structure page")
    public void following_options_are_accessible_on_company_structure_page(List<String> companyTab) {

    }


    @Then("on the Company structure page user sees {string}")
    public void onTheCompanyStructurePageUserSees(String arg0) {

    }
}
