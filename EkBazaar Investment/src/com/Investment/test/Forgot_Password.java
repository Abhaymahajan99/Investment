package com.Investment.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forgot_Password {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://investment.tech-active.com/");
		
		driver.findElement(By.xpath("//a[.=' Sign In ']")).click();
		
		driver.findElement(By.xpath("//a[@class='preference']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Enter registered number']")).sendKeys("9806526604");
		
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
		driver.findElement(By.xpath("//input[contains(@aria-label,'Digit 1')]")).sendKeys("1");
		driver.findElement(By.xpath("//input[contains(@aria-label,'Digit 2')]")).sendKeys("2");
		driver.findElement(By.xpath("//input[contains(@aria-label,'Digit 3')]")).sendKeys("3");
		driver.findElement(By.xpath("//input[contains(@aria-label,'Digit 4')]")).sendKeys("4");
		driver.findElement(By.xpath("//input[@value='Confirm OTP']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Enter new password']")).sendKeys("Active@123");
		driver.findElement(By.xpath("//input[@placeholder='Re-enter new password']")).sendKeys("Active@123");
		driver.findElement(By.xpath("//input[@value='Reset Password']")).click();
		driver.findElement(By.xpath("//button[@value='Back to Login']")).click();
		
		System.out.println("Forgot_Password successfully");
		
	}

}
