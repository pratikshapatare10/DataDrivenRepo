package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass4 {
 
	@Test
	public void login()
	{
		System.out.println("This is login method");
		Assert.fail();
	}
	
	@Test(dependsOnMethods= {"login"})
	public void verifylogo()
	{
		System.out.println("This is verify logo method");
		
	}
	
	@Test(timeOut=5000)
	public void test()
	{
		System.out.println("This is test method");
	}
}
