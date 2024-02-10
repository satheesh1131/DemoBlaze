@demoBlaze
Feature: User order all the products in each category
	@phone @order @all
	Scenario: User order all the phones in the phones category
		Given User go to demoblaze homepage
		When User click phones category
		And User click on galaxyS6 phone
		And User adds galaxyS6 phone to cart
		And User verify the products added
		|Product added|
		And User return to home page
		And User click phones category
		And User click on lumia1520 phone
		And User adds lumia1520 phone to cart
		And User verify the products added
		|Product added|
		And User return to home page
		And User click phones category
		And User click nexus6 phone
		And User adds the nexus6 phone to cart
		And User verify the products added
		|Product added|
		And User return to home page
		And User click phones category
		And User click on galaxyS7 phone
		And User adds galaxyS7 phone to cart
		And User verify the products added
		|Product added|
		And User return to home page
		And User click phones category
		And User click on iphone6 phone
		And User adds iphone6 phone to cart
		And User verify the products added
		|Product added|
		And User return to home page
		And User click phones category
		And User click on xperiaZ5 phone
		And User adds xperiaZ5 phone to cart
		And User verify the products added
		|Product added|
		And User return to home page
		And User click phones category
		And User click htcOne phone
		And User adds the htcOne phone to cart
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
	@laptop @order @all
	Scenario: User order all the products in the laptop category
		Given User go to demoblaze homepage
		When User click laptops category
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
		And User click laptops category
		And User click macbook air laptop
		And User adds the macbook air laptop to cart
		And User verify the products added
		|Product added|
		And User return to home page
		And User click laptops category
		And User click on dellI7 laptop
		And User adds the dellI7 laptop to cart
		And User verify the products added
		|Product added|
		And User return to home page
		And User click laptops category
		And User click on dell2017 laptop
		And User adds the dell2017 laptop to cart
		And User verify the products added
		|Product added|
		And User return to home page
		And User click laptops category
		And User click macbook pro laptop
		And User adds the macbook pro laptop to cart
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
	@monitor @order @all
	Scenario: User order all the products in the monitor category
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