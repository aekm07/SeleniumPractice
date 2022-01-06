package com.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class day1 {

	@Test
	public void demo()
	{
		
		System.out.println("hello");
	}
	
	@Parameters({"URL"})
	@Test
	public void demo2(String url)
	{
		
		System.out.println(url);
	}	
	
	
	
	
	
	
}
