package com;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	
	@Parameters ({"name"})
	@Test (priority = 1)
	private void empname(@Optional("Arun") String name) {
     System.out.println("Name: "+ name);
	}
	@Parameters ({"id"}) 
	@Test (priority = 2)
	private void empid(@Optional("C0297") String id) {
     System.out.println("Id: "+ id);
	}
	@Parameters ({"DOB"})
	@Test (priority = 1)
	private void empzdob(@Optional("21.12.21") String DOB) {
    System.out.println("D.O.B"+ DOB );
	}

}
