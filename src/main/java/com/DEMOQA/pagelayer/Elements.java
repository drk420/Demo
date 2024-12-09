package com.DEMOQA.pagelayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DEMOQA.Testbase.TestBase;
import com.DEMOQA.Utility.Dropdown;
import com.DEMOQA.Utility.Explicitewait;
import com.DEMOQA.Utility.MoveUpTo;
import com.DEMOQA.Utility.handlingaction;

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
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[10]/div[2]/div[1]/div[1]")
	private WebElement selectstate_dropdown;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]/div[1]")
	private WebElement form_link;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]")
	private WebElement practieceform_link;
	
	@FindBy(xpath="//input[@id='firstName']")
	private WebElement firstnameform_textbox;
	
	@FindBy(xpath="//input[@id='lastName']")
	private WebElement lastnameform_textbox;
	
	@FindBy(xpath="//input[@id='userEmail']")
	private WebElement emailform_textbox;
	
	@FindBy(xpath="//label[contains(text(),'Male')]")
	private WebElement maleform_gender;
	
	@FindBy(xpath="//input[@id='userNumber']")
	private WebElement mobilenumber_textbox;
	
	@FindBy(xpath="//input[@id='dateOfBirthInput']")
	private WebElement dateofbirthform_textbox;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]")
	private WebElement monthform_dropdown;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]")
	private WebElement yearform_dropdown;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[6]")
	private WebElement dateform_dropdown;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]")
	private WebElement subjectform_text;
	
	@FindBy(xpath="//label[contains(text(),'Sports')]")
	private WebElement sportform_checkbox;
	
	@FindBy(xpath="//textarea[@id='currentAddress']")
	private WebElement currentaddressform_textbox;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[10]/div[3]")
	private WebElement selectcityform_text;
	
	@FindBy(xpath="//button[@id='submit']")
	private WebElement submitform_button;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/span[1]/div[1]/div[1]")
	private WebElement alert_link;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]")
	private WebElement element_link;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]")
	private WebElement checkbox;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]")
	private WebElement home_checkbox;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/button[1]/*[1]")
	private WebElement arrow;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[3]/span[1]/label[1]/span[1]/*[1]")
	private WebElement download_webelement;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[1]")
	private WebElement document_checkbox;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]")
	private WebElement desktop_checkbox;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]")
	private WebElement button;
	
	@FindBy(xpath="//button[@id='doubleClickBtn']")
	private WebElement doubleclick_button;
	
	@FindBy(xpath="//button[@id='rightClickBtn']")
	private WebElement rightclick_button;
	
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/button[1]")
	private WebElement clickme_button;
	
	public void clickontextbox() {
		Explicitewait.waity(textbox);
		textbox.click();
	}
	
	public void enterfullname(String fullname) {
		Explicitewait.waity(fullname_textbox);
		MoveUpTo.by();
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
	
	public void clickonselectstatedropdown(String text) {
		Explicitewait.waity(selectstate_dropdown);
		
		selectstate_dropdown.sendKeys(text+Keys.ARROW_DOWN+Keys.ENTER);
		
	}
	
	public void clickonformlink() {
		MoveUpTo m = new MoveUpTo();
		m.by();
		form_link.click();
	}
	
	public void clickonpractieceform() {
		MoveUpTo m = new MoveUpTo();
		m.by();
		practieceform_link.click();
	}
	
	public void enterfirstname(String name) {
		MoveUpTo m = new MoveUpTo();
		m.by();
		firstnameform_textbox.sendKeys(name);
	}
	
	public void enterlastname(String lastname) {
		lastnameform_textbox.sendKeys(lastname);
	}
	
	public void enteremailtextbox(String email) {
		emailform_textbox.sendKeys(email);
	}
	
	public void clickonmalegender() {
		maleform_gender.click();
	}
	public void entermobilenumber(String mobilenumber) {
		mobilenumber_textbox.sendKeys(mobilenumber);
	}
	
	public void clickondateofbirth() {
		MoveUpTo m = new MoveUpTo();
		m.by();
		dateofbirthform_textbox.click();
	}
	
	public void selectmonth(String text) {
		Dropdown d = new Dropdown ();
		d.dropdownhandling(monthform_dropdown,text);
	
	}
	
	public void selectyear(String text) {
		Dropdown d = new Dropdown ();
		d.dropdownhandling(yearform_dropdown,text );
	}
	public void clickondate() {
		dateofbirthform_textbox.click();
	}
	public void entercurrentaddressform(String currentform_address) {
		MoveUpTo m = new MoveUpTo();
		m.by();
		currentaddressform_textbox.sendKeys(currentform_address);
	}
	
	public void clickonselectcity(String text) {
		Explicitewait.waity(selectcityform_text);
		selectcityform_text.sendKeys(text+Keys.ARROW_DOWN+Keys.ENTER);
	}
	
	public void clickondatform() {
		dateform_dropdown.click();
	}
	public void clickonsubmitformbutton() {
		submitform_button.click();
	}
	
	public void entersubjectform(String subject) {
		Explicitewait h = new Explicitewait();
		h.waity(subjectform_text);

		
		subjectform_text.sendKeys(subject);
	}
	
	public void clickonsportscheckbox() {
		sportform_checkbox.click();
		
	}
	
	public void clickonalertlink() throws InterruptedException {
		Thread.sleep(5000);
		alert_link.click();
	}
	public void clickonlinkbutton() throws InterruptedException {
		Thread.sleep(6000);
		element_link.click();
	}
	public void clickoncheckbox() throws InterruptedException {
		Thread.sleep(5000);
		checkbox.click();
	}
	public void homecheckbox() throws InterruptedException {
		Thread.sleep(5000);
		home_checkbox.click();
	}
	public void clickonverifyarrow() throws InterruptedException {
		Thread.sleep(5000);
		arrow.click();
	}
	
	public void clickondownloadlink() throws InterruptedException {
		MoveUpTo m = new MoveUpTo();
		m.by();
		Thread.sleep(5000);
		download_webelement.click();
		
	}
	
	public void clickondocumentsoption() throws InterruptedException {
		Thread.sleep(5000);
		document_checkbox.click();
	}
	
	public void clickon_desktop() throws InterruptedException {
		Thread.sleep(5000);
		desktop_checkbox.click();
	}
	
	public void clickonbuttons() throws InterruptedException {
		Thread.sleep(5000);
		button.click();
	}
	
	public void clickondoublclick() throws InterruptedException {
		Thread.sleep(5000);
		handlingaction h = new handlingaction();
		h.elementhandle(doubleclick_button);
	}
	public void rightclickonbutton() throws InterruptedException {
		Thread.sleep(5000);
		handlingaction h = new handlingaction();
		h.elementhandle(rightclick_button);
	}
	
	public void clickmebutton() throws InterruptedException {
		Thread.sleep(5000);
		handlingaction h = new handlingaction();
		h.elementhandle(clickme_button);
	}
	
}

