package com.Investment.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Investment.Pom.Latest;
import com.Investment.Pom.LeftSideFilter;
import com.Investment.Pom.Post_a_project;
import com.Investment.Pom.Project_n_SendEnquiries;
import com.Investment.generics.Investment_BaseClass;


public class Test1 extends Investment_BaseClass {
	
	
	
	@Test
	public void testcase() throws InterruptedException {
		
		  Latest l= new Latest (driver); 
		  l.latest1();
		  Reporter.log("Latest Test case pass", true);	  
		  Thread.sleep(500);
		  
		  LeftSideFilter lf=new LeftSideFilter(driver);
		  Thread.sleep(500);
		// lf.searchKeyword();
		  lf.State();
		  lf.Sector();
		  
		  Thread.sleep(500);
		  js.executeScript("window.scrollTo(0,500)");
		  lf.InvestmentType();
		  Thread.sleep(500);
		  js.executeScript("window.scrollTo(0,500)");
		  lf.InvestmentValue();
		  Thread.sleep(500);
		  js.executeScript("window.scrollTo(0,500)");
		  lf.Document();
		  Thread.sleep(500);
		  lf.ProjectStatus();
		  
		  
		  Project_n_SendEnquiries p=new Project_n_SendEnquiries(driver);
		  p.selectproject();
		  p.SendEnquirie();
		 
		 
		 
		/*
		 * Post_a_project p= new Post_a_project(driver);
		 * 
		 * p.postProject(); wait.until(ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//span[.='Upload Documents']"))); Thread.sleep(10000);
		 * Reporter.log("Post a Project Test case pass", true);
		 */ 
				 
		
	
		
	}

}
