package com.adachinrunner.com;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.day.com.Baseclass;
import com.pom.com.Booking;
import com.pom.com.Login;
import com.pom.com.Search;

import com.singledesignpattern.com.Filereadermanager;

public class Adachin extends Baseclass {
	public static void main(String[] args) throws IOException {
		WebDriver driver = browserlaunch("chrome");
		// launchurl("https://adactinhotelapp.com/");
		launchurl(Filereadermanager.getinstance_fr().getinstance_cr().geturl());
		// LOGIN
		Login lo = new Login(driver);
		sendkey(lo.getUsername(), "puviyarasan");
		// sendkey(lo.getPassword(), "puvi@1234");
		sendkey(lo.getPassword(), Filereadermanager.getinstance_fr().getinstance_cr().getpassword());
		click(lo.getLogin());
		// SEARCH
		Search s = new Search(driver);
		select(s.getLocation(), "London", "val");
		select(s.getHotels(), "1", "index");
		select(s.getRoomtype(), "Deluxe", "vis");
		sendkey(s.getNoofrooms(), "2");
		sendkey(s.getCheckin(), "29/5/2022");
		sendkey(s.getCheckout(), "30/5/2022");
		select(s.getAdult(), "3", "index");
		select(s.getChildren(), "1", "index");
		s.getSubmit().click();
		// Selecthotel
		s.getSelecthotel().click();
		click(s.getHotelcontinue());
		// booking
		Booking bo = new Booking(driver);
		sendkey(bo.getFirstname(), "puviyarasan");
		sendkey(bo.getLastname(), "kumaravel");
		sendkey(bo.getBilling(), "chennai006");
		// sendkey(bo.getCreditcard(), "2115141141356785");
		sendkey(bo.getCreditcard(), Filereadermanager.getinstance_fr().getinstance_cr().getcreditcard());
		select(bo.getCardtype(), "Master Card", "vis");
		select(bo.getExpirydate(), "9", "val");
		select(bo.getExpiryyear(), "4", "index");
		// sendkey(bo.getCvvno(), "254");
		sendkey(bo.getCvvno(), Filereadermanager.getinstance_fr().getinstance_cr().getcvvno());
		click(bo.getBooknow());
		System.out.println("sucessfull");

	}
}
