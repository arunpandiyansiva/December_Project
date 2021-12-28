package com;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Parallel extends Base_Class {
	public static WebDriver driver;
	
	
	@Test
	private void chrome() {
		
		driver = browserLaunch("chrome");
		getUrl("https://www.facebook.com/");

	}
	@Test
	private void firefox() {
     driver = browserLaunch("Firefox");
     getUrl("https://twitter.com/i/flow/login");
	}

}
