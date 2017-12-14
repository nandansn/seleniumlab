package com.nanda.app.ecomm.gurru99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	WebDriver chromerDriver = null;

	String ecommSiteUrl = "http://live.guru99.com/index.php/";

	@BeforeMethod
	public void setDriver() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nandakumar_rangasamy\\chromedriver\\chromedriver.exe");

		chromerDriver = new ChromeDriver();
		
		chromerDriver.get(ecommSiteUrl);

	}
	
		
	@AfterMethod
	public void closeApp() {
		chromerDriver.quit();
	}

}
