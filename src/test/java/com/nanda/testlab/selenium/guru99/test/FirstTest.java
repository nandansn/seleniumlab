package com.nanda.testlab.selenium.guru99.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
	
	@Test
	public void testPage() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nandakumar_rangasamy\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/newtours/");
		
		Assert.assertEquals(driver.getTitle(), "Welcome: Mercury Tours");
		
		driver.close();
		
	}

}
