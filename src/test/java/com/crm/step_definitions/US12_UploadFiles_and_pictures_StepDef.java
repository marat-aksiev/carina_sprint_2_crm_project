package com.crm.step_definitions;

import com.crm.pages.AppreciationPage;
import com.crm.pages.LoginPage;
import com.crm.pages.UploadPage;
import com.crm.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class US12_UploadFiles_and_pictures_StepDef {

    LoginPage loginPage = new LoginPage();
    AppreciationPage appreciationPage = new AppreciationPage();
    UploadPage uploadPage = new UploadPage();

    @When("user click to More  and selects Appreciation")
    public void user_click_to_more_and_selects_appreciation() {
       appreciationPage.moreLink.click();
       BrowserUtils.waitForClickablility(appreciationPage.appreciationButton,2);
       appreciationPage.appreciationButton.click();


    }
    @When("user clicks on the upload files and images")
    public void user_clicks_on_the_upload_files_and_images() {
        uploadPage.uploadBtn.click();

    }
    @When("user uploads files and images through the upload files and images button")
    public void user_uploads_files_and_images_through_the_upload_files_and_images_button() {
        String projectPath=System.getProperty("user.dir");
        String filePath="src/test/resources/fileToLoad/file.txt";
        String fullPath=projectPath+"/"+filePath;
        uploadPage.uploadFilesImagesBtn.sendKeys(fullPath);





    }

}

