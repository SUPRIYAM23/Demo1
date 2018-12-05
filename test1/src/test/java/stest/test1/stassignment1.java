package stest.test1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class stassignment1 {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");	 
		  driver.navigate().to("http://www.friends2support.org/index.aspx");
		 System.out.println(driver.getCurrentUrl());
		 driver.navigate().back();
		 System.out.println(driver.getCurrentUrl());
		  driver.close();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

  }

  @AfterTest
  public void afterTest() {
  }

}
