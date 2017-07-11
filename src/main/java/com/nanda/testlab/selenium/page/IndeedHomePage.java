/**
 * 
 */
package com.nanda.testlab.selenium.page;

import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.FindBy;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.nanda.testlab.selenium.page.element.Button;
import com.nanda.testlab.selenium.page.element.Link;
import com.nanda.testlab.selenium.page.element.TextBox;
import com.nanda.testlab.selenium.resource.util.JsonPageDataToPageObjectMapper;

/**
 * @author Nandakumar 20-Apr-2017
 *
 */
public class IndeedHomePage extends Page {

    final static String filePath = "src/main/resources/home-page.json";
    
    Button findJobButton;
    String link;
    TextBox whatTextBox;
    TextBox whereTextBox;

    public static IndeedHomePage loadPage() throws JsonSyntaxException, JsonIOException, FileNotFoundException {

	IndeedHomePage homePage = (IndeedHomePage) JsonPageDataToPageObjectMapper
		.getPageObjectFromJson(IndeedHomePage.class, filePath);

	homePage.open();

	return homePage;
    }

    /**
     * @return the whatTextBox
     */
    public TextBox getWhatTextBox() {
	return whatTextBox;
    }

    /**
     * @param whatTextBox
     *            the whatTextBox to set
     */
    public void setWhatTextBox(TextBox whatTextBox) {
	this.whatTextBox = whatTextBox;
    }

    /**
     * @return the whereTextBox
     */
    public TextBox getWhereTextBox() {
	return whereTextBox;
    }

    /**
     * @param whereTextBox
     *            the whereTextBox to set
     */
    public void setWhereTextBox(TextBox whereTextBox) {
	this.whereTextBox = whereTextBox;
    }

    /**
     * @return the findJobButton
     */
    public Button getFindJobButton() {
	return findJobButton;
    }

    /**
     * @param findJobButton
     *            the findJobButton to set
     */
    public void setFindJobButton(Button findJobButton) {
	this.findJobButton = findJobButton;
    }

    /**
     * @return the link
     */
    public String getLink() {
	return link;
    }

    /**
     * @param link
     *            the link to set
     */
    public void setLink(String link) {
	this.link = link;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "TestHomePage [link=" + link + ", findJobButton=" + findJobButton + "]";
    }

    public IndeedHomePage open() {

	super.open(this.getLink());
	return this;

    }

    public boolean close() {

	super.closePage();
	return true;
    }

    public void clickFindJobButton() {

	super.clickButton(this.findJobButton);
    }

    public void sendTextToWhatTextBox(String text) {

	super.type(whatTextBox, text);
    }

    public void sendTextToWhereTextBox(String text) {

	super.type(whereTextBox, text);
    }

}