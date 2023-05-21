package org.Facebook_assert;


import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.Assertion;

import com.Facebook_baseclass.FB_Base_Class;

import dev.failsafe.internal.util.Assert;

public class Face_Book extends FB_Base_Class{

	public static void main(String[] args) throws IOException {
		
	WebDriver driver = new FirefoxDriver();
	url(driver, "https://www.facebook.com/");
	Assertion asser = new Assertion();
	
	for (int i = 1; i <=2; i++) {
		
	if (i==1) {
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys(excel("facebook", "fb", 1, i));
	continue;
	}else if(i==2){
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(excel("facebook", "fb", 1, i));
	}}
		 driver.findElement(By.xpath("//*[@name='login']")).click();
		String actualresult = driver.getTitle();
		String expectedResult ="Log in to Facebook";
		assertEquals(actualresult, expectedResult ,"result is fail");
      
		String actualtext = driver.findElement(By.xpath("//*[@id='email_container']/div[2]")).getText();
		String expectetext ="The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		asser.assertEquals(actualtext, expectetext);
		
		for (int i = 1; i <=2; i++) {
			
			if (i==1) {
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys(excel("facebook", "fb", 2, 1));
        continue;
			}else if(i==2){
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(excel("facebook", "fb", 2, 2));	
		driver.findElement(By.xpath("//*[@name='login']")).click()	;
			}}
		
		
		
		
		System.out.println("jbfkjsdbfkjdsbfbdsb");
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
