package TradeProblem;

	
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class AddproductsAfterSIgnUp {
		
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		}


		public static void main(String[] args) {
			//System.setProperty("webdriver.chrome.driver", "/Users/activemac03/Desktop/Drivers for Selenium/ChromeDriver");
			WebDriver driver=new ChromeDriver();
			driver.get("https://tradebazaar.tech-active.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//<div class="sell">Sell on EkBazaar</div>
			driver.findElement(By.xpath("//div[text()='Sell on EkBazaar']")).click();//Sell on Ekbazaar
			//<button class="modal-toggle-button Register"> Register </button>
			driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click(); //Register
			//<div class="role__value-container css-g1d714-ValueContainer"><div class="role__placeholder css-1wa3eu0-placeholder">Select a Language</div><input id="react-select-6-input" readonly="" tabindex="0" aria-autocomplete="list" class="css-62g3xt-dummyInput" value=""></div>
			driver.findElement(By.xpath("//div[@class='role__value-container css-g1d714-ValueContainer']")).click();
			//<div class="role__single-value css-1lt0c-singleValue">English</div>
			List<WebElement> AllOptions=driver.findElements(By.xpath("//div[text()='English']"));
			for(int i=0; i<=AllOptions.size()-1;i++) {
				if(AllOptions.get(i).getText().contains("English")) { 
					AllOptions.get(i).click();
	                break; 
				}
			}
			//<button value="Remember &amp; Continue" xpath="1">Remember &amp; Continue</button>
	        driver.findElement(By.xpath("//button[contains(text(),'Remember & Continue')]")).click();
			//<input autocomplete="new-password" maxlength="10" type="tel" placeholder="Enter number" value="" xpath="1">
			driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1397825787");
			//<input type="submit" value="Sign up " xpath="1">
			driver.findElement(By.xpath("//input[@value='Sign up ']")).click(); //Sign Up
			//<input aria-label="Please enter verification code. Character 1" autocomplete="off" class=" " type="password" maxlength="1" value="" style="width: 1em; text-align: center;" xpath="1">
		    driver.findElement(By.xpath("//input[@aria-label='Please enter verification code. Character 1']")).sendKeys("1");
		    //<input aria-label="Character 2" autocomplete="off" class=" " type="password" maxlength="1" value="" style="width: 1em; text-align: center;" xpath="1">
		    driver.findElement(By.xpath("//input[@aria-label='Character 2']")).sendKeys("2");
		    //<input aria-label="Character 3" autocomplete="off" class=" " type="password" maxlength="1" value="" style="width: 1em; text-align: center;" xpath="1">
		    driver.findElement(By.xpath("//input[@aria-label='Character 3']")).sendKeys("3");
		    //<input aria-label="Character 4" autocomplete="off" class=" " type="password" maxlength="1" value="" style="width: 1em; text-align: center;" xpath="1">
		    driver.findElement(By.xpath("//input[@aria-label='Character 4']")).sendKeys("4");
		    //<input type="submit" value="Confirm OTP" xpath="1">
		    driver.findElement(By.xpath("//input[@value='Confirm OTP']")).click(); //Confirm OTP
		    //<input autocomplete="new-password" type="password" placeholder="Enter password" value="" xpath="1">
		    driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("Active@123");
		    //<input autocomplete="new-password" type="password" placeholder="Re-enter password" value="">
	        driver.findElement(By.xpath("//input[@placeholder='Re-enter password']")).sendKeys("Active@123");	
	        //<input type="submit" value="Confirm" xpath="1">
	        driver.findElement(By.xpath("//input[@value='Confirm']")).click(); //Confirm
	        //<button value="Proceed" xpath="1">Proceed</button>
	        driver.findElement(By.xpath("//button[@value='Proceed']")).click(); //Proceed
	        //Dr0p Down of Who You Are
	        
	        //<div class="role__value-container css-g1d714-ValueContainer" xpath="1"><div class="role__placeholder css-1wa3eu0-placeholder">Select</div><input id="react-select-3-input" readonly="" tabindex="0" aria-autocomplete="list" class="css-62g3xt-dummyInput" value=""></div>
	        driver.findElement(By.xpath("//div[@class='role__value-container css-g1d714-ValueContainer']")).click(); //Who You ARe drop down
	        //<div class="role__single-value css-1lt0c-singleValue" xpath="1">farmer</div>
	        List<WebElement> Who=driver.findElements(By.xpath("//div[contains(text(),'farmer')]"));
	        for(int j=0;j<=Who.size()-1;j++) {
	        	if(Who.get(j).getText().contains("Farmer")) {
	        		Who.get(j).click();
	        		break; 
	        	}
	        }
	        //<input autocomplete="new-password" type="text" placeholder="Enter your name" value="" xpath="1">
	        driver.findElement(By.xpath("//input[@placeholder='Enter your name']")).sendKeys("Anusha");
	        //Country drop down 
	        //<div class="role__value-container css-g1d714-ValueContainer" xpath="1"><div class="role__placeholder css-1wa3eu0-placeholder">search or select country</div><div class="css-b8ldur-Input"><div class="role__input" style="display: inline-block;"><input autocapitalize="none" autocomplete="off" autocorrect="off" id="react-select-4-input" spellcheck="false" tabindex="0" type="text" aria-autocomplete="list" value="" style="box-sizing: content-box; width: 2px; background: 0px center; border: 0px; font-size: inherit; opacity: 1; outline: 0px; padding: 0px; color: inherit;"><div style="position: absolute; top: 0px; left: 0px; visibility: hidden; height: 0px; overflow: scroll; white-space: pre; font-size: 16px; font-family: Arial; font-weight: 400; font-style: normal; letter-spacing: normal; text-transform: none;"></div></div></div></div>
	        driver.findElement(By.xpath("//div[@class='role__value-container css-g1d714-ValueContainer']")).click(); //Country 
	        List<WebElement> Country=driver.findElements(By.xpath("//div[contains(text(),'india')]"));
	        for(int k=0;k<=Country.size()-1; k++) {
	        	if(Country.get(k).getText().contains("India")) {
	        		Country.get(k).click();
	        		break; 
	     	}
        }
	        		
	        	    driver.findElement(By.xpath("//div[@class='role__value-container css-g1d714-ValueContainer']")).click();//city
	        	    driver.findElement(By.xpath("//div[contains(text(),'Bengaluru,Karnataka')]")).click();
	        	
	        
	       // driver.findElement(By.xpath("//div[contains(text(),'Bengaluru,Karnataka')]")).click();
	        //driver.findElement(By.xpath("//div[@class='role__value-container css-g1d714-ValueContainer']")).click();//city
			 //driver.findElement(By.xpath("//div[contains(text(),'Bengaluru,Karnataka')]")).click();
	        //<input autocomplete="new-password" type="text" placeholder="Email ID" value="" xpath="1">
	        //driver.findElement(By.xpath("//input[@placeholder='Email ID']")).sendKeys("dsvvdvc@gmail.com");
	       // driver.findElement(By.xpath("//*[@id=\"Seller-layout\"]/div[3]/div/div[1]/div/form/div[6]/div/input")).sendKeys("dsvvdvc@gmail.com");
	        //driver.findElement(By.xpath("//*[@id=\"Seller-layout\"]/div[3]/div/div[1]/div/form/div[6]/div/input")).sendKeys("fdgdbh@gmail.com");
	     
	        WebElement l = driver.findElement(By.xpath("//input[@placeholder='Email ID']"));
	        l.sendKeys("test@gmail.com");
	        //refresh page
	        driver.navigate().refresh();
	        //fix exception with try−catch block
	        try{
	           l.sendKeys("test@gmail.com");
	        }
	        catch(StaleElementReferenceException e){
	           l = driver.findElement(By.xpath("//input[@placeholder='Email ID']"));
	           l.sendKeys("test@gmail.com");
	       
	        }
	        driver.quit();
	        
	        
	        
		}
		}



