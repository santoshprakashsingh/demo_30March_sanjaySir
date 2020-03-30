package com.capg.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class MercuryToursAssignment {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh Softwares\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/mercuryregister.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("firstName")).sendKeys("Abhishek");
		driver.findElement(By.name("lastName")).sendKeys("Singh");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("1234567890");
		driver.findElement(By.cssSelector("#userName")).sendKeys("abcd@abc.com");
		driver.findElement(By.name("address1")).sendKeys("500 Jason Street");
		driver.findElement(By.name("address2")).sendKeys("Nice Road");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Sydney");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("NSW");
		driver.findElement(By.name("postalCode")).sendKeys("2001");
		
		Select selectCountry = new Select(driver.findElement(By.name("country")));
		selectCountry.selectByVisibleText("AUSTRALIA");
		
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("abhisheks");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Abc123@43");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Abc123@43");
		driver.findElement(By.name("register")).click();
		
		System.out.println(" Current URL " +driver.getCurrentUrl());
		System.out.println(" Title " + driver.getTitle());
		
		Assert.assertEquals(driver.getTitle(), "Register: Mercury Tours");
	//	System.out.println(" Get Page Source " + driver.getPageSource());
		System.out.println( "Window Handle "  + driver.getWindowHandles());
		System.out.println(" Testing Completed ");
		
	}

}
