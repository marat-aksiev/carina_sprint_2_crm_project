package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.pages.UploadPage;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class US05_UploadingFilesAndPicturesStep_Definitions {
    LoginPage loginPage=new LoginPage();


    UploadPage uploadPage=new UploadPage();


    @When("user clicks on the message tab")
    public void user_clicks_on_the_message_tab() {
        uploadPage.messageBtn.click();
    }
    @When("user clicks on the upload files button")
    public void user_clicks_on_the_upload_files_button() {
        uploadPage.uploadBtn.click();
    }
    @And("user uploads files and images through the upload files&images button")
    public void userUploadsFilesAndImagesThroughTheUploadFilesImagesButton() {
        //uploadPage.uploadFilesImagesBtn.click();
       // uploadPage.uploadFilesImagesBtn.sendKeys("C:\\Users\\dell\\Desktop\\file.txt");

        String projectPath=System.getProperty("user.dir");
        String filePath="src/test/resources/fileToLoad/file.txt";
        String fullPath=projectPath+"/"+filePath;
        uploadPage.uploadFilesImagesBtn.sendKeys(fullPath);

    }


    @When("user clicks on insert in text button")
    public void user_clicks_on_insert_in_text_button() {
        uploadPage.insertInText.click();
    }


    @When("user clicks on the x button")
    public void user_clicks_on_the_x_button() {
        uploadPage.xBtn.click();
    }

}
