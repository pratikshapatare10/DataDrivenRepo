package test;

import org.testng.annotations.Test;

public class GroupsKeyword {
 
	@Test(groups= {"sanity","regression"})
	public void login()
	{
		System.out.println("This is login method");
	}
	
	@Test(groups= {"regression"})
	public void test1()
	{
		System.out.println("This is test 1 method");
	}
	
	@Test(groups= {"sanity"})
	public void test2()
	{
		System.out.println("This is test 1 method");
	}
}
