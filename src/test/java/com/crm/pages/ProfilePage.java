package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProfilePage extends BasePage {

    @FindBy(id = "user-name")
    public WebElement profileNameButton;

    @FindBy(xpath = "//div[@class='menu-popup-items']/a/span[.='My Profile']")
    public WebElement myProfileButton;

    @FindBy(xpath = "//div[@id='profile-menu-filter']/a")
    public List<WebElement> profileOprions;

    @FindBy(xpath = "//table[@class='user-profile-block']//tr[2]/td[.='E-Mail:']/following-sibling::td/a")
    public WebElement email;

}
