/**
 * 
 */
package com.nanda.testlab.selenium.problems;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

/**
 * @author Nandakumar 
 * 30-Apr-2017
 *
 */
public class TestFormElements {
    
    static WebDriver driver = null;
    
    final static String pageUrl ="";
    
    @BeforeClass
    public void createDriverInstance(){
	
	System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
	driver = new ChromeDriver();
	
    }
    
    

}
