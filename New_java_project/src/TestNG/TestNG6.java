package TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG6 {
	
	@Test
	public void a() {
		System.out.println("a3 method");
	}

	@Test(invocationCount = 2, priority = -1 , enabled = false)
	public void b() {
		System.out.println("b method");
	}

	@Test(invocationCount = 2)
	public void c() {
		System.out.println("c method");
	}
	
	@BeforeMethod
	public void d() {
		System.out.println("This is before method");
	}
}
