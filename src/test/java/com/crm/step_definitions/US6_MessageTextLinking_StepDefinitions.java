package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.pages.PortalPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class US6_MessageTextLinking_StepDefinitions {
    PortalPage portalPage = new PortalPage();
    Actions actions = new Actions(Driver.getDriver());
    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @When("user clicks on MESSAGE text area")
    public void user_clicks_on_message_text_area() {
        portalPage.enterToMessageTextArea();
        portalPage.messageTextArea.click();
    }

    @When("enters the {string}")
    public void enters_the(String text) {
        portalPage.messageTextArea.sendKeys(text);
    }

    @When("double-clicks on the entered text")
    public void double_clicks_on_the_entered_text() {
        actions.doubleClick(portalPage.messageTextArea).perform();
        Driver.getDriver().switchTo().defaultContent();
    }

    @When("clicks link button")
    public void clicks_link_button() {
        wait.until(ExpectedConditions.elementToBeClickable(portalPage.linkBtn));
        portalPage.linkBtn.click();
    }

    @When("enters link {string}")
    public void enters_link(String address) {
        portalPage.linkTextInput.sendKeys(address);
    }

    @When("clicks Save button")
    public void clicks_save_button() {
        portalPage.saveBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(portalPage.sendBtn));
    }

    @Given("user is on the Login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user enters the login")
    public void userEntersTheLogin() {
        loginPage.login.sendKeys(ConfigurationReader.getProperty("hr_username"));
    }

    @And("user enters the password")
    public void userEntersThePassword() {
        loginPage.password.sendKeys(ConfigurationReader.getProperty("hr_password"));
    }

    @And("user clicks Log In button")
    public void userClicksLogInButton() {
        loginPage.loginButton.click();
        wait.until(ExpectedConditions.titleIs("Portal"));
    }

    @Then("user is logged in")
    public void userIsLoggedIn() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Portal";
        Assert.assertEquals("Title verification failed", expectedTitle, actualTitle);
    }

    @And("clicks Send button")
    public void clicksSendButton() {
        portalPage.sendBtn.click();
    }

    @Then("user is on the {string} webpage")
    public void userIsOnTheWebpage(String expectedURL) {
        BrowserUtils.sleep(1);
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();
        for (String each : allWindowHandles) {
            Driver.getDriver().switchTo().window(each);
            System.out.println("Current URL: " + Driver.getDriver().getCurrentUrl());
            if (Driver.getDriver().getCurrentUrl().contains(expectedURL)) {
                break;
            }
        }
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
    }

    @Then("user is on the {string} webpage opened on a new tab")
    public void userIsOnTheWebpageOpenedOnANewTab(String address) {
        Assert.assertTrue(Driver.getDriver().getWindowHandles().size() > 1);
    }

    @And("clicks on the text with {string} link")
    public void clicksOnTheTextWithLink(String address) {
        WebElement link = Driver.getDriver().findElement(By.xpath("//a[@href='" + address + "']"));
        wait.until(ExpectedConditions.visibilityOf(link));
        link.click();
    }

    @Then("the link {string} is attached to the text")
    public void theLinkIsAttachedToTheText(String address) {
        WebElement message = Driver.getDriver().findElement(By.xpath("//a[@href='" + address + "']"));
        wait.until(ExpectedConditions.visibilityOf(message));
        Assert.assertTrue(message.isDisplayed());
    }
}