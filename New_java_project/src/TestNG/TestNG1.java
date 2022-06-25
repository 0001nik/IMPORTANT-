package TestNG;

import org.testng.annotations.*;

public class TestNG1 {
	
		@Test
		public void a2() {
			System.out.println("a2 test method");
		}
		@BeforeTest
		public void b() {
			System.out.println("BeforeTest Method");
		}
		@BeforeTest
		public void c() {
			System.out.println("BeforeSuit Method");
		}
		@AfterMethod
		public void d() {
			System.out.println("AfterMethod Method");
		}
		@BeforeClass
		public void e() {
			System.out.println("BeforeClass Method");
		}
		@AfterTest
		public void f() {
			System.out.println("AfterTest Method");
		}
		@AfterClass
		public void g() {
			System.out.println("AfterClass Method");
		}
		@BeforeMethod
		public void h() {
			System.out.println("BeforeMethod Method");
		}
		@AfterSuite
		public void i() {
			System.out.println("AfterSuite Method");
		}
		
		@Test
		public void a1() {
			System.out.println("a1 test method");
		}
		
		public static void main(String[] args) {
			System.out.println("main method");
		}

	}

