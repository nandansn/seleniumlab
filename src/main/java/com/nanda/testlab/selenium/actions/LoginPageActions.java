package com.nanda.testlab.selenium.actions;

import org.openqa.selenium.WebDriver;

import com.nanda.testlab.selenium.ecomm.page.LoginPage;

public class LoginPageActions {

	public static void login(WebDriver driver, String email, String userPassword) {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.getEmailTextBox().sendKeys(email);

		loginPage.getPasswordTextBox().sendKeys(userPassword);

		loginPage.getLoginButton().click();
	}

}
