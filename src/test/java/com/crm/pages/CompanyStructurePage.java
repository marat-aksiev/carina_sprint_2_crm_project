package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CompanyStructurePage extends BasePage{

    public CompanyStructurePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//a[@title='Employees']")
    public WebElement employeesMenu;

    @FindBy(xpath="//span[@id='pagetitle']")
    public WebElement companyStructureHeader;

    @FindBy(xpath="//span[@class='webform-small-button-text']")
    public WebElement addDepartmentButton;

    // iframe
    @FindBy(xpath="//div[@id='BXStructure']")
    public WebElement popUpDepartmentForm;

//    @FindBy(xpath="//a[@id='single-user-choice']")
//    public WebElement selectFromStructure;


//    @FindBy(xpath="//div[@class='finder-box-tabs']/span[2]//span[2]")
//    public WebElement companyButton;
//
//    // dropdown
//    @FindBy(xpath = "//div[@class='company-structure']")
//    public WebElement getDropdown;
//
//    @FindBy(xpath="//div[@class='company-department-arrow']")
//    public WebElement dropdownButton;

    @FindBy(xpath="//input[@id='NAME']")
    public WebElement departmentNameInputBox;

    @FindBy(xpath="//select[@id='IBLOCK_SECTION_ID']")
    public WebElement parentDepartmentDropdown;


    @FindBy(xpath="//select[@id='IBLOCK_SECTION_ID']/option[6]")
    public WebElement parentDepartmentDropdownOption;

    @FindBy(xpath="//div[@class = 'popup-window-buttons']/span[.='Add']")
    public WebElement addButton;

    @FindBy(xpath="//span[@id='bx_str_149']")
    public WebElement newDepartment;





}
