@demoBlaze
Feature: User with negative test cases
	@order @null
	Scenario: User complete order without adding product to the cart
		Given User go to demoblaze homepage
		When User click cart option
		And User click placeorder button
		And User gives personal details
		|Sathish|
		|India|
		|Chennai|
		|123456789012345|
		|05|
		|2025|
		Then User click purchase button
		And User verify order price
		|Amount: 0 USD|
		And User verfiy order confirmation
		|Thank you for your purchase!| 
	@order @single @null
	Scenario: User complete order without giving user credentials
		Given User go to demoblaze homepage
		When User click phones category
		And User click on iphone6 phone
		And User adds iphone6 phone to cart
		And User verify the products added
		|Product added|
		And User click cart option
		And User click placeorder button
		Then User click purchase button and encounters alert
		|Please fill out Name and Creditcard.|
	@login @null
	Scenario: User login without giving username and password
		Given User go to demoblaze homepage
		When User click login option
		Then User click login button and encounters alert
		|Please fill out Username and Password.|
	@signup @null
	Scenario: User signup without giving username and password
		Given User go to demoblaze homepage
		When User click signup option
		Then User click signup button and encounters alert
		|Please fill out Username and Password.|
	