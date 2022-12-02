/**
 * 
 */
package com.nanda.testlab.selenium.problems;

import com.nanda.testlab.selenium.driver.DriverHelper;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Nandakumar 
 * 26-Apr-2017
 *
 */
public class AlertMessageTest {
    
    public static void main(String[] args) {
	
	
	WebDriver driver = DriverHelper.getChromeDriver();
	 driver.get("http://demo.guru99.com/V4/");			
		
         driver.findElement(By.name("uid")).sendKeys("mngr4806");					
         driver.findElement(By.name("password")).sendKeys("ejunEmA");
         driver.findElement(By.name("btnLogin")).submit();
         
         Alert alertBox =driver.switchTo().alert();
         System.out.println(alertBox.getText());
         alertBox.accept();
         
         			
        
         
       
         
         
         
         
         
    }
    

}
