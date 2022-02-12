package com.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.utility.PropertiesUtils;

public class LoginTest extends BaseClass{
	
	@BeforeSuite
	public void setup() {
		
		initialization();
		reportInit();
	}
	
	@AfterSuite
	public void tearDown () {
		report.flush();
	}

	@Test (priority = 1)
	public void logintest (){
		driver.findElement(By.id("email")).sendKeys(PropertiesUtils.readProprty("username"));
		driver.findElement(By.id("password")).sendKeys(PropertiesUtils.readProprty("password"));
		driver.findElement(By.xpath("//button")).click();
	}
	
	@Test (priority = 2)
	public void failTest() {
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
	}
}
