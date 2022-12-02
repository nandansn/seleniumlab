package com.nanda.testlab.selenium.guru99.test;

import org.apache.commons.exec.OS;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
	
	@Test
	public void testPage() {

		LogManager.getLogger(FirstTest.class).info(OS.isFamilyMac());
		
		System.setProperty("webdriver.chrome.driver", "/Users/nrangasa/driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/newtours/");
		
		Assert.assertEquals(driver.getTitle(), "Welcome: Mercury Tours");
		
		driver.close();
		
	}

}
