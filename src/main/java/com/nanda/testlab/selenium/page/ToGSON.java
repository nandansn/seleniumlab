/**
 * 
 */
package com.nanda.testlab.selenium.page;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.nanda.testlab.selenium.page.element.Button;
import com.nanda.testlab.selenium.page.element.TextBox;

/**
 * @author Nandakumar 
 * 20-Apr-2017
 *
 */
public class ToGSON {
    
    public static void main(String[] args) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
	
	Button b = new Button();
	b.setId("fj");
	
	TextBox whatTextBox = new TextBox();
	whatTextBox.setId("what");
	TextBox whereTextBox  = new TextBox();
	whereTextBox.setId("where");
	
	IndeedHomePage thp = new IndeedHomePage();
	thp.link ="https://www.indeed.co.uk/";
	thp.setFindJobButton(b);
	thp.setWhatTextBox(whatTextBox);
	thp.setWhereTextBox(whereTextBox);
	
	Gson gson = new GsonBuilder().setPrettyPrinting().create();
	System.out.println(gson.toJson(thp));
	
	//System.out.println(gson.fromJson(new FileReader("src/main/resources/home-page.json"), TestHomePage.class).toString());
	
	
	
    }

}
