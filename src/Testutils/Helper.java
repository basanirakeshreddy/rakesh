package Testutils;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Tests.TestBase;


public class Helper extends TestBase {
	public static Helper h;
	
	
	//Selecting Browser Type and Opening browser
	public void browserType() {
		
	//System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		//driver = new ChromeDriver();
			
		if (conf.getProperty("browserType").equalsIgnoreCase("chrome")){
		    System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
		    driver = new ChromeDriver();
		}else if (conf.getProperty("browserType").equalsIgnoreCase("firefox")){
	    driver = new FirefoxDriver();
	    } 
        else 
	    {
	    System.setProperty("webdriver.ie.driver", "C:\\Windows\\System32\\IEDriverServer.exe");
	    driver = new InternetExplorerDriver();
		  }	 
	}
	
	//Opening the required URL
	public void Pagemaximise() {
		driver.manage().window().maximize();	
	}
	
	//Quitting the browser
	public void closingBrowser() {
		driver.close();
		driver.quit();
	}
	
	//Wait Method
	public void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (Exception e) {
			
		}
	}
		
	
}
