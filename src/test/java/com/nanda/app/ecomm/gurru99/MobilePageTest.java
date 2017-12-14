package com.nanda.app.ecomm.gurru99;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MobilePageTest {

	WebDriver chromerDriver = null;

	String ecommSiteUrl = "http://live.guru99.com/index.php/";

	@BeforeMethod
	public void setDriver() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nandakumar_rangasamy\\chromedriver\\chromedriver.exe");

		chromerDriver = new ChromeDriver();
	}

	@Test
	public void testMobileList() {

		chromerDriver.get(ecommSiteUrl);

		int[] arry = null;

		WebElement headElement = chromerDriver.findElement(By.tagName("h2"));
		String titleText = headElement.getText();

		Assert.assertTrue(titleText.contains("THIS IS DEMO SITE"));

		WebElement mobileMenu = chromerDriver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a"));

		mobileMenu.click();

		WebElement mobileTitle = chromerDriver
				.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[1]/h1"));

		Assert.assertTrue(mobileTitle.getText().contains("MOBILE"));

		Select mobileSelectOptions = new Select(chromerDriver.findElement(
				By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")));

		mobileSelectOptions.selectByVisibleText("Name");

		List<WebElement> mobileList = chromerDriver
				.findElements(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li"));

		List<String> actualNames = new ArrayList<String>();

		TreeSet<String> setOfNames = new TreeSet<String>();

		for (WebElement name : mobileList) {
			setOfNames.add(name.getText().split("\n")[0]);
			actualNames.add(name.getText().split("\n")[0]);

		}

		List<String> expectedNames = new ArrayList<String>();

		expectedNames.addAll(setOfNames);

		Assert.assertTrue(actualNames.equals(expectedNames));

	}

	@Test
	public void testMobileDetails() {

		chromerDriver.get(ecommSiteUrl);

		WebElement mobileMenu = chromerDriver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a"));

		mobileMenu.click();

		String sonyXperiaPrice = chromerDriver.findElement(By.xpath("//*[@id=\"product-price-1\"]/span")).getText();

		chromerDriver.findElement(By.xpath("//*[@id=\"product-collection-image-1\"]")).click();

		String sonyXperiaPriceInDetailsPage = chromerDriver.findElement(By.xpath("//*[@id=\"product-price-1\"]/span"))
				.getText();

		Assert.assertEquals(sonyXperiaPrice, sonyXperiaPriceInDetailsPage);

	}

	@Test
	public void testErrorVerification() {

		chromerDriver.get(ecommSiteUrl);

		WebElement mobileMenu = chromerDriver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a"));

		mobileMenu.click();
		
		
		chromerDriver.findElement(By.xpath("//h2[@class='product-name']/a[contains(text(),'Sony')]/../following-sibling::div/following-sibling::div/following-sibling::div/button/span/span")).click();
		
		chromerDriver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/input")).sendKeys("1000");
		
		chromerDriver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/button")).click();
		
		String errorMessage = chromerDriver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/div/ul/li/ul/li/span")).getText();
		
		Assert.assertEquals(errorMessage, "Some of the products cannot be ordered in requested quantity.");
		
		chromerDriver.findElement(By.xpath("//*[@id=\"empty_cart_button\"]/span/span")).click();
		
		String emptyCartMessage = chromerDriver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/div[1]/h1")).getText();
		
		Assert.assertEquals(emptyCartMessage, "SHOPPING CART IS EMPTY");

	}
	
	@Test
	public void testPopUp() {
		
		chromerDriver.get(ecommSiteUrl);

		WebElement mobileMenu = chromerDriver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a"));

		mobileMenu.click();
		
		chromerDriver.findElement(By.xpath("//h2[@class='product-name']/a[contains(text(),'Sony')]/../following-sibling::div/following-sibling::div/following-sibling::div/ul/li[2]/a")).click();
		
		chromerDriver.findElement(By.xpath("//h2[@class='product-name']/a[contains(text(),'IPhone')]/../following-sibling::div/following-sibling::div/following-sibling::div/ul/li[2]/a")).click();
		
		chromerDriver.findElement(By.xpath("//div[@class='actions']/button[@type='button' and @title='Compare']/span")).click();
		
		
		Set<String> popUpWindows = chromerDriver.getWindowHandles();
		
		Iterator<String> popUpWindow = popUpWindows.iterator();
		
		while(popUpWindow.hasNext()) {
			String window = popUpWindow.next();
			
			if(chromerDriver.switchTo().window(window).getTitle().contains("Products Comparison List")){
			
			Assert.assertTrue(chromerDriver.findElement(By.xpath("//*[@id=\"product_comparison\"]/tbody[1]/tr[1]/td[1]/h2/a")).getText().contains("SONY"));
			
			Assert.assertTrue(chromerDriver.findElement(By.xpath("//*[@id=\"product_comparison\"]/tbody[1]/tr[1]/td[2]/h2/a")).getText().contains("IPHONE"));
			
			}
			
			
		}
	}

	@AfterMethod
	public void closeApp() {
		chromerDriver.close();
	}

}
