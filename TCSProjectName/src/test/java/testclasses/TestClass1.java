package testclasses;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {
	
	@Test(groups="regression1")
	public void TC01()
	{
		System.out.println("TC01");
	}
	
	@Test(groups="regression2")
	public void TC02()
	{
		System.out.println("TC02");
	}
	
	@Test
	public void TC03()
	{
		System.out.println("TC03");
	}
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("@BeforeSuite");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("@BeforeTest");
	}
	
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("@AfterTest");
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("@AfterSuite");
	}
}
