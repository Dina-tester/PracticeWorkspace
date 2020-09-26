package com.runner;

import org.junit.BeforeClass;

public class TestRunner {

	@BeforeClass
	public static void beforeClass() {
		String report=System.getProperty("user.dir") + "E:\\Ellipse - Gtech\\IDE program\\Pratics Workspace\\ExtendedReport";	
		System.setProperty("Screenshot.dir",report+"Screenshorts");
		System.setProperty("extent.reporter.spark.start", "true");
		System.setProperty("extent.reporter.spark.start", report);
	}

}
