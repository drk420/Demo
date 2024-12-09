package com.DEMOQA.Testlayer;

import org.testng.annotations.Test;

import com.DEMOQA.Testbase.TestBase;
import com.DEMOQA.pagelayer.Bookstoreapplication;
import com.DEMOQA.pagelayer.Homepage;

public class Logintest extends TestBase{

	@Test
	public void verifyloginfunctionality() throws InterruptedException {
		Homepage h = new Homepage(driver);
		h.clickonelements();
		Bookstoreapplication b = new Bookstoreapplication(driver);
		b.clickonbookstorelink();
		b.clickonlogininlink();
		b.clickonnewuserbutton();
		b.enterfirstname("dragon");
		b.enterlastname("kjo");
		b.enterusername("Duiok");
		b.enterpasswordd("hityh");
		
		b.clickoncaptchacheckbox();
		Thread.sleep(5000);
		b.clickonregisterbutton();
		
	}
	    @Test
		public void verifyloginfunctionalityy() {
			Homepage h = new Homepage(driver);
			h.clickonelements();
			Bookstoreapplication b = new Bookstoreapplication(driver);
			b.clickonbookstorelink();
			b.clickonlogininlink();
		//b.clickonbacktologinbutton();
		b.enterusernametextbox("Duiok");
		b.enterpassword("hityh");
		b.clickonloginbutton();
	}
}
