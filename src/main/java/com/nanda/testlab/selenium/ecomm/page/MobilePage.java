package com.nanda.testlab.selenium.ecomm.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilePage {

	@FindBy(xpath = "//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/button/span/span")
	WebElement addMobileToCart;

	public MobilePage(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddToCartButton() {
		return addMobileToCart;
	}

}
