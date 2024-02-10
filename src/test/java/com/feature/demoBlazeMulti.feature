@demoBlaze
Feature: DemoBlaze Multiple Product Order
	@phone @order @multi
	Scenario: User order more than one phone
		Given User go to demoblaze homepage
		When User click phones category
		And User click on iphone6 phone
		And User adds iphone6 phone to cart
		And User verify the products added
		|Product added|
		And User return to home page
		And User click phones category
		And User click nexus6 phone
		And User adds the nexus6 phone to cart
		And User verify the products added
		|Product added|
		And User click cart option
		And User click placeorder button
		And User gives personal details
		|Sathish|
		|India|
		|Chennai|
		|123456789012345|
		|05|
		|2025|
		Then User click purchase button
		And User verfiy order confirmation
		|Thank you for your purchase!|
	@laptop @order @multi
	Scenario: User order more than one laptop
		Given User go to demoblaze homepage
		When User click laptops category
		And User click on dell2017 laptop
		And User adds the dell2017 laptop to cart
		And User verify the products added
		|Product added|
		And User return to home page
		And User click laptops category
		And User click macbook air laptop
		And User adds the macbook air laptop to cart
		And User verify the products added
		|Product added|
		And User click cart option
		And User click placeorder button
		And User gives personal details
		|Sathish|
		|India|
		|Chennai|
		|123456789012345|
		|05|
		|2025|
		Then User click purchase button
		And User verfiy order confirmation
		|Thank you for your purchase!|
	@monitor @order @multi
	Scenario: User order more than one monitor
		Given User go to demoblaze homepage
		When User click monitors category
		And User click on apple24 monitor
		And User adds the apple24 monitor to cart
		And User verify the products added
		|Product added|
		And User return to home page
		And User click monitors category
		And User click asusHd monitor
		And User adds the asusHd monitor to cart
		And User verify the products added
		|Product added|
		And User click cart option
		And User click placeorder button
		And User gives personal details
		|Sathish|
		|India|
		|Chennai|
		|123456789012345|
		|05|
		|2025|
		Then User click purchase button
		And User verfiy order confirmation
		|Thank you for your purchase!|