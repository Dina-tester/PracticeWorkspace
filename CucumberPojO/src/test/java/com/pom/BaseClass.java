package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	static Select s;

	// 1.Launch Browser
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Ellipse - Gtech\\selenium drivers\\Latest 84.0\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	// 2.Launch URL
	public static void launchUrl(String Urlinput) {
		driver.get(Urlinput);
	}

	// 3. To click Button
	public static void bclick(WebElement buttonclick) {
		buttonclick.click();
	}

	// 4.TO fill text Box
	public static void filltxtbox(WebElement fill, String input) {
		fill.sendKeys(input);
	}

	// 5.Drop down select by Index
	public static void dropdown(WebElement drpdwn, int Indexvalue) {
		s = new Select(drpdwn);
		s.selectByIndex(Indexvalue);
	}

	// 6.Select BY value
	public static void dropdownValue(WebElement drpdwn, String value) {
		s.selectByValue(value);
	}

	// To quit
	public static void quit() {
		driver.quit();
	}

}
