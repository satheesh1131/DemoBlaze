@demoBlaze
Feature: DemoBlaze Single Product Order
	@single @phone @order
	Scenario: Single phone order
		Given User go to demoblaze homepage
		When User click phones category
		And User click on iphone6 phone
		And User adds iphone6 phone to cart
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
	@single @laptop @order
	Scenario: Single laptop order
		Given User go to demoblaze homepage
		When User click laptops category
		And User click on dell2017 laptop
		And User adds the dell2017 laptop to cart
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
	@single @monitor @order
	Scenario: Single monitor order
		Given User go to demoblaze homepage
		When User click monitors category
		And User click on apple24 monitor
		And User adds the apple24 monitor to cart
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