/**
 * 
 */
package com.nanda.testlab.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*import com.nanda.testng.lab.listeners.MyListener;
import com.nanda.testng.logging.LoggingType;
import com.nanda.testng.logging.TestConsoleLogger;*/


/**
 * @author Nandakumar 
 * 20-Apr-2017
 *
 */
@Test
//@Listeners(MyListener.class)
public class FirstTest {
    
    static final String APP_HOME_URL ="http://www.google.com";
    
    @BeforeTest
    public void doDriverSetup(){
	
	System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
    }
    
    @Test
    public void testWeb() throws InterruptedException{
	
	WebDriver fireFoxDriver = new FirefoxDriver();
	fireFoxDriver.get(APP_HOME_URL);
	
	
	StringBuilder logMessage = new StringBuilder();
	logMessage.append("Window Title:").append(fireFoxDriver.getTitle());
	
	//TestConsoleLogger.log(LoggingType.Info, logMessage);
	
	Thread.sleep(3000);
	
	fireFoxDriver.quit();
	
    }

}
