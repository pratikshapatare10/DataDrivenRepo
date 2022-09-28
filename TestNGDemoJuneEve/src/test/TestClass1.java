package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass1 {
  
	@Test
	public void login()
	{
		System.out.println("This is login method");
	}
	
	@Test
	public void test1()
	{
		System.out.println("This is test 1 method");
	}
	
	//If we want to fail any test case forcefully
	@Test
	public void test2()
	{
		Assert.fail();
	}
	
	
}
