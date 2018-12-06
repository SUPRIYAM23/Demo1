package ProjectKickOff.Project1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.AfterTest;
import org.testng.asserts.*;

import junit.framework.Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Day2 {
	WebDriver driver = new ChromeDriver();
	
	
	
  @Test
  
  public void loginCheck() {
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  String baseUrl="http://www.demo.guru99.com/V4/";
	   driver.get(baseUrl);
	   
	   driver.findElement(By.name("uid")).sendKeys("mngr165749");
	   driver.findElement(By.name("password")).sendKeys("vazUgEd");
	   driver.findElement(By.name("btnLogin")).click();
	   Assert.assertEquals("Home", driver.getTitle());
	  
	   
	   //test to check if i commit directly
	  
	   
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  
	
	 
  }

}
