package com.DEMOQA.Testlayer;

import org.testng.annotations.Test;

import com.DEMOQA.Testbase.TestBase;
import com.DEMOQA.pagelayer.Elements;
import com.DEMOQA.pagelayer.Homepage;
import com.DEMOQA.pagelayer.Interaction;

public class DragandDropTest extends TestBase {

	@Test
	public void draganddrophandle() throws InterruptedException {
		
		Homepage h = new Homepage(driver);
		h.clickonelements();
		Interaction i = new Interaction(driver);
		
		i.clickoninteractionlink();
		Thread.sleep(5000);
		i.clickondroppablelink();
		Thread.sleep(5000);
		i.handlingdraganddrop();
	}
	
	@Test
	public void verifysortable() {
		
		Homepage h = new Homepage(driver);
		h.clickonelements();
		Interaction i = new Interaction(driver);
		
		i.clickoninteractionlink();
		i.clickonsortablelink();
		i.clickonallsortabletwobuttons();
		i.clickonsortablthreeernebuttons();
		i.clickonallsortablefourbuttons();
		i.clickonallsortablefivebuttons();
		i.clickonallsotablesixbuttons();
	}
	
	@Test
	public void verifyselctabletest() {
		Homepage h = new Homepage(driver);
		h.clickonelements();
		Interaction i = new Interaction(driver);
		
		i.clickoninteractionlink();
		i.clickonselectablelink();
		i.clickonselectableonebuttons();
		i.clickonallselectabletwobuttons();
		i.clickonselectablthreeernebuttons();
		i.clickonallselectablefourbuttons();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
