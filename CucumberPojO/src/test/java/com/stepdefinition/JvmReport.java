package com.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
		public static void generateJvmReport(String json) 
		{
			File F = new File("Reports\\reports.json");
			Configuration con = new Configuration(F, "Adacting Report Cucumber");
			con.addClassifications("Platform", "Windows");
			con.addClassifications("driver", "79.80");
			List<String> jsonFiles = new ArrayList<String>();
			jsonFiles.add(json);

			ReportBuilder r = new ReportBuilder(jsonFiles, con);
			r.generateReports();
		}

	}

