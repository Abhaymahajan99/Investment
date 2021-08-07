package com.Investment.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Project_n_SendEnquiries {

	@FindBy(xpath="//p[.='Balan Eng Pvt Ltd']")
	private WebElement selectProject;
	
	@FindBy(xpath="//button[.='Contact Via Email']")
	private WebElement ContactViaEmail;
	
	@FindBy(xpath="//img[@src='/assets/images/Group 841.svg']")
	private WebElement image;
	
	@FindBy(xpath="//textarea[@id='comments']")
	private WebElement Comments;
	
	
	@FindBy(xpath="//button[.='Send Message']")
	private WebElement SendMessage;
	
	@FindBy(xpath="//button[.='Continue Browsing']")
	private WebElement ContinueBrowsing;
	
	public Project_n_SendEnquiries(WebDriver driver) 
	{
	PageFactory.initElements(driver, this);	
	}
	
	public void selectproject() throws InterruptedException {
		
		selectProject.click();
		Thread.sleep(500);
	}
	
	public void SendEnquirie() throws InterruptedException{
		
		ContactViaEmail.click();
		Thread.sleep(500);
		image.isDisplayed();
		Comments.sendKeys("Automated comment");
		Thread.sleep(500);
		SendMessage.click();
		Thread.sleep(500);
		ContinueBrowsing.click();
		
	}
	
}
