package test;

import org.testng.annotations.Test;

public class TestClass3 {
 
	@Test(invocationCount=3)
	public void login()
	{
		System.out.println("This is login method");
	}
	
	@Test(invocationCount=2)
	public void test1()
	{
		System.out.println("This is test 1 method");
	}
	
	@Test(enabled=false)
	public void test2()
	{
		System.out.println("This is test2");
	}
}
