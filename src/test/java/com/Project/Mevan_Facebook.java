package com.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.Base_Class;

public class Mevan_Facebook extends Base_Class{

	@Test
	private void data() {
         driver = browserLaunch("chrome");
         getUrl("https://www.facebook.com/");

		
		WebElement mail = driver.findElement(By.xpath("//input[@type='text']"));
		inputvalues(mail,"arunpandiyan.siva@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		inputvalues(password,"9894942065");
		
		
	
		WebElement login = driver.findElement(By.name("login"));
		clickOnElement(login);
		//Student();	
	}
	@Test (enabled = true)
	private void Student() {
		
		System.out.println("Student Result :");

	}
	

}
