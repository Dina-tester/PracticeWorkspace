package org.in;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ddown {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Ellipse - Gtech\\selenium drivers\\Latest 84.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();

		// driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		try {

			driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			WebElement searchengine = driver.findElement(By.xpath("//div//child::select[@id='select-demo']"));
			Select s = new Select(searchengine);
			Thread.sleep(4000);
			
			s.selectByValue("Monday");
			

			/*
			 * List<WebElement> options = s.getOptions();
			 * System.out.println(options.size());
			 * 
			 * for (int i = 0; i < options.size(); i++) { WebElement s1 = options.get(i);
			 * String val = s1.getText(); System.out.println(val);
			 * 
			 * }
			 */
			
			
			
			
			/*
			 * List<WebElement> values =
			 * driver.findElements(By.xpath("//li[@class='sbct']"));
			 */

//			System.out.println(values.size());

			/*
			 * List<WebElement> options = s.getOptions();
			 * 
			 * for (WebElement googlex : values) {
			 * 
			 * String text = googlex.getText();
			 * 
			 * System.out.print(text); }
			 */

			// List<WebElement> listofvalues =
			// driver.findElements(By.xpath("//div//child::select[@id='select-demo']"));

			// Select s = new Select(listofvalues);

//		 for (WebElement x : listofvalues) {
//			 System.out.println(x);
//			
//		}

		} finally {

			Thread.sleep(4000);
			driver.quit();

		}

	}

}
