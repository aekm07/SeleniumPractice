package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

	
	@Test
	public void demo1()
	{
		
		System.out.println("Akash");
	}
	
	@BeforeSuite
	public void demo2()
	{
		
		System.out.println("i am before suite");
	}
	
	
	@BeforeClass
	public void beforeClass()
	{
		
		System.out.println("i am before class");
	}
	
	@BeforeTest
	public void demo4()
	{
		
		System.out.println("before test");
	}
}
