package com.stepdefinition;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;

import com.page.objects.PageObjectManager;
import com.resources.BaseClass;
import com.utilities.FileReaderManager;
import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoBlazeStepDef extends BaseClass{
	PageObjectManager pom=new PageObjectManager(getDriver());
	
	@Given("User go to demoblaze homepage")
	public void userGoToDemoblazeHomepage() throws IOException {
	    loadUrl(FileReaderManager.getInstance().getCrInstance().getUrl());    
	}
	@When("User click signup option")
	public void userClickSignupOption() {
	    click(pom.getHomePage().getSignupOption());	    
	}
	@When("User gives signup username and password")
	public void userGivesSignupUsernameAndPassword(DataTable dataTable) {
		List<String> li = dataTable.asList();
	    sendText(pom.getHomePage().getSignupUsername(), li.get(0));
	    sendText(pom.getHomePage().getSignupPassword(), li.get(1));
	}
	@Then("User click signup button")
	public void userClickSignupButton() {
	    click(pom.getHomePage().getSignupButton());
	}
	@Then("User verify signup")
	public void userVerifySignup(DataTable dataTable) {
		List<String> li = dataTable.asList();
		waitForAlert();
	    Assert.assertEquals(li.get(0),alertGetText());
	    alertAccept();
	}
	@When("User gives signup existing username and password")
	public void userGivesSignupExistingUsernameAndPassword(DataTable dataTable) {
		List<String> li = dataTable.asList();
	    sendText(pom.getHomePage().getSignupUsername(), li.get(0));
	    sendText(pom.getHomePage().getSignupPassword(), li.get(1));
	}
	@Then("User verify signup and accept alert")
	public void userVerifySignupAndAcceptAlert(DataTable dataTable) {
		List<String> li = dataTable.asList();
		waitForAlert();
		Assert.assertEquals(li.get(0), alertGetText());
		alertAccept();	    
	}
	@When("User click login option")
	public void userClickLoginOption() {
	    click(pom.getHomePage().getLoginOption());	    
	}
	@When("User gives valid username and password")
	public void userGivesValidUsernameAndPassword(DataTable dataTable) {
		List<String> li = dataTable.asList();
		sendText(pom.getHomePage().getLoginUsername(), li.get(0));
		sendText(pom.getHomePage().getLoginPassword(), li.get(1));	   
	}
	@Then("User click login button")
	public void userClickLoginButton() {
	    click(pom.getHomePage().getLoginButton());	    
	}
	@Then("User verify the login")
	public void userVerifyTheLogin(DataTable dataTable) {
		List<String> li = dataTable.asList();
		waitForElementVisible(pom.getHomePage().getUsernameTitle()); 
		Assert.assertEquals(li.get(0), getText(pom.getHomePage().getUsernameTitle()));
	}
	@When("User gives invalid username and password")
	public void userGivesInvalidUsernameAndPassword(DataTable dataTable) {
		List<String> li = dataTable.asList();
		sendText(pom.getHomePage().getLoginUsername(), li.get(0));
		sendText(pom.getHomePage().getLoginPassword(), li.get(1));		    
	}
	@Then("User verify the login and accept alert")
	public void userVerifyTheLoginAndAcceptAlert(DataTable dataTable) {
		List<String> li = dataTable.asList();
	    waitForAlert();
		Assert.assertEquals(li.get(0), alertGetText());
	    alertAccept();	    
	}
	@When("User click phones category")
	public void userClickPhonesCategory() {
	    click(pom.getHomePage().getPhonesOption());	    
	}
	@When("User verify the products added")
	public void userVerifyTheProductsAdded(DataTable dataTable) {
		List<String> li = dataTable.asList();
		waitForAlert();
		Assert.assertEquals(li.get(0), alertGetText());
		alertAccept();
	}
	@When("User click cart option")
	public void userClickCartOption() {
		click(pom.getHomePage().getCartOption());	    
	}
	@When("User click placeorder button")
	public void userClickPlaceorderButton() {
	    click(pom.getCartAndPurchasePage().getPlaceOrderbutton());	    
	}
	@When("User gives personal details")
	public void userGivesPersonalDetails(DataTable dataTable) {
		List<String> li = dataTable.asList();
		sendText(pom.getCartAndPurchasePage().getNameInputTextbox(), li.get(0));
		sendText(pom.getCartAndPurchasePage().getCountryInputTextbox(), li.get(1));
		sendText(pom.getCartAndPurchasePage().getCityInputTextbox(), li.get(2));
		sendText(pom.getCartAndPurchasePage().getCardInputTextbox(), li.get(3));
		sendText(pom.getCartAndPurchasePage().getMonthInputTextbox(), li.get(4));
		sendText(pom.getCartAndPurchasePage().getYearInputTextbox(), li.get(5));
	}
	@Then("User click purchase button")
	public void userClickPurchaseButton() {
	    click(pom.getCartAndPurchasePage().getPurchaseButton());	    
	}
	@Then("User verfiy order confirmation")
	public void userVerfiyOrderConfirmation(DataTable dataTable) {
		List<String> li = dataTable.asList();
	    Assert.assertEquals(li.get(0), getText(pom.getCartAndPurchasePage().getOrderConfirmMessage()));
	    click(pom.getCartAndPurchasePage().getConfirmOrder());
	}
	@When("User click laptops category")
	public void userClickLaptopsCategory() {
	    click(pom.getHomePage().getLaptopsOption());	    
	}
	@When("User click monitors category")
	public void userClickMonitorsCategory() {
	    click(pom.getHomePage().getMonitorsOption());	    
	}
	@When("User return to home page")
	public void userReturnToHomePage() {
		click(pom.getHomePage().getHomeOption());
	}
	@When("User click on iphone6 phone")
	public void userClickOnIphone6Phone() {
		click(pom.getPhoneProductsPage().getIphone6());	    
	}
	@When("User adds iphone6 phone to cart")
	public void userAddsIphone6PhoneToCart() {
		click(pom.getPhoneProductsPage().getIphone6AddCart());	    
	}
	@When("User click on dell2017 laptop")
	public void userClickOnDell2017Laptop() {
		click(pom.getLaptopProductsPage().getDell2017());	    
	}
	@When("User adds the dell2017 laptop to cart")
	public void userAddsTheDell2017LaptopToCart() {
		click(pom.getLaptopProductsPage().getDell2017AddCart());	    
	}
	@When("User click on apple24 monitor")
	public void userClickOnApple24Monitor() {
		click(pom.getMonitorProductsPage().getAppleMonitor24());
	}
	@When("User adds the apple24 monitor to cart")
	public void userAddsTheApple24MonitorToCart() {
		click(pom.getMonitorProductsPage().getAppleMonitor24AddCart());	 
	}
	@When("User click nexus6 phone")
	public void userClickNexus6Phone() {
		click(pom.getPhoneProductsPage().getNexus6());	    
	}
	@When("User adds the nexus6 phone to cart")
	public void userAddsTheNexus6PhoneToCart() {
		click(pom.getPhoneProductsPage().getNexus6AddCart());	    
	}
	@When("User click macbook air laptop")
	public void userClickMacbookAirLaptop() {
		click(pom.getLaptopProductsPage().getMacbookAir());	    
	}
	@When("User adds the macbook air laptop to cart")
	public void userAddsTheMacbookAirLaptopToCart() {
		click(pom.getLaptopProductsPage().getMacbookAirAddCart());	    
	}
	@When("User click asusHd monitor")
	public void userClickAsusHdMonitor() {
		click(pom.getMonitorProductsPage().getAsusHdMonitor());	    
	}
	@When("User adds the asusHd monitor to cart")
	public void userAddsTheAsusHdMonitorToCart() {
		click(pom.getMonitorProductsPage().getAsusHdMonitorAddCart());	    
	}
	@When("User click on galaxyS6 phone")
	public void userClickOnGalaxyS6Phone() {
	    click(pom.getPhoneProductsPage().getSamsungGalaxyS6());	    
	}
	@When("User adds galaxyS6 phone to cart")
	public void userAddsGalaxyS6PhoneToCart() {
	    click(pom.getPhoneProductsPage().getSamsungGalaxyS6AddCart());	    
	}
	@When("User click macbook pro laptop")
	public void userClickMacbookProLaptop() {
	    click(pom.getLaptopProductsPage().getMacbookPro());	    
	}
	@When("User adds the macbook pro laptop to cart")
	public void userAddsTheMacbookProLaptopToCart() {
	    click(pom.getLaptopProductsPage().getMacbookProAddCart());	    
	}
	@When("User click on galaxyS7 phone")
	public void userClickOnGalaxyS7Phone() {
	    click(pom.getPhoneProductsPage().getSamsungGalaxyS7());	    
	}
	@When("User adds galaxyS7 phone to cart")
	public void userAddsGalaxyS7PhoneToCart() {
	    click(pom.getPhoneProductsPage().getSamsungGalaxyS7AddCart());	    
	}
	@When("User click on xperiaZ5 phone")
	public void userClickOnXperiaZ5Phone() {
	    click(pom.getPhoneProductsPage().getSonyXperiaZ5());	    
	}
	@When("User adds xperiaZ5 phone to cart")
	public void userAddsXperiaZ5PhoneToCart() {
	    click(pom.getPhoneProductsPage().getSonyXperiaZ5AddCart());	    
	}
	@When("User click vaioI5 laptop")
	public void userClickVaioI5Laptop() {
	    click(pom.getLaptopProductsPage().getSonyVaioI5());	    
	}
	@When("User adds the vaioI5 laptop to cart")
	public void userAddsTheVaioI5LaptopToCart() {
	    click(pom.getLaptopProductsPage().getSonyVaioI5AddCart());	    
	}
	@When("User click vaioI7 laptop")
	public void userClickVaioI7Laptop() {
	    click(pom.getLaptopProductsPage().getSonyVaioI7());	    
	}
	@When("User adds the vaioI7 laptop to cart")
	public void userAddsTheVaioI7LaptopToCart() {
	    click(pom.getLaptopProductsPage().getSonyVaioI7AddCart());	    
	}
	@When("User click on lumia1520 phone")
	public void userClickOnLumia1520Phone() {
	   click(pom.getPhoneProductsPage().getNokiaLumia1520());	    
	}
	@When("User adds lumia1520 phone to cart")
	public void userAddsLumia1520PhoneToCart() {
	   click(pom.getPhoneProductsPage().getNokiaLumia1520AddCart());	    
	}
	@When("User click htcOne phone")
	public void userClickHtcOnePhone() {
	   click(pom.getPhoneProductsPage().getHtcOneM9());	    
	}
	@When("User adds the htcOne phone to cart")
	public void userAddsTheHtcOnePhoneToCart() {
	   click(pom.getPhoneProductsPage().getHtcOneM9AddCart());	    
	}
	@When("User click on dellI7 laptop")
	public void userClickOnDellI7Laptop() {
	   click(pom.getLaptopProductsPage().getDellI7());	    
	}
	@When("User adds the dellI7 laptop to cart")
	public void userAddsTheDellI7LaptopToCart() {
	   click(pom.getLaptopProductsPage().getDellI7AddCart());	   
	}
	@Then("User verify order price")
	public void userVerifyOrderPrice(DataTable dataTable) {
	    List<String> li = dataTable.asList();
	    Assert.assertTrue(getText(pom.getCartAndPurchasePage().getOrderDetails()).contains(li.get(0)));
	}
	@Then("User click login button and encounters alert")
	public void userClickLoginButtonAndEncountersAlert(DataTable dataTable) {
	    click(pom.getHomePage().getLoginButton());
	    waitForAlert();
	    List<String> li = dataTable.asList();
	    Assert.assertEquals(li.get(0), alertGetText());
	    alertAccept();
	}
	@Then("User click purchase button and encounters alert")
	public void userClickPurchaseButtonAndEncountersAlert(DataTable dataTable) {
		click(pom.getCartAndPurchasePage().getPurchaseButton());
		waitForAlert();
		List<String> li = dataTable.asList();
	    Assert.assertEquals(li.get(0), alertGetText());
	    alertAccept();
	}
	@Then("User click signup button and encounters alert")
	public void userClickSignupButtonAndEncountersAlert(DataTable dataTable) {
		click(pom.getHomePage().getSignupButton());
		waitForAlert();
		List<String> li = dataTable.asList();
	    Assert.assertEquals(li.get(0), alertGetText());
	    alertAccept();
	}

}
