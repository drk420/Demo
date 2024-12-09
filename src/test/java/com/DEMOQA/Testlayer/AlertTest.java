package com.DEMOQA.Testlayer;

import org.testng.annotations.Test;

import com.DEMOQA.Testbase.TestBase;
import com.DEMOQA.pagelayer.AlertFrameWindow;
import com.DEMOQA.pagelayer.Elements;
import com.DEMOQA.pagelayer.Homepage;

public class AlertTest extends TestBase {

	@Test
	public void verifyalerttest() throws InterruptedException {
		
		Homepage h = new Homepage (driver);
		h.clickonelements();
		
		Elements e = new Elements (driver);
		
		e.clickonalertlink();
		
	AlertFrameWindow a = new AlertFrameWindow(driver);
		
	   a.clickonalertslink();
	    
	    
	  
	  a.clickonsimplealert();
	  Thread.sleep(5000);
		a.movetoelement();
		a.clickonpromptalert("Dnyanu");
	Thread.sleep(5000);
	   a.clickonconfirmalert();
	   
	}}
