import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Junit_practice {
@Test
	public static void main(String[] args) {

		
		
		
		
	
		
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumInstallation\\Miscellaneous\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver(); 
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.yahoo.com/");
		 
		//driver.findElement(By.cssSelector("input#ybar-sbq._yb_cerck")).sendKeys("facebook");
		 
		 driver.findElement(By.id("ybar-sbq")).sendKeys("facebook");
		 
		 
		 
		 
		 driver.findElement(By.xpath("//*[@id=\"ybar-sf\"]/input[2]")).click();
		 
		 driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		 
		driver.findElement(By.linkText("Facebook - Log In or Sign Up")).click();
		 
		 
		 

		  
		//driver.findElement(By.id("yui_3_10_0_1_1607998880102_252")).click();

		 // How to switch the Browser "WINDOW HANDELER"
		 System.out.println("window handeler" + driver.getWindowHandle()); 
		 
		 for(String handle:driver.getWindowHandles()) 
		 { 
		 driver.switchTo().window(handle); 
		 }
		 
		 

		 String expected, actucal; 
		 expected = "Facebook";
		 actucal= driver.getTitle();

		if (expected.equals(actucal)) {
		System.out.println("validation passed" + actucal);

		}
		else System.out.println("validation failed" + actucal);

		String soursecode;
		soursecode= driver.getPageSource();
		System.out.println(soursecode);

		driver.findElement(By.id("u_0_2")).click();
		driver.findElement(By.name("firstname")).sendKeys("sams");
		driver.findElement(By.name("lastname")).sendKeys("khan");
		driver.findElement(By.name("reg_email__")).sendKeys("eamy23549@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Eamy23549$");


		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


		//Dropdown box.


		 WebElement dd_box = driver.findElement(By.name("birthday_month"));
		 
		 Select month_dd = new Select(dd_box);
		 
		 month_dd.selectByVisibleText("May");
		 
		 
		 WebElement day_dd = driver.findElement(By.id("day"));
		 
		 Select newday_dd = new Select(day_dd);
		 
		 newday_dd.selectByIndex(12);


		//driver.close();
	

	}

}
