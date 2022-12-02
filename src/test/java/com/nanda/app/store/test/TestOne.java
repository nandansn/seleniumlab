/**
 * 
 */
package com.nanda.app.store.test;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @author Nandakumar 17-May-2017
 *
 */
public class TestOne {

    WebDriver driver = null;
    String url = "http://store.demoqa.com/";
    final private static Logger logger = LogManager.getLogger("Store App Test");

    @BeforeClass
    public void startDriver() {

	System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
	driver = new ChromeDriver();
    }

    @Test
    public void testOne() {

	driver.get(url);

	logger.info("Title:" + driver.getTitle());
	logger.info("Title Length:" + driver.getTitle().length());
	logger.info(driver.getCurrentUrl());
	assertEquals(driver.getCurrentUrl(), url);
	logger.info("Page Source:" + driver.getPageSource());
	logger.info("Page Source Length:" + driver.getPageSource().length());
	
	

    }

    @AfterClass
    public void stopDriver() {

	driver.close();
    }

}
