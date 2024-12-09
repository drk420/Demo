package com.DEMOQA.Testlayer;

import org.testng.annotations.Test;

import com.DEMOQA.Testbase.TestBase;
import com.DEMOQA.pagelayer.Swaglabsloginpage;

public class SwagTest extends TestBase{

	
	
	@Test
	public void verifyloginfunctionality() {
		Swaglabsloginpage s = new Swaglabsloginpage(driver);
		s.openurl();
		s.enterusername("standard_user");
		s.enterpassword("secret_sauce");
		s.clickonloginbutton();
	}
}
