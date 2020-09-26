package org.in;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHand {
	static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Ellipse - Gtech\\selenium drivers\\Latest 84.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		Thread.sleep(400);
		// openbrowser_button();
		
		for (int i = 0; i < 2; i++) {
			WebElement buttonclick = driver.findElement(By.xpath("//button[text()='    click   ']"));
			buttonclick.click();
		}
	
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		System.out.println(driver.getTitle());
		
		
		//driver.switchTo().window("http://www.sakinalium.in/");
		
		ArrayList<String> windows_List = new ArrayList<String>();
		windows_List.addAll(windows);
		
		String s = windows_List.get(1);
		driver.switchTo().window(s);
		String Current_url = driver.getCurrentUrl();
		System.out.println(Current_url);
		
		Thread.sleep(3000);
		
		
		
	
//	for (String x : windows) {
//		if (condition) {
//			
//		}
//		driver.switchTo().window(x);
//		
//	}	
		
		try{
			WebElement degreeswindwos = driver.findElement(By.xpath("//*[text()='Quick and Easy Online Degrees']"));
			degreeswindwos.click();
		} 
		finally 
		{
			Thread.sleep(6000);
			driver.quit();
		}
		
	}

}
