package com.crm.pages;


import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage {

    public CompanyPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//a[@title='Company']")
    public WebElement companyPage;

    @FindBy(id="pagetitle")
    public WebElement expectedTitle;
    public void ClickOnPage(){
        companyPage.click();
    }

    public String titleVerification(String title){
       title =  expectedTitle.getText();
       return  title;
    }

}
