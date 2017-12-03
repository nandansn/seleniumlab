package com.nanda.testlab.selenium.guru99.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	protected WebDriver driver = null;
	
	protected Logger logger = null;

	@BeforeTest
	public void init() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nandakumar_rangasamy\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		logger = Logger.getLogger("Registration Form Test");

	}
	
	@AfterTest
	public void close() {
		driver.close();
	}

}
