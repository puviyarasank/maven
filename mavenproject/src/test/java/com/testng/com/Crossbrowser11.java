package com.testng.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser11 {
	@Parameters("browser")
	@BeforeClass
	public void beforelogin(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("chrome");
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.out.println("firefox");
		} else
			System.out.println("invalid browser");
	}

	@Test
	public void login() {
		System.out.println("login");

	}

	@AfterClass
	public void afterlogin() {
		System.out.println("quit");

	}

}
