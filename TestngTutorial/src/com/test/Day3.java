package com.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day3 {

	
	@Test(groups= {"Smoke"})
	public void webloginCarloan()
	{
		System.out.println("carloan1");
	}
	
	@Test(dependsOnMethods= {"webloginCarloan"})
	public void mobileloginCarloan()
	{
		System.out.println("carloan2");
	}
	
	@AfterTest
	public void afterTest()
	{
		
		System.out.println("i am after test");
	}
	
	
	@BeforeTest
	public void demo5()
	{
		
		System.out.println("before test2");
	}
}
