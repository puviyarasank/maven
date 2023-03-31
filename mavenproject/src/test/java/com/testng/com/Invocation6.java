package com.testng.com;

import org.testng.annotations.Test;

public class Invocation6{
	@Test
	public void alpha() {
		System.out.println("alphamethod");
	}
	@Test
	public void beta() {
		System.out.println("betamethod");
	}
	@Test(invocationCount = 5 )
	public void gamma() {
		System.out.println("gammamethod");
	}
	@Test
	public void delta() {
		System.out.println("detlamethod");
	}
	@Test
	public void symbol() {
		System.out.println("symbolmethod");

	}

	

}
