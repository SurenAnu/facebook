package com.runner_class;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\SURENANU\\eclipse-workspace\\Facebook\\src\\test\\java\\com\\facebook\\feature\\fb.feature" ,
glue = "com.step.definition",
monochrome = true,
plugin = {"html:rep/rep.html", "pretty"}
)
public class Runner_Class {
	public static WebDriver driver;
	
	@BeforeClass
	public static void start() {
		driver= new FirefoxDriver();
		System.out.println("driver  "+driver);

	}
	
	
	
//	@AfterClass
//	public static void end() {
//		driver.quit();
//
//	}

}
