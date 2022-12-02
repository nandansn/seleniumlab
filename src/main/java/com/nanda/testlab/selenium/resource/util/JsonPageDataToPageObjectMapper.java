/**
 * 
 */
package com.nanda.testlab.selenium.resource.util;

import java.io.FileNotFoundException;
import java.io.FileReader;



import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Nandakumar 20-Apr-2017
 *
 */
public class JsonPageDataToPageObjectMapper {

    final static Logger log = LogManager.getRootLogger();

    public static Object getPageObjectFromJson(Class classObj, String filePath)
	    throws JsonSyntaxException, JsonIOException, FileNotFoundException {

	log.info("Parsing the JSON");
	Gson gson = new GsonBuilder().setPrettyPrinting().create();
	Object dataObject = gson.fromJson(new FileReader("src/main/resources/home-page.json"), classObj);

	return dataObject;
    }

}
