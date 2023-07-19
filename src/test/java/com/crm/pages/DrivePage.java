package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DrivePage extends BasePage{
    public DrivePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='main-buttons-item-text-title'][normalize-space()='My Drive']")
   private WebElement MyDriveModule;
    @FindBy(xpath = "//span[contains(text(),'All Documents')]")
    private WebElement AllDocumentsModule;
    @FindBy(xpath = "//span[contains(text(),'Company Drive')]")
    private WebElement CompanyDriveModule;
    @FindBy(xpath = "//span[contains(text(),'Sales and Marketing')]")
    private WebElement SalesAndMarketingModuleModule;
    @FindBy(xpath = "//a[@href='/docs/manage/']//span[@class='main-buttons-item-text']//span[@class='main-buttons-item-text-title']")
    private WebElement TopManagementsAndMarketingDocumentsModule;
    @FindBy(xpath = "//span[contains(text(),'Drive Cleanup')]")
    private WebElement DriveCleanUpModule;
}
