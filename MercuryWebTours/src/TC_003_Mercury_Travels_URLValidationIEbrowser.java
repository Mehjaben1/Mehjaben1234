import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TC_003_Mercury_Travels_URLValidationIEbrowser {

	public static void main(String[] args) {
		
		
		// Set system Property IE Browser  
		  System.setProperty("webdriver.ie.driver","C:\\SeleniumInstallation\\Miscellaneous\\IEDriverServer.exe");
		  
		  
		  // Instantiate the browser class for IE browser  
		  WebDriver driver = new InternetExplorerDriver();
		  
		  // Navigate the URL
		  driver.get("http://demo.guru99.com/test/newtours/"); 
		  

		  
	}

}
