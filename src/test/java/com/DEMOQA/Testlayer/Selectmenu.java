package com.DEMOQA.Testlayer;

import org.testng.annotations.Test;

import com.DEMOQA.Testbase.TestBase;
import com.DEMOQA.pagelayer.Elements;
import com.DEMOQA.pagelayer.Homepage;
import com.DEMOQA.pagelayer.Wedges;

public class Selectmenu extends TestBase {

	@Test
	public void verifyselectmenuoption() throws InterruptedException {
		Homepage h = new Homepage(driver);
		Thread.sleep(5000);
		h.clickonelements();
		
		//Elements e = new Elements(driver);
		Wedges w = new Wedges (driver);
		Thread.sleep(5000);
		w.clickonwidges();
		Thread.sleep(5000);
		w.clickonselectmenu();
		Thread.sleep(5000);
		w.sendkeysmenu("A root option");
		
		
		
		
		
		
		
		
		
		
		}
	}
