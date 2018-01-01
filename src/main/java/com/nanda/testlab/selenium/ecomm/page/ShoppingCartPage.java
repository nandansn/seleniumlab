package com.nanda.testlab.selenium.ecomm.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

	@FindBy(xpath = "//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/ul/li[1]/a")
	WebElement editOrder;

	@FindBy(xpath = "//*[@id=\"shopping-cart-table\"]/tbody/tr/td[5]/span/span")
	WebElement subTotal;

	@FindBy(xpath = "//*[@id=\"top\"]/body/div/div/div[2]/div/div/div/div[1]/ul/li/button")
	WebElement proccedToCheckout;

	@FindBy(xpath = "//*[@id=\"coupon_code\"]")
	WebElement couponCodeText;

	@FindBy(xpath = "//*[@id=\"discount-coupon-form\"]/div/div/div/div/button/span/span")
	WebElement couponApplyLink;
	
	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div/div/ul/li/ul/li/span")
	WebElement couponAppliedLabel;

	public ShoppingCartPage(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
	}

	public WebElement getEditOrderLink() {

		return editOrder;
	}

	public WebElement getSubTotalLabel() {

		return subTotal;

	}

	public WebElement getProceedToChecoutButton() {

		return proccedToCheckout;

	}

	public WebElement getCouponCodeTextbox() {

		return couponCodeText;
	}

	public WebElement getCouponApplyLink() {
		return couponApplyLink;
	}
	
	public WebElement getCouponAppliedText() {
		
		return couponAppliedLabel;
	}

}
