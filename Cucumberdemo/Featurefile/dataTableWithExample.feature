Feature: this is feature file to open HRM Website and checking 

Scenario Outline: this is the login scenario

	Given : processed to login page
	
	When : user enter the logo  cradential "<username>" and "<password>"
	
	And : to click the login button
	
	Examples:
	
	|username|password|
	|Admin	 |admin123|
	|Admin   |admin12|
	|Admin   |admin1234|	
	
	