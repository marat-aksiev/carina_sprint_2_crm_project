package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PortalPage {
    public PortalPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(tagName = "body")
    public WebElement messageTextArea;

    public void enterToMessageTextArea() {
        sendMsgArea.click();
        Driver.getDriver().switchTo().frame(frame);
    }

    @FindBy(xpath = "//button[@id='blog-submit-button-draft']")
    public WebElement saveAsDraftBtn;
    @FindBy(xpath = "//a[@title='Edit']")
    public WebElement editBtn;
    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement frame;
    @FindBy(xpath = "//div[@id='microoPostFormLHE_blogPostForm_inner']")
    public WebElement sendMsgArea;
    @FindBy(xpath = "//span[@title='Link']")
    public WebElement linkBtn;
    @FindBy(xpath = "//input[@placeholder='Link URL']")
    public WebElement linkTextInput;
    @FindBy(xpath = "//input[@id='undefined']")
    public WebElement saveBtn;
    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendBtn;
}
