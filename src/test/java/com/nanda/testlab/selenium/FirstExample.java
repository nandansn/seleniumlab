/**
 * 
 */
package com.nanda.testlab.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Nandakumar 
 * 20-Apr-2017
 *
 */
public class FirstExample {
    
    public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
	WebDriver fireFoxDriver = new FirefoxDriver();
	
	fireFoxDriver.get("http://www.google.com");
	
	fireFoxDriver.getTitle();	
	
	fireFoxDriver.close();
	
    }

}
