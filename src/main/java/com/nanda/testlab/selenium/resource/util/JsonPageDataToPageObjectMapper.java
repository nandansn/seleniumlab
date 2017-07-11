/**
 * 
 */
package com.nanda.testlab.selenium.resource.util;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

/**
 * @author Nandakumar 20-Apr-2017
 *
 */
public class JsonPageDataToPageObjectMapper {

    final static Logger log = Logger.getRootLogger();

    public static Object getPageObjectFromJson(Class classObj, String filePath)
	    throws JsonSyntaxException, JsonIOException, FileNotFoundException {

	log.info("Parsing the JSON");
	Gson gson = new GsonBuilder().setPrettyPrinting().create();
	Object dataObject = gson.fromJson(new FileReader("src/main/resources/home-page.json"), classObj);

	return dataObject;
    }

}
