package SelPAT1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.by;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.Assert;


public class NewTest {
  @Test
  public void f() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
		driver.get("http://qatechhub.com");	 
	/*	string actTitle = "QA Automation Tools Trainings and Tutorials | QA Tech Hub";
		 Assert.assertEquals(driver.getTitle(), actTitle);
		 System.out.println("PASS" + driver.getTitle());
		 
		 driver.navigate().to("https://www.facebook.com");
		
		 System.out.println("Title of Naviagte 1 " + driver.getTitle());
		 
		 driver.navigate().back();
		 
		 System.out.println("Title of Naviagte 2 " +driver.getcurrentUrl());
		 
		 driver.navigate().forward();
		 System.out.println("Title of Naviagte 3 " +driver.getcurrentUrl());
		 
		 driver.navigate().refresh();
		 System.out.println("Title of Naviagte 4" +driver.getcurrentUrl());
		 */
		 
		  
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
