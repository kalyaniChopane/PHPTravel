package com.mavenproject.org.ProjectMavenPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Phpbilling {
	WebDriver driver;
	
	@FindBy(className="field")
	WebElement CompanyName;
	
	@FindBy(xpath="//input[@name='address1'and @type='text']")
	WebElement Streetaddress;
	
	@FindBy(name="city")
	WebElement citytextbox;
	
	@FindBy(id="stateinput")
	WebElement statetextbox;
	public Phpbilling(WebDriver driver3) 
	{
		driver=driver3;
		
		PageFactory.initElements(driver, this);
	}

	public void billingMethod()
	{
		//SoftAssert soft=new SoftAssert();
		//soft.assertEquals(driver.getTitle(), "");
		CompanyName.sendKeys("Abcde");
		Streetaddress.sendKeys("america");
		citytextbox.sendKeys("warje");
		statetextbox.sendKeys("MP");
		//soft.assertAll();
		
	}

}
