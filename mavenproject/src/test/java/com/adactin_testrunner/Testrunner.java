package com.adactin_testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.day.com.Baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin_feature\\adactin.feature", glue = "com.adactin_stepdefinition", monochrome = true, plugin = {
		"pretty", "com.cucumber.listener.ExtentCucumberFormatter:Report/CucumberExtentReports.html",
		"html:Report/CucumberHtmlReport",
		"json:Report/CucumberJsonReport.json" }, dryRun = false, strict = true ,tags = { "@smoketest" })
public class Testrunner {
	public static WebDriver driver;

	@BeforeClass
	public static void setup() {
		driver = Baseclass.browserlaunch("chrome");
	}

	@AfterClass
	public static void teardown() {
		Baseclass.close();
		System.out.println("sucessful");
	}

}
