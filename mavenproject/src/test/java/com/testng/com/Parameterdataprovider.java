package com.testng.com;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameterdataprovider {

	@Test(dataProvider = "data")
	public void method(String username, String password) {
		System.out.println("username:" + username);
		System.out.println("password:" + password);
	}

	@DataProvider(name = "data")
	public Object[][] test() {

		return new Object[][] { { "puvi", "2344" }, { "arul", "1234" }, { "kumar", "23445" }

		};

	}

}
