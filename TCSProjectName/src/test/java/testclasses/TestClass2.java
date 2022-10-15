package testclasses;

import org.testng.annotations.Test;

public class TestClass2 {

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
}
