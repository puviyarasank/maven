package com.testng.com;

import org.testng.annotations.Test;

public class Timesout7 {
	@Test(timeOut = 3000)
	public void alpha() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("alphamethod");
	}
	
	@Test(timeOut = 2000)
	public void beta() throws InterruptedException {
		Thread.sleep(1000);
		
		System.out.println("betamethod");
	

	}
}
