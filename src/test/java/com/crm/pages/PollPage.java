package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PollPage extends BasePage {

    public PollPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Poll']")
    public WebElement pollButton;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement textTitle;

    @FindBy(xpath = "//input[@id='question_0']")
    public WebElement questionField;

    @FindBy(xpath = "//input[@placeholder='Answer  1']")
    public WebElement answer1;

    @FindBy(xpath = "//input[@placeholder='Answer  2']")
    public WebElement answer2;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//input[@id ='multi_0']")
    public WebElement multipleChoiceCheckbox;

    @FindBy(xpath = "//span[text() ='All employees']")
    public WebElement allEmployeesButton;

    @FindBy(xpath = "//span[@class ='feed-add-post-del-but']")
    public WebElement removeAllEmployeesButton;

    @FindBy(xpath = "//div[text() ='Programming Language']")
    public WebElement publishedPollTitle;

    @FindBy(xpath = "//div[text() ='What language to learn?']")
    public WebElement publishedQuestion;

    @FindBy(xpath = "//label[text() ='Java']")
    public WebElement publishedAnswer;

    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement errorMsgAtLeastOnePerson;

    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement errorMsgTheQuestionIsNotSpecified;

    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement errorMsgTheQuestionHasNOAnswer;

    @FindBy(xpath = "//span[text()='The message title is not specified']")
    public WebElement errorTheMsgTitleIsNotSpecified;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframe;


}
