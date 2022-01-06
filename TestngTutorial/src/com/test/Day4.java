package com.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day4 {

	
	@Test
	public void ApiloginCarloan()
	{
		System.out.println("carloan1");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("i am before method");
	}
	
	@Test
	public void mobileloginHouseloan()
	{
		System.out.println("houseloan2");
	}

	@Test
	public void webloginHouseloan()
	{
		System.out.println("houseloan3");
	}
	
	
	
}





