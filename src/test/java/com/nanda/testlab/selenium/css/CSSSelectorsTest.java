package com.nanda.testlab.selenium.css;

import com.nanda.testlab.selenium.select.SelectAPITest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CSSSelectorsTest {
	
	WebDriver driver;

	String url = "http://live.guru99.com/index.php/";

	final static Logger logger = LogManager.getLogger(SelectAPITest.class);

	@BeforeMethod
	public void launchApp() {

		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");

		driver = new ChromeDriver();

	}
	
	@Test
	public void testCSSSelectors() {
		
		driver.get(url);
		
		driver.findElement(By.cssSelector("#newsletter")).sendKeys("dummy@gmail.com"); //Using id attribute
		
		driver.findElement(By.cssSelector("button[class='button'][title='Subscribe'][type='submit']")).click(); //Using multiple attributes
		
		java.util.List<WebElement> listCategory = driver.findElements(By.cssSelector("nav#nav ol.nav-primary li"));
		
		for (int i = 1; i <= listCategory.size(); i++) {
			
					
			logger.info(driver.findElement(By.cssSelector("nav#nav ol.nav-primary li:nth-of-type("+i+") a")).getText());
			
			driver.findElement(By.cssSelector("nav#nav ol.nav-primary li:nth-of-type("+i+") a")).click(); //. is used to refer the class attribute.
			
			java.util.List<WebElement> list = driver.findElements(By.cssSelector("div.category-products ul[class^='products-grid'] li[class^='item']")); // class starts with item
			
			for (WebElement webElementProducts : list) {
				logger.info(webElementProducts.findElement(By.cssSelector("div.product-info h2.product-name a")).getText());
			}
			
			driver.findElement(By.cssSelector("a.logo")).click();
			
		}
		
		
	}
	
	@AfterMethod
	public void closeApp() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}
