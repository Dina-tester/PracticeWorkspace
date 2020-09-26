package org.in;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductList {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Ellipse - Gtech\\IDE program\\Pratics Workspace\\InterviewPreparation\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium");
		WebElement text = driver.findElement(By.xpath("//ul[@class='erkvQe']"));
		System.out.println(text.getText());
		System.out.println("---------------------------------------------");
		List<WebElement> name = driver.findElements(By.tagName("li"));
		System.out.println();
		System.out.println(name.size());
		System.out.println();
		for (WebElement x : name) {
			
			System.out.println(x.getText());
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i <name.size(); i++) {
			System.out.println(name.get(i).getText());
		}
	}
}
