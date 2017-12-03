package com.nanda.app.ecomm.gurru99;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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

	WebDriver firefoxDriver = null;

	String ecommSiteUrl = "http://live.guru99.com/index.php/";

	@BeforeMethod
	public void setDriver() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nandakumar_rangasamy\\chromedriver\\chromedriver.exe");

		firefoxDriver = new ChromeDriver();
	}

	@Test
	public void testMobileList() {

		firefoxDriver.get(ecommSiteUrl);

		WebElement headElement = firefoxDriver.findElement(By.tagName("h2"));
		String titleText = headElement.getText();

		Assert.assertTrue(titleText.contains("THIS IS DEMO SITE"));

		WebElement mobileMenu = firefoxDriver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a"));

		mobileMenu.click();

		WebElement mobileTitle = firefoxDriver
				.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[1]/h1"));
		
		

		Assert.assertTrue(mobileTitle.getText().contains("MOBILE"));

		Select mobileSelectOptions = new Select(firefoxDriver.findElement(
				By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")));

		mobileSelectOptions.selectByVisibleText("Name");

		List<WebElement> mobileList = firefoxDriver
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
	
	@AfterMethod
	public void closeApp() {
		firefoxDriver.close();
	}

}
