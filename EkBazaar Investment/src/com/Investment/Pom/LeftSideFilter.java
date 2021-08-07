package com.Investment.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LeftSideFilter {
	
	@FindBy(xpath="//div[contains(@class,'search-keyword__placeholder')]")
	private WebElement searchKeword;
	
	@FindBy(xpath="(//div[.=\"Textile Fabrics\"])[1]")
	private WebElement SelectsearchKeword;
	
	@FindBy(xpath="(//div[@class=\"general-set__placeholder css-1wa3eu0-placeholder\"])[1]")
	private WebElement Sector;
	
	@FindBy(xpath="(//div[.=\"engineering\"])[1]")
	private WebElement SelectSector;
	

	@FindBy(xpath="(//div[@class=\"general-set__placeholder css-1wa3eu0-placeholder\"])[2]")
	private WebElement State;
	
	@FindBy(xpath="(//div[.=\"karnataka\"])[1] ")
	private WebElement SelectState;
	
	@FindBy(xpath="(//div[@class=\"general-set__placeholder css-1wa3eu0-placeholder\"])[1]")
	private WebElement InvestmentType;
	
	@FindBy(xpath="(//div[.=\"Gov. Approved\"])[1] ")
	private WebElement SelectInvestmentType;
	
	@FindBy(xpath="(//span[.=\"10 Crores - 100 Crores\"])[2]")
	private WebElement InvestmentValue;
	
	@FindBy(xpath="(//span[.=\"Document\"])[2]")
	private WebElement Document;
	
	@FindBy(xpath="(//span[.=\"Implementation Stage\"])[2]")
	private WebElement ProjectStatus;
	
	public LeftSideFilter(WebDriver driver) 
	{
	PageFactory.initElements(driver, this);	
	}

	public void searchKeyword() throws InterruptedException {
		
		searchKeword.click();
		SelectsearchKeword.click();
	}
	
	public void Sector() throws InterruptedException {
		
		Sector.click();
		SelectSector.click();
		
	}
	public void State() throws InterruptedException {
		
		State.click();
		SelectState.click();
		Thread.sleep(300);
	  
	}
		
		public void InvestmentType() throws InterruptedException {
			Thread.sleep(300);
			InvestmentType.click();
			SelectInvestmentType.click();
			
		}
		
		
		public void InvestmentValue() throws InterruptedException {
			InvestmentValue.click();
			Thread.sleep(300);
			
		}
		public void Document() throws InterruptedException {
			Document.click();
			Thread.sleep(300);
		}
		
		
		public void ProjectStatus() throws InterruptedException {
		
		ProjectStatus.click();
		
	}
	
	
}
