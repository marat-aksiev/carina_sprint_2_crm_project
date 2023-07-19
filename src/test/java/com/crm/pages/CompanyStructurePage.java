package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyStructurePage {

    public CompanyStructurePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css=".menu-item-link")
    public WebElement employeesMenu;

    @FindBy(id="pagetitle")
    public WebElement companyStructureHeader;

    @FindBy(xpath="//span[@class='webform-small-button-text']")
    public WebElement addDepartmentButton;

    // iframe
    @FindBy(xpath="//div[@id='BXStructure']")
    public WebElement popUpDepartmentForm;

    @FindBy(xpath="//a[@id='single-user-choice']")
    public WebElement selectFromStructure;

    @FindBy(xpath="//div[@class='finder-box-tabs']/span[2]//span[2]")
    public WebElement companyButton;

    @FindBy(xpath = "//div[@class='company-structure']")
    public WebElement getDropdown;

    @FindBy(xpath="//div[@class='company-department-arrow']")
    public WebElement dropdownButton;




}
