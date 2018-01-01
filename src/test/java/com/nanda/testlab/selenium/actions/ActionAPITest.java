package com.nanda.testlab.selenium.actions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nanda.testlab.selenium.select.SelectAPITest;

public class ActionAPITest {

	WebDriver driver;

	String url = "http://live.guru99.com/index.php/";

	final static Logger logger = Logger.getLogger(SelectAPITest.class);

	@BeforeMethod
	public void launchApp() {

		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");

		driver = new ChromeDriver();

	}

	@Test
	public void testActions() throws InterruptedException {

		driver.get(url);

		Actions actions = new Actions(driver);
		Action action = actions.contextClick().build();

		action.perform();

		actions.moveToElement(driver.findElement(By.cssSelector("input#newsletter"))).click().keyDown(Keys.SHIFT)
				.sendKeys("nanda").keyUp(Keys.SHIFT).doubleClick().build().perform();

		Thread.sleep(2000);

	}

	@AfterMethod
	public void closeApp() {
		driver.close();
	}
}
