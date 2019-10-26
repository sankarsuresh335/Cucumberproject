Feature: this is to serch google
Scenario: Google serch scenario
	Given user is entering google.co.in
	When  user is typing the search term "sankar"
	And enters the return key
	Then the user should see the serch result
	
	