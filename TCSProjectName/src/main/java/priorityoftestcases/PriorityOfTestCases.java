package priorityoftestcases;

import org.testng.annotations.Test;

public class PriorityOfTestCases {
	
	@Test(priority=1)
	public void Test1()
	{
		System.out.println("Test1");
	}
	
	@Test(priority=-1)
	public void Test2()
	{
		System.out.println("Test2");
	}
	
	@Test(priority=3)
	public void Test3()
	{
		System.out.println("Test3");
	}
	
	@Test()
	public void Test4()
	{
		System.out.println("Test4");
	}
	
	@Test(enabled=false)
	public void Test5()
	{
		System.out.println("Test5");
	}
	
	@Test(invocationCount=5)
	public void Test6()
	{
		System.out.println("Test6");
	}
	
	@Test(dependsOnMethods="Test4")
	public void Test7()
	{
		System.out.println("Test7");
	}
	
	@Test(priority=-2, timeOut=2000)
	public void Test8() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("Test8");
	}
	
	@Test(dependsOnMethods= {"Test1", "Test6"})
	public void Test9() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("Test9");
	}

}
