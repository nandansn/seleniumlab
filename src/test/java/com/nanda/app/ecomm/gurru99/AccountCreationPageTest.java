package com.nanda.app.ecomm.gurru99;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountCreationPageTest extends BaseTest {

	
	
	 String email = "jumjum"+new Random().nextInt()+"@gmail.com";

	
	
	@Test(groups= {"account.item"})
	public void testAccountCreation() {
		
		chromerDriver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/a/span[2]")).click();
		
		chromerDriver.findElement(By.xpath("//*[@id=\"header-account\"]/div/ul/li[5]/a")).click();
		
		
		chromerDriver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("N");
		
		chromerDriver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("K");
		
		
		
		
		
		chromerDriver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys(email);
		
		chromerDriver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("gurrugurru");
		
		chromerDriver.findElement(By.xpath("//*[@id=\"confirmation\"]")).sendKeys("gurrugurru");
		
		chromerDriver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/button/span/span")).submit();
		
		Assert.assertEquals(chromerDriver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div/ul/li/ul/li/span\r\n" + 
				"")).getText(), "Thank you for registering with Main Website Store.");
		
		chromerDriver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[2]/a")).click();
		
		chromerDriver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/ul/li[1]/a")).click();
		
		chromerDriver.findElement(By.xpath("//*[@id=\"wishlist-view-form\"]/div/div/button[1]/span/span")).click();
		
		chromerDriver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys(email);
		
		chromerDriver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/button/span/span")).click();
		
		Assert.assertEquals(chromerDriver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div[1]/ul/li/ul/li/span")).getText(),"Your Wishlist has been shared.");
	}

	

}
