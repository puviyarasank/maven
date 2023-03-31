package com.testng.com;

import org.testng.annotations.Test;

public class Priority3 {
	@Test(priority = -5)
	public void alpha() {
		System.out.println("alphamethod");
	}

	@Test(priority = 0)
	public void beta() {
		System.out.println("betamethod");
	}
@Test(priority = 7)
	public void gamma() {
		System.out.println("gammamethod");
	}
@Test(priority = 2)
	public void delta() {
		System.out.println("detlamethod");
	}
	@Test(priority = 1)
	public void symbol() {
		System.out.println("symbolmethod");

	}
	
	
}
