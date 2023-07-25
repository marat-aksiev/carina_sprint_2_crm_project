package com.crm.step_definitions;

import com.crm.pages.AppreciationPage;
import com.crm.pages.PortalPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US11_AppreciationPage_StepDefs {

    AppreciationPage appreciationPage = new AppreciationPage();
    PortalPage portalPage = new PortalPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @Given("user is on appreciation tab")
    public void user_is_on_appreciation_tab() {
        appreciationPage.moreTab.click();
        appreciationPage.appreciationTab.click();
    }

    @When("user enters {string} text")
    public void user_enters_text(String msgText) {
        WebElement iframe = Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']"));
        Driver.getDriver().switchTo().frame(iframe);
        appreciationPage.msgTexBox.sendKeys(msgText);
        Driver.getDriver().switchTo().defaultContent();
    }

    @When("user enters {string}")
    public void user_enters(String to) {
        wait.until(ExpectedConditions.elementToBeClickable(appreciationPage.enterTo));
        appreciationPage.enterTo.click();
        wait.until(ExpectedConditions.elementToBeClickable(appreciationPage.allEmployeesClose));

        appreciationPage.allEmployeesClose.click();

        appreciationPage.to.sendKeys(to + Keys.ENTER);

    }

    @When("user clicks send button")
    public void user_clicks_send_button() {
        portalPage.sendBtn.click();
    }

    @Then("user should be able to see {string} in Activity Stream")
    public void userShouldBeAbleToSeeInActivityStream(String fromWho) {
        Assert.assertEquals(appreciationPage.lastSender.getText(), fromWho + "12@cybertekschool.com");
    }

    @Then("user should be able to see {string} in sent message")
    public void userShouldBeAbleToSeeInSentMessage(String toWhom) {
        Assert.assertEquals(appreciationPage.lastAddressee.getText(), toWhom);
    }

    @Then("user should be able to see {string} in last sent message")
    public void userShouldBeAbleToSeeInLastSentMessage(String lastMsgText) {
        Assert.assertEquals(appreciationPage.lastSentMsg.getText(), lastMsgText);

    }
}
