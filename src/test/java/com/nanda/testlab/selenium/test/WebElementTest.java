/**
 * 
 */
package com.nanda.testlab.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.nanda.testng.lab.listeners.WebTestListener;

/**
 * @author Nandakumar 
 * 26-Apr-2017
 *
 */
@Listeners(WebTestListener.class)
public class WebElementTest {
    
    @Test
    public void testSelect(){
	
	System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://newtours.demoaut.com/mercuryregister.php");
	Select selectCountry = new Select(driver.findElement(By.name("country")));
	selectCountry.selectByIndex(2);
    }

}
