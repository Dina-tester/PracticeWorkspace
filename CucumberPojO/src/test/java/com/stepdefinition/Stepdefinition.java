package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pom.BaseClass;
import com.pom.LoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends BaseClass {
	@Given("User is on Adactin login Page")
	public void user_is_on_Adactin_login_Page() {
		launchBrowser();
		launchUrl("https://www.adactin.com/HotelApp/index.php");

	}

	@When("User enter the {string} and {string}")
	public void user_enter_the_and(String userfield, String passfield) {
		LoginPojo l = new LoginPojo();

		filltxtbox(l.getTxtuser(), userfield);
		filltxtbox(l.getPassword(), passfield);
	}

	@Then("user enter the loginButton")
	public void user_enter_the_loginButton() {
		LoginPojo l = new LoginPojo();
		bclick(l.getLogin());
		

	}

	@Given("User is on AdactIn search Hotel page")
	public void user_is_on_AdactIn_search_Hotel_page() {
		System.out.println("Welcome to AdactIn Group of Hotels");

	}

	@When("User select the {string} , {string} , {string},{string}")
	public void user_select_the(String loc, String hot, String Rtype, String Rnos) {

		LoginPojo l = new LoginPojo();
		System.out.println("Just to check");
		dropdownValue(l.getLocation(), loc);
		dropdownValue(l.getHotels(), hot);
		dropdownValue(l.getRoom_type(), Rtype);
		dropdownValue(l.getRoom_nos(), Rnos);
		//dropdown(l.getLocation(),1);
		System.out.println("Another checking");
	}


	@When("User enter the Date	{string} , {string}")
	public void user_enter_the_Date(String Checkin, String Checkout) {
		LoginPojo l = new LoginPojo();
		filltxtbox(l.getDatepick_in(), Checkin);
		filltxtbox(l.getDatepick_out(), Checkout);
	}
	
	@When("User select the {string},{string}")
	public void user_select_the(String Adultsno, String childno) {
		LoginPojo l = new LoginPojo();
		dropdownValue(l.getAdult_room(), Adultsno);
		dropdownValue(l.getChild_room(), childno);

	}

	@Then("User should click the SearchButton")
	public void user_should_click_the_SearchButton() {
		WebElement searchBtn = driver.findElement(By.id("Submit"));
		bclick(searchBtn);

	}

	@Given("User is on AdactIn Select Hotel page")
	public void user_is_on_AdactIn_Select_Hotel_page() {
		System.out.println("Kindly select hotels from the listed Below ");
	}

	@When("user select the radio button of Hotel lists")
	public void user_select_the_radio_button_of_Hotel_lists() {
		WebElement selecthotel = driver.findElement(By.id("radiobutton_0"));
		bclick(selecthotel);

	}

	@Then("User should click the continueButton")
	public void user_should_click_the_continueButton() {
		WebElement clickcontinue = driver.findElement(By.id("continue"));
		bclick(clickcontinue);
	}

}

