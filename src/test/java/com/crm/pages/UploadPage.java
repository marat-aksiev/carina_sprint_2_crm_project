package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadPage {
    public UploadPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[text()='Message']")
    public WebElement messageBtn;

    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement uploadBtn;

    @FindBy(xpath = "//input[@name='bxu_files[]']")
    public WebElement uploadFilesImagesBtn;
    @FindBy(xpath = "(//span[.='Insert in text'])[2]")
    public WebElement insertInText;

    @FindBy(xpath = "//span[@class='del-but']")
    public WebElement xBtn;
}
