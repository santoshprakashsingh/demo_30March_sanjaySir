package com.capg.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePractice {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh Softwares\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(" Current URL " +driver.getCurrentUrl());
		System.out.println(" Title " + driver.getTitle());
	//	System.out.println(" Get Page Source " + driver.getPageSource());
		System.out.println( "Window Handle "  + driver.getWindowHandles());
		
	}

}
