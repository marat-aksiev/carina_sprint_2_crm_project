package com.crm.step_definitions;

import com.crm.pages.ProfileMenuItems;
import com.crm.pages.ProfilePage;
import com.crm.utilities.CrmUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.stream.Collectors;

import static com.crm.utilities.BrowserUtils.waitForClickablility;

public class US03_ProfilePage_StepDefs {


    private ProfilePage page = new ProfilePage();

    @When("the user clicks profile menu item {word}")
    public void theUserClicksProfileMenuItem(String menuItem) {
        page.profileNameButton.click();
        ProfileMenuItems menuItemEnum = ProfileMenuItems.valueOf(menuItem);
        page.getProfileMenuItem(menuItemEnum).click();
    }

    @When("the user clicks profile menu item named {string}")
    public void theUserClicksProfileMenuItemNamed(String menuItem) {
        page.profileNameButton.click();
        page.getProfileMenuItem(menuItem).click();
    }

    @Then("Following options are accessible on profile page")
    public void followingOptionsAreAccessibleOnProfilePage(List<String> expectedOptions) {
        page.profileOptions.stream().forEach(each -> waitForClickablility(each, 10));
        List<String> actualOptions = page.profileOptions.stream().map(each -> each.getText()).collect(Collectors.toList());

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
