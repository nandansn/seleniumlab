/**
 * 
 */
package com.nanda.app.store.test;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
    String url = "http://www.amazon.in/";
    final private static Logger logger = LogManager.getLogger("Store App Navigation Test");

    @BeforeClass
    public void startDriver() {

	System.setProperty("webdriver.chrome.driver", "/Users/nrangasa/driver/chromedriver");
	driver = new ChromeDriver();
    }

    @Test
    public void testOne() {

	driver.get(url);
	
	driver.findElement(By.xpath(".//*[@id='nav-hamburger-menu']")).click();

	logger.info("Back:" );
	driver.navigate().back();

	logger.info("Forward:" );
	driver.navigate().forward();

	logger.info("Navigate to:" );
	driver.navigate().to(url);
	
	driver.navigate().refresh();
	
	
	
	
	

    }

    @AfterClass
    public void stopDriver() {

	driver.close();
    }

}
