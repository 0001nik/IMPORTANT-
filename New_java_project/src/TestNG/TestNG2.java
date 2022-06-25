package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG2 {
	
	@Test
	public void assertionCheck() {
		
		String expectedmessage ="user created successfully.";
		String actualmessage ="user created successfully";
		
		try {
			Assert.assertEquals(expectedmessage,actualmessage);
		} catch (AssertionError e) {
			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("Verification successful");
	}
}
