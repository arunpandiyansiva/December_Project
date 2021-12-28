package com;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
	
	public static WebDriver driver;

	//1. browserlaunch
    public static WebDriver browserLaunch(String browser) {
		try {
   	 if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sugan\\MavenProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
   	 }
		else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\sugan\\MavenProject\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();	
		}
		else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver","C:\\Users\\Jose\\eclipse-workspace\\MavenProject\\driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();	
		}
		else {
			System.out.println("invalid browser");
		}
   	 	driver.manage().window().maximize();
		}catch(Exception e) {
		e.printStackTrace();
		}
		return driver;
	}
    
    //2.navigateforward
   	public static void navigateForward() {
   		try {
   	 	driver.navigate().forward();
   	 	}catch(Exception e) {
   	 	e.printStackTrace();
   	 	}
   	}
   	
   	 //3.navigateBack
   	public static void navigateBack() {
   		try {
   	 	driver.navigate().back();;
   	 	}catch(Exception e) {
   	 	e.printStackTrace();
   	 	}
   	}
   	
   	 //4.navigateTo
   	public static void navigateTo(String url) {
   		try {
   	    driver.navigate().to("");
   		}catch(Exception e) {
   		e.printStackTrace();
   		}
   	}
   	 
   	  //5.navigateRefresh
   	public static void navigateRefresh() {
   		try {
   	 	driver.navigate().refresh();;
   	 	}catch(Exception e) {
   	 	e.printStackTrace();
   	 	}
   	}
   	 
   	//6.get(url)
    public static void getUrl(String url) {
   	 try {
   		 driver.get(url);
   	 }catch(Exception e) {
   		 e.printStackTrace();
   	 }
  }
	
    //7.  getTitle
    public static void getTheText(WebElement ele) {
		try {
    	String title = driver.getTitle();
		System.out.println(title);
	}catch(Exception e) {
		e.printStackTrace();
	}
  }
    
    //8.  getAttribute(), WebElement --- getAttribute
    public static void getAttribute(By bySearchButton) {
	 WebElement element = driver.findElement(bySearchButton);
	 System.out.println(element);
    }
    
  	//9.get(CurrentUrl)
    public static void getCurrentUrl(String Currenturl) {
   	 try {
   		 String currentUrl2 = driver.getCurrentUrl();
   		 System.out.println(currentUrl2);
   	 }catch(Exception e) {
 
   	 }
  }
    
	//10.  getText(), WebElement --- getText
    public static void getText(WebElement element) {
     try {
    	String text = element.getText();
		System.out.println(text);
     }catch(Exception e) {
	}
   }
    
    //11. Dropdown
    public static void dropDownSelection(WebElement element,String value,String input) {
	 Select s= new Select(element);
	 
	 if (value.equalsIgnoreCase("value")) {
       s.selectByValue(input);		
	}
	 else if (value.equals("text")) {
		 s.selectByVisibleText(input);
  }
	 else if (value.equals("index")) {
		 int parseInt = Integer.parseInt(input);
		 s.selectByIndex(parseInt);	
	}
   }
    
	//12.  Click() --- ClickOnElement
	public static void clickOnElement(WebElement element){
		element.click();	
	}
	
	//13.  Send Keys(), WebElement,String --- input values
	public static void inputvalues(WebElement element,String inputvalue){
		element.sendKeys(inputvalue);
	}
	
    //14.  isEnabled, WebElement,Boolean --- isEnabled
	public static void isEnabled(WebElement element) {
		try {
		element.isEnabled();
		}catch(Exception e) {
		}
	}
	
    //15.  isdisplayed, WebElement,Boolean --- isDisplayed
    public static void isDisplayed(WebElement element) {
    	try {
		element.isDisplayed();
    	}catch(Exception e) {
    	}
	}
    
    //16.  isSelected, WebElement, Boolean --- isSelected
    public static void isSelected(WebElement element) {
    	try {
		element.isSelected();
    	}catch(Exception e) {
    	}
	}
    
	 //17.Alert ---- simplealert
	public static void simplealert () {
		try {
		Alert simplealert = driver.switchTo().alert();
		simplealert.accept();
		}catch(Exception e) {
		}
	}
	
	 //18.Alert ---- confirmalert
	public static void confirmalert () {
		try {
		Alert confirmalert = driver.switchTo().alert();
		confirmalert.accept();
		}catch(Exception e) {
		}
	}
	
	 //19. Alert ---- promptalert
	public static void promptalert () {
		try {
		Alert promptalert = driver.switchTo().alert();
		promptalert.accept();
		}catch(Exception e) {
		}
	}
	
	 //20. quit()
    public static void quit() {
    	try {
		driver.quit();
		}catch(Exception e) {
		}
	}
    
     //21. close()
    public static void close() {
    	try {
    	driver.close();
	}catch(Exception e) {
	}	
  }
	
    //22. DragDrop
    public static void dragdrop(WebElement drag, WebElement drop) {
    	try {
    		Actions ac = new Actions(driver);
    		ac.dragAndDrop(drag, drop).build().perform();
    	}catch(Exception e) {
    	}
    }
    
    //23. Action
    public static void action(WebElement element) {
   	 Actions ac = new Actions(driver);
   	 element = driver.findElement(By.linkText("Get started free"));
   	 ac.moveToElement(element).build().perform();	 
	}
    
    //24. Frames
    public static void Frames(WebElement iframe) {
    	//iframe.click();
    	driver.switchTo().frame(0);
    }
    
    //25. ScreenShot
    public static void takeScreenshot(String path) throws IOException {
   		TakesScreenshot ts=(TakesScreenshot)driver;
   		File srcfile = ts.getScreenshotAs(OutputType.FILE);
   		File destfile = new File(path);
   		FileUtils.copyFile(srcfile, destfile);
	}
    
    //26. Wait --- ImplicitWait
    public static void implicitwait() {
    	try
    	{
    		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	}catch(Exception e) {
    	}
    }
    
    //27. Wait --- ExplicitWait
    public static void explicitwait(long seconds, WebElement element) {
    	try {
    		WebDriverWait wait1 = new WebDriverWait(driver, seconds);
    		wait1.until(ExpectedConditions.visibilityOf(element));
    	}catch(Exception e) {
    	}
    }
    
    //28. Wait --- FluentWait
    //public static void fluentwait() {
    	//FluentWait wait = new FluentWait(driver).withTimeout(30,TimeUnit.SECONDS);
    
    
    //29. WindowsHandling
    public static void windowshandling() {
    	try {
   	 driver.getWindowHandles();
	}catch(Exception e) {
	}   	
  }
    
    //30. Robot
    public static void robot(WebElement element) throws AWTException {
    	Robot r = new Robot();
    	r.keyPress(KeyEvent.VK_DOWN);
    	r.keyRelease(KeyEvent.VK_DOWN);
    	r.keyPress(KeyEvent.VK_ENTER);
    	r.keyRelease(KeyEvent.VK_ENTER);
    }
    
    //31. getSelected
    public void getSelected() {
    	Select select = new Select(driver.findElement(By.xpath("//select")));
    	WebElement option = select.getFirstSelectedOption();
    	String defaultItem = option.getText();
    	System.out.println(defaultItem);
    }
        
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


