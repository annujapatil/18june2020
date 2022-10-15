package Priority;

import org.testng.annotations.Test;

public class priority {
	
	@Test(priority=1)
	public void TC01()
	{
		System.out.println("TC01");
	}
	
	@Test(priority=-1)
	public void TC03()
	{
		System.out.println("TC03");
	}
	@Test()
	public void TC04()
	{
		System.out.println("TC04");
	}
	@Test(dependsOnMethods="TC03")
	public void TC05()
	{
		System.out.println("TC05");
	}
	@Test(enabled=false)
	public void TC06()
	{
		System.out.println("TC06");
	}
	@Test(invocationCount=5)
	public void TC07()
	{
		System.out.println("TC07");
	}
	@Test(timeOut=2000)
	public void TC08() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("TC08");
		
	}
     
}
