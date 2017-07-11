/**
 * 
 */
package com.nanda.testlab.selenium.problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;

import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author Nandakumar 30-Apr-2017
 *
 */
@Test(groups = { "Locators" })
public class TestLocatorFeature {

    static WebDriver driver = null;

    final static String pageUrl = "http://demo.guru99.com/selenium/facebook.html";

    @BeforeTest
    public void openPage() throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(pageUrl);
	sleep();

    }

    @Test
    public void testId() {

	WebElement email = driver.findElement(By.id("email"));
	assertEquals(email.isDisplayed(), true);

    }

    @Test
    public void testXPATH() {

	WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	assertEquals(email.isDisplayed(), true);

    }

    @Test
    public void testName() {

	WebElement email = driver.findElement(By.name("email"));
	assertEquals(email.isDisplayed(), true);

    }

    @Test
    public void testLinkText() {

	WebElement email = driver.findElement(By.linkText("Forgot your password?"));
	assertEquals(email.isDisplayed(), true);

    }

    @Test
    public void testPartialLinkText() {

	WebElement email = driver.findElement(By.partialLinkText("Forgot"));
	assertEquals(email.isDisplayed(), true);

    }

    @Test
    public void testTagName() {

	WebElement email = driver.findElement(By.tagName("center"));
	assertEquals(email.isDisplayed(), true);

    }

    @Test
    public void testClassName() {

	List<WebElement> inputtexts = driver.findElements(By.className("inputtext"));
	for (WebElement inputtext : inputtexts)
	    assertEquals(inputtext.isDisplayed(), true);

    }
    
    @Test
    public void testCSS() {

	WebElement email = driver.findElement(By.cssSelector("input[id=email]"));
	assertEquals(email.isDisplayed(), true);

    }

    @AfterTest
    public void closePage() throws InterruptedException {

	sleep();
	driver.close();

    }

    public static void sleep() throws InterruptedException {

	Thread.sleep(1000);
    }

}
