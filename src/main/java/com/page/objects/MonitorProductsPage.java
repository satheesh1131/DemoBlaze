package com.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MonitorProductsPage {
	public MonitorProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Apple monitor 24']")
	private WebElement appleMonitor24;
	@FindBy(xpath="//a[text()='ASUS Full HD']")
	private WebElement asusHdMonitor;
	@FindBy(xpath="//a[@onclick='addToCart(10)']")
	private WebElement appleMonitor24AddCart;
	@FindBy(xpath="//a[@onclick='addToCart(14)']")
	private WebElement asusHdMonitorAddCart;
	public WebElement getAppleMonitor24() {
		return appleMonitor24;
	}
	public WebElement getAsusHdMonitor() {
		return asusHdMonitor;
	}
	public WebElement getAppleMonitor24AddCart() {
		return appleMonitor24AddCart;
	}
	public WebElement getAsusHdMonitorAddCart() {
		return asusHdMonitorAddCart;
	}

}
