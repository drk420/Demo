package com.DEMOQA.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DEMOQA.Testbase.TestBase;
import com.DEMOQA.Utility.AlertPopUp;
import com.DEMOQA.Utility.Explicitewait;
import com.DEMOQA.Utility.MoveUpTo;

public class AlertFrameWindow extends TestBase{

	
	
	
	
	
	public AlertFrameWindow (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]")
	private WebElement alerts_link;
	
	@FindBy(xpath="//button[@id='alertButton']")
	private WebElement simplealert_button;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/button[1]")
	private WebElement confirmalert_button;
	
	@FindBy(xpath="//button[@id='promtButton']")
	private WebElement promptalert_button;
	
	public void clickonalertslink() throws InterruptedException {
		Explicitewait g = new Explicitewait();
		g.waity(alerts_link);
		alerts_link.click();
		//AlertPopUp a = new AlertPopUp();
		//a.handlealertpopupaccept();
		
	}
	
	public void clickonsimplealert() {
		simplealert_button.click();
		AlertPopUp a = new AlertPopUp();
		a.handlealertpopupaccept();
	}
	
	public void clickonconfirmalert() throws InterruptedException {
	
		confirmalert_button.click();
		Thread.sleep(5000);
		AlertPopUp a = new AlertPopUp();
		a.handlealertpopupaccept();
	}
	
	public void clickonpromptalert(String text) {
		promptalert_button.click();
		AlertPopUp a = new AlertPopUp();
		a.handlealertpopsendkeys(text);
		a.handlealertpopupdissmis();
	}
	public void movetoelement() {
		MoveUpTo n = new MoveUpTo ();
		n.by();
	}
	
	
	
}
