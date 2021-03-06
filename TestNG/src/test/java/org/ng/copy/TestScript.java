package org.ng.copy;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class TestScript extends BaseClass {
	
	@BeforeMethod
	public void intilization() {
		BrowserLaunch();
	}
	@AfterMethod
	public void completion() {
		driver.quit();
	}
	@Test
	public void testmethod1() {
		System.out.println("Getting google URL ");
		assertEquals(driver.getCurrentUrl(), "https://www.dinesh.com/");
	}

	@Test
	public void testmethod2() {
		System.out.println("Getting google URL testmethod 2 ");
		assertTrue(driver.getCurrentUrl().equals("https://www.google.com/"));
	}
	
	@Test
	public void testmethod3() {
		System.out.println("Getting google URL testmethod 3 ");
		assertFalse(driver.getTitle().equals("Google"),"Thrid method");
	}
}
