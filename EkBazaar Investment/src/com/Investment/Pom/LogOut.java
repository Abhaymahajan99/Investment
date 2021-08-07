package com.Investment.Pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {

	
	
	@FindBy(xpath="//span[@class='userName']")
	private WebElement Username;
	
	@FindBy(className="logout-button")
	private WebElement logOut;
	
	@FindBy(xpath="//button[.='Yes']")
	private WebElement button;

	public LogOut(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void Setlogout() throws InterruptedException
	{
		Thread.sleep(2000);
		Username.click();
		logOut.click();
		button.click();
	}
}
