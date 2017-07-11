/**
 * 
 */
package com.nanda.testlab.selenium.page.element;

/**
 * @author Nandakumar 
 * 20-Apr-2017
 *
 */
public enum Link {
    
    Home("https://www.indeed.co.uk/");
    
    private String link;
    
    Link(String link){
	this.link = link;
    }
    
    public String getLink(){
	
	return this.link;
    }
    

}
