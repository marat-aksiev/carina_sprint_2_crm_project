package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US04_SendMessage_StepDef{
    @Given("the user is logged in  as {string}")
    public void theUserIsLoggedInAs(String userType) {


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

    @When("user clicks   message field")
    public void user_clicks_message_field() {

    }

    @When("user enters {string} in  message content field")
    public void user_enters_in_message_content_field(String string) {

    }

    @And("And user clicks in the Recipient field on {string}")
    public void andUserClicksInTheRecipientFieldOn(String arg0) {
    }

    @When("user adds the recipient from available options in the tooltip")
    public void user_adds_the_recipient_from_available_options_in_the_tooltipg( ) {

    }

    @And("user clicks the Send button")
    public void userClicksTheSendButton() {
    }


    @Then("user should be able to send the message")
    public void user_should_be_able_to_send_the_message() {

    }

    @Then("the message is successfully sent to the selected group of recipients")
    public void the_message_is_successfully_sent_to_the_selected_group_of_recipients() {

    }

    @When("user navigates to the Message tab and clicks on it")
    public void userNavigatesToTheMessageTabAndClicksOnIt() {
    }

    @When("user leaves the Message field empty")
    public void userLeavesTheMessageFieldEmpty() {
    }

    @And("user clicks  send button")
    public void userClicksSendButton() {
    }

    @Then("Then user should be able to see the error message {string}")
    public void thenUserShouldBeAbleToSeeTheErrorMessage(String arg0) {
    }

    @When("user navigates to the Message tab")
    public void userNavigatesToTheMessageTab() {
    }

    @And("user clicks on it")
    public void userClicksOnIt() {
    }

    @When("user leaves the Recipient input box empty")
    public void userLeavesTheRecipientInputBoxEmpty() {
    }

    @And("user clicks a send button")
    public void userClicksASendButton() {
    }

    @Then("user should be able to see the error Message {string} after clicking send button")
    public void userShouldBeAbleToSeeTheErrorMessageAfterClickingSendButton(String arg0) {

    }
    @When("user clicks on  message tab")
    public void userClicksOnMessageTab() {
    }
    @Then("{string} input text displays in the Recipient field by default")
    public void inputTextDisplaysInTheRecipientFieldByDefault(String arg0) {
    }

    @When("user clicks on  message field")
    public void userClicksOnMessageField() {
    }
    @And("user enters {string} in the message field")
    public void userEntersInTheMessageField(String arg0) {
    }

    @When("user clicks on the cancel button")
    public void userClicksOnTheCancelButton() {
    }

    @Then("Message tab is clickable")
    public void messageTabIsClickable() {
    }

    @And("entered text is shown in the message field")
    public void enteredTextIsShownInTheMessageField() {
    }

    @Then("user should be able to cancel sending message successfully")
    public void userShouldBeAbleToCancelSendingMessageSuccessfully() {
    }


    @When("user enters valid credentials")
    public void userEntersValidCredentials() {
    }

    @Then("user should be able to log in")
    public void userShouldBeAbleToLogIn() {
    }

    @When("user clicks message field")
    public void userClicksMessageField() {
    }


    @When("user clicks on a message field")
    public void userClicksOnAMessageField() {
    }


}










