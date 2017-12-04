package com.nanda.testlab.selenium.guru99.test;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsTest extends BaseTest {
	
	@Test
	private void testJS() {

		driver.get("http://demo.guru99.com/V4/");
		
		Actions actions = new Actions(driver);
		actions.click().build();
	}
	

}
