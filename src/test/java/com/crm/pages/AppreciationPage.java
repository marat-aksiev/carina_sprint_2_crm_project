package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppreciationPage {
    public AppreciationPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

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