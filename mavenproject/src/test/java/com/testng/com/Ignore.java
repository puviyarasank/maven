package com.testng.com;

import org.testng.annotations.Test;

import com.day.com.Baseclass;

public class Ignore extends Baseclass  {
	@Test
	public void alpha() {
		System.out.println("alphamethod");
	}
	@ org.testng.annotations.Ignore
	@Test
	public void beta() {
		System.out.println("betamethod");
	}
	@Test(enabled = false)
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
