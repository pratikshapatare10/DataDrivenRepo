package assertdemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
  
	String s1="Hi";
	String s2="Hello";
	String s3="Hi";
	String s4=null;
	
	SoftAssert soft=new SoftAssert();
	
	@Test
	  public void test1() 
		{
			
			soft.assertEquals(s1, s3);   //
			//To print logs in reports
			Reporter.log("Hello");
		}
		
		@Test
		public void test2()
		{
			soft.assertEquals(s1, s2);  //f
			soft.assertNotNull(s3);   //p
			System.out.println("in soft assert");
			
			soft.assertAll();
			
		}
}
