package com.step.definition;

import org.openqa.selenium.WebDriver;

import com.Bace_Class.Base_Classes;
import com.Bace_Class.Home_Page;
import com.Bace_Class.Login_Page;
import com.runner_class.Runner_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Base_Classes {
	public static WebDriver driver =Runner_Class.driver;
	Login_Page login = new Login_Page(driver);
	Home_Page pro = new Home_Page(driver);
	
	@Given("user lanch facebook application")
	public void user_lanch_facebook_application() {
		url(driver, "https://www.facebook.com/");
		
	}

	@When("user enter the id in the username field")
	public void user_enter_the_id_in_the_username_field() {
		sendkey(login.getId(), "9360204515");
	}

	@When("user enter password in the password field")
	public void user_enter_password_in_the_password_field() {
		sendkey(login.getPassword(), "SURENanu@123");
	}

	@Then("user click the login butten it is redirect to home page")
	public void user_click_the_login_butten_it_is_redirect_to_home_page() {
		click(login.getClick());
	}

	@When("user click profile button on profile field")
	public void user_click_profile_button_on_profile_field() {
		click(pro.getProfile());
	}
	
	@Then("user click logout button it is redirect to login page")
	public void user_click_logout_button_it_is_redirect_to_login_page() {
		click(pro.getLogout());
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
