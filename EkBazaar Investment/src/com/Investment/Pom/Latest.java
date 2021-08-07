package com.Investment.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Latest {
	
	
	@FindBy(xpath="//a[.=' Latest ']")
	private WebElement Latest;
	
	
	
	public Latest(WebDriver driver) 
	{
	PageFactory.initElements(driver, this);	
	}

	public void latest1() throws InterruptedException{
		
		Latest.click();
	}
	
	
}
