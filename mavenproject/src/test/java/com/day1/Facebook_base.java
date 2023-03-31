package com.day1;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.day.com.Baseclass;

public class Facebook_base extends Baseclass {
	public static void main(String[] args) throws IOException, AWTException {
		WebDriver web =  browserlaunch("chrome");
		//Wait(2);
		launchurl("https://www.facebook.com/");
		robot();
		
		//screenshot();
	//	getpagetitle();
	//	getCurrentUrl();
		//quit();
	//	alert();
		
	//select(login,"text", "ame", "met");
		
	}
	}

	
	


