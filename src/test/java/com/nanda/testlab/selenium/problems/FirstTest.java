/**
 * 
 */
package com.nanda.testlab.selenium.problems;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * @author Nandakumar 
 * 17-May-2017
 *
 */
public class FirstTest {
    
    @Test
    public void testPage(){
	
	System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
	
	
    }

}
