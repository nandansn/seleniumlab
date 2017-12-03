package com.nanda.testlab.selenium.guru99.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FormTest {

	private WebDriver driver = null;
	private String appUrl = "http://demo.guru99.com/selenium/webform/login.html";

	@BeforeTest
	public void init() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nandakumar_rangasamy\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void formTest() {

		driver.get(appUrl);
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		userName.sendKeys("nanda@abc.com");

		WebElement password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		password.sendKeys("goodguy");

		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();

	}

	@AfterTest
	public void close() {
		driver.close();
	}
}
