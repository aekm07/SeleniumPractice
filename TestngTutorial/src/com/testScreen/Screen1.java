package com.testScreen;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Screen1 {
	@Test
	public void meth1() {

		System.out.println("this is meth1");

	}

	@Test(dataProvider = "getdata")
	public void meth2(String a) {

		System.out.println("this is meth2");
		System.out.println(a);

	}

	@DataProvider
	public Object[][] getdata() {
		Object[][] names = new Object[2][1];
		names[0][0] = "akash";
		names[1][0] = "elango";
		return names;
	}
}
