package com.jorge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainProject {
	
	public static WebDriver driver; 
	public static String url = "http://qa.way2automation.com";
	
	@BeforeMethod
	public void bmet() {
		WebDriverManager.chromedriver().setup();
	    driver  = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get(url);			
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	//@AfterMethod
	public void amet() {
		driver.quit();	
	}
}
