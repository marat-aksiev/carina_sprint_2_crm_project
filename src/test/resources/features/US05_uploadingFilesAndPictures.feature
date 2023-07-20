@B29G11-247
Feature: user should be able to upload files and pictures as messages
  User Story: User should be able to upload files and pictures.
  Supported file formats .pdf, .txt, .jpeg, .png, .docx
  User should be able to insert the files and images into the text.
  User should be able to remove files and images at any time before sending


  Background:
    Given user is on the login page



  @wip1
  Scenario: User should upload files and pictures
    Given user is already logged in to the crm app
    When user clicks on the message tab
    And user clicks on the upload files button
    And user uploads files and images through the upload files&images button


  @wip2
  Scenario: User should be able to insert the uploaded files and images in text
    Given user is already logged in to the crm app
    When user clicks on the message tab
    And user clicks on the upload files button
    And user uploads files and images through the upload files&images button
    Then user clicks on insert in text button


  @wip3
  Scenario: User should be able to remove files and images from message box before sending
    Given user is already logged in to the crm app
    When user clicks on the message tab
    And user clicks on the upload files button
    And user uploads files and images through the upload files&images button
    And user clicks on insert in text button
    Then user clicks on the x button