package com.DEMOQA.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DEMOQA.Testbase.TestBase;
import com.DEMOQA.Utility.Explicitewait;
import com.DEMOQA.Utility.Iframehandling;
import com.DEMOQA.Utility.MoveUpTo;

public class Bookstoreapplication extends  TestBase{

	public Bookstoreapplication(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/span[1]/div[1]")
	private WebElement bookstore_link;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/ul[1]/li[1]")
	private WebElement login_link;
	
	@FindBy(xpath="//input[@id='userName']")
	private WebElement username_textbox;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password_textbox;
	
	@FindBy(xpath="//button[@id='login']")
	private WebElement login_button;
	
	@FindBy(xpath="//button[@id='newUser']")
	private WebElement newuser_button;
	
	@FindBy(xpath="//input[@id='firstname']")
	private WebElement firstname_textbox;
	
	@FindBy(xpath="//input[@id='userName']")
	private WebElement usernamee_textbox;
	@FindBy(xpath="//input[@id='lastname']")
	private WebElement lastname_textbox;
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwordd_textbox;
	@FindBy(xpath="//span[@id=\"recaptcha-anchor\"]")
	private WebElement register_button;
	
	@FindBy(xpath="//button[@id='gotologin']")
	private WebElement backtologin_button;
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[6]/div[1]/div[1]/div[1]/iframe[1]")
	private WebElement captcha_checkbox;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[7]")
	private WebElement checkbox_element;
	
	public void clickonbookstorelink() {
		MoveUpTo.by();
		bookstore_link.click();
		
		
	}
	public void clickonlogininlink() {
		login_link.click();
	}
	
	public void enterusernametextbox(String name) {
		username_textbox.sendKeys(name);
	}
	
	public void enterpassword(String password) {
		password_textbox.sendKeys(password);
	}
	public void clickonloginbutton() {
		login_button.click();
	}
	public void clickonnewuserbutton() {
		MoveUpTo.by();
		newuser_button.click();
	}
	public void enterfirstname(String firstname) {
		firstname_textbox.sendKeys(firstname);
	}
	public void enterlastname(String lastname) {
		lastname_textbox.sendKeys(lastname);
	}
	public void enterusername(String username) {
		usernamee_textbox.sendKeys(username);
	}
	public void enterpasswordd(String password) {
		MoveUpTo.by();
		passwordd_textbox.sendKeys(password);
	}
	public void clickoncaptchacheckbox() {
		//Explicitewait j = new Explicitewait();
		//Iframehandling i = new Iframehandling();
		//i.framehandling();
		//j.waity(captcha_checkbox);
		checkbox_element.click();
		//captcha_checkbox.click();
	}
	public void clickonregisterbutton() {
		register_button.click();
	}
	public void clickonbacktologinbutton() {
		backtologin_button.click();
	}
}
