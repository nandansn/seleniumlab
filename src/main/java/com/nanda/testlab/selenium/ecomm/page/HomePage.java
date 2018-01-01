package com.nanda.testlab.selenium.ecomm.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//*[@id=\"header\"]/div/div[2]/div/a/span[2]")
	WebElement account;
	
	@FindBy(xpath="//*[@id=\"nav\"]/ol/li[1]/a")
	WebElement mobileCategoryLink;

	public HomePage(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
	}

	public class Account {

		@FindBy(xpath = "//*[@id=\"header-account\"]/div/ul/li[6]/a")
		WebElement login;

		public Account(WebDriver driver) {
			super();
			PageFactory.initElements(driver, this);
		}

		public WebElement getLoginLink() {

			return login;

		}
	}

	public WebElement getAccountLink() {
		return account;
	}
	
	public WebElement getMobileCategoryLink() {
		
		return mobileCategoryLink;
	}

}
