package Tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

public class TestBase 
{
	 public static String dir1;
	  public static Properties conf=null;
	  public static Properties Or=null;
	  public static WebDriver driver;
	  FileInputStream fp, fp1;
	  public static Logger log = Logger.getLogger("devpinoyLogger");
	 

		@BeforeSuite	
		public void intialize() throws IOException   {
			
			log.debug("Starting the test suite......");
			log.debug("Loading the config files.....");
			dir1= System.getProperty("user.dir");	
			fp= new FileInputStream(dir1+"\\src\\Conifg\\confg.properties");
			conf = new Properties();
			conf.load(fp);
			log.debug("Loading the Object repository files.....");
			fp1= new FileInputStream(dir1+"\\src\\Conifg\\OR.properties");
			Or = new Properties();
			Or.load(fp1);
			
			System.out.println("Choosing the browser: "+ conf.getProperty("browserType"));
			
				}
}
