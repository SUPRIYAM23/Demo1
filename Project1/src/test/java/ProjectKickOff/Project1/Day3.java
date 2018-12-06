package ProjectKickOff.Project1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Day3 {
	WebDriver driver = new ChromeDriver();
	
	
	
  @Test
  @Parameters({"username" ,"password"})
  public void loginCheck(String username,String password) {
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  String baseUrl="http://www.demo.guru99.com/V4/";
	   driver.get(baseUrl);
	   
	   driver.findElement(By.name("uid")).sendKeys(username);
	   driver.findElement(By.name("password")).sendKeys(password);
	   driver.findElement(By.name("btnLogin")).click();
	  
	   
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
