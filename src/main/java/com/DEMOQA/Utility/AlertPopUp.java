package com.DEMOQA.Utility;

import com.DEMOQA.Testbase.TestBase;

public class AlertPopUp extends TestBase {

	
	public void handlealertpopupaccept() {
		
		
		driver.switchTo().alert().accept();
		
		
		
	}
	
public void handlealertpopupdissmis() {
		
		
		driver.switchTo().alert().dismiss();
		
		
		
	}
	
public void handlealertpopsendkeys(String text) {
	
	
	driver.switchTo().alert().sendKeys(text);
	
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
