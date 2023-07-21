package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PollPage extends BasePage{

    @FindBy(xpath = "//span[text()='Poll']")
    public WebElement pollButton;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
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

}
