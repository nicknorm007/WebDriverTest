package example;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.*;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;

import java.net.MalformedURLException;
import java.net.URL;

public class NewTest {		
	    private WebDriver driver;		
		@Test				
		public void testEasy() {	
			driver.get("http://demo.guru99.com/selenium/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
		}	
		@BeforeTest
		public void beforeTest() {
			//System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		    //driver = new ChromeDriver();
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setBrowserName("chrome");
			try {
				driver = new RemoteWebDriver( new URL("http://localhost:4444/wd/hub"), capabilities);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	