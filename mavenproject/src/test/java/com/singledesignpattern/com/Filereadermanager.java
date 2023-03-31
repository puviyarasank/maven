package com.singledesignpattern.com;

import java.io.IOException;

public class Filereadermanager {
	private Filereadermanager() {
		
	}
public static Filereadermanager getinstance_fr() {
	Filereadermanager fr = new Filereadermanager();
	return fr;
}
public Configurationreader getinstance_cr() throws IOException {
	Configurationreader cr = new Configurationreader();
     return cr;
}
}
