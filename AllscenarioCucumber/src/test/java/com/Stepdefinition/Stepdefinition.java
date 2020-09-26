package com.Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition {
	WebDriver driver;

	@Given("User on the Adactin page")
	public void user_on_the_Adactin_page() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Ellipse - Gtech\\IDE program\\Pratics Workspace\\AllscenarioCucumber\\dri\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/index.php");
		driver.manage().window().maximize();

	}

	@When("User enter the {string} and {string}")
	public void user_enter_the_and(String string, String string2) {
		WebElement Usertxt = driver.findElement(By.id("username"));
		Usertxt.sendKeys(string);
		WebElement Userpass = driver.findElement(By.id("password"));
		Userpass.sendKeys(string2);
		WebElement loginclick = driver.findElement(By.id("login"));
		loginclick.click();

	}

	@When("User to fill the search hotel detail Page")
	public void user_to_fill_the_search_hotel_detail_Page() {
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByIndex(2);
		WebElement Hotels = driver.findElement(By.id("hotels"));
		Select s1 = new Select(Hotels);
		s1.selectByIndex(1);
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select s2 = new Select(roomtype);
		s2.selectByIndex(2);
		WebElement roomnos = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(roomnos);
		s3.selectByIndex(3);
		WebElement Checkindate = driver.findElement(By.id("datepick_in"));
		Checkindate.sendKeys("14/02/2020");
		WebElement Checkoutdate = driver.findElement(By.id("datepick_out"));
		Checkoutdate.sendKeys("29/02/2020");
		WebElement adultroom = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adultroom);
		s4.selectByIndex(2);
		WebElement childroom = driver.findElement(By.id("child_room"));
		Select s5 = new Select(childroom);
		s5.selectByIndex(2);
		WebElement searchhotel = driver.findElement(By.id("Submit"));
		searchhotel.click();

	}

	@When("user should select the hotel")
	public void user_should_select_the_hotel() {
		WebElement selecthotel = driver.findElement(By.id("radiobutton_0"));
		selecthotel.click();
		WebElement continu = driver.findElement(By.id("continue"));
		continu.click();

	}

	@Then("user should fill the Book a hote page")
	public void user_should_fill_the_Book_a_hote_page() {
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("Dinesh");
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("Dina");
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Greens OMR karappakkam");
		WebElement ccnumber = driver.findElement(By.id("cc_num"));
		ccnumber.sendKeys("1234567887654321");

		WebElement cctype = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(cctype);
		s6.selectByValue("VISA");

		WebElement ccexpmonth = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(ccexpmonth);
		s7.selectByVisibleText("November");

		WebElement ccexpyear = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(ccexpyear);
		s8.selectByVisibleText("2020");

		WebElement cccvv = driver.findElement(By.id("cc_cvv"));
		cccvv.sendKeys("2257");
		WebElement booknow = driver.findElement(By.id("book_now"));
		booknow.click();

	}
}
