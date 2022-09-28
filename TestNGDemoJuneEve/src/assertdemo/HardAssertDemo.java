package assertdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertDemo {
	String s1="Hi";
	String s2="Hello";
	String s3="Hi";
	String s4=null;
	
	@Test
	public void test1() 
	{
		Assert.assertEquals(s1, s3);    //p
	}
	
	@Test
	public void test2()
	{
		//verification points
		Assert.assertNotEquals(s1, s3);  //f
		Assert.assertNotEquals(s1, s2);  //
		System.out.println("in hard assert");
	}
	
	@Test
	public void test3()
	{
		Assert.assertNull(s4);  //p
	}
	@Test
	public void test4()
	{
		Assert.assertNotNull(s4);   //f
	}
}
