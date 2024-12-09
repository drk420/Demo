package com.DEMOQA.Utility;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.DEMOQA.Testbase.TestBase;

public class handlingaction extends TestBase{
    
	public void elementhandle(WebElement element) {
	
	Actions o = new Actions(driver);
	o.doubleClick(element).perform();
	o.click(element).perform();
	o.contextClick(element).perform();
	
	}
	
	public void draganddrop(WebElement element1,WebElement element2) {
		Actions o = new Actions(driver);
		o.clickAndHold(element1).moveToElement(element2).build().perform();
	}
}
