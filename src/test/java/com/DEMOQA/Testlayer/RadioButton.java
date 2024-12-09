package com.DEMOQA.Testlayer;

import org.testng.annotations.Test;

import com.DEMOQA.Testbase.TestBase;
import com.DEMOQA.pagelayer.Elements;
import com.DEMOQA.pagelayer.Homepage;
import com.DEMOQA.pagelayer.Radiobutton;

public class RadioButton extends TestBase{

	
	@Test
	public void verifyrediobutton() throws InterruptedException {
		
		Homepage h = new Homepage (driver);
		Thread.sleep(5000);
		h.clickonelements();
		
		Elements e = new Elements(driver);
		Thread.sleep(5000);
		e.clickonlinkbutton();
		Radiobutton r = new Radiobutton (driver);
		
		Thread.sleep(5000);
		r.verifyradiobutton();
		
		Thread.sleep(5000);
		r.varifyyesradiobutton();
		
	}
	
	@Test
	public void verifycheckbox() throws InterruptedException {
		
		Homepage h = new Homepage (driver);
		Thread.sleep(5000);
		h.clickonelements();
		
		Elements e = new Elements(driver);
		Thread.sleep(5000);
		e.clickonlinkbutton();
		e.clickoncheckbox();
		//e.homecheckbox();
		Thread.sleep(5000);
		e.clickonverifyarrow();
		Thread.sleep(5000);
		e.clickondownloadlink();
		Thread.sleep(5000);
		e.clickondocumentsoption();
		Thread.sleep(5000);
		e.clickon_desktop();
		e.clickonbuttons();
		Thread.sleep(5000);
		e.clickmebutton();
		e.rightclickonbutton();
		e.clickondoublclick();
	}
	
	@Test
	public void verifybuttons() throws InterruptedException {
		Homepage h = new Homepage (driver);
		Thread.sleep(5000);
		h.clickonelements();
		
		Elements e = new Elements(driver);
		Thread.sleep(5000);
		e.clickonlinkbutton();
		//e.clickoncheckbox();
	
	
	e.clickonbuttons();
	Thread.sleep(5000);
	e.clickmebutton();
	e.rightclickonbutton();
	e.clickondoublclick();
	
	}
}
