package com.page.objects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	WebDriver driver;
	public PageObjectManager(WebDriver driver1) {
		this.driver=driver1;
	}
	public HomePage getHomePage() {
		return new HomePage(driver);
	}
	public PhoneProductsPage getPhoneProductsPage() {
		return new PhoneProductsPage(driver);
	}
	public LaptopProductsPage getLaptopProductsPage() {
		return new LaptopProductsPage(driver);
	}
	public MonitorProductsPage getMonitorProductsPage() {
		return new MonitorProductsPage(driver);
	}
	public CartAndPurchasePage getCartAndPurchasePage() {
		return new CartAndPurchasePage(driver);
	}
	
	
}
