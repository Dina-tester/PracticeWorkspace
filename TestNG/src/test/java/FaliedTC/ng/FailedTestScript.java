package FaliedTC.ng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.ng.copy.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FailedTestScript extends BaseClass {

	@BeforeTest
	public void Launch() {
		BrowserLaunch();
	}

	@AfterTest
	public void aftersession() throws Throwable {
		quitBrowser();
	}

	@Test(enabled = false)
	public void automationwebsite() {
		WebElement countrys = driver.findElement(By.tagName("select"));
		Select s = new Select(countrys);
		List<WebElement> options = s.getOptions();
		int count = 0;
		for (WebElement listofCountrys : options) {
			String text = listofCountrys.getText();

			if (text.startsWith("Saint") || text.startsWith("I")) {
				System.out.println(text);
				count++;
			}
		}
		assertTrue(count > 10);
	}

	@Test(enabled = false)
	public void SelectvaluefromDD() {
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		WebElement countrys = driver.findElement(By.tagName("select"));
		DDbyvalue(countrys,"India");
		
		//Select dDvalue = getDDvalue();
		//String ddstrvalue = dDvalue.toString();
		//boolean isselectedref = isselected(countrys);
		//Assert.assertEquals(isselectedref, "India");
		
		
	}
	@Test(enabled = false)
	private void assertDD() {
		WebElement countrys = driver.findElement(By.tagName("select"));
		Select s = new Select(countrys);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement we : allSelectedOptions) {
			String text = we.getText();
			System.out.println(text);
			if (text.equalsIgnoreCase("india")) {
				Assert.assertTrue(true, "Assert true mathched with india");
				System.out.println("Assert true executed");
			} else {
				Assert.assertTrue(false, "Selected value is not india");
				System.out.println("False executed");
			}
		}
	}
	@Test(retryAnalyzer = RerunCount.class)
	private void asserttest() {
		Assert.assertTrue(true,"trueding");
		SoftAssert s =new SoftAssert();
		s.assertTrue(false, "conditionfailed");
		s.assertAll();
	}
	
	@Test
	private void asserttest2() {
		Assert.assertTrue(true,"assertmethod 2");
		
	}	
	
}
