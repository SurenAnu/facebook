package com.Bace_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public Login_Page(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver driver;
	

	@FindBy(xpath = "//input[@id='email']")
	private WebElement id;


	public WebElement getId() {
		return id;
	}
	@FindBy(xpath = "//input[@id='pass']")
	private WebElement password;


	public WebElement getPassword() {
		return password;
	}
	@FindBy(xpath = "//button[.='Log in']")
	private WebElement  click;


	public WebElement getClick() {
		return click;
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
