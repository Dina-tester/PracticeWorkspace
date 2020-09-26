package org.in;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Ellipse - Gtech\\selenium drivers\\Latest 84.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://www.freejobalert.com/government-jobs/");

		Thread.sleep(4000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement UPSC = driver.findElement(By.xpath("//h4[text()=' UPSC ']"));

		js.executeScript("arguments[0].scrollIntoView(true)", UPSC);

		List<WebElement> tablecontent = driver.findElements(By.xpath("(//table//tbody)[6]"));
		

		List<WebElement> tablerow =  driver.findElements(By.tagName("tr"));
		
		System.out.println(tablerow.size());

		for (int i = tablerow.size() - 1; i < tablerow.size(); i++) {
			WebElement row = tablerow.get(i);
//			System.out.println(tablecontent.get(i));
			List<WebElement> col = row.findElements(By.tagName("td"));

			for (int j = col.size() - 2; j < col.size(); j++) {
				WebElement c = col.get(j);
				String s = c.getText();
				System.out.println(s);
			}

		}

	}

}
