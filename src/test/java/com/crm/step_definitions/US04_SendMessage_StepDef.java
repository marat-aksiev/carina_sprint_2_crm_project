package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.pages.SendMessage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US04_SendMessage_StepDef {
    SendMessage sendMessage=new SendMessage();


    @Given("the user is logged in first scenario {string}")
    public void theUserIsLoggedInFirstScenario(String userType) {



        String username = null;
        String password = null;

        if (userType.equalsIgnoreCase("Help Desk")) {
            username = ConfigurationReader.getProperty("helpdesk_username");
            password = ConfigurationReader.getProperty("helpdesk_password");
        } else if (userType.equalsIgnoreCase("HR")) {
            username = ConfigurationReader.getProperty("hr_username");
            password = ConfigurationReader.getProperty("hr_password");
        } else if (userType.equalsIgnoreCase("Marketing")) {
            username = ConfigurationReader.getProperty("marketing_username");
            password = ConfigurationReader.getProperty("marketing_password");
        }
        //send username and password and login
        new LoginPage().login(username, password);
    }

    @When("user navigates to  message tab")
    public void userNavigatesToMessageTab() {

        sendMessage.messageTab.click();
        Assert.assertTrue(sendMessage.messageTab.isDisplayed());
    }

    @When("user enters {string} in  message content field")
    public void user_enters_in_message_content_field(String textMessage) {
        textMessage="Hello world";

        Driver.getDriver().switchTo().frame(sendMessage.iframe);
        sendMessage.inputField.sendKeys(textMessage);
        String actualmessageText=sendMessage.inputField.getText();
        String expectedMessageText=textMessage;
        Assert.assertEquals(actualmessageText,expectedMessageText);
        Driver.getDriver().switchTo().defaultContent();




    }

    @And("user clicks in the Recipient field on {string}")
    public void userClicksInTheRecipientFieldOn(String recipientOptions) {
        sendMessage.employeeInputBox.click();
        //Assert.assertTrue(sendMessage.employeeInputBox.isEnabled());

    }

    @When("user adds the recipient from available options in the tooltip")
    public void user_adds_the_recipient_from_available_options_in_the_tooltipg() {
        sendMessage.addEmployee.click();
        Assert.assertTrue(sendMessage.addEmployee.isEnabled());

    }

    @Then("user clicks the Send button and should be able to send the message")
    public void userClicksTheSendButtonAndShouldBeAbleToSendTheMessage() {

        sendMessage.sendBtn.click();
        Assert.assertTrue(sendMessage.sendBtn.isEnabled());
    }

    @Given("the user is logged in second scenario {string}")
    public void theUserIsLoggedInSecondScenario(String userType) {



        String username = null;
        String password = null;

        if (userType.equalsIgnoreCase("Help Desk")) {
            username = ConfigurationReader.getProperty("helpdesk_username");
            password = ConfigurationReader.getProperty("helpdesk_password");
        } else if (userType.equalsIgnoreCase("HR")) {
            username = ConfigurationReader.getProperty("hr_username");
            password = ConfigurationReader.getProperty("hr_password");
        } else if (userType.equalsIgnoreCase("Marketing")) {
            username = ConfigurationReader.getProperty("marketing_username");
            password = ConfigurationReader.getProperty("marketing_password");
        }
        //send username and password and login
        new LoginPage().login(username, password);
    }

    @When("user navigates to the Message tab and clicks on it")
    public void userNavigatesToTheMessageTabAndClicksOnIt() {
        sendMessage.messageTab.click();
        BrowserUtils.verifyElementDisplayed(sendMessage.messageTab);
    }


    @When("user leaves the Message field empty and  clicks  send button")
    public void userLeavesTheMessageFieldEmptyAndClicksSendButton() {

        Driver.getDriver().switchTo().frame(sendMessage.iframe);
        Assert.assertTrue(sendMessage.inputField.isDisplayed());
        Driver.getDriver().switchTo().defaultContent();
        sendMessage.sendBtn.click();
        //BrowserUtils.verifyElementDisplayed(sendMessage.sendBtn);
    }
    @Then("user should be able to see the error message {string}")
    public void userShouldBeAbleToSeeTheErrorMessage(String arg0) {
        String expectedTitleErrorMessage="The message title is not specified";
        String actualTitleErrorMessage=sendMessage.messageTitleError.getText();
        Assert.assertEquals(actualTitleErrorMessage,expectedTitleErrorMessage);
    }

    @Given("the user is logged in  third scenario {string}")
    public void theUserIsLoggedInThirdScenario(String userType) {



        String username = null;
        String password = null;

        if (userType.equalsIgnoreCase("Help Desk")) {
            username = ConfigurationReader.getProperty("helpdesk_username");
            password = ConfigurationReader.getProperty("helpdesk_password");
        } else if (userType.equalsIgnoreCase("HR")) {
            username = ConfigurationReader.getProperty("hr_username");
            password = ConfigurationReader.getProperty("hr_password");
        } else if (userType.equalsIgnoreCase("Marketing")) {
            username = ConfigurationReader.getProperty("marketing_username");
            password = ConfigurationReader.getProperty("marketing_password");
        }
        //send username and password and login
        new LoginPage().login(username, password);
    }

    @When("user navigates to the Message tab and clicks on")
    public void userNavigatesToTheMessageTabAndClicksOn() {
        sendMessage.messageTab.click();
        BrowserUtils.verifyElementDisplayed(sendMessage.messageTab);
        //Assert.assertTrue(sendMessage.messageTab.isDisplayed());
    }

    @When("user leaves the Recipient input box empty by clicking x button")
    public void userLeavesTheRecipientInputBoxEmptyByClickingXButton() {
        sendMessage.employeeInputBox.click();
     sendMessage.xButton.click();
    //Assert.assertTrue(sendMessage.xButton.isEnabled());
    }

    @And("user clicks a send button")
    public void userClicksASendButton() {
        sendMessage.sendBtn.click();
        Assert.assertTrue(sendMessage.sendBtn.isEnabled());
    }

    @Then("user should be able to see the error Message {string} after clicking send button")
    public void userShouldBeAbleToSeeTheErrorMessageAfterClickingSendButton(String arg0) {
        String expectedTitleErrorMessage="Please specify at least one person.";
        String actualTitleErrorMessage=sendMessage.recipientErrorMsg.getText();
        Assert.assertEquals(actualTitleErrorMessage,expectedTitleErrorMessage);
    }

    @Given("the user is logged in  forth scenario {string}")
    public void theUserIsLoggedInForthScenario(String userType) {



        String username = null;
        String password = null;

        if (userType.equalsIgnoreCase("Help Desk")) {
            username = ConfigurationReader.getProperty("helpdesk_username");
            password = ConfigurationReader.getProperty("helpdesk_password");
        } else if (userType.equalsIgnoreCase("HR")) {
            username = ConfigurationReader.getProperty("hr_username");
            password = ConfigurationReader.getProperty("hr_password");
        } else if (userType.equalsIgnoreCase("Marketing")) {
            username = ConfigurationReader.getProperty("marketing_username");
            password = ConfigurationReader.getProperty("marketing_password");
        }
        //send username and password and login
        new LoginPage().login(username, password);
    }

    @When("user clicks on  message tab")
    public void userClicksOnMessageTab() {
        sendMessage.messageTab.click();
        BrowserUtils.verifyElementDisplayed(sendMessage.messageTab);
    }

    @Then("{string} input text displays in the Recipient field by default")
    public void inputTextDisplaysInTheRecipientFieldByDefault(String byDefault) {
       String expectedByDefault=byDefault;
       String actualByDefault=sendMessage.recipientsByDefault.getText();
       Assert.assertEquals(actualByDefault,expectedByDefault);
    }

    @Given("the user is logged in  fifth scenario {string}")
    public void theUserIsLoggedInFifthScenario(String userType) {

        String username = null;
        String password = null;

        if (userType.equalsIgnoreCase("Help Desk")) {
            username = ConfigurationReader.getProperty("helpdesk_username");
            password = ConfigurationReader.getProperty("helpdesk_password");
        } else if (userType.equalsIgnoreCase("HR")) {
            username = ConfigurationReader.getProperty("hr_username");
            password = ConfigurationReader.getProperty("hr_password");
        } else if (userType.equalsIgnoreCase("Marketing")) {
            username = ConfigurationReader.getProperty("marketing_username");
            password = ConfigurationReader.getProperty("marketing_password");
        }
        //send username and password and login
        new LoginPage().login(username, password);
    }

    @When("user clicks on a message field and enters {string} in the message field")
    public void userClicksOnAMessageFieldAndEntersInTheMessageField(String textMessage) {
        textMessage="Hello world";

        Driver.getDriver().switchTo().frame(sendMessage.iframe);
        sendMessage.inputField.sendKeys(textMessage);
        String actualmessageText=sendMessage.inputField.getText();
        String expectedMessageText=textMessage;
        Assert.assertEquals(actualmessageText,expectedMessageText);
        Driver.getDriver().switchTo().defaultContent();

    }

    @When("user clicks on the cancel button")
    public void userClicksOnTheCancelButton() {
        sendMessage.cancelButton.click();
        Assert.assertTrue(sendMessage.cancelButton.isEnabled());
    }
    @Then("user should be able to cancel sending message successfully")
    public void userShouldBeAbleToCancelSendingMessageSuccessfully() {

        BrowserUtils.verifyElementDisplayed(sendMessage.backToStream);
    }



}

