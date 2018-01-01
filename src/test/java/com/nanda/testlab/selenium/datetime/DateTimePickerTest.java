package com.nanda.testlab.selenium.datetime;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nanda.testlab.selenium.select.SelectAPITest;

public class DateTimePickerTest {
	
	WebDriver driver;

	String url = "http://demo.guru99.com/selenium/";

	final static Logger logger = Logger.getLogger(DateTimePickerTest.class);

	@BeforeMethod
	public void launchApp() {

		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");

		driver = new ChromeDriver();

	}
	
	@Test
	private void testDateTime() throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.get(url);
		
		driver.findElement(By.cssSelector("input[name='bdaytime']")).sendKeys("12/29/2017000846AM");
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		logger.info(driver.findElement(By.tagName("body")).getText());

	}
	
	@AfterMethod
	public void closeApp() {
		driver.close();
	}

}
