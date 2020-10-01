


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_330_FLIGHT_BOOKING {
	
	
//private static final TimeUnit SECONDS = null;

public String MercuryURL = "http://demo.guru99.com/test/newtours/";
	
	// Instantiate of the object
	public WebDriver driver;		
	
	public String WebBrowserKey ="webdriver.chrome.driver";
	 
	public String WebBrwoserKeyValue ="C:\\SeleniumInstallation\\Miscellaneous\\chromedriver.exe";
	
	@BeforeTest
	
public void NavigateURL(TimeUnit SECONDS) {		
		
		try {
		
		// Set system property for chrome browser		
		System.setProperty(WebBrowserKey, WebBrwoserKeyValue);				
			
		 driver = new ChromeDriver();
		
		
		
				
		// Implicit Wait 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		// FLUENT WAIT
			
		 
				// Navigate to the specified URL
				//driver.get(MercuryURL);
				
		// Maximize the web browser
		driver.manage().window().maximize();
		
		
		} catch (Exception e) {
			
			throw (e);
		}
		
	}
	
	
	
  @Test (priority = 1)
  
  
  
  public void Flight_Booking() {
	  
	 try  { 
	  
		// Click on Sign-On link
			driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
			
			// ENter Username into the username field
			driver.findElement(By.name("userName")).sendKeys("mercury");
			
			// Enter password into the password filed
			
			driver.findElement(By.name("password")).sendKeys("mercury");
			
			// Click on Submit button		
			driver.findElement(By.name("submit")).click();
			
			//****************************************************************
			//Context validation point
			//****************************************************************
			
			String ActualText, ExpectedText;
			
			ActualText = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")).getText();
					
			ExpectedText = "Login Successfully";
			
			if (ActualText.equals(ExpectedText)) {			
				System.out.println("Login Successful!");			
			}		
			else {			
				System.out.println("Login Failed!");			
			}
					
					
			// click on Flight link		
			driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a")).click();
			
			// Click on One Way button
			driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
			
			// Identify the element and put into the new variable
			Select drpPassengers = new Select(driver.findElement(By.name("passCount")));
			
			// Select 2 from the drop down list
			drpPassengers.selectByVisibleText("2");
			
			
			// Select Depart City		
			Select drpCity = new Select(driver.findElement(By.name("fromPort")));
			drpCity.selectByVisibleText("New York");
			
			
			// Select Month
			
			Select drpMonth = new Select(driver.findElement(By.name("fromMonth")));		
			//drpMonth.selectByVisibleText("August");		
			//drpMonth.selectByValue("12");		
			drpMonth.selectByIndex(11);
			
			
			// Select Depart Day
			Select DepartDay = new Select(driver.findElement(By.name("fromDay")));		
			DepartDay.selectByVisibleText("31");
			
			// Select Arrive City
			Select ArriveCity = new Select(driver.findElement(By.name("toPort")));
			ArriveCity.selectByVisibleText("London");
			
			
			// Select Service Class (First Class)
			
		// driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]")).click();
			
			// Select Service Class (First Class)
			//driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]")).click();
		driver.findElement(By.name("servClass")).getText();	
			
			
			
			// Select Airline
			Select AirlineSelect = new Select(driver.findElement(By.name("airline")));
			AirlineSelect.selectByVisibleText("Unified Airlines");
			
			
			// Click on Continue button
			driver.findElement(By.name("findFlights")).click();
			
			
			String FindFlightActualText, FindFlightExpectedText, UpdatedActualText ; 		
			
			FindFlightActualText = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td/p/font/b/font[1]")).getText();
			FindFlightExpectedText = "After flight finder - No Seats Avaialble"; 						
			UpdatedActualText = FindFlightActualText.trim();
			
							
			if (UpdatedActualText.equals(FindFlightExpectedText)) {			
				System.out.println("TC_110_MercuryTours_Flight_Booking is Successful!");			
			} else {			
				System.out.println("TC_110_MercuryTours_Flight_Booking is Failed!");			
			}
					
				} catch (Exception e) {
					
					throw (e);
				}
			
		}
		 
  
  
  
     @AfterTest
     
public void CloseBrowser() {	
		 
		 try {
			 
		// Close the browser
			driver.quit();	 
			
			} catch (Exception e) {
				
				throw (e);
			}
	  
  }
}
