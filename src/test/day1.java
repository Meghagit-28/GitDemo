package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {


		// TODO Auto-generated method stub
	
	@Test
	public void demo()
	{
		System.out.println("For git demo");
		System.out.println("To learn git");
		System.out.println("to push changes to github");
	}
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");
		
	}
	@Test
	public void Demo()
	{
		System.out.println("hello");//automation
		Assert.assertTrue(false);
	}
	@AfterSuite
	
	public void afSyite()
	{
		System.out.println("I am the no 1 from last ");
	}
	@Test
	public void SecondTest()
	{
		System.out.println("bye");
	}



}
