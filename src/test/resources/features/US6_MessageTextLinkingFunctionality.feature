@B29G11-289
Feature: Default

	Background:
		#@B29G11-286
		Given user is on the Login page
		When user enters the login
		And user enters the password
		And user clicks Log In button
		Then user is logged in
		

	#*{color:#de350b}US6{color}* As a user, I should be able to add link in message
	#
	#*{color:#de350b}AC1{color}* User should be able to attach a link to the specified text
	@B29G11-258
	Scenario Outline: Verify that user is able to attach a link to the specified text
		When user clicks on MESSAGE text area
		And enters the "<text>"
		And double-clicks on the entered text
		And clicks link button
		And enters link "<address>"
		And clicks Save button
		And clicks Send button
		Then the link "<address>" is attached to the text
		Examples:
		    |text       |address                    |
		    |Google     |https://www.google.com/    |
		    |Facebook   |https://www.facebook.com/  |
		    |Instagram  |https://www.instagram.com/ |

	#*{color:#de350b}US6{color}* As a user, I should be able to add link in message
	#
	#{color:#de350b}*AC2*{color} By clicking on the link user should be able to navigate to the correct URL
	@B29G11-287
	Scenario Outline: Verify user is able to navigate to the correct URL by clicking on the link.
		When user clicks on MESSAGE text area
		And enters the "<text>"
		And double-clicks on the entered text
		And clicks link button
		And enters link "<address>"
		And clicks Save button
		And clicks Send button
		And clicks on the text with "<address>" link
		Then user is on the "<address>" webpage
		Examples:
		    |text       |address                    |
		    |Google     |https://www.google.com/    |
		    |Facebook   |https://www.facebook.com/  |
		    |Instagram  |https://www.instagram.com/ |

	#*{color:#de350b}US6{color}* As a user, I should be able to add link in message
	#
	#{color:#de350b}*AC3*{color} Link should open in a new tab
	@B29G11-288
	Scenario Outline: Verify user sees a new tab when clicked the link should
		When user clicks on MESSAGE text area
		And enters the "<text>"
		And double-clicks on the entered text
		And clicks link button
		And enters link "<address>"
		And clicks Save button
		And clicks Send button
		And clicks on the text with "<address>" link
		Then user is on the "<address>" webpage opened on a new tab
		Examples:
		    |text       |address                    |
		    |Google     |https://www.google.com/    |
		    |Facebook   |https://www.facebook.com/  |
		    |Instagram  |https://www.instagram.com/ |