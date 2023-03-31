package com.singledesignpattern.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configurationreader {
	Properties p = new Properties();

	public Configurationreader() throws IOException {
		File f = new File("C:\\Users\\PUVI\\eclipse-workspace\\mavenproject\\Configuration\\config.properties");
		FileInputStream fi = new FileInputStream(f);
		p.load(fi);
	}

	public String geturl() {
		String url = p.getProperty("url");
		return url;
	}

	public String getpassword() {
		String pass = p.getProperty("password");
		return pass;

	}

	public String getcreditcard() {
		String card = p.getProperty("creditcardno");
		return card;

	}

	public String getcvvno() {
		String cvv = p.getProperty("cvvno");
		return cvv;
	}

}
