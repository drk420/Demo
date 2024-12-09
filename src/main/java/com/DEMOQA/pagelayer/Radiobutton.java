package com.DEMOQA.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DEMOQA.Testbase.TestBase;
import com.DEMOQA.Utility.MoveUpTo;

public class Radiobutton extends TestBase {

	
	public Radiobutton(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]")
	private WebElement radiobutton_but;
	
	@FindBy(xpath="//label[contains(text(),'Yes')]")
	private WebElement yes_radiobutton;
	
	public void verifyradiobutton() {
		MoveUpTo.by();
		//MoveUpTo.scrollupto(yes_radiobutton);
		radiobutton_but.click();
	}
	
	public void varifyyesradiobutton() {
		MoveUpTo.by();
		yes_radiobutton.click();
		
	}
	
	
	
}
