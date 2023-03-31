package com.testng.com;

import org.testng.annotations.Test;

public class Dependency5 {
	@Test
	public void alpha() {
		System.out.println("alphamethod");
	}

	@Test // (dependsOnMethods = "delta")
	public void beta() {
		System.out.println("betamethod");
	}

	@Test(dependsOnMethods = "alpha")
	public void gamma() {
		System.out.println("gammamethod");
	}

	@Test // (dependsOnMethods = "gamma")
	public void delta() {
		System.out.println("detlamethod");
	}

	@Test // (dependsOnMethods = "beta")
	public void symbol() {
		System.out.println("symbolmethod");
	}
}
