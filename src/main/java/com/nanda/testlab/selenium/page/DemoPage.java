/**
 * 
 */
package com.nanda.testlab.selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Nandakumar 
 * 30-Apr-2017
 *
 *  Page Object Model, Page Object Factory
 *  https://www.guru99.com/page-object-model-pom-page-factory-in-selenium-ultimate-guide.html
 *
 *
 */
public class DemoPage {

    By login = By.name("login");

    @FindBy(name = "nanda")
    WebElement element;

    public void DemoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void lazyLoading(WebDriver driver) {
        AjaxElementLocatorFactory ajaxElementLocatorFactory = new AjaxElementLocatorFactory(driver, 10);
        PageFactory.initElements(ajaxElementLocatorFactory, this);

    }

    public void doLogin() {
        element.click();
    }





}
