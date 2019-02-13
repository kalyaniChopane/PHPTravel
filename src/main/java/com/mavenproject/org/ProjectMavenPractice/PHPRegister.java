package com.mavenproject.org.ProjectMavenPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PHPRegister {
	WebDriver driver;
	
	@FindBy(css="input[name='firstname']")
	WebElement FirstName;
	
	@FindBy(css="input[name='lastname']")
	WebElement Lastname;
	
	@FindBy(id="inputEmail")
	WebElement Email;
	
	@FindBy(name="phonenumber")
	WebElement phonenumber;
	
	public PHPRegister(WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public void registerMethod() {
		// TODO Auto-generated method stub
		
		Assert.assertEquals(driver.getTitle(), "Register - PHPTRAVELS");//hard assert
		
		FirstName.sendKeys("nicks");
		Lastname.sendKeys("johns");
		Email.sendKeys("user@phptravels.com");
		phonenumber.sendKeys("7217944832");
	}

}
