package com.crm.step_definitions;


import com.crm.pages.CompanyPage;
import com.crm.pages.LoginPage;
import com.crm.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US14_CompanyPage_StepDefs {
    @When("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {

        String username =null;
        String password =null;

        if(userType.equalsIgnoreCase("Help Desk")){
            username = ConfigurationReader.getProperty("helpdesk_username");
            password = ConfigurationReader.getProperty("helpdesk_password");
        }else if(userType.equalsIgnoreCase("HR")){
            username = ConfigurationReader.getProperty("hr_username");
            password = ConfigurationReader.getProperty("hr_password");
        }else if(userType.equalsIgnoreCase("Marketing")){
            username = ConfigurationReader.getProperty("marketing_username");
            password = ConfigurationReader.getProperty("marketing_password");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }
    @And("the user click on the {string}")
    public void theUserClickOn(String pageName) {
        if(pageName.equalsIgnoreCase( "Company")){
            new CompanyPage().ClickOnPage();

        }
    }
    @Then("the user verified that the title is equal to {string}")
    public void theUserVerifiedThatTheIsEqualTo(String pageName) {
        String expectedTitle = new CompanyPage().titleVerification(pageName);
     if (expectedTitle.equals(pageName)){
         System.out.println("TITLE IS VERIFIED AS "+pageName);
     }


    }
}
