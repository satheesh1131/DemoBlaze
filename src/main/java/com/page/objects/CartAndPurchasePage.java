package com.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartAndPurchasePage {
	public CartAndPurchasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='Place Order']")
	private WebElement placeOrderbutton;
	@FindBy(css="input#name")
	private WebElement nameInputTextbox;
	@FindBy(css="input#country")
	private WebElement countryInputTextbox;
	@FindBy(css="input#city")
	private WebElement cityInputTextbox;
	@FindBy(css="input#card")
	private WebElement cardInputTextbox;
	@FindBy(css="input#month")
	private WebElement monthInputTextbox;
	@FindBy(css="input#year")
	private WebElement yearInputTextbox;
	@FindBy(xpath="//button[@onclick='purchaseOrder()']")
	private WebElement purchaseButton;
	@FindBy(xpath="//h2[text()='Thank you for your purchase!']")
	private WebElement orderConfirmMessage;
	public WebElement getOrderConfirmMessage() {
		return orderConfirmMessage;
	}
	public WebElement getOrderDetails() {
		return orderDetails;
	}
	public WebElement getConfirmOrder() {
		return confirmOrder;
	}
	@FindBy(css="p.lead.text-muted ")
	private WebElement orderDetails;
	@FindBy(css="button.confirm.btn.btn-lg.btn-primary")
	private WebElement confirmOrder;
	public WebElement getPlaceOrderbutton() {
		return placeOrderbutton;
	}
	public WebElement getNameInputTextbox() {
		return nameInputTextbox;
	}
	public WebElement getCountryInputTextbox() {
		return countryInputTextbox;
	}
	public WebElement getCityInputTextbox() {
		return cityInputTextbox;
	}
	public WebElement getCardInputTextbox() {
		return cardInputTextbox;
	}
	public WebElement getMonthInputTextbox() {
		return monthInputTextbox;
	}
	public WebElement getYearInputTextbox() {
		return yearInputTextbox;
	}
	public WebElement getPurchaseButton() {
		return purchaseButton;
	}
}
