package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendMessage extends BasePage  {

    @FindBy(xpath = "//span[text()='Message']")
    public WebElement messageTab;
    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframe;
    @FindBy(xpath = "//body[@contenteditable='true']")

    public WebElement  inputField;
@FindBy(xpath = "//div[@id='feed-add-post-destination-container']")
    public  WebElement employeeInputBox;
@FindBy(xpath = "//div[@class='feed-add-post-destination-wrap']")
    public WebElement addEmployee;
    @FindBy(xpath = "//span[@class='bx-finder-groupbox-content']")
    public WebElement availableEmployee;
    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendBtn;
    @FindBy(xpath = "//span[text()='The message title is not specified']")
    public WebElement messageTitleError;

    @FindBy(xpath ="//span[@class='feed-add-post-del-but']")
    public  WebElement xButton;

    @FindBy(xpath ="//span[text()='Please specify at least one person.']" )
    public WebElement recipientErrorMsg;
    @FindBy(xpath = "//span[@class='feed-add-post-destination-text']")
    public WebElement recipientsByDefault;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelButton;

    @FindBy(xpath = "//div[@id='pagetitle']")
    public WebElement backToStream;

}
