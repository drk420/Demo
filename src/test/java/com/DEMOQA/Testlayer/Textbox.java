package com.DEMOQA.Testlayer;

import org.testng.annotations.Test;


import com.DEMOQA.Testbase.TestBase;
import com.DEMOQA.pagelayer.Elements;
import com.DEMOQA.pagelayer.Homepage;

public class Textbox extends TestBase{

	@Test
	public void verifytextboxtest() throws InterruptedException {
		

		Homepage homepage = new Homepage (driver);
		
		homepage.clickonelements();
		
		Elements elements = new Elements(driver);
		
		elements.clickontextbox();
		
		elements.enterfullname("dnyaneshwar");
		
		elements.enteremailid("kinikardnyaneshwar28@gmail.com");
		
	    elements.entercurrentaddress("At.Po.Kini Yalladevi,Tq.Udgir,Dist.Latur");
	  
		elements.enterpermenantaddress("At.Po.Kini Yalladevi,Tq.Udgir,Dist.Latur");
		
		elements.clickonsubmitbutton();
		
	}
	
	@Test
	public void verifycheckbox() {
        
		Homepage homepage = new Homepage (driver);
		
		homepage.clickonelements();
		
		Elements elements = new Elements(driver);
		
		elements.clickoncheckbox();
		
		elements.clickoncheckboxbutton();
	}
	

   @Test
   public void verifyradiobutton() {
	   Homepage homepage = new Homepage (driver);
		
		homepage.clickonelements();
		
		Elements elements = new Elements(driver);
		elements.clickonradiobutton();
		elements.clickonyesradiobutton();
}
   @Test
   public void verifybuttons() {
	   Homepage homepage = new Homepage (driver);
		
		homepage.clickonelements();
		
		Elements elements = new Elements(driver);
		elements.clickonbuttob();
		
		elements.clickonclickme();
		
   }
}