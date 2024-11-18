package com.DEMOQA.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DEMOQA.Testbase.TestBase;
import com.DEMOQA.Utility.Explicitewait;
import com.DEMOQA.Utility.MoveUpTo;

public class Elements extends TestBase  {

	public Elements(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]")
	private WebElement textbox;
	
	@FindBy(xpath="//input[@id='userName']")
	private WebElement fullname_textbox;
	
	@FindBy(xpath="//input[@id='userEmail']")
	private WebElement emailid_textbox;
	
	@FindBy(xpath="//textarea[@id='currentAddress']")
	private WebElement currentaddress_textbox;

	@FindBy(xpath="//textarea[@id='permanentAddress']")
	private WebElement permanentaddress_textbox;
	
	@FindBy(xpath="//button[@id='submit']")
	private WebElement submit_button;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]")
	private WebElement checkbox;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]")
	private WebElement checkbox_button;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]")
	private WebElement radiobutton;
	
	@FindBy(xpath="//label[contains(text(),'Yes')]")
	private WebElement yes_radiobutton;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]")
	private WebElement button;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/button[1]")
	private WebElement clickme_button;
	
	public void clickontextbox() {
		Explicitewait.waity(textbox);
		textbox.click();
	}
	
	public void enterfullname(String fullname) {
		Explicitewait.waity(fullname_textbox);
		fullname_textbox.sendKeys(fullname);
	}
	
	public void enteremailid(String emailid) {
		Explicitewait.waity(emailid_textbox);
		emailid_textbox.sendKeys(emailid);
	}
	
	public void entercurrentaddress(String currentaddress) {
		Explicitewait.waity(currentaddress_textbox);
		currentaddress_textbox.sendKeys(currentaddress);
	}
	
	public void enterpermenantaddress(String permanantaddress) {
		//Explicitewait.waity(permanentaddress_textbox);
		MoveUpTo.by();
		permanentaddress_textbox.sendKeys(permanantaddress);
	}
	
	public void clickonsubmitbutton() {
		Explicitewait.waity(submit_button);
		submit_button.click();
	}
	
	public void clickoncheckbox() {
		checkbox.click();
	}
	
	public void clickoncheckboxbutton() {
		checkbox_button.click();
	}
	
	public void clickonradiobutton() {
		radiobutton.click();
	}
	
	public void clickonyesradiobutton() {
		yes_radiobutton.click();
	}
	
	public void clickonbuttob() {
		button.click();
	}
	
	public void clickonclickme() {
		clickme_button.click();
	}
}

