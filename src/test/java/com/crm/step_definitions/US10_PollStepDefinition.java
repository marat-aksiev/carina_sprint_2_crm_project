package com.crm.step_definitions;

import com.crm.pages.PollPage;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US10_PollStepDefinition {


    public PollPage pollPage = new PollPage();
    Actions actions = new Actions(Driver.getDriver());

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @When("user clicks on poll button")
    public void user_clicks_on_poll_button() {
        pollPage.pollButton.click();
    }

    @When("user navigated to Allow multiple choice checkbox")
    public void user_navigated_to_allow_multiple_choice_checkbox() {
    }

    @Then("user should see All employees option by default")
    public void user_should_see_all_employees_option_by_default() {
        pollPage.allEmployeesButton.isDisplayed();
    }

    @When("user enters {string} in the title field")
    public void user_enters_in_the_title_field(String titleText) {
      //  WebElement iframe = Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']"));
       // Driver.getDriver().switchTo().frame(0);
      Driver.getDriver().switchTo().frame(pollPage.iframe);
        pollPage.textTitle.sendKeys(titleText);
        Driver.getDriver().switchTo().defaultContent();
    }

    @When("user enters a {string} text into the poll Question field")
    public void user_enters_a_text_into_the_poll_question_field(String question) {
        pollPage.questionField.sendKeys(question);
    }

    @And("user enters an answers into the {string} and {string} fields")
    public void userEntersAnAnswersIntoTheAndFields(String answer1, String answer2) {
        pollPage.answer1.sendKeys(answer1);
        pollPage.answer2.sendKeys(answer2);
    }

    @When("user clicks on SEND button")
    public void user_clicks_on_send_button() {
        pollPage.sendButton.click();
    }

    @Then("user sees the created poll in the Activity Stream")
    public void user_sees_the_created_poll_in_the_activity_stream() {
        pollPage.publishedPollTitle.isDisplayed();
        pollPage.publishedQuestion.isDisplayed();
        pollPage.publishedAnswer.isDisplayed();
    }

    @When("user clicks on it")
    public void user_clicks_on_it() {
        pollPage.allEmployeesButton.click();
    }

    @When("user clicks on Allow multiple choice option")
    public void user_clicks_on_Allow_multiple_choice_option() {
        pollPage.multipleChoiceCheckbox.click();
    }

    @Then("user is able to select Allow multiple choice option")
    public void user_is_able_to_select_allow_multiple_choice_option() {
        pollPage.multipleChoiceCheckbox.isSelected();
    }

    @When("user enters an answers into the {string} field")
    public void user_enters_an_answers_into_the_field(String answer1) {
        pollPage.answer1.sendKeys(answer1);
    }

    @When("user removes All employees option")
    public void user_removes_all_employees_option() {
        pollPage.removeAllEmployeesButton.click();
    }

    @Then("user sees an error message Please specify at least one person")
    public void user_sees_an_error_message_please_specify_at_least_one_person() {
        String expectedErrorAtLeastOnePerson = "Please specify at least one person.";
        Assert.assertEquals(expectedErrorAtLeastOnePerson, pollPage.errorMsgAtLeastOnePerson.getText());
    }

    @Then("user sees an error message The question text is not specified")
    public void user_sees_an_error_message_the_question_text_is_not_specified() {
        String expectedErrorTheQuestionHasNOAnswer = "The question text is not specified.";
        Assert.assertEquals(expectedErrorTheQuestionHasNOAnswer, pollPage.errorMsgTheQuestionIsNotSpecified.getText());
    }

    @Then("user sees an error message The message title is not specified")
    public void user_sees_an_error_message_the_message_title_is_not_specified() {
        pollPage.errorTheMsgTitleIsNotSpecified.isDisplayed();
    }

    @Then("user sees an error message The question {string} has no answers.")
    public void userSeesAnErrorMessageTheQuestionHasNoAnswers(String question) {
        String expectedErrorTHeQuestionHasNoAnswer = "The question \""+question+"\" has no answers.";
        Assert.assertEquals((pollPage.errorMsgTheQuestionHasNOAnswer.getText()), (expectedErrorTHeQuestionHasNoAnswer));

    }
}
