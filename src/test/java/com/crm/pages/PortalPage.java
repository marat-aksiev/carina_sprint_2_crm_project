package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PortalPage {
    public PortalPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(tagName = "body")
    public WebElement messageTextArea;
    public void enterToMessageTextArea(){
        Driver.getDriver().switchTo().frame(0);
    }
    @FindBy(xpath = "//span[@title='link']")
    public WebElement linkBtn;
    @FindBy(xpath = "//input[@placeholder='Link URL']")
    public WebElement linkTextInput;
    @FindBy(xpath = "//input[@id='undefined']")
    public WebElement saveBtn;
}
