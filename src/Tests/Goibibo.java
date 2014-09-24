package Tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Testutils.Helper;

public class Goibibo extends Helper
{
	//  ///////////////////////////// code for sign up test case1    ///////////////////////////////////////////
	
	Helper h = new Helper();
	
	@Test
	public void Test1() throws IOException 
	{
		driver.get(conf.getProperty("testUrlReg"));
		h.Pagemaximise();
		driver.findElement(By.id("id_email")).sendKeys("rakesh.selinium@gmail.com");
		driver.findElement(By.id("id_password1")).sendKeys("rakesh1616");
		driver.findElement(By.id("id_city")).sendKeys("Warangal");
		driver.findElement(By.className("loginBut")).submit();
		System.out.println("Test 1 Registrtaion in the site is done");
		System.out.println("========================================================================================================");
		h.closingBrowser();
	}
	
	// ////////////////////////////   code for hotel links clicking test case 2 ////////////////////////////////      
		@Test
		public void Test2()
		{
			driver.get(conf.getProperty("testUrlHotel"));
			h.Pagemaximise();
			h.sleep(5);
			
			List <WebElement> links = driver.findElement(By.cssSelector("div.goibibo_special_")).findElements(By.tagName("a"));
			if (links==null){
	        	Assert.fail("404 Exception");
	        	System.out.println("fail");
	        }else
			System.out.println("GOIBIBO special container size" + " " + links.size());
	        ArrayList<String> arrlinks = new ArrayList<String>();
			for(int j=0;j<links.size();j++){
			
				arrlinks.add(links.get(j).getAttribute("href"));
			}
			
			for(int i=0;i<links.size();i++){
				System.out.println("Clicking " +(i+1) +" " +driver.getTitle());
				driver.get(arrlinks.get(i));
				if(driver.getTitle().contains("Page Not Found")){
					Assert.fail("Fail");
				}else{
					System.out.println("PASS");
				}
				
				h.sleep(5);
			}
			
		System.out.println("Veified links of Goibibo special container ====================================================");
	

			driver.get(conf.getProperty("testUrlHotel"));
			h.Pagemaximise();
			h.sleep(10);
			List <WebElement> links1 = driver.findElement(By.cssSelector("div.fresh_offers")).findElements(By.tagName("a"));
			if (links1==null){
	        	Assert.fail("404 Exception");
	        	System.out.println("fail");
	        }else
			System.out.println("Fresh offers container size " + " " + links1.size());
	        ArrayList<String> arrlinks1 = new ArrayList<String>();
			for(int l=0;l<links1.size();l++){
				arrlinks1.add(links1.get(l).getAttribute("href"));
			}
			
			for(int m=0;m<links1.size();m++){
				System.out.println("Clicking " +(m+1) +" " +driver.getTitle());
				driver.get(arrlinks1.get(m));
				if(driver.getTitle().contains("Page Not Found")){
					Assert.fail("Fail");
				}else{
					System.out.println("PASS");
				}
				
				h.sleep(5);
			
			}
			System.out.println("Verified fresh offes container ====================================================================");
			
			driver.get(conf.getProperty("testUrlHotel"));
			h.Pagemaximise();
			h.sleep(5);
			
			List <WebElement> links2 = driver.findElement(By.cssSelector("div.international_deals")).findElements(By.tagName("a"));
			if (links2==null){
	        	Assert.fail("404 Exception");
	        	System.out.println("fail");
	        }else
			System.out.println("Intenational deals container size " + " " + links2.size());
	        ArrayList<String> arrlinks2 = new ArrayList<String>();
			for(int l=0;l<links2.size();l++){
				arrlinks2.add(links2.get(l).getAttribute("href"));
			}
			
			for(int m=0;m<links2.size();m++){
				System.out.println("Clicking " +(m+1) +" " +driver.getTitle());
				driver.get(arrlinks2.get(m));
				if(driver.getTitle().contains("Page Not Found")){
					Assert.fail("Fail");
				}else{
					System.out.println("PASS");
				}
				
				h.sleep(5);
			}
			System.out.println("Verified Internation deals container ===========================================================");
			h.closingBrowser();
			}
			
	        @Test
	        public void Test3(){
	        	driver.get(conf.getProperty("testUrlHotel"));
	        	h.Pagemaximise();
				
				h.sleep(5);
				List <WebElement> links1 = driver.findElement(By.cssSelector("div.fresh_offers")).findElements(By.tagName("a"));
				if (links1==null){
		        	Assert.fail("404 Exception");
		        	System.out.println("fail");
		        }else
				System.out.println("container size " + " " + links1.size());
				links1.get(0).click();
				System.out.println(driver.getTitle());
				System.out.println("Clicked on fern hotel link");
				
				h.sleep(5);
				
				List <WebElement> container = driver.findElement(By.cssSelector("div.main_container")).findElements(By.tagName("a"));
				if (container==null){
		        	Assert.fail("404 Exception");
		        	System.out.println("fail");
		        }else
				System.out.println(container.size());
				container.get(2).click();
				System.out.println("clicked required hotel ");
				h.closingBrowser();
	        }
				/*ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(newTab.get(1));
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				List <WebElement> links2 = driver.findElement(By.className("ht_rmprn")).findElements(By.tagName("a"));
				System.out.println(links2.size());
				System.out.println(links2.get(0).getCssValue("color"));
				driver.quit();	
	        } 
	        
			@Test
			public void Test4(){
		    driver.get(conf.getProperty("testUrlBook"));
		    try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		    driver.findElement(By.id("detail_checkin")).click();
		   List<WebElement> chckin = driver.findElement(By.id("temp_cal_holder")).findElement(By.className("ui-datepicker-calendar")).findElements(By.tagName("a"));
		    if (chckin.size() != 0)
		    System.out.println(chckin.size());
		   try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		    chckin.get(2).click();
		    System.out.println("checked in");
			List<WebElement> chckout = driver.findElement(By.cssSelector("div.hd-calPos.hasDatepicker")).findElement(By.cssSelector("table.ui-datepicker-calendar")).findElements(By.tagName("a"));
			//System.out.println(chckout.size());
			if (chckout.size() != 0)
			System.out.println( chckout.size());
		    try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			chckout.get(2).click();
			System.out.println("checked out");
			List<WebElement> hotel = driver.findElement(By.cssSelector("select.room_name")).findElements(By.tagName("option"));
			System.out.println( hotel.size());
			hotel.get(1).click();	
			System.out.println("hotel selected");
			List<WebElement> rum = driver.findElement(By.id("roomNum")).findElements(By.tagName("a"));
			System.out.println( rum.size());
			rum.get(1).click();	
			System.out.println("rooms selected");
		   driver.quit();
			}
		
	        	
	        */
	        @BeforeMethod
	        public void beforeMethod() {
	        	h.browserType();
	        }
	
			
	
	
	
}
