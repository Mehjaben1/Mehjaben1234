/*
 		 **************************************************************************************************************************************************
		* Test Name: TC_101_Travels_URLValidation_Chrombrowser 
		* Test Discription: User should be able to navigate to the home page of the application using valid URL.
		* Test Engineer Name: Mehjaben Shahriar
		* Date: 07-07-2020
		* Review History: Aktar Zaman
		********************************************************************************************************************************************************
		********************************************************************************************************************************************************
	
		*/
		
		import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;	
	

public class TC_001_Mercury_Travels_URLValidation_ChromeDiver {

	public static void main(String[] args) {
		
		
		try {
			
				// Set System Property
				  System.setProperty("webdriver.chrome.driver","C:\\SeleniumInstallation\\Miscellaneous\\chromedriver.exe");
				  
				  // Instantiate a browser class
				  WebDriver driver = new ChromeDriver();
				  
				  // Navigate to the following URL
				  driver.get("http://demo.guru99.com/test/newtours/"); 
			

				  
				//Implicit Wait
				     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    
				     //Maximize the Browser
				     driver.manage().window().maximize();
				     
				     //Click on sign-on Link
				     driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
					
					//Enter User name
				     driver.findElement(By.name("userName")).sendKeys("mercury");
					
					//Enter Password
				     driver.findElement(By.name("password")).sendKeys("mercury");
				     
				     //Click on Submit button
				     driver.findElement(By.name("submit")).click();
					
				     //Context Validation Point
				     String actText;
				     String expecText;
				     expecText = "Login Successfully";
				     
					 actText = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")).getText();
					
				     if(actText.equals(expecText)) {
				    	 System.out.println("Login Successful");
				     }else {
				    	 System.out.println("Login Failed");
				     }
					
					
					//Click on Flight Link
				     driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a")).click();
					
					//Select One Way from the radio button
				     driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
					
					//Identify the element and put it into the variable
					//Select Passenger from drop down list
				     Select drpPassenger = new Select(driver.findElement(By.name("passCount")));
					drpPassenger.selectByVisibleText("2");
					
					//Select DEparting Country from drop down list
					Select drpDeparting = new Select(driver.findElement(By.name("fromPort")));
					drpDeparting.selectByVisibleText("London");
					
					//Select Departing Month from drop down list
					Select drpMonth = new Select(driver.findElement(By.name("fromMonth")));
					drpMonth.selectByVisibleText("August");
					
					//Select Departing Date from drop down list
					Select drpDate = new Select(driver.findElement(By.name("fromDay")));
					drpDate.selectByValue("26");
					
					//Select Arriving Country from drop down list
					Select drpArrive = new Select(driver.findElement(By.name("toPort")));
					drpArrive.selectByValue("New York");
					
					//Select Arriving Month from drop down list
					Select arriveMonth = new Select(driver.findElement(By.name("toMonth")));
					arriveMonth.selectByValue("12");
					
					//Select Arriving Date from drop down list
					Select arrivingDate = new Select(driver.findElement(By.name("toDay")));
					arrivingDate.selectByValue("30");
					
				    //Select from list
					driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]")).click();
					
					//Select Airlines from drop down list
					Select airLines = new Select(driver.findElement(By.name("airline")));
					airLines.selectByVisibleText("Unified Airlines");
					
					//Click on continue button
					driver.findElement(By.name("findFlights")).click();
					
			//	driver.findElement(By.name("findFlights")).click();
					
			// driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input")).click();		
							
					
					
					String FindFlightActualText, FindFlightExpectedText, UpdatedActualText ;   
					 
					  FindFlightActualText = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td/p/font/b/font[1]")).getText();
					  System.out.println(FindFlightActualText);
					  
					  FindFlightExpectedText =  "After flight finder - No Seats Avaialble";	
					  
					  //FindFlightExpectedText = "After flight finder - No Seats Avaialble";       
					  UpdatedActualText = FindFlightActualText.trim();
					  
					      
					 if (UpdatedActualText.equals(FindFlightExpectedText)) {   
					   System.out.println("TC_110_MercuryTours_Flight_Booking is Successful!");   
					  } else {   
					   System.out.println("TC_110_MercuryTours_Flight_Booking is Failed!");   
					  }

					    //Close the Browser
					     
					 driver.quit();
					 
						}
					catch(Exception e) {
						throw e;
						
					}  
				  
				  
				  
				  
	}

}
