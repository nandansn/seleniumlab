package com.nanda.testlab.selenium.ecomm.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath = "//*[@id=\"email\"]|//*[@id=\"login-email\"]")
	WebElement emailTextBox;

	@FindBy(xpath = "//*[@id=\"pass\"]|//*[@id=\"login-password\"]")
	WebElement passwordTextBox;

	@FindBy(xpath = "//*[@id=\"send2\"]|//*[@id=\"checkout-step-login\"]/div/div[2]/div/button")
	WebElement loginButton;

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}
