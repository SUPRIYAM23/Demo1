package Samples.Sample1;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {
	WebDriver driver = new ChromeDriver();
	
  @Test
  public void f() {
	  
	  driver.get("http://www.google.com");
	  driver.navigate().to("http://www.friends2support.org/index.aspx");
	 driver.findElement(By.linkText("Forgot Password?")).click();
	 AssertJUnit.assertEquals("http://www.friends2support.org/inner/news/forgotPassword.aspx", driver.getCurrentUrl());
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

  }

  @AfterTest
  public void afterTest() {
	  driver.close(;)
  }

}
