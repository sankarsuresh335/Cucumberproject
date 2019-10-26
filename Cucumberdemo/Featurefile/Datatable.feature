Feature: This is the login feature for HRM 

Scenario: This is the login scenario 

	Given :	User is on the login pages stage 
	When :  The user enter the valid to the valid box
	|Admin|admin123|
	And :  click on the login page to go main home page
	Then : the user should be navigated to home page with tittalpage 
