package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations extends Base_Class {

	@Test(priority =1)
	private void Setproperty() {

		System.out.println("Chrome");

	}
	@Test(priority =2)
	private void Url() {
		System.out.println("facebook");

	}
	@Test(priority =1)
	private void login() {
		System.out.println("Login");

	}
	@Test(priority =3)
	private void Username() {
		System.out.println("username");

	}
	@Test(priority =4)
	private void password() {
		System.out.println("password");

	}
	@Test(priority =-1)
	private void submit() {
		System.out.println("submit");

	}
//	@AfterMethod
//	private void Browser() {
//		driver = browserLaunch("chrome");
//		getUrl("https://www.facebook.com/");
//
//
//	}
//	@AfterClass
//	private void User() {
//		WebElement mail = driver.findElement(By.xpath("//input[@type='text']"));
//		inputvalues(mail,"arunpandiyan.siva@gmail.com");
//
//	}
//
//	@AfterTest
//	private void Pass() {
//		WebElement password = driver.findElement(By.id("pass"));
//		inputvalues(password,"9894942065");
//
//	}
//	@AfterSuite
//	private void Log() {
//		WebElement login = driver.findElement(By.name("login"));
//		clickOnElement(login);
//
//	}





}