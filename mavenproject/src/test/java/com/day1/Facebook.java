package com.day1;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.day.com.Baseclass;

public class Facebook extends Baseclass {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PUVI\\eclipse-workspace\\mavenproject\\Driver\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		web.manage().window().maximize();
		web.get("https://www.facebook.com/");
		sendkey(web, )
		
		
		System.out.println("sucessfull");
		TakesScreenshot t =  (TakesScreenshot) web;
		File sou = t.getScreenshotAs(OutputType.FILE);
		File des = new File ("C:\\Users\\PUVI\\eclipse-workspace\\mavenproject\\screenshot\\ss1.png");
	FileUtils.copyFile(sou, des);
		
		
		
	}
	
	
}



