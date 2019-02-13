package com.mavenproject.org.ProjectMavenPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PhpTravels 
{
	WebDriver driver;
	@Test
	public void registrationMethod()
	{
		PHPRegister register=new PHPRegister(driver);
		register.registerMethod();
		
		Phpbilling bill=new Phpbilling(driver);
		bill.billingMethod();
	}
	@Parameters("browsername")
	@BeforeTest
	public void steupMethod(String browser)
	{
		 String bro=browser;
		if (bro.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","Resource/chromedriver.exe");
			driver=new ChromeDriver();
			
		} 
		if (bro.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver","Resource/geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		if(bro.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "Resource/IEDriverServer.exe");
		}
		else 
		{
			System.out.println("No available browser");
		}
		driver.manage().window().maximize();
		driver.get("https://phptravels.org/register.php");
	}
	@AfterTest
	public void closebrowserMethod()
	{

		System.out.println("close all");
		driver.quit();
	}
}
