package com.nanda.testlab.selenium.guru99.test;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	protected WebDriver driver = null;

	protected Logger logger = null;

	@BeforeTest
	public void init() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nandakumar_rangasamy\\chromedriver\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1024,768");

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(capabilities);
		driver = new ChromeDriver();

		logger = LogManager.getLogger("Registration Form Test");

	}

	@AfterTest
	public void close() {
		driver.close();
	}

}
