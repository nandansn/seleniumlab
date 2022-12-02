package com.nanda.testlab.selenium.guru99.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class RegisterPageTest extends BaseTest{
	
	private String appUrl = "http://demo.guru99.com/selenium/newtours/register.php";
	
	@Test
	public void testRegister() {
		
		driver.get(appUrl);
		
		WebElement firstName = driver.findElement(By.xpath("//form/table/tbody/tr[2]/td[2]/input"));
		WebElement lastName = driver.findElement(By.xpath("//form/table/tbody/tr[3]/td[2]/input"));
		WebElement phone = driver.findElement(By.xpath("//form/table/tbody/tr[4]/td[2]/input"));
		WebElement email = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
		WebElement address = driver.findElement(By.xpath("//form/table/tbody/tr[7]/td[2]/input"));
		WebElement city = driver.findElement(By.xpath("//form/table/tbody/tr[8]/td[2]/input"));
		WebElement state = driver.findElement(By.xpath("//form/table/tbody/tr[9]/td[2]/input"));
		WebElement postalCode = driver .findElement(By.xpath("//form/table/tbody/tr[10]/td[2]/input"));
		WebElement country = driver.findElement(By.xpath("//form/table/tbody/tr[11]/td[2]/select"));
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		WebElement pwd = driver.findElement(By.xpath("//form/table/tbody/tr[14]/td[2]/input"));
		WebElement confirmPwd = driver.findElement(By.xpath("//form/table/tbody/tr[15]/td[2]/input"));
		
		Select selectCountry = new Select(country);
		
		List<WebElement> options = selectCountry.getOptions();
		
		for (WebElement option: options) {
			
			logger.info("Country:"+option.getText());
			
		}
		
		if(selectCountry.isMultiple()) 
			 logger.info("Allows Multiple");
		else
		    logger.info("Do not allow multiple"); 
	}

}
