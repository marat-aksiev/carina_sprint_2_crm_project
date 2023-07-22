package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProfilePage extends BasePage {

    @FindBy(id = "user-name")
    public WebElement profileNameButton;

    @FindBy(xpath = "//div[@class='menu-popup-items']/*/span[.='My Profile']")
    public WebElement myProfileButton;

    @FindBy(xpath = "//div[@id='profile-menu-filter']/a")
    public List<WebElement> profileOptions;

    @FindBy(xpath = "//table[@class='user-profile-block']//tr[2]/td[.='E-Mail:']/following-sibling::td/a")
    public WebElement email;

    public WebElement getProfileMenuItem(ProfileMenuItems menuItem) {
        String[] menuItemNames = {
                "My Profile",
                "Edit Profile Settings",
                "Themes",
                "Configure notifications",
                "Log out"};
        String menuItemName = menuItemNames[menuItem.ordinal()];
        return getProfileMenuItem(menuItemName);
    }

    public WebElement getProfileMenuItem(String menuItemName) {
        String menuItemXpath = "//div[@class='menu-popup-items']/*/span[.='" + menuItemName + "']";
        return Driver.getDriver().findElement(By.xpath(menuItemXpath));
    }

}
