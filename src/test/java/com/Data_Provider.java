package com;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
	//multiple set of data
	//data provider return type---> object [][] (object 2d array)
	@Test(dataProvider  = "My Data")
	private void loginDetails(String name, String pass) {		
		System.out.println("user name :" + name);
         System.out.println("user pass :" + pass);
	}
	@DataProvider(name = "My Data")
	private Object[][] inputData() {
		return new Object[][] {
			{"Arun","1988"},{"Jose","1988"},{"ram","2021"},{"aji","a123"}

	};
	

}
}