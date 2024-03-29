package com.nanda.app.ecomm.gurru99;

import com.nanda.testlab.selenium.actions.AccountDashboardPageActions;
import com.nanda.testlab.selenium.actions.LoginPageActions;
import com.nanda.testlab.selenium.ecomm.page.AccountDashboardPage;
import com.nanda.testlab.selenium.ecomm.page.CheckoutPage;
import com.nanda.testlab.selenium.ecomm.page.CheckoutSuccessPage;
import com.nanda.testlab.selenium.ecomm.page.HomePage;
import com.nanda.testlab.selenium.ecomm.page.MobilePage;
import com.nanda.testlab.selenium.ecomm.page.ProductConfigurePage;
import com.nanda.testlab.selenium.ecomm.page.ShoppingCartPage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

@Test
public class PurchaseItemTest extends BaseTest {

	String email = "jumjum" + new Random().nextInt() + "@gmail.com";
	String userPassword = "password123";

	final static Logger logger = LogManager.getLogger(PurchaseItemTest.class);

	@Test
	public void testAccountCreation() {

		chromerDriver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/a/span[2]")).click();

		chromerDriver.findElement(By.xpath("//*[@id=\"header-account\"]/div/ul/li[5]/a")).click();

		chromerDriver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("N");

		chromerDriver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("K");

		chromerDriver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys(email);

		chromerDriver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(userPassword);

		chromerDriver.findElement(By.xpath("//*[@id=\"confirmation\"]")).sendKeys(userPassword);

		chromerDriver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/button/span/span")).submit();

		Assert.assertEquals(chromerDriver
				.findElement(
						By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div/ul/li/ul/li/span\r\n" + ""))
				.getText(), "Thank you for registering with Main Website Store.");

		chromerDriver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[2]/a")).click();

		chromerDriver
				.findElement(By.xpath(
						"//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/ul/li[1]/a"))
				.click();

		chromerDriver.findElement(By.xpath("//*[@id=\"wishlist-view-form\"]/div/div/button[1]/span/span")).click();

		chromerDriver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys(email);

		chromerDriver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/button/span/span")).click();

		Assert.assertEquals(chromerDriver
				.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div[1]/ul/li/ul/li/span"))
				.getText(), "Your Wishlist has been shared.");
	}

	@Test(dependsOnMethods = { "testAccountCreation" })
	public void testItemPurchase() throws InterruptedException {

		chromerDriver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/a/span[2]")).click();

		chromerDriver.findElement(By.xpath("//*[@id=\"header-account\"]/div/ul/li[6]/a")).click();

		chromerDriver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);

		chromerDriver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(userPassword);

		chromerDriver.findElement(By.xpath("//*[@id=\"send2\"]")).click();

		chromerDriver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[1]/div/div[2]/ul/li[8]/a"))
				.click();

		chromerDriver.findElement(By.xpath(
				"//td[@class=\"wishlist-cell1 customer-wishlist-item-info\"]/following-sibling::td/following-sibling::td/following-sibling::td/div/button/span/span"))
				.click();

		chromerDriver
				.findElement(By.xpath(
						"//*[@id=\"top\"]/body/div/div/div[2]/div/div/div/div[1]/ul/li/button/span/span\r\n" + ""))
				.click();

		chromerDriver.findElement(By.xpath("//*[@id=\"billing:street1\"]")).sendKeys("ABC");
		chromerDriver.findElement(By.xpath("//*[@id=\"billing:city\"]")).sendKeys("New York");

		Select selectRegion = new Select(chromerDriver.findElement(By.xpath("//*[@id=\"billing:region_id\"]")));
		selectRegion.selectByVisibleText("New York");
		chromerDriver.findElement(By.xpath("//*[@id=\"billing:postcode\"]")).sendKeys("542896");

		Select selectCountry = new Select(chromerDriver.findElement(By.xpath("//*[@id=\"billing:country_id\"]")));
		selectCountry.selectByVisibleText("United States");

		chromerDriver.findElement(By.xpath("//*[@id=\"billing:telephone\"]")).sendKeys("12345678");

		WebDriverWait wait = new WebDriverWait(chromerDriver, 10);

		WebElement button = chromerDriver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button"));

		wait.until(ExpectedConditions.visibilityOf(button));

		button.click();

		wait.until(ExpectedConditions.invisibilityOf(button));
		WebElement priceLabel = chromerDriver
				.findElement(By.xpath("//*[@id=\"checkout-shipping-method-load\"]/dl/dd/ul/li/label"));

		wait.until(ExpectedConditions.visibilityOf(priceLabel));

		chromerDriver.findElement(By.xpath("//*[@id=\"checkout-shipping-method-load\"]/dl/dd/ul/li/label/span"))
				.getText();

		wait = new WebDriverWait(chromerDriver, 10);

		chromerDriver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button")).click();

		wait.until(ExpectedConditions.invisibilityOf(
				chromerDriver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button"))));

		chromerDriver.findElement(By.xpath("//*[@id=\"p_method_checkmo\"]")).click();

		wait = new WebDriverWait(chromerDriver, 10);

		chromerDriver.findElement(By.xpath("//*[@id=\"payment-buttons-container\"]/button")).click();

		wait.until(ExpectedConditions
				.invisibilityOf(chromerDriver.findElement(By.xpath("//*[@id=\"payment-buttons-container\"]/button"))));

		chromerDriver.findElement(By.xpath("//*[@id=\"checkout-review-table\"]/tfoot/tr[1]/td[2]/span")).getText();
		chromerDriver.findElement(By.xpath("//*[@id=\"checkout-review-table\"]/tfoot/tr[2]/td[2]/span")).getText();
		chromerDriver.findElement(By.xpath("//*[@id=\"checkout-review-table\"]/tfoot/tr[3]/td[2]/strong/span"))
				.getText();

		wait = new WebDriverWait(chromerDriver, 10);

		chromerDriver.findElement(By.xpath("//*[@id=\"review-buttons-container\"]/button")).click();

		wait.until(ExpectedConditions
				.invisibilityOf(chromerDriver.findElement(By.xpath("//*[@id=\"review-buttons-container\"]/button"))));

		chromerDriver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/div[1]/h1")).getText();
		chromerDriver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/p[1]/a")).getText();
	}

	@Test(dependsOnMethods = { "testItemPurchase" })
	public void testReOrder() {
		
		logger.info("Email:"+email);

		HomePage homePage = new HomePage(chromerDriver);
		homePage.getAccountLink().click();

		HomePage.Account account = homePage.new Account(chromerDriver);

		account.getLoginLink().click();

		LoginPageActions.login(chromerDriver, email, userPassword);

		new AccountDashboardPage(chromerDriver).getReOrderLink().click();
		
		ShoppingCartPage shoppingCartPage =new ShoppingCartPage(chromerDriver);
		shoppingCartPage.getEditOrderLink().click();
		
		

		ProductConfigurePage productConfigurePage = new ProductConfigurePage(chromerDriver);
		productConfigurePage.getQuantityTextbox().sendKeys("2");
		productConfigurePage.getUpdateCartButton().click();
		
		logger.info(shoppingCartPage.getSubTotalLabel().getText());
		
		shoppingCartPage.getProceedToChecoutButton().click();

		CheckoutPage checkOutPage = new CheckoutPage(chromerDriver);
		checkOutPage.getBillingContinueButton().click();
		
		checkOutPage.getShippingMethodContinueButton().click();

		checkOutPage.getCheckOrMoneyOrderRadioButton().click();

		checkOutPage.getPaymentInformationButton().click();

		checkOutPage.getPlaceOrderButton().click();

		logger.info(new CheckoutSuccessPage(chromerDriver).getOrderIdLink().getText());

	}
	
	@Test(dependsOnMethods= {"testReOrder"})
	public void testApplyCouponCode()
	{
		
		HomePage homePage = new HomePage(chromerDriver);
		homePage.getMobileCategoryLink().click();
		
		
		MobilePage mobilePage = new MobilePage(chromerDriver);
		mobilePage.getAddToCartButton().click();
		
		ShoppingCartPage shoppingCartPage = new ShoppingCartPage(chromerDriver);
		shoppingCartPage.getCouponCodeTextbox().sendKeys("GURU50");
		
		shoppingCartPage.getCouponApplyLink().click();	
		
		logger.info(shoppingCartPage.getCouponAppliedText().getText());
		
		shoppingCartPage.getProceedToChecoutButton().click();
		
		LoginPageActions.login(chromerDriver, email, userPassword);
		
		
		CheckoutPage checkOutPage = new CheckoutPage(chromerDriver);
		checkOutPage.getBillingContinueButton().click();
		
		checkOutPage.getShippingMethodContinueButton().click();

		checkOutPage.getCheckOrMoneyOrderRadioButton().click();

		checkOutPage.getPaymentInformationButton().click();
		
		CheckoutPage.OrderReview orderReview = new CheckoutPage.OrderReview(chromerDriver);
		logger.info(orderReview.getCouponDiscountLabelText().getText());
		
		
	}

	@Test(enabled=false)
	public void testPDFOrder() {

		chromerDriver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/a/span[2]")).click();

		chromerDriver.findElement(By.xpath("//*[@id=\"header-account\"]/div/ul/li[6]/a")).click();

		LoginPageActions.login(chromerDriver, "jumjum-1148660382@gmail.com", userPassword);

		logger.info(AccountDashboardPageActions.getRecentOrderText(chromerDriver));

	}

	@Test(dependsOnMethods = { "testItemPurchase" },enabled=false)
	public void testOrderSavedAsPDFFile() {

		System.out.println(email);

	}
}
