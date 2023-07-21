package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppreciationPage {


    public AppreciationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@id='feed-add-post-form-link-text']")
    public WebElement moreTab;
    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[2]")
    public WebElement appreciationTab;
    @FindBy (xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement allEmployeesClose;

    @FindBy(xpath = "//input[@id='feed-add-post-destination-input']")
    public WebElement to;
    @FindBy(tagName = "body")
    public WebElement msgTexBox;

    @FindBy(xpath = "//div[@id='feed-add-post-destination-container']")
    public WebElement enterTo;
    @FindBy(xpath = "//div[@class='feed-post-title-block']//a[@id='bp_326']")
    public WebElement lastSender;

    @FindBy(xpath = "//div[@class='feed-post-title-block']//a[@class='feed-add-post-destination-new']")
    public WebElement lastAddressee;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframe;
    @FindBy(xpath = "//div[@id='blog_post_outer_337']//div[@class='feed-post-text-block-inner-inner']")
    public WebElement lastSentMsg;

    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement moreLink;

    @FindBy(xpath = "//span[@class='menu-popup-item menu-popup-no-icon feed-add-post-form-grat feed-add-post-form-grat-more ']")                   //(id = "feed-add-post-form-tab-grat")
    public WebElement appreciationButton;




    @FindBy(xpath = "//input[@name='bxu_files[]']") //Sucharita
    public WebElement uploadFilesImagesBtn;

    @FindBy(xpath = "(//span[.='Insert in text'])[2]")//Sucharita
    public WebElement insertInText;

    @FindBy(xpath = "//span[@class='del-but']") //Sucharita
    public WebElement xBtn;


}

