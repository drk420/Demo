package com.DEMOQA.Testlayer;

import org.openqa.selenium.Keys;
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
		
		elements.clickonlinkbutton();
		elements.clickontextbox();
		
	
		
		elements.enterfullname("dnyaneshwar");
		
		elements.enteremailid("kinikardnyaneshwar28@gmail.com");
		
	    elements.entercurrentaddress("At.Po.Kini Yalladevi,Tq.Udgir,Dist.Latur");
	    elements.enterpermenantaddress("At.Po.Kini Yalladevi,Tq.Udgir,Dist.Latur");
	   
		
		elements.clickonsubmitbutton();
		
	}
	
	@Test
<<<<<<< HEAD
	public void verifyform() throws InterruptedException {
	Homepage homepage = new Homepage (driver);
	
	homepage.clickonelements();
	
	Elements elements = new Elements(driver);
	
	Thread.sleep(5000);
	elements.clickonformlink();
	Thread.sleep(5000);
    elements.clickonpractieceform();
	Thread.sleep(5000);
	elements.enterfirstname("dnyaneshwar");
	Thread.sleep(5000);
    elements.enterlastname("Kinikar");
    elements.enteremailtextbox("dnyaneshwarkinikar28@gmail.com");
	Thread.sleep(5000);
    elements.clickonmalegender();
    Thread.sleep(5000);
    elements.entermobilenumber("8788172074");
    //Thread.sleep(5000);
   // elements.entersubjectform("Tom");
    
    Thread.sleep(5000);
	elements.clickondateofbirth();
	
	elements.selectmonth("April");
	Thread.sleep(5000);
	elements.selectyear("2019");
	
    Thread.sleep(5000);
	elements.clickondatform();
	
	Thread.sleep(5000);
	elements.clickonsportscheckbox();
	Thread.sleep(5000);
	elements.entercurrentaddressform("Kini Yalladevi");
	//Thread.sleep(5000);
	//elements.clickonselectstatedropdown("Haryana");
	
	//Thread.sleep(8000);
	//elements.clickonselectcity("Panipat");
	Thread.sleep(9000);
	elements.clickonsubmitformbutton();
	}}
=======
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
>>>>>>> e7fc4cfac735f3869940394c04adce7071cb1a11
