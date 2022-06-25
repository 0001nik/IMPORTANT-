package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion4 {
	
	@Test
	public void Testcase2() throws Exception {
		
		int i = 10;
		int j = 10;
		
		try {
			Assert.assertTrue(i>j);
		}
			catch(AssertionError e) {
				e.printStackTrace();
				System.out.println("e");
			}
			System.out.println("Assertion Fail");
			
			if (i == j ) {
				System.out.println("result of i is equal to j");
			} else {
				System.out.println("result of i is not equal to j ");
			}
	}
}
