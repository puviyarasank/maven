package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
	public WebDriver driver;
	@FindBy(name="location")
	 private WebElement location;
	@FindBy(name= "hotels")
	 private WebElement hotels;
	@FindBy(name="room_type")
	private WebElement roomtype;
	@FindBy(name="room_nos")
	private WebElement noofrooms;
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement checkin;
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement checkout;
	@FindBy(name="adult_room")
	private WebElement adult;
	@FindBy(name="child_room")
	private WebElement children;
	@FindBy(name="Submit")
	private WebElement submit;
	@FindBy(name="radiobutton_0")
	private  WebElement selecthotel;
	@FindBy(name="continue")
	private WebElement hotelcontinue;

	public WebElement getHotelcontinue() {
		return hotelcontinue;
	}
	public WebElement getSelecthotel() {
		return selecthotel;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getNoofrooms() {
		return noofrooms;
	}
	public WebElement getCheckin() {
		return checkin;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChildren() {
		return children;
	}
	public WebElement getSubmit() {
		return submit;
		
	}
	
	public Search(WebDriver driver) {
   this.driver=driver;
   PageFactory.initElements(driver, this);
	}

}
