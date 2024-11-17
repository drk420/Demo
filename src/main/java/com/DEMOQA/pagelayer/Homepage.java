package com.DEMOQA.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DEMOQA.Testbase.TestBase;
import com.DEMOQA.Utility.Explicitewait;
import com.DEMOQA.Utility.MoveUpTo;

public class Homepage extends TestBase{

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]")
	private WebElement elements;
		
	
	
	
	
	public void clickonelements() {
		MoveUpTo.by();
		elements.click();
	}
	
	
	
	
}
