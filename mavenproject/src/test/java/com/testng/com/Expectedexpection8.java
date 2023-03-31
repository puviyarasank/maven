package com.testng.com;

import org.testng.annotations.Test;

public class Expectedexpection8 {
	@Test(expectedExceptions = ArithmeticException.class)
	public void alpha() {
		System.out.println("alphamethod");
		throw new ArithmeticException();
	}

	@Test
	public void beta() {
		System.out.println("betamethod");
	}

}
