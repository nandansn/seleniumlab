/**
 * 
 */
package com.nanda.testlab.selenium.driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Nandakumar 
 * 20-Apr-2017
 *
 */
public class DriverHelper {
    
    public static FirefoxDriver getFireFoxDriver(){
	
	System.setProperty("webdriver.gecko.driver", "c:/gecko/geckodriver.exe");
	
	return new FirefoxDriver();
    }
    
    
    public static ChromeDriver getChromeDriver(){
	
	System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
	
	return new ChromeDriver();
    }

}
