package TestNG;

import org.testng.annotations.Test;

public class TestNG4 {
	
	@Test( priority = -20)
	public void a() {
		System.out.println("a test method");  //1st
	}
	
	@Test( priority = -10)
	public void b() {
		System.out.println("b test method");  //2nd
	}
	
	@Test( priority = 0)
	public void z() {
		System.out.println("z test method");	//6th
	}
	
	@Test( priority = 2)
	public void d() {
		System.out.println("d test method");    //8th
	}
	
	@Test
	public void a3() {
		System.out.println("a3 test method");   //3rd
	}
	
	@Test
	public void e() {
		System.out.println("e test method");    //4th
	}
	
	@Test
	public void s() {
		System.out.println("s test method");	//5th 
	}
	
	@Test( priority = 1)
	public void f() {
		System.out.println("f test method");  //7th
	}
}
