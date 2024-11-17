package com.DEMOQA.Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.DEMOQA.Testbase.TestBase;

public class MoveUpTo extends TestBase {

	public static void scrollupto(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollInToView(true)",element);
		
		
		
		
	}
	
	public static void by() {
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,400)");
	}
	
	
	
	
	
	
	
	
	
	
}
