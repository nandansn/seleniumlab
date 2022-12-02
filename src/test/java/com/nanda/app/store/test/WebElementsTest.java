/**
 * 
 */
package com.nanda.app.store.test;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author Nandakumar 17-May-2017
 *
 */
public class WebElementsTest {

    WebDriver driver = null;
    String url = "http://www.demoqa.com/";
    final private static Logger logger = LogManager.getLogger("Store App Elements Test");

    @BeforeClass
    public void startDriver() {

	System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
	driver = new ChromeDriver();
    }

    @Test
    public void testElements() {

	driver.get(url);

	driver.findElement(By.xpath("//*[@id='menu-item-374']")).click();

	if (driver.findElement(By.id("name_3_firstname")).isDisplayed()) {

	    driver.findElement(By.id("name_3_firstname")).sendKeys("Nandakumar");
	}

	driver.findElement(By.id("name_3_firstname")).clear();

	driver.findElement(By.id("name_3_lastname")).sendKeys("Rangasamy");

	if (driver.findElements(By.name("radio_4[]")).get(1).isEnabled()) {

	    driver.findElements(By.name("radio_4[]")).get(1).click();
	}

	driver.findElements(By.name("checkbox_5[]")).get(1).click();

	driver.findElements(By.name("checkbox_5[]")).get(1).isSelected();

	driver.findElement(By.id("dropdown_7")).findElements(By.tagName("option")).get(2).click();

	driver.findElement(By.name("pie_submit")).submit();
	
	
	Alert alert = driver.switchTo().alert();

	


    }

    @AfterClass
    public void stopDriver() {

	driver.close();
    }

}
