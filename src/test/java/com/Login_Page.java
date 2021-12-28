package com;


	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	public class Login_Page {
		//driver.findelement(by.)--->//@FindBy
		@FindBy(id="email")
		private WebElement email;    //*
		
		public WebElement getEmail() {
			return email;
		}

		public WebElement getPassword() {
			return password;
		}

		@FindBy(name="pass")         //*
		private WebElement password; //*  *-R.C--Source--Generate Getters and Setters--Click
	}


