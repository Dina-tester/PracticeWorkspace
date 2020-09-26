package org.in;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Ellipse - Gtech\\IDE program\\Pratics Workspace\\InterviewPreparation\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.flipkart.com/?affid=admitad&affExtParam1=1182344&affExtParam2=1976d180ff0a8c0c79ee83ba36f3c958");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		WebElement type = driver.findElement(By.xpath("//input[@type='text']"));
		type.sendKeys("ledtv", Keys.ENTER);

		List<WebElement> allProduct = driver.findElements(By.className("_2cLu-l"));
		System.out.println(allProduct.size());

		Set s = new TreeSet();
		
	for (int i = 0; i <allProduct.size(); i++) {
		
		WebElement items = allProduct.get(i);
		String text = items.getText();
		s.add(text);
		
	}	
	for (Object x : s) {
		
		System.out.println(x);
	}
	
	
	}

}
