package com.nanda.testlab.selenium.guru99.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;



public class JSExecutorTest extends BaseTest {

	@Test
	private void testJS() {

		driver.get("http://demo.guru99.com/V4/");

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		jsExecutor.executeScript("alert('hello world');");

		logger.info(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	}

}
