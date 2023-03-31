package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking {
	public WebDriver driver;
	@FindBy(name="first_name")
private WebElement firstname;
	@FindBy(name="last_name")
private WebElement lastname;
	@FindBy(name="address")
private WebElement billing;
	@FindBy(name="cc_num")
private WebElement creditcard;
	@FindBy(name="cc_type")
private WebElement cardtype;
	@FindBy(name="cc_exp_month")
	private WebElement expirydate;
	@FindBy(name="cc_exp_year")
private WebElement expiryyear;
	@FindBy(name="cc_cvv")
private WebElement cvvno;
	@FindBy(name="book_now")
private WebElement booknow;
	@FindBy(name="logout")
	private WebElement logout;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getLogout() {
		return logout;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getBilling() {
		return billing;
	}
	public WebElement getCreditcard() {
		return creditcard;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getExpirydate() {
		return expirydate;
	}
	public WebElement getExpiryyear() {
		return expiryyear;
	}
	public WebElement getCvvno() {
		return cvvno;
	}
	public WebElement getBooknow() {
		return booknow;
	}

 public Booking(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 }

