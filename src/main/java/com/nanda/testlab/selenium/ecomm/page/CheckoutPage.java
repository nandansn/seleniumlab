package com.nanda.testlab.selenium.ecomm.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {

	@FindBy(xpath = "//*[@id=\"billing-buttons-container\"]/button/span/span")
	WebElement billingContinue;

	@FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/button")
	WebElement shippingMethodContinue;

	@FindBy(xpath = "//*[@id=\"p_method_checkmo\"]")
	WebElement checkOrMoneyOrder;

	@FindBy(xpath = "//*[@id=\"payment-buttons-container\"]/button")
	WebElement paymentInformation;

	@FindBy(xpath = "//*[@id=\"review-buttons-container\"]/button")
	WebElement placeOrder;

	static WebDriverWait wait;

	public CheckoutPage(WebDriver driver) {
		super();
		wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
	}

	public WebElement getBillingContinueButton() {
		return billingContinue;
	}

	public WebElement getShippingMethodContinueButton() {

		wait.until(ExpectedConditions.visibilityOf(shippingMethodContinue));

		return shippingMethodContinue;
	}

	public WebElement getCheckOrMoneyOrderRadioButton() {

		wait.until(ExpectedConditions.visibilityOf(checkOrMoneyOrder));

		return checkOrMoneyOrder;
	}

	public WebElement getPaymentInformationButton() {

		wait.until(ExpectedConditions.visibilityOf(paymentInformation));

		return paymentInformation;
	}

	public WebElement getPlaceOrderButton() {

		wait.until(ExpectedConditions.visibilityOf(placeOrder));

		return placeOrder;
	}
	
	static public class OrderReview{
		
		public OrderReview(WebDriver driver) {
			super();
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//*[@id=\"checkout-review-table\"]/tfoot/tr[2]/td[2]/span")
		WebElement couponDiscountLabelText;
		
		public WebElement getCouponDiscountLabelText() {
			wait.until(ExpectedConditions.visibilityOf(couponDiscountLabelText));
			return couponDiscountLabelText;
		}
	}

}
