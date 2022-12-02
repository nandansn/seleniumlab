package com.nanda.testlab.selenium.link;

import com.nanda.testlab.selenium.select.SelectAPITest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinksAPITest {
	
	WebDriver driver;

	String url = "http://live.guru99.com/index.php/";

	final static Logger logger = LogManager.getLogger(SelectAPITest.class);

	@BeforeMethod
	public void launchApp() {

		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");

		driver = new ChromeDriver();

	}
	
	@Test
	public void testLinks() {
		driver.get(url);
		
		driver.findElement(By.linkText("TV")).click();
		
		driver.findElement(By.partialLinkText("Compare")).click();
		
		
		
		logger.info("Number of links:"+driver.findElements(By.tagName("a")).size());
		
		driver.navigate().forward();
		
		logger.info("Number of links:"+driver.findElements(By.tagName("a")).size());
		
		driver.findElement(By.cssSelector("img[alt='Magento Commerce']")).click(); // image link using css selector
		
		
		
	}
	
	@AfterMethod
	public void closeApp() {
		driver.close();
	}

}
