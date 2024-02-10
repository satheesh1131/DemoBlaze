@demoBlaze
Feature: DemoBlaze Product Order in different category
	@phone @order @mix @laptop @monitor @single
	Scenario: User order one product in each category
		Given User go to demoblaze homepage
		When User click phones category
		And User click on galaxyS6 phone
		And User adds galaxyS6 phone to cart
		And User verify the products added
		|Product added|
		And User return to home page
		And User click laptops category
		And User click macbook pro laptop
		And User adds the macbook pro laptop to cart
		And User verify the products added
		|Product added|
		And User return to home page
		And User click monitors category
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
	@phone @order @mix @laptop @monitor @multi
	Scenario: User order more than one product in each category
		Given User go to demoblaze homepage
		When User click phones category
		And User click on galaxyS7 phone
		And User adds galaxyS7 phone to cart
		And User verify the products added
		|Product added|
		And User return to home page
		And User click phones category
		And User click on xperiaZ5 phone
		And User adds xperiaZ5 phone to cart
		And User verify the products added
		|Product added|
		And User return to home page
		And User click laptops category
		And User click vaioI5 laptop
		And User adds the vaioI5 laptop to cart
		And User verify the products added
		|Product added|
		And User return to home page
		And User click laptops category
		And User click vaioI7 laptop
		And User adds the vaioI7 laptop to cart
		And User verify the products added
		|Product added|
		And User return to home page
		And User click monitors category
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