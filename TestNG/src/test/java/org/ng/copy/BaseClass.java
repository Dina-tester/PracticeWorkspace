package org.ng.copy;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	static Select s;
	
	public static void BrowserLaunch() {
		System.setProperty("webdriver.chrome.driver", "E:\\Ellipse - Gtech\\selenium drivers\\Latest 84.0\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	}
	
	public void DDbyvalue(WebElement webref,String DDref ) {
		Select s = new Select(webref);
		s.selectByVisibleText(DDref);
		
	}
	public Select getDDvalue() {
		s.getFirstSelectedOption();
		return s;
	}
	
	public boolean isselected(WebElement webref)
	{
		webref.isSelected();
		return true;
	}
	/*
	 * public Select select(WebElement webref) { Select s = new Select(webref);
	 * return s; }
	 */

	public void screenshot(String shotname) {
		TakesScreenshot shot = (TakesScreenshot) driver;
		File source = shot.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"E:\\Ellipse - Gtech\\IDE program\\Pratics Workspace\\TestNG\\Shot\\" + shotname + ".jpg");
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void quitBrowser() throws Throwable
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
	
}
