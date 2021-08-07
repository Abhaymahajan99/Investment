package com.Investment.generics;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.Investment.Pom.LogIn;
import com.Investment.Pom.LogOut;





public class Investment_BaseClass {
	
	public FirefoxOptions options1;
	public ChromeOptions options;
	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	
	
	public Investment_Filelibrary f = new Investment_Filelibrary ();
	
	
	
	

	static {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe" );
		System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
	}
	 
	
	@BeforeTest
	
	public void openBrowser() throws Exception{
		
		
		 options = new ChromeOptions();
		 
		 options1 = new FirefoxOptions();
		 
			options1.addArguments("--disable-notifications");
			options.addArguments("--disable-notifications");
			
			
		String url = f.getPropertyData("url");
		
		String browser =f.getPropertyData("browser");
		
		
		if (browser.equalsIgnoreCase("chrome")) 
		{
		driver=new ChromeDriver(options);
		}
		else if (browser.equalsIgnoreCase("firfox")) 
		{
			
			driver=new FirefoxDriver(options1);
			 
			
		}
		else if(browser.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		 
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		wait =new WebDriverWait(driver,10);
	    js = (JavascriptExecutor) driver;
	   
		driver.get(url);
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

	@BeforeMethod

	  public void login() throws IOException, InterruptedException {
	  
	  
	  String un = f.getPropertyData("username");
	  
	  String pw =f.getPropertyData("password"); 
	  
	  LogIn l=new LogIn(driver); 
	  
	  l.setLogin(un,pw);
	  
	  Thread.sleep(4000);
	  
	  }
	 
	
	

	@AfterMethod
	public void logout() throws InterruptedException {
		LogOut lg=new LogOut(driver);
		lg.Setlogout();

	}



}
