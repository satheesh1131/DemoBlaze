@demoBlaze
Feature: User order same product more than once
	@order @phone @same
	Scenario: User order same phone more than once
		Given User go to demoblaze homepage
		When User click phones category
		And User click on xperiaZ5 phone
		And User adds xperiaZ5 phone to cart
		And User verify the products added
		|Product added|
		And User return to home page
		And User click phones category
		And User click on xperiaZ5 phone
		And User adds xperiaZ5 phone to cart
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
	@order @laptop @same
	Scenario: User order same laptop more than once
		Given User go to demoblaze homepage
		When User click laptops category
		And User click vaioI5 laptop
		And User adds the vaioI5 laptop to cart
		And User verify the products added
		|Product added|
		And User return to home page
		And User click laptops category
		And User click vaioI5 laptop
		And User adds the vaioI5 laptop to cart
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
	@order @monitor @same
	Scenario: User order same monitor more than once
		Given User go to demoblaze homepage
		When User click monitors category
		And User click asusHd monitor
		And User adds the asusHd monitor to cart
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
	@order @same @mix
	Scenario: User order same product more than once in all category
		Given User go to demoblaze homepage
		When User click phones category
		And User click htcOne phone
		And User adds the htcOne phone to cart
		And User verify the products added
		|Product added|
		And User return to home page
		And User click phones category
		And User click htcOne phone
		And User adds the htcOne phone to cart
		And User verify the products added
		|Product added|
		And User return to home page
		When User click laptops category
		And User click on dellI7 laptop
		And User adds the dellI7 laptop to cart
		And User verify the products added
		|Product added|
		And User return to home page
		And User click laptops category
		And User click on dellI7 laptop
		And User adds the dellI7 laptop to cart
		And User verify the products added
		|Product added|
		And User return to home page
		When User click monitors category
		And User click on apple24 monitor
		And User adds the apple24 monitor to cart
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