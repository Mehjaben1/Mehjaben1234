import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_002_Mercury_Travels_URLValidation_FirefoxBrowser {

	public static void main(String[] args) {
	
		
		// Set system Property Firefox Browser  
		  System.setProperty("webdriver.gecko.driver","C:\\SeleniumInstallation\\Miscellaneous\\geckodriver.exe");
		  
		  // Instantiate the browser class for Firefox  
		  WebDriver driver = new FirefoxDriver();
		  
		  // Navigate the URL
		  driver.get("http://demo.guru99.com/test/newtours/"); 
		  



	}

}
