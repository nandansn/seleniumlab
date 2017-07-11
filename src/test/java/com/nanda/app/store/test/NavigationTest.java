/**
 * 
 */
package com.nanda.app.store.test;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author Nandakumar 
 * 17-May-2017
 *
 */
public class NavigationTest {
    
    WebDriver driver = null;
    String url = "http://www.demoqa.com/";
    final private static Logger logger = Logger.getLogger("Store App Navigation Test");

    @BeforeClass
    public void startDriver() {

	System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
	driver = new ChromeDriver();
    }

    @Test
    public void testOne() {

	driver.get(url);
	
	driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();

	logger.info("Back:" );
	driver.navigate().back();
	
	driver.navigate().forward();
	
	driver.navigate().to(url);
	
	driver.navigate().refresh();
	
	
	
	
	

    }

    @AfterClass
    public void stopDriver() {

	driver.close();
    }

}
