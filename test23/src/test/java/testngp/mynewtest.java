package testngp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;


public class mynewtest {
  @Test (priority=2)//my very first succesfull testcase
  public void f() {
	  
	  	  WebDriver driver = new ChromeDriver();
	  	//  driver.manage().window().maximize();
	  		driver.get("http://qatechhub.com");	 
	  		 System.out.println("Title of Naviagte 1 " + driver.getTitle());
	String  	 actTitle = "QA Automation Tools Trainings and Tutorials | QA Tech Hub";
	  		 Assert.assertEquals(driver.getTitle(), actTitle);
	  		 driver.navigate().to("https://www.facebook.com");
	  		 driver.navigate().back();
	  		 
	  		 System.out.println("Title of Naviagte 2 " +driver.getCurrentUrl());
	  		 driver.navigate().forward();
	  		 System.out.println("Title of Naviagte 3 " +driver.getCurrentUrl());
	  		 
	  		 
	  		
	  		 
	  		 driver.navigate().refresh();
	  		 System.out.println("Title of Naviagte 4" +driver.getCurrentUrl());
	  		 
	  		 driver.findElement(By.name("firstname")).sendKeys("Panav");
	  		 driver.findElement(By.name("lastname")).sendKeys("Mugalapalli");
	  		 // 	 System.out.println("PASS" + driver.getTitle());
	  	/*	 
	  		
	  		
	  		
	  		 
	  		
	  	
	  		 */

	  
	  		 driver.close();
	  
	  
	  
	  
  }
  
  @Test(priority=1) //To test Login
  public void testLogin() {
	  
	  	  WebDriver driver = new ChromeDriver();
	  	//  driver.manage().window().maximize();
	  		driver.get("https://courses.ultimateqa.com/users/sign_in");	 
	  		driver.findElement(By.name("user[email]")).sendKeys("masani.supriya@gmail.com");
	  		driver.findElement(By.name("user[password]")).sendKeys("password1234");
	  		WebElement chkboxRme= driver.findElement(By.id("user_remember_me"));
	  		chkboxRme.click();
	  		
	  		WebElement btnsubmit=driver.findElement(By.id("btn-signin"));
	  		btnsubmit.click();
	  		
	  		
	  		 //(driver.getPageSource().contains("Invalid email or password.")
	  		
	  		boolean error= driver.getPageSource().contains("Invalid email or password.");
	  		 if (error= true)
	  		 { 
	  		WebElement btnCreate=	driver.findElement(By.partialLinkText("Create a new account"));
	  			 btnCreate.click();
	  			 
	  			System.out.println(driver.getCurrentUrl()); 
	  			
	  			driver.findElement(By.id("user_first_name")).sendKeys("supriya");
		  	
	  			driver.findElement(By.id("user_last_name")).sendKeys("masani");
	  			driver.findElement(By.id("user_email")).sendKeys("masani.supriya@gmail.com");
	  			driver.findElement(By.id("user_password")).sendKeys("password1234");
	  			
	  			WebElement chkUserTerms= driver.findElement(By.id("user_terms"));
	  			
	  			chkUserTerms.click();
	  			
	  			WebElement chckCaptcha=driver.findElement(By.className("recaptcha-checkbox-checkmark"));
	  			
	  					chckCaptcha.click();
	  					
	  					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  					WebElement btnsignin=driver.findElement(By.id("btn-signup"));
	  					btnsignin.click();
	  					 driver.close();
	  					  
	  					
	  		 }
	  		 
	  		 
	  	

	  
	  	
	  
	  
	  
  }
  
  
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
  }

  @AfterTest
  public void afterTest() {
	 
  }

}
