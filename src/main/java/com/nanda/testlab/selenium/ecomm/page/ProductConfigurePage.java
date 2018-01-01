package com.nanda.testlab.selenium.ecomm.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductConfigurePage {

	@FindBy(xpath = "//input[@id=\"qty\"]")
	WebElement quantity;
	
	@FindBy(xpath="//*[@id=\"product_addtocart_form\"]/div[4]/div/div/div[2]/button/span/span")
	WebElement updateCart;

	public ProductConfigurePage(WebDriver driver) {
		super();
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getQuantityTextbox() {

		return quantity;
	}
	
	public WebElement getUpdateCartButton() {
		
		return updateCart;
	}

}
