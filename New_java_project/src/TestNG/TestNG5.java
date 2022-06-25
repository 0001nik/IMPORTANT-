package TestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG5 {

	// @Test
	public void a() {
		System.out.println("a method");
	}

	// As experienced professional we will use this method
	@Test(enabled = false)	//Always recommended in industry
	public void b() {
		System.out.println("b method");
	}
	
	//Testcase will execute 2 times
	@Test(invocationCount = 2)
	public void c() {
		System.out.println("c method");
	}
	
	//Testcase will execute 0 times,means test will skip
	@Test(invocationCount = 0)
	public void d() {
		System.out.println("d method");
	}
	
	//Correct way but not recommended
	@Test
	public void e() {
		System.out.println("e method");
		throw new SkipException("this method is skipped");
		//System.out.println("e method");
	}
}
