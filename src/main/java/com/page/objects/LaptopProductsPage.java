package com.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaptopProductsPage {
	public LaptopProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Sony vaio i5']")
	private WebElement sonyVaioI5;
	@FindBy(xpath="//a[@href='prod.html?idp_=9'][@class='hrefch']")
	private WebElement sonyVaioI7;
	@FindBy(xpath="//a[text()='MacBook air']")
	private WebElement macbookAir;
	@FindBy(xpath="//a[text()='Dell i7 8gb']")
	private WebElement dellI7;
	@FindBy(xpath="//a[text()='2017 Dell 15.6 Inch']")
	private WebElement dell2017;
	@FindBy(xpath="//a[text()='MacBook Pro']")
	private WebElement macbookPro;
	@FindBy(xpath="//a[@onclick='addToCart(8)']")
	private WebElement sonyVaioI5AddCart;
	@FindBy(xpath="//a[@onclick='addToCart(9)']")
	private WebElement sonyVaioI7AddCart;
	@FindBy(xpath="//a[@onclick='addToCart(11)']")
	private WebElement macbookAirAddCart;
	@FindBy(xpath="//a[@onclick='addToCart(12)']")
	private WebElement dellI7AddCart;
	@FindBy(xpath="//a[@onclick='addToCart(13)']")
	private WebElement dell2017AddCart;
	@FindBy(xpath="//a[@onclick='addToCart(15)']")
	private WebElement macbookProAddCart;
	public WebElement getSonyVaioI5AddCart() {
		return sonyVaioI5AddCart;
	}
	public WebElement getSonyVaioI7AddCart() {
		return sonyVaioI7AddCart;
	}
	public WebElement getMacbookAirAddCart() {
		return macbookAirAddCart;
	}
	public WebElement getDellI7AddCart() {
		return dellI7AddCart;
	}
	public WebElement getDell2017AddCart() {
		return dell2017AddCart;
	}
	public WebElement getMacbookProAddCart() {
		return macbookProAddCart;
	}
	public WebElement getSonyVaioI5() {
		return sonyVaioI5;
	}
	public WebElement getSonyVaioI7() {
		return sonyVaioI7;
	}
	public WebElement getMacbookAir() {
		return macbookAir;
	}
	public WebElement getDellI7() {
		return dellI7;
	}
	public WebElement getDell2017() {
		return dell2017;
	}
	public WebElement getMacbookPro() {
		return macbookPro;
	}
	
}
