package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 {
	
	@Test
	public void Testcase2() throws Exception {
		
		int a = 10;
		int b = 20;
		
		String actualMessage = "Google";
		String expectedMessage = "Google";
		
		Assert.assertEquals(actualMessage, expectedMessage, "Actual and Expected are not matching");
		System.out.println("Assertion Pass");
		
		Assert.assertFalse(a>b, "assertfalse condition get failed");
		System.out.println("Assertion pass");
		
		Assert.assertTrue(a<b, "asserttrue condition get failed");
		System.out.println("Assertion pass");
	}
	
	@Test
	public void Testcase3() {
		//Assertion are written in Testcase2 
		//so the scope of assertion will be limited to that method only.
		System.out.println("ok fuck you");
	}
}
