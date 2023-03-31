package com.testng.com;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter9_02 {
	@Parameters({ "ame" })
	@Test
	public void alpha(@Optional("arul") String username) {
		System.out.println("username:" + username);

	}

	@Parameters({ "pass" })

	@Test
	public void beta(String password) throws InterruptedException {
		// Thread.sleep(1000);
		System.out.println("password:" + password);

	}

	@Parameters({ "ear" })
	@Test
	public void gamma(@Optional("1997") String boy) throws InterruptedException {
		// Thread.sleep(1000);
		System.out.println("birth of year:" + boy);

	}
}
