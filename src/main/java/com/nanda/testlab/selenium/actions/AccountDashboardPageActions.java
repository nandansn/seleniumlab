package com.nanda.testlab.selenium.actions;

import org.openqa.selenium.WebDriver;

import com.nanda.testlab.selenium.ecomm.page.AccountDashboardPage;

public class AccountDashboardPageActions {

	public static String getRecentOrderText(WebDriver driver) {

		return new AccountDashboardPage(driver).getRecentOrderElement().getText();
	}

}
