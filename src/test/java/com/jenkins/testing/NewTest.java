package com.jenkins.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NewTest {
  @SuppressWarnings("unused")
@Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver = new FirefoxDriver();
		// driver.get("https://msohaibdevvm1.dev.sagedining.com/intranet");
		// driver.findElement(By.id("authenticateUid")).sendKeys("msohaib");
		// driver.findElement(By.id("authenticatePw")).sendKeys("@College1");
		 //driver.findElement(By.id("authenticateSubmit")).click();
		//Thread.sleep(5000);
	  String appUrl = "https://accounts.google.com";
	                driver.get(appUrl);
		
	  
	                
	                System.out.println("sadfsdf");
	                driver.quit();
	 
  }
}
