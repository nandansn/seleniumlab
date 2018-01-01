package com.nanda.testlab.selenium.ecomm.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutSuccessPage {

	@FindBy(xpath = "//*[@id=\"top\"]/body/div/div/div[2]/div/div/p[1]/a")
	WebElement orderId;

	WebDriverWait wait;

	public CheckoutSuccessPage(WebDriver driver) {
		super();
		wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrderIdLink() {

		wait.until(ExpectedConditions.visibilityOf(orderId));

		return orderId;
	}

}
