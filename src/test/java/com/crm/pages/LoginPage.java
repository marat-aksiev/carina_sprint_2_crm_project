package com.crm.pages;


import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//input[@placeholder='Login']")
    public WebElement login;


    @FindBy(name = "//input[@placeholder='Password']")
    public WebElement password;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement loginButton;


    public void login(String loginStr, String passwordStr) {
        login.sendKeys(loginStr);
        password.sendKeys(passwordStr);
        loginButton.click();

    }
}



