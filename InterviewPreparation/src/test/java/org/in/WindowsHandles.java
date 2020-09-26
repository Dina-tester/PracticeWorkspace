package org.in;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class WindowsHandles {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Ellipse - Gtech\\IDE program\\Pratics Workspace\\InterviewPreparation\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.snapdeal.com/products/kids-clothing?q=Brand%3ACherokee%5EColt%5EDonuts%5EKarigaari%7C&sort=plrty");
		WebElement comboTshirt = driver
				.findElement(By.xpath("//p[@title='Cherokee Boys Short Sleeve Printed T Shirt - Pack Of 3']"));
		comboTshirt.click();
		String parid = driver.getWindowHandle();
		System.out.println(parid);
		
		Set<String> allwin = driver.getWindowHandles();
		List<String> arrayList = new ArrayList<String>(allwin);
		driver.switchTo().window("https://www.snapdeal.com/product/boys-short-sleeve-printed-tshirt/654052583716?vendorCode=S0ce56&pa=true&fv=true&supc=SDL628520006&utm_campaign=null&utm_medium=ProductAds&isSellerPage=true");
		
		
		
		// FluentWait<WebDriver> f = new
		// FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(50)).ignoring(Throwable.class);
		Thread.sleep(500);
		driver.quit();
	}

}
