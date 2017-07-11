/**
 * 
 */
package com.nanda.testlab.selenium.test;

import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.nanda.testlab.selenium.page.IndeedHomePage;
import com.nanda.testlab.selenium.page.Page;
import com.nanda.testng.lab.listeners.WebTestListener;

/**
 * @author Nandakumar 20-Apr-2017
 *
 */
@Listeners(WebTestListener.class)
public class IndeedHomePageTest {

    /*
     * @Test(groups = { "Core" }, enabled = false) public void testCaseTitle() {
     * 
     * testDriver.get(new IndeedHomePage().getLink());
     * 
     * TestConsoleLogger.log(LoggingType.Info, new
     * StringBuilder(testDriver.getTitle()));
     * 
     * WebAsserts.assertEquals(testDriver.getTitle(), testDriver.getTitle());
     * 
     * }
     */

    @Test(groups = { "Core", "WebElements" }, enabled = false)
    public void testFindJobButton() throws JsonSyntaxException, JsonIOException, FileNotFoundException {

	IndeedHomePage homePage = IndeedHomePage.loadPage();

	homePage.clickFindJobButton();

    }
    
    @Test(groups = { "Core", "WebElements" }, enabled = false)
    public void testFindJobSearch() throws JsonSyntaxException, JsonIOException, FileNotFoundException {

	IndeedHomePage homePage = IndeedHomePage.loadPage();
	
	homePage.sendTextToWhatTextBox("Automation Testing");
	homePage.sendTextToWhereTextBox("London, Greater London");
	homePage.clickFindJobButton();
	homePage.close();
	
	
    }
    
    @Test
    public void testMe(){
	
	 Logger log = Logger.getLogger(IndeedHomePageTest.class);
	 log.info("Nanda");
    }

}
