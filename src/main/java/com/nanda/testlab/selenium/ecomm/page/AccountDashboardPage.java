package com.nanda.testlab.selenium.ecomm.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountDashboardPage {

	@FindBy(xpath = "//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div/div[3]/div/h2")
	WebElement recentOrderText;

	@FindBy(xpath = "//*[@id=\"my-orders-table\"]/tbody/tr/td[6]/span/a[2]")
	WebElement reOrderLink;

	public AccountDashboardPage(WebDriver driver) {
		super();

		PageFactory.initElements(driver, this);
	}

	public WebElement getRecentOrderElement() {
		return recentOrderText;
	}

	public WebElement getReOrderLink() {

		return reOrderLink;
	}

}
