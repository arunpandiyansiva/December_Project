package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Hotel extends Base_Class {

	public static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		driver=browserLaunch("chrome");
		getUrl("https://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		WebElement name = driver.findElement(By.name("username"));
		inputvalues(name,"a1r4u3ns");
		WebElement pass = driver.findElement(By.name("password"));
		inputvalues(pass,"Arun@1988");
		WebElement click = driver.findElement(By.name("login"));
		clickOnElement(click);
		implicitwait();

		WebElement click1 = driver.findElement(By.name("location"));
		clickOnElement(click1);
		implicitwait();
		WebElement location = driver.findElement(By.name("location"));
		isSelected(location);
		dropDownSelection(location,"index" ,"5");
		clickOnElement(location);
		implicitwait();

		WebElement click2 = driver.findElement(By.name("hotels"));
		clickOnElement(click2);
		implicitwait();

		WebElement hotel = driver.findElement(By.name("hotels"));
		isSelected(hotel);
		dropDownSelection(hotel, "index", "2");
		clickOnElement(hotel);		
		implicitwait();

		WebElement click3 = driver.findElement(By.name("room_type"));
		clickOnElement(click3);

		WebElement room = driver.findElement(By.name("room_type"));
		isSelected(room);
		dropDownSelection(room, "index", "3");
		clickOnElement(room);


		implicitwait();
		WebElement click4 = driver.findElement(By.name("room_nos"));
		clickOnElement(click4);

		WebElement no = driver.findElement(By.name("room_nos"));
		isSelected(no);
		dropDownSelection(no, "index", "2");
		clickOnElement(no);

		implicitwait();
		WebElement click5 = driver.findElement(By.name("datepick_in"));
		clickOnElement(click5);
		//			WebElement checkin = driver.findElement(By.name("datepick_in"));
		//			Select s4 =new Select(checkin);
		//			s4.selectByIndex(1);
		//			
		implicitwait();
		WebElement click6 = driver.findElement(By.name("datepick_out"));
		clickOnElement(click6);
		//			WebElement checkout = driver.findElement(By.name("datepick_out"));
		//			Select s5 =new Select(checkout);
		//			s5.selectByIndex(1);

		implicitwait();
		WebElement click7 = driver.findElement(By.name("adult_room"));
		clickOnElement(click7);
		WebElement adultroom = driver.findElement(By.name("adult_room"));
		isSelected(adultroom);
		dropDownSelection(adultroom, "index", "2");

		implicitwait();
		WebElement click8 = driver.findElement(By.name("child_room"));
		clickOnElement(click8);
		WebElement childroom = driver.findElement(By.name("child_room"));
		isSelected(childroom);
		dropDownSelection(childroom, "index", "1");

		implicitwait();
		WebElement search = driver.findElement(By.xpath("//input[@value='Search']"));
		clickOnElement(search);
		implicitwait();
		WebElement button = driver.findElement(By.name("radiobutton_0"));
		clickOnElement(button);

		implicitwait();
		WebElement con = driver.findElement(By.name("continue"));
		clickOnElement(con);

		implicitwait();
		WebElement first = driver.findElement(By.name("first_name"));
		inputvalues(first, "Arunpandiyan");
		implicitwait();
		WebElement last = driver.findElement(By.name("last_name"));
		inputvalues(last, "S");

		implicitwait();
		WebElement add = driver.findElement(By.name("address"));
		inputvalues(add, "No.23 EVP park Avenue London");

		implicitwait();
		WebElement num = driver.findElement(By.name("cc_num"));
		inputvalues(num, "1234567891234567");
		implicitwait();

		WebElement type = driver.findElement(By.name("cc_type"));
		clickOnElement(type);
		implicitwait();

		WebElement credit = driver.findElement(By.name("cc_type"));
		isSelected(credit);
		dropDownSelection(credit, "index", "1");
		clickOnElement(credit);

		implicitwait();
		WebElement mon = driver.findElement(By.name("cc_exp_month"));
		clickOnElement(mon);

		implicitwait();
		WebElement month = driver.findElement(By.name("cc_exp_month"));
		isSelected(month);
		dropDownSelection(month, "index", "4");
		clickOnElement(month);



		implicitwait();
		WebElement yar = driver.findElement(By.name("cc_exp_year"));
		clickOnElement(yar);
		WebElement year = driver.findElement(By.name("cc_exp_year"));
		isSelected(year);
		dropDownSelection(year, "index", "11");
		clickOnElement(year);

		implicitwait();
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		inputvalues(cvv, "916");


		implicitwait();
		WebElement book = driver.findElement(By.name("book_now"));
		clickOnElement(book);
		//driver.manage().window().maximize();
		robot(book);


		implicitwait();
		WebElement ary = driver.findElement(By.name("my_itinerary"));
		clickOnElement(ary);




	}


























}
