package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendMessage extends BasePage  {

    @FindBy(xpath = "//span[text()='Message']")
    public WebElement messageTab;
    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement messageField;
@FindBy(xpath = "//div[@id='feed-add-post-destination-container']")
    public  WebElement employeeInputBox;
@FindBy(xpath = "//a[@id='bx-destination-tag']")
    public WebElement addEmployee;
    @FindBy(xpath = "//a[@id='destination5446536_last_UA']")
    public WebElement availableEmployee;
    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendBtn;
}
