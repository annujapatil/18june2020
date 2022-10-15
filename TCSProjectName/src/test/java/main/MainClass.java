package main;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainClass {
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("@BeforeClass");
	}
	
	@BeforeMethod
	public void login()
	{
		System.out.println("@BeforeMethod");
	}
	
	@Test
	public void Test1()
	{
		System.out.println("Test1");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Test2");
	}
	
	@Test
	public void Test3()
	{
		System.out.println("Test3");
	}
	
	@Test
	public void Test4()
	{
		System.out.println("Test4");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("@AfterMethod");
	}
	
	@AfterClass
	public void closeBrowser()
	{
	System.out.println("@AfterClass");	
	}

}
