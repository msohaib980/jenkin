package com.jenkins.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NewTest {
  @SuppressWarnings("unused")
  @BeforeClass
  public void beforeClas() throws InterruptedException{
	  
	  WebDriver driver = 
			  new FirefoxDriver();
	  driver.get("https://www.sagedining.com/intranet/apps/messages/?p=123027");
		driver.findElement(By.id("authenticateUid")).sendKeys("msohaib");
		driver.findElement(By.id("authenticatePw")).sendKeys("@College12");
		driver.findElement(By.id("authenticateSubmit")).click();
		System.out.println(driver.getTitle());
		System.err.println(driver.getWindowHandle());
		Thread.sleep(500);
	
//		driver.findElement(By.xpath(".//*[@id='content']/div[5]/div/div/div[1]/div[2]/div[2]/div/div[1]/h2")).click();
//		driver.findElement(By.tagName(name))
		
	  
  }
  
@Test
  public void f() throws InterruptedException {
	  
//	driver.findElement(By.className("_1mf7 _4jy0 _4jy3 _4jy1 _51sy selected _42ft")).click();
		
//	WebDriver driver2 = new FirefoxDriver();
//	driver2.get("https://www.sagedining.com/intranet/apps/messages/?p=123027");
//			
//		Assert.assertEquals(2, 3);
		
		
	  
	                
	                System.out.println("sadfsdf");
//	                driver.quit();
	 
  }
}
