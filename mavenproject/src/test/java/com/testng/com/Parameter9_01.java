package com.testng.com;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter9_01 {
	@Parameters({ "name" })
	@Test
	public void alpha(String username) {
		System.out.println("username:" + username);

	}

	@Parameters({ "pass" })

	@Test
	public void beta(String password) throws InterruptedException {
		// Thread.sleep(1000);
		System.out.println("password:" + password);

	}

	@Parameters({ "year" })
	@Test
	public void gamma(String boy) throws InterruptedException {
		// Thread.sleep(1000);
		System.out.println("birth of year:" + boy);
	}

	@Parameters({ "age" })
	@Test(dependsOnMethods = "gamma")
	public void age(String age) {
		System.out.println("age:" + age);

	}
}
