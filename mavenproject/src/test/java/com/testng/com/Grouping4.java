package com.testng.com;

import org.testng.annotations.Test;

public class Grouping4 {
	@Test(groups = "king")
	public void alpha() {
		System.out.println("alphamethod");
	}
	
	@Test(groups = "king")
	public void beta() {
		System.out.println("betamethod");
	}
	@Test(groups = "queen")
	public void gamma() {
		System.out.println("gammamethod");
	}
	@Test(groups = "queen")
	public void delta() {
		System.out.println("detlamethod");
	}
	@Test(groups = {"king","queen"})
	public void symbol() {
		System.out.println("symbolmethod");

	}

}
