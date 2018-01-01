package com.nanda.testlab.selenium.select;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nanda.app.ecomm.gurru99.PurchaseItemTest;

public class SelectAPITest {

	WebDriver driver;

	String url = "http://demo.guru99.com/selenium/newtours/register.php";

	final static Logger logger = Logger.getLogger(SelectAPITest.class);

	@BeforeMethod
	public void launchApp() {

		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");

		driver = new ChromeDriver();

	}

	@Test
	public void testSelectAPI() throws InterruptedException {

		driver.get(url);

		// select

		Select selectCountry = new Select(driver.findElement(By.xpath("//select[@name=\"country\"]")));

		if (selectCountry.isMultiple()) {
			logger.info("Multiple select allowed");
		} else {
			logger.info("Multiple select not allowed");
			selectCountry.selectByIndex(3);
			
			
		}
		
		Thread.sleep(3000);


		

		for (WebElement iterable_element : selectCountry.getOptions()) {

			logger.info(iterable_element.getText());

		}

		driver.get("http://output.jsbin.com/osebed/2");

		selectCountry = new Select(driver.findElement(By.xpath("//select[@id=\"fruits\"]")));

		if (selectCountry.isMultiple()) {

			logger.info("Multiple select allowed");

			selectCountry.selectByValue("banana");
			selectCountry.selectByValue("apple");
			selectCountry.selectByVisibleText("Orange");
			selectCountry.selectByIndex(3);
			
			Thread.sleep(3000);

			selectCountry.deselectByIndex(2);
			selectCountry.deselectByValue("apple");
			selectCountry.deselectByVisibleText("Banana");

		} else {
			logger.info("Multiple select not allowed");
		}

		

	}

	@AfterMethod
	public void closeApp() {
		driver.close();
	}
}
