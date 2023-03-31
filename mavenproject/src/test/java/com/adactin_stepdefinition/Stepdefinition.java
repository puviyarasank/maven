package com.adactin_stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin_testrunner.Testrunner;
import com.day.com.Baseclass;
import com.pomofpom.com.Pageobjectmanager;
import com.singledesignpattern.com.Filereadermanager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends Baseclass {
	WebDriver driver = Testrunner.driver;

	Pageobjectmanager po = new Pageobjectmanager(driver);

	@Given("^user Launches the Adactin Application$")
	public void user_Launches_the_Adactin_Application() throws Throwable {
		launchurl(Filereadermanager.getinstance_fr().getinstance_cr().geturl());

	}
	@When("^user Enter The\"([^\"]*)\" username In Inbox$")
	public void user_Enter_The_username_In_Inbox(String arg1) throws Throwable {
		sendkey(po.getLogin().getUsername(), arg1);
	}

	@When("^user Enter The\"([^\"]*)\" Password In Inbox$")
	public void user_Enter_The_Password_In_Inbox(String arg1) throws Throwable {
		sendkey(po.getLogin().getPassword(), arg1);
	}

//	@When("^user Enter The username In Inbox$")
//	public void user_Enter_The_username_In_Inbox() throws Throwable {
//		sendkey(po.getLogin().getUsername(), "puviyarasan");
//	}
//
//	@When("^user Enter The Password In Inbox$")
//	public void user_Enter_The_Password_In_Inbox() throws Throwable {
//		sendkey(po.getLogin().getPassword(), "puvi@1234");

//	}

	@Then("^user Click On The LoginButton  Its Navigates To Searchpage$")
	public void user_Click_On_The_LoginButton_Its_Navigates_To_Searchpage() throws Throwable {
		click(po.getLogin().getLogin());

	}

	@When("^user Selects The Location From The Dropdown$")
	public void user_Selects_The_Location_From_The_Dropdown() throws Throwable {

		select(po.getSearch().getLocation(), "London", "val");
	}

	@When("^user Selects The Hotel From The Dropdown$")
	public void user_Selects_The_Hotel_From_The_Dropdown() throws Throwable {
		select(po.getSearch().getHotels(), "1", "index");
	}

	@When("^user Selects The Room Type From The Dropdown$")
	public void user_Selects_The_Room_Type_From_The_Dropdown() throws Throwable {
		select(po.getSearch().getRoomtype(), "Deluxe", "vis");

	}

	@When("^user Selects The No Of Rooms From The Dropdown$")
	public void user_Selects_The_No_Of_Rooms_From_The_Dropdown() throws Throwable {
		select(po.getSearch().getNoofrooms(), "2", "val");
	}

	@When("^user Selects The Checkin Date From The Dropdown$")
	public void user_Selects_The_Checkin_Date_From_The_Dropdown() throws Throwable {
		sendkey(po.getSearch().getCheckin(), "23/05/2022");

	}

	@When("^user Selects The Checkout Date From The Dropdown$")
	public void user_Selects_The_Checkout_Date_From_The_Dropdown() throws Throwable {
		sendkey(po.getSearch().getCheckout(), "24/05/2022");

	}

	@When("^user Selects The Adults Per Room From The Dropdown$")
	public void user_Selects_The_Adults_Per_Room_From_The_Dropdown() throws Throwable {
		select(po.getSearch().getAdult(), "2", "index");

	}

	@When("^user Selects The Children Per Room From The Dropdown$")
	public void user_Selects_The_Children_Per_Room_From_The_Dropdown() throws Throwable {
		select(po.getSearch().getChildren(), "4", "val");

	}

	@Then("^user Clicks On Searchbutton Its Navigates To Selecthotel$")
	public void user_Clicks_On_Searchbutton_Its_Navigates_To_Selecthotel() throws Throwable {
		click(po.getSearch().getSubmit());
	}

	@When("^user Clicks On Radiobutton To Select Hotel$")
	public void user_Clicks_On_Radiobutton_To_Select_Hotel() throws Throwable {
		po.getSearch().getSelecthotel().click();

	}

	@Then("^user Clicks on Continuebutton Its Navigates To Book A Hotel$")
	public void user_Clicks_on_Continuebutton_Its_Navigates_To_Book_A_Hotel() throws Throwable {

		click(po.getSearch().getHotelcontinue());
	}

	@When("^user Enters The First Name In Inputbox$")
	public void user_Enters_The_First_Name_In_Inputbox() throws Throwable {
		sendkey(po.getBooking().getFirstname(), "puviyarasan");

	}

	@When("^user Enters The Last Name In Inputbox$")
	public void user_Enters_The_Last_Name_In_Inputbox() throws Throwable {
		sendkey(po.getBooking().getLastname(), "kumaravel");

	}

	@When("^user Enters The Billing Address In Inputbox$")
	public void user_Enters_The_Billing_Address_In_Inputbox() throws Throwable {
		sendkey(po.getBooking().getBilling(), "14/28 mariyamman koil street,vellore");

	}

	@When("^user Selects the Credit Card Number$")
	public void user_Selects_the_Credit_Card_Number() throws Throwable {

		sendkey(po.getBooking().getCreditcard(), "2562115425513622");
	}

	@When("^user Selects The  CreditCard Type From The Dropdown$")
	public void user_Selects_The_CreditCard_Type_From_The_Dropdown() throws Throwable {
		select(po.getBooking().getCardtype(), "VISA", "val");

	}

	@When("^user Selects The  Expiry Month From The Dropdown$")
	public void user_Selects_The_Expiry_Month_From_The_Dropdown() throws Throwable {

		select(po.getBooking().getExpirydate(), "1", "val");
	}

	@When("^user Selects The Extiry Year From The Dropdown$")
	public void user_Selects_The_Extiry_Year_From_The_Dropdown() throws Throwable {
		select(po.getBooking().getExpiryyear(), "2022", "val");
	}

	@When("^user Enters The Cvv Number In Inputbox$")
	public void user_Enters_The_Cvv_Number_In_Inputbox() throws Throwable {
		sendkey(po.getBooking().getCvvno(), Filereadermanager.getinstance_fr().getinstance_cr().getcvvno());

	}

	@Then("^user Clicks On Booknowbutton Its Navigates To Booking Confirmation$")
	public void user_Clicks_On_Booknowbutton_Its_Navigates_To_Booking_Confirmation() throws Throwable {
		click(po.getBooking().getBooknow());

	}

	@Then("^user Clicks On Logout Button Its Navigate To Logout Page$")
	public void user_Clicks_On_Logout_Button_Its_Navigate_To_Logout_Page() throws Throwable {
		click(po.getBooking().getLogout());
	}
}
