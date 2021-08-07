package com.Investment.Pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
	
	
	
	@FindBy(className="signin-button")
	private WebElement SignIn;
	
	
	@FindBy(xpath="//input[@placeholder='Enter number']")
	private WebElement untbx;
	
	@FindBy(xpath="//input[@placeholder='Enter password'] ")
	private WebElement pwtxb;
	
	@FindBy(xpath="//input[@value='Sign In']")
	private WebElement lgbtn;
	


	public LogIn(WebDriver driver) 
	{
	PageFactory.initElements(driver, this);	
	}
	
	public void setLogin(String un, String pw) {
		
		SignIn.click();
		
		untbx.sendKeys(un);
		
		pwtxb.sendKeys(pw);
		
		lgbtn.click();
		
		

		
		
		
		}

}

