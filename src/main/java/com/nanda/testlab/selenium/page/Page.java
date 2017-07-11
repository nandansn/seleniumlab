/**
 * 
 */
package com.nanda.testlab.selenium.page;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nanda.testlab.selenium.driver.DriverHelper;
import com.nanda.testlab.selenium.page.element.Button;
import com.nanda.testlab.selenium.page.element.TextBox;

/**
 * @author Nandakumar 20-Apr-2017
 *
 */
public class Page {

    final static WebDriver driver = DriverHelper.getChromeDriver();
    final static Logger log = Logger.getLogger(Page.class);

    static void open(String link) {
	
	log.info("Opening the page");
	driver.get(link);

    }
    
    static void closePage(){
	log.info("Closing the page");
	driver.close();
    }

    public void clickButton(Button button) {
	
	// Explicit fluent wait
	Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS).withMessage("Waiting for element...").ignoring(Exception.class);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(button.getId())));
	
	log.info("Clicking the button");	
	driver.findElement(By.id(button.getId())).click();
    }

    public void type(TextBox textBox, String text) {

	/*while (!driver.findElement(By.id(textBox.getId())).isDisplayed()) {
	    TestConsoleLogger.log(LoggingType.Info, new StringBuilder("Waiting for the element.."));
	}*/
	// This is explicit wait condition
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(textBox.getId())));
	log.info("Entering the text");
	driver.findElement(By.id(textBox.getId())).sendKeys(text);

    }

}
