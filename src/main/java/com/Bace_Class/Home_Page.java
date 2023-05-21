package com.Bace_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	public static WebDriver driver;
	
	
	@FindBy(xpath = "(//span[@class='x4k7w5x x1h91t0o x1h9r5lt xv2umb2 x1beo9mf xaigb6o x12ejxvf x3igimt xarpa2k xedcshv x1lytzrv x1t2pt76 x7ja8zs x1qrby5j x1jfb8zj'])[7]")

	private WebElement profile;

	public Home_Page(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProfile() {
		return profile;
	}
	
	
	@FindBy(xpath = "(//div[@role='button'])[14]")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}
}
