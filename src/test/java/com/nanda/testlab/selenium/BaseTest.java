/**
 * 
 */
package com.nanda.testlab.selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.nanda.testlab.selenium.driver.DriverHelper;
//import com.nanda.testng.logging.LoggingType;
//import com.nanda.testng.logging.TestConsoleLogger;

/**
 * @author Nandakumar 20-Apr-2017
 *
 */

public class BaseTest {

    protected WebDriver testDriver;

    @BeforeSuite
    public void initDriver() {

	testDriver = DriverHelper.getFireFoxDriver();
	//TestConsoleLogger.log(LoggingType.Info, new StringBuilder("FireFox Driver Created."));
    }

    @AfterSuite
    public void closeDriver() {

	testDriver.quit();
	//TestConsoleLogger.log(LoggingType.Info, new StringBuilder("FireFox Driver Closed."));
    }

}
