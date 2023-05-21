package com.Bace_Class;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base_Classes {
	
	

	//web driver
	public static void url(WebDriver d, String url ) {
d.get(url);
	}
	
	public static void max(WebDriver d) {

		d.manage().window().maximize();
	}
	
	
	public static void title(WebDriver d) {
	String title = d.getTitle();
		System.out.println(title);
		
	}
	public static void geturl(WebDriver d){
		String url = d.getCurrentUrl();
		System.out.println(url);
	}
	public static void click(WebElement e) {
e.click();
	} 
	public static void sendkey(WebElement e, String s) {
	e.sendKeys(s);
	}
	
	
	
	
	
	
	
	
	
	
	
}
