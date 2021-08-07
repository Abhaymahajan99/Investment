package com.Investment.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register_Account {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://investment.tech-active.com/");
		
		/*
		 * driver.findElement(By.xpath("//input[contains(@placeholder,'Find Projects')]"
		 * )).sendKeys("textile");
		 * 
		 * driver.findElement(By.xpath("//input[@type='submit']")).click();
		 */
		
		
		
		
		driver.findElement(By.xpath("//button[.=\"Register\"]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter registered number']")).sendKeys("9184004910");
		driver.findElement(By.xpath("//input[@value='Sign up ']")).click();
		driver.findElement(By.xpath("//input[contains(@aria-label,'Digit 1')]")).sendKeys("1");
		driver.findElement(By.xpath("//input[contains(@aria-label,'Digit 2')]")).sendKeys("2");
		driver.findElement(By.xpath("//input[contains(@aria-label,'Digit 3')]")).sendKeys("3");
		driver.findElement(By.xpath("//input[contains(@aria-label,'Digit 4')]")).sendKeys("4");
		driver.findElement(By.xpath("//input[@value='Confirm OTP']")).click();

		driver.findElement(By.xpath("//input[@placeholder='Enter new password']")).sendKeys("Active@123");
		driver.findElement(By.xpath("//input[@placeholder='Re-enter new password']")).sendKeys("Active@123");
		driver.findElement(By.xpath("//input[@value='Confirm']")).click();
		driver.findElement(By.xpath("//button[.='Proceed']")).click();

		//A few more details page

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Ekbazaar tester");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("tester@gmail.com");
		driver.findElement(By.xpath("//input[@value='Next']")).click();

		//A few more details 2 page

		Thread.sleep(500);

		driver.findElement(By.xpath("(//div[@class=\"role__placeholder css-1wa3eu0-placeholder\"])[1]")).click();
		driver.findElement(By.xpath("(//div[.='karnataka'])")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class=\"role__placeholder css-1wa3eu0-placeholder\"]")).click();
		driver.findElement(By.xpath("(//div[.='bengaluru'])")).click();

		driver.findElement(By.xpath("//input[@placeholder='Business name']")).sendKeys("TestUser");
		driver.findElement(By.xpath("//input[@placeholder='GST Number']")).sendKeys("37AAACB1534F2Z4");


		driver.findElement(By.xpath("//textarea[@placeholder='Business address']")).sendKeys("2nd Stage BTM");
		driver.findElement(By.xpath("//input[@placeholder='Pincode']")).sendKeys("560076");
		driver.findElement(By.xpath("//textarea[@placeholder='Company Overview']")).sendKeys("Support small and medium enterprises, individual craftsmen, artisans, weavers etc...,");

		driver.findElement(By.xpath("//input[@value=' Submit & Continue']")).click();

		//email varification
		Thread.sleep(500);

		WebDriverWait wait =new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.
				xpath("//a[contains(text(),'Verify Later')]")));



		WebElement verify = driver.findElement(By.xpath("//a[contains(text(),'Verify Later')]"));
		Thread.sleep(500);
		verify.click();


		//Specify your interests Page

		driver.findElement(By.xpath("//span[.='electricals']")).click();
		driver.findElement(By.xpath("//span[.='cement']")).click();
		driver.findElement(By.xpath("//span[.='chemicals']")).click();

		Thread.sleep(500);
		
		
		/*
		 * driver.findElement(By.
		 * xpath("(//div[@class='search-for__value-container search-for__value-container--is-multi css-g1d714-ValueContainer'])[2]"
		 * )).click(); driver.findElement(By.
		 * xpath("//div[@class='search-for__placeholder css-1wa3eu0-placeholder']"));
		 * Thread.sleep(500);
		 * driver.findElement(By.xpath("(//span[.='karnataka'])")).click();
		 */
		 
		/*
		 * driver.findElement(By.
		 * xpath("(//div[@class='search-for__value-container search-for__value-container--is-multi css-g1d714-ValueContainer'])[2]"
		 * )).click(); List<WebElement> opt = driver.findElements(By.
		 * xpath("(//div[@class='search-for__value-container search-for__value-container--is-multi css-g1d714-ValueContainer'])[2]"
		 * )); int s = opt.size(); // Iterating through the list selecting the desired
		 * for( int j = 0; j<=opt.size()-1;j++){ // if the option is By Subject if(
		 * opt.get(j).getText().equals("karnataka")) { opt.get(j).click(); break; }}
		 */

		
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[.='Save & Browse']")).click();
		
		System.out.println("Account Created successfully");
		
		driver.quit();
	}


}
