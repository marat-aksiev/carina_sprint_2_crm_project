package com.crm.step_definitions;

import com.crm.pages.LogoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US02_Logout_StepDefs {

    LogoutPage logoutPage = new LogoutPage();

    @When("user click on the profile name")
    public void userClickOnTheProfileName() {
        logoutPage.usernameButton.click();
    }

    @And("user clicks Log Out button")
    public void userClicksLogOutButton() {

    }

    @Then("user can see login page")
    public void userCanSeeLoginPage() {
    }

    @Then("user can see five options under profile name")
    public void userCanSeeOptionsUnderProfileName(int arg0) {
    }
}
