package com;


	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	public class MavenDemo extends Base_Class {
	
		public static WebDriver driver;
		
		public static void main(String[] args) {
			driver=browserLaunch("chrome");
			getUrl("https://www.facebook.com/");
			
			WebElement email = driver.findElement(By.id("email"));
			inputvalues(email,"a1r4u3n@gmail.com");
			
			WebElement password = driver.findElement(By.name("pass"));
			inputvalues(password,"qwerty123");
			
			WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
			clickOnElement(login);
			
			
		}

		
	}


