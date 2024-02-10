package com.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Home ']")
	private WebElement homeOption;
	public WebElement getHomeOption() {
		return homeOption;
	}
	@FindBy(xpath="//a[text()='Sign up']")
	private WebElement signupOption;
	@FindBy(css="input#sign-username")
	private WebElement signupUsername;
	@FindBy(css="input#sign-password")
	private WebElement signupPassword;
	@FindBy(xpath="//button[text()='Sign up']")
	private WebElement signupButton;
	@FindBy(css="a#login2")
	private WebElement loginOption;
	@FindBy(css="input#loginusername")
	private WebElement loginUsername;
	@FindBy(css="input#loginpassword")
	private WebElement loginPassword;
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement loginButton;
	@FindBy(xpath="//a[text()='Phones']")
	private WebElement phonesOption;
	@FindBy(xpath="//a[text()='Laptops']")
	private WebElement laptopsOption;
	@FindBy(xpath="//a[text()='Monitors']")
	private WebElement monitorsOption;
	@FindBy(css="a#nameofuser")
	private WebElement usernameTitle;
	@FindBy(css="a#cartur")
	private WebElement cartOption;
	public WebElement getCartOption() {
		return cartOption;
	}
	public WebElement getUsernameTitle() {
		return usernameTitle;
	}
	public WebElement getSignupOption() {
		return signupOption;
	}
	public WebElement getSignupUsername() {
		return signupUsername;
	}
	public WebElement getSignupPassword() {
		return signupPassword;
	}
	public WebElement getSignupButton() {
		return signupButton;
	}
	public WebElement getLoginOption() {
		return loginOption;
	}
	public WebElement getLoginUsername() {
		return loginUsername;
	}
	public WebElement getLoginPassword() {
		return loginPassword;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getPhonesOption() {
		return phonesOption;
	}
	public WebElement getLaptopsOption() {
		return laptopsOption;
	}
	public WebElement getMonitorsOption() {
		return monitorsOption;
	}
	
	
}
