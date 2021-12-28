package com;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel_Miniproject7 {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sugan\\Selenium_Oct\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("a1r4u3ns");
		driver.findElement(By.name("password")).sendKeys("Arun@1988");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("location")).click();
		WebElement location = driver.findElement(By.name("location"));
		Select s= new Select(location);
		s.selectByIndex(5);
		location.click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("hotels")).click();
		WebElement hotel = driver.findElement(By.name("hotels"));
		Select s1 =new Select(hotel);
		s1.selectByIndex(2);
		hotel.click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("room_type")).click();
		WebElement room = driver.findElement(By.name("room_type"));
		Select s2 =new Select(room);
		s2.selectByIndex(3);
		room.click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("room_nos")).click();
		WebElement no = driver.findElement(By.name("room_nos"));
		Select s3 = new Select(no);
		s3.selectByIndex(2);
		no.click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("datepick_in")).click();
//		WebElement checkin = driver.findElement(By.name("datepick_in"));
//		Select s4 =new Select(checkin);
//		s4.selectByIndex(1);
//		
		driver.findElement(By.name("datepick_out")).click();
//		WebElement checkout = driver.findElement(By.name("datepick_out"));
//		Select s5 =new Select(checkout);
//		s5.selectByIndex(1);
		
		Thread.sleep(3000);
		driver.findElement(By.name("adult_room")).click();
		WebElement adultroom = driver.findElement(By.name("adult_room"));
		Select s4 = new Select(adultroom);
		s4.selectByIndex(2);
		adultroom.click();
		
		Thread.sleep(3000);
		driver.findElement(By.name("child_room")).click();
		WebElement childroom = driver.findElement(By.name("child_room"));
		Select s5 = new Select(childroom);
		s5.selectByIndex(1);
		childroom.click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.name("radiobutton_0")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.name("continue")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.name("first_name")).sendKeys("Arunpandiyan");
		
		Thread.sleep(3000);
		driver.findElement(By.name("last_name")).sendKeys("s");
		
		Thread.sleep(3000);
		driver.findElement(By.name("address")).sendKeys("No.23 EVP park Avenue London");
		
		Thread.sleep(3000);
		driver.findElement(By.name("cc_num")).sendKeys("1234567891234567");
		
		driver.findElement(By.name("cc_type")).click();
		WebElement credit = driver.findElement(By.name("cc_type"));
		Select s6 =new Select(credit);
		s6.selectByIndex(1);
		credit.click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("cc_exp_month")).click();
		WebElement month = driver.findElement(By.name("cc_exp_month"));
		Select s7 =new Select(month);
		s7.selectByIndex(4);
		month.click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("cc_exp_year")).click();
		WebElement year = driver.findElement(By.name("cc_exp_year"));
		Select s8 =new Select(year);
		s8.selectByIndex(11);
		year.click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("cc_cvv")).sendKeys("916");
		Thread.sleep(3000);
		
		driver.findElement(By.name("book_now")).click();
		Thread.sleep(5000);
		//driver.manage().window().maximize();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		driver.findElement(By.name("my_itinerary")).click();
		
		
		TakesScreenshot t1 = (TakesScreenshot) driver ;
		File a = t1.getScreenshotAs(OutputType.FILE); //file store
		File d = new File("C:\\Users\\sugan\\Selenium_Oct\\ScreenShot\\hotel.png");
		FileUtils.copyFile(a, d);
				
		
		
		
		
		
		
		
		
		
		

	}

}
