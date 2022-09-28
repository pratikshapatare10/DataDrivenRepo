package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass2 {
  
	@Test(priority=1)
	public void login()
	{
		System.out.println("This is login method");
	}
	
	@Test(priority=2)
	public void test1()
	{
		System.out.println("This is test 1 method");
	}
	
	//If we want to fail any test case forcefully
	@Test(priority=3)
	public void test2()
	{
		Assert.fail();
	}
	
	@Test(priority=4)
	public void login1()
	{
		System.out.println("This is login1 method");
	}
	
	@Test(priority=5)
	public void abc()
	{
		System.out.println("This is abc method");
	}
}
