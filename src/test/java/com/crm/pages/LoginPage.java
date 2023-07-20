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


    @FindBy(name = "USER_LOGIN")
    public WebElement login;


    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    @FindBy(css = ".errortext")
    public WebElement errorMessage;

    @FindBy(id = "USER_REMEMBER")
    public  WebElement rememberMeCheckBox;







    public void login(String loginStr, String passwordStr) {
        login.sendKeys(loginStr);
        password.sendKeys(passwordStr);
        loginButton.click();


    }
}



