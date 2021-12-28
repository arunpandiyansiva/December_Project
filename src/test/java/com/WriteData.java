package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.tool.XMLBeanXSTCHarness;

public class WriteData {

	public static void main(String[] args) throws Throwable {
		System.out.println("Creating excel data in the name of DATA");
		File f =new File("C:\\Users\\sugan\\MavenProject\\Maven_Dec.xlsx");
		FileInputStream fis =new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		
//create sheet		
		Sheet createSheet = wb.createSheet("DATA");
//create row	
		Row createRow = createSheet.createRow(0);
//create cell
		Cell createCell = createRow.createCell(0);
//set the values
		createCell.setCellValue("User Data");
//set the value in second cell
		wb.getSheet("DATA").getRow(0).createCell(1).setCellValue("User password");
		wb.getSheet("DATA").createRow(1).createCell(0).setCellValue("ARUN");
		wb.getSheet("DATA").getRow(1).createCell(1).setCellValue("12345");
		
		wb.getSheet("DATA").createRow(2).createCell(0).setCellValue("PANDIYAN");
		wb.getSheet("DATA").getRow(2).createCell(1).setCellValue("987456");
		
		FileOutputStream fos= new FileOutputStream(f);
		 
		//write
		wb.write(fos);
		//close
		wb.close();
		
		System.out.println("DATA sheet created successfully");

		

		
		
		
		
		

	}

}
