package com.jenkins.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NewTest {
  @SuppressWarnings("unused")
@Test
  public void f() {
	  
	  WebDriver driver = new FirefoxDriver();
	                String appUrl = "https://accounts.google.com";
	                driver.get(appUrl);
	 
	 
  }
}
