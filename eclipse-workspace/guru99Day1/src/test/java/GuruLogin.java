import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.asserts.*;


//import static org.testng.Assert.assertEqual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruLogin {
	  WebDriver driver = new ChromeDriver();
	
  @Test
  @Parameters({"username","password"})
  public void f(String username,String password) {
	
	  driver.get("http://www.demo.guru99.com/V4/");	
	 WebElement userId= driver.findElement(By.name("uid"));
			 userId.sendKeys(username);
			 WebElement pwd =driver.findElement(By.name("password"));
			 pwd.sendKeys(password);
	 
	  WebElement btnLogin= driver.findElement(By.name("btnLogin"));
	  btnLogin.click();
	  String loginUrl ="http://www.demo.guru99.com/V4/manager/Managerhomepage.php";
	  String url= driver.getCurrentUrl();
	  
	    Assert.assertEquals(loginUrl, url);
	  System.out.println("Login Succesfull");
	  
	  
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
