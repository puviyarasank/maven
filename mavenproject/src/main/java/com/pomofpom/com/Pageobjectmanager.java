package com.pomofpom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.com.Booking;
import com.pom.com.Login;
import com.pom.com.Search;

public class Pageobjectmanager {
public WebDriver driver;
	private Login login;
	private Search search;
	private Booking booking;
	public WebDriver getDriver() {
		return driver;
	}
	public Login getLogin() {
		login=new Login(driver);
		return login;
	}
	public  Search getSearch() {
		search= new Search(driver);
		return search;
	}
	public Booking getBooking() {
		booking = new Booking(driver);
		return booking;
	}
public Pageobjectmanager(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	
	
}
}