package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"user-name\"]")
    public WebElement usernameButton;
}
