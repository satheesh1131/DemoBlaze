package com.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhoneProductsPage {
	public PhoneProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Samsung galaxy s6']")
	private WebElement samsungGalaxyS6;
	@FindBy(xpath="//a[text()='Nokia lumia 1520']")
	private WebElement nokiaLumia1520;
	@FindBy(xpath="//a[text()='Nexus 6']")
	private WebElement nexus6;
	@FindBy(xpath="//a[text()='Samsung galaxy s7']")
	private WebElement samsungGalaxyS7;
	@FindBy(xpath="//a[text()='Iphone 6 32gb']")
	private WebElement iphone6;
	@FindBy(xpath="//a[text()='Sony xperia z5']")
	private WebElement sonyXperiaZ5;
	@FindBy(xpath="//a[text()='HTC One M9']")
	private WebElement htcOneM9;
	@FindBy(xpath="//a[@onclick='addToCart(1)']")
	private WebElement samsungGalaxyS6AddCart;
	@FindBy(xpath="//a[@onclick='addToCart(2)']")
	private WebElement nokiaLumia1520AddCart;
	@FindBy(xpath="//a[@onclick='addToCart(3)']")
	private WebElement nexus6AddCart;
	@FindBy(xpath="//a[@onclick='addToCart(4)']")
	private WebElement samsungGalaxyS7AddCart;
	@FindBy(xpath="//a[@onclick='addToCart(5)']")
	private WebElement iphone6AddCart;
	@FindBy(xpath="//a[@onclick='addToCart(6)']")
	private WebElement sonyXperiaZ5AddCart;
	@FindBy(xpath="//a[@onclick='addToCart(7)']")
	private WebElement htcOneM9AddCart;
	public WebElement getSamsungGalaxyS6AddCart() {
		return samsungGalaxyS6AddCart;
	}
	public WebElement getNokiaLumia1520AddCart() {
		return nokiaLumia1520AddCart;
	}
	public WebElement getNexus6AddCart() {
		return nexus6AddCart;
	}
	public WebElement getSamsungGalaxyS7AddCart() {
		return samsungGalaxyS7AddCart;
	}
	public WebElement getIphone6AddCart() {
		return iphone6AddCart;
	}
	public WebElement getSonyXperiaZ5AddCart() {
		return sonyXperiaZ5AddCart;
	}
	public WebElement getHtcOneM9AddCart() {
		return htcOneM9AddCart;
	}
	public WebElement getSamsungGalaxyS6() {
		return samsungGalaxyS6;
	}
	public WebElement getNokiaLumia1520() {
		return nokiaLumia1520;
	}
	public WebElement getNexus6() {
		return nexus6;
	}
	public WebElement getSamsungGalaxyS7() {
		return samsungGalaxyS7;
	}
	public WebElement getIphone6() {
		return iphone6;
	}
	public WebElement getSonyXperiaZ5() {
		return sonyXperiaZ5;
	}
	public WebElement getHtcOneM9() {
		return htcOneM9;
	}	
	
}
