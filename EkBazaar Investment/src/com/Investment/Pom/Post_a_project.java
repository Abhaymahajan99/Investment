package com.Investment.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Post_a_project {

	
	@FindBy(xpath="(//a[.=' Post a Project'])[1]")
	private WebElement Postaproject;
	
	@FindBy(xpath="//input[@placeholder=\"Project Name\"]")
	private WebElement ProjectName;
	
	@FindBy(xpath="//input[@placeholder=\"Short Summary\"]")
	private WebElement ShortSummary;
	
	
	@FindBy(xpath="(//div[@class=\" css-g1d714-ValueContainer\"])[1]")
	private WebElement Sector;
	
	@FindBy(xpath="(//div[.=\"automobile\"])[1]")
	private WebElement SelectSector;
	
	@FindBy(xpath="(//div[@class=\" css-g1d714-ValueContainer\"])[2]")
	private WebElement ProjectStatus;
	
	@FindBy(xpath="(//div[.=\"Development Stage\"])[1]")
	private WebElement SelectProjectStatus;
	
	@FindBy(xpath="(//div[@class=\" css-g1d714-ValueContainer\"])[3]")
	private WebElement ProjectTenure;
	
	@FindBy(xpath="(//div[.=\"< 2 Years\"])[1]")
	private WebElement SelectProjectTenure;
	
	@FindBy(xpath="//input[@placeholder='Value']")
	private WebElement Value;
	
	@FindBy(xpath="(//div[@class=\" css-g1d714-ValueContainer\"])[4]")
	private WebElement Location;
	
	@FindBy(xpath="(//div[.=\"karnataka\"])[1]")
	private WebElement SelectLocation;
	
	@FindBy(xpath="(//div[@class=\" css-g1d714-ValueContainer\"])[5]")
	private WebElement City;
	
	@FindBy(xpath="(//div[.=\"bengaluru\"])[1]")
	private WebElement SelectCity;
	
	@FindBy(xpath="//textarea[@placeholder='Address']")
	private WebElement Address;
	
	@FindBy(xpath="//input[@placeholder='PIN Code']")
	private WebElement PinCode;
	
	@FindBy(xpath="//textarea[@placeholder='Project Overview']")
	private WebElement ProjectOverview;
	
	@FindBy(xpath="//button[.='Submit & Continue']")
	private WebElement SubmitButton;
	
	@FindBy(xpath="//span[.='Upload Documents']")
	private WebElement UploadDocuments;
	
	
	@FindBy(id="docSelector")
	private WebElement Docselect;
	
	
	
	public Post_a_project (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void postProject(){
		
		Postaproject.click();
		
		ProjectName.sendKeys("Automated test");
		
		Location.click();
		SelectLocation.click();
		
		City.click();
		SelectCity.click();
		
		ShortSummary.sendKeys("Test");
		
		Address.sendKeys("2nd Stage BTM");
		
		Sector.click();
		SelectSector.click();
		
		PinCode.sendKeys("560076");
		
		ProjectStatus.click();
		SelectProjectStatus.click();
		
		ProjectOverview.sendKeys("Creation of New Infrastructure for Industrial Parks Schemes National Industrial Corridor Development Programme");
		
		ProjectTenure.click();
		SelectProjectTenure.click();
		
		Value.sendKeys("2000000");
		
		SubmitButton.click();
		
		Docselect.sendKeys("C:\\Users\\Asus\\Desktop\\_No_edit_limits_1.pdf");
		
		
		
		
	}
}
