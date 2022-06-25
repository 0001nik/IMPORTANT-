package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG7 {

	@Test
	public void z() {
		Assert.assertTrue(3 > 12);
		System.out.println("z test method");
	}
	
	@Test(dependsOnMethods= {"z"} )
	public void a() {
		System.out.println("z test method");
	}
}
