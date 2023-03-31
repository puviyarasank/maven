package com.testng.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

public class SimpleAnnotations1 {
	@BeforeSuite 
	private void setup() {
		System.out.println("system.setpropery");
	}
	@BeforeTest
	public void browserlaunch() {
		System.out.println("browserlaunch");

	}
	@BeforeClass
		public void enterurl() {
			System.out.println("enter url");
		}
	@BeforeMethod
		public void login() {
			System.out.println("login");
		}
	@Test
	public void searchTshirt() {
		System.out.println("searchTshirt");
	}
	@Test
	
	public void searchbooks() {
	System.out.println("searchbooks");
	}
	@AfterMethod
	public  void Verify() {
	System.out.println("verification done");
	}
@AfterClass
	public void logout() {
		System.out.println("logout");
	}
@AfterTest
	
	public void closebrowser() {
	 System.out.println("closebrowser");
	}
@AfterSuite
	
	public void deletecookies() {
		System.out.println("delete cookies");

	}
	
	
	
	
	
	
}
