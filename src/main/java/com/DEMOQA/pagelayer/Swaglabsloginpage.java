package com.DEMOQA.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DEMOQA.Testbase.TestBase;

public class Swaglabsloginpage extends TestBase {

	public Swaglabsloginpage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username_textbox;
	
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password_textbox;
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement login_button;
	
	public void enterusername(String username) {
		username_textbox.sendKeys(username);
	}
	public void enterpassword(String password) {
		password_textbox.sendKeys(password);
	}
	public void openurl() {
		
		driver.navigate().to("https://www.saucedemo.com/");
	}
	public void clickonloginbutton() {
		login_button.click();
	}
}
