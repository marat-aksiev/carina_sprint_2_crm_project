package com.crm.step_definitions;

import com.crm.pages.ProfilePage;
import com.crm.utilities.CrmUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;
import java.util.stream.Collectors;

import static com.crm.utilities.BrowserUtils.waitForClickablility;

public class US03_ProfilePage_StepDefs {


    private ProfilePage page = new ProfilePage();

    @And("the user opened profile page")
    public void theUserOpenedProfilePage() {
        page.profileNameButton.click();
        page.myProfileButton.click();
    }

    @Then("Following options are accessible on profile page")
    public void followingOptionsAreAccessibleOnProfilePage(List<String> expectedOptions) {
        page.profileOprions.stream().forEach(each -> waitForClickablility(each, 10));
        List<String> actualOptions = page.profileOprions.stream().map(each -> each.getText()).collect(Collectors.toList());

        Assert.assertEquals(expectedOptions,actualOptions);
    }

    @Then("the email address under the General tab is {string}")
    public void theEmailAddressUnderTheGeneralTabIs(String expectedEmail) {
        String actualEmail = page.email.getText();
        String actualEmailLink = page.email.getAttribute("href");
        String expectedEmailLink = "mailto:"+expectedEmail;

        Assert.assertEquals(actualEmail,expectedEmail);
        Assert.assertEquals(actualEmailLink,expectedEmailLink);
    }

    @Then("the email address under the General tab is email for user role {string}")
    public void theEmailAddressUnderTheGeneralTabIsEmailForUserRole(String userRole) {
        String email= CrmUtils.getUserNameByRole(userRole);
        theEmailAddressUnderTheGeneralTabIs(email);
    }
}
