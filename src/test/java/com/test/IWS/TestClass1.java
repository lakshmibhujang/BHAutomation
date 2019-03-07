package com.test.IWS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestClass1 {
	
	@Test
	public void openGoogle(){
		//Added a comment
		System.setProperty("webdriver.gecko.driver","C:\\Softwares\\Selenium jars\\latestsel\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		System.out.println("Page opened!");
		//driver.close();
		//driver.quit();
		
		
	}

}
