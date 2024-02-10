@demoBlaze
Feature: DemoBlaze
	@signup
	Scenario: User signup for first time
		Given User go to demoblaze homepage
		When User click signup option
		And User gives signup username and password
		|sathish995511|
		|sathish335511|
		Then User click signup button
		And User verify signup
		|Sign up successful.|
	@signup
	Scenario: User signup with existing username and password
		Given User go to demoblaze homepage
		When User click signup option
		And User gives signup existing username and password
		|sathish55555|
		|sathish55555|
		Then User click signup button
		And User verify signup and accept alert
		|This user already exist.|
	@login
	Scenario: User login with valid username and password
		Given User go to demoblaze homepage
		When User click login option
		And User gives valid username and password
		|sathish98765|
		|sathish98765|
		Then User click login button
		And User verify the login
		|Welcome sathish98765|
	@login
	Scenario: User login with invalid username and password
		Given User go to demoblaze homepage
		When User click login option
		And User gives invalid username and password
		|sathish|
		|sathish|
		Then User click login button
		And User verify the login and accept alert
		|Wrong password.|