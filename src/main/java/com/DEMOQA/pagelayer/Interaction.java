package com.DEMOQA.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DEMOQA.Testbase.TestBase;
import com.DEMOQA.Utility.Explicitewait;
import com.DEMOQA.Utility.MoveUpTo;
import com.DEMOQA.Utility.handlingaction;

public class Interaction extends TestBase{

	public Interaction(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/span[1]/div[1]")
	private WebElement interaction_link;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/ul[1]/li[4]")
	private WebElement droppable_link;
	
	@FindBy(xpath="//div[@id='draggable']")
	private WebElement srcdraggable_link;
	
	@FindBy(xpath="//div[@id='simpleDropContainer']//div[@id='droppable']")
	private WebElement desdroppable_link;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/ul[1]/li[1]")
	private WebElement sortable_link;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/ul[1]/li[2]")
	private WebElement selectable_link;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]")
	private WebElement one_button;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]")
	private WebElement two_button;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]")
	private WebElement three_button;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]")
	private WebElement four_button;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]")
	private WebElement five_button;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[6]")
	private WebElement six_button;
	
	@FindBy(xpath="//li[contains(text(),'Cras justo odio')]")
	private WebElement oneselectable_button;
	
	@FindBy(xpath="//li[contains(text(),'Dapibus ac facilisis in')]")
	private WebElement twoselctable_button;
	
	@FindBy(xpath="//li[contains(text(),'Morbi leo risus')]")
	private WebElement threeselectable_button;
	
	@FindBy(xpath="//li[contains(text(),'Porta ac consectetur ac')]")
	private WebElement fourselectable_button;
	
	
	
	public void clickoninteractionlink() {
		handlingaction j = new handlingaction();
		MoveUpTo.by();
		//Explicitewait e = new Explicitewait();
		//e.waity(interaction_link);
		interaction_link.click();
	}
	
	public void handlingdraganddrop() {
		handlingaction j = new handlingaction();
		MoveUpTo.by();
		j.draganddrop(srcdraggable_link, desdroppable_link);
	}
	
	public void clickondroppablelink() {
		Explicitewait e = new Explicitewait();
		e.waity(droppable_link);
		droppable_link.click();
	}
	
	public void clickonsortablelink() {
		sortable_link.click();
		
	}
	public void clickonselectablelink() {
		selectable_link.click();
		
	}
	public void clickonsortableonebuttons() {
		Explicitewait e = new Explicitewait();
		e.waity(one_button);
		one_button.click();
		
		
	}
	public void clickonallsortabletwobuttons() {
		Explicitewait e = new Explicitewait();
	e.waity(two_button);
	two_button.click();
	
	}
	public void clickonsortablthreeernebuttons() {
		Explicitewait e = new Explicitewait();
		e.waity(three_button);
		three_button.click();
	}
	
	public void clickonallsortablefourbuttons() {
		Explicitewait e = new Explicitewait();
		e.waity(four_button);
		four_button.click();
	}
	public void clickonallsortablefivebuttons() {
		Explicitewait e = new Explicitewait();
		e.waity(five_button);
		five_button.click();
	}
	public void clickonallsotablesixbuttons() {
		Explicitewait e = new Explicitewait();
		e.waity(six_button);
		six_button.click();
	}
	
	public void clickonallselectabletwobuttons() {
		Explicitewait e = new Explicitewait();
	e.waity(twoselctable_button);
	twoselctable_button.click();
	
	}
	
	
	
	public void clickonselectableonebuttons() {
		Explicitewait e = new Explicitewait();
		e.waity(oneselectable_button);
		oneselectable_button.click();
		
		
	}
	public void clickonselectablthreeernebuttons() {
		Explicitewait e = new Explicitewait();
		e.waity(threeselectable_button);
		threeselectable_button.click();
	}
	
	public void clickonallselectablefourbuttons() {
		Explicitewait e = new Explicitewait();
		e.waity(fourselectable_button);
		fourselectable_button.click();
	}

	
	
	
	
	
	
	
	
	
}
