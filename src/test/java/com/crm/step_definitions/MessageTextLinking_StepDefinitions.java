package com.crm.step_definitions;

import com.crm.pages.PortalPage;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class MessageTextLinking_StepDefinitions {
    PortalPage portalPage = new PortalPage();
    Actions actions = new Actions(Driver.getDriver());
    @When("user clicks on MESSAGE text area")
    public void user_clicks_on_message_text_area() {
        portalPage.enterToMessageTextArea();
        portalPage.messageTextArea.click();
    }

    @When("enters the {string}")
    public void enters_the(String text) {
        portalPage.messageTextArea.sendKeys(text);
    }

    @When("double-clicks on the entered text")
    public void double_clicks_on_the_entered_text() {
        actions.doubleClick(portalPage.messageTextArea).perform();
    }

    @When("clicks link button")
    public void clicks_link_button() {
        portalPage.linkBtn.click();
    }

    @When("enters link {string}")
    public void enters_link(String address) {
        Driver.getDriver().switchTo().defaultContent();
        portalPage.linkTextInput.sendKeys(address);
    }

    @When("clicks Save button")
    public void clicks_save_button() {
        portalPage.saveBtn.click();
    }

    @Then("the link address is attached to the text")
    public void the_link_address_is_attached_to_the_text() {

    }
}