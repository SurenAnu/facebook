package com.Facebook_baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FB_Base_Class {
	
	public static void url(WebDriver d, String s) {
		d.get(s);
	}
	public static void sendkey( WebElement e , String s) {
		e.sendKeys(s);
	}
	
	
		
	
	public static String excel ( String filename,String shee,int ro, int ce ) throws IOException {
		File f = new File("C:\\Users\\SURENANU\\Desktop\\"+filename+".xlsx");
		FileInputStream file = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(file);
		Sheet sheet = book.getSheet(shee);
		Row row = sheet.getRow(ro);
		Cell cell = row.getCell(ce);
		CellType ct = cell.getCellType();
		String sv = " " ; 
		if (ct.equals(ct.STRING)) {
			sv = cell.getStringCellValue();	
		} else if (ct.equals(ct.NUMERIC)){
			double nv = cell.getNumericCellValue();
			int i =(int) nv;
			 sv = String.valueOf(i);
		}
		return sv;
	}


		public static String geturl(WebDriver d) {
			String title = d.getTitle();
			return title;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

