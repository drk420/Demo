package com.DEMOQA.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DEMOQA.Testbase.TestBase;

public class Wedges extends TestBase {

	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[9]")
	private WebElement selectmenu_link;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]")
	private WebElement selectvalue_link;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/span[1]/div[1]")
	private WebElement widges_link;
	
	public Wedges (WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	
	
	public void clickonselectmenu() {
		selectmenu_link.click();
	}
	
	
	public void sendkeysmenu(String text) {
		
		selectvalue_link.sendKeys(text);
	}
	
	
	public void clickonwidges() {
		
		widges_link.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
