package com.adachinrunner.com;

import org.openqa.selenium.WebDriver;

import com.day.com.Baseclass;
import com.pom.com.Booking;
import com.pom.com.Search;
import com.pom.com.login;
import com.pomofpom.com.Pageobjectmanager;

public class Runnernew extends Baseclass {
public static void main(String[] args) {
	WebDriver driver = browserlaunch("chrome");
	launchurl("https://adactinhotelapp.com/");
	Pageobjectmanager po = new Pageobjectmanager(driver);
//LOGIN
	//login lo = new login(driver);
	sendkey(po.getLogin().getUsername(),"puviyarasan");
	sendkey(po.getLogin().getPassword(), "puvi@1234");
	click(po.getLogin().getLogin());
	//SEARCH
	//Search s = new Search(driver);
	select(po.getSearch().getLocation(), "London", "val");
	select(po.getSearch().getHotels(), "1", "index");
	select(po.getSearch().getRoomtype(), "Deluxe", "vis");
	sendkey(po.getSearch().getNoofrooms(), "2");
	sendkey(po.getSearch().getCheckin(), "29/5/2022");
	sendkey(po.getSearch().getCheckout(), "30/5/2022");
	select(po.getSearch().getAdult(), "3", "index");
	select(po.getSearch().getChildren(), "1", "index");
	po.getSearch().getSubmit().click();
	//Selecthotel
	po.getSearch().getSelecthotel().click();
	click(po.getSearch().getHotelcontinue());
	//booking
	//Booking bo = new Booking(driver);
	sendkey(po.getBooking().getFirstname(), "puviyarasan");
	sendkey(po.getBooking().getLastname(), "kumaravel");
	sendkey(po.getBooking().getBilling(), "chennai006");
	sendkey(po.getBooking().getCreditcard(), "2115141141356785");
	select(po.getBooking().getCardtype(), "Master Card", "vis");
	select(po.getBooking().getExpirydate(), "9", "val");
	select(po.getBooking().getExpiryyear(), "4", "index");
	sendkey(po.getBooking().getCvvno(), "254");
	click(po.getBooking().getBooknow());
	System.out.println("sucessfull");
}
}
