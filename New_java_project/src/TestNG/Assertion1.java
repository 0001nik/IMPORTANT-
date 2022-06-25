package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {
	
	WebDriver driver;
	
	@Test
	public void Testcase1() throws Exception {
		
		String expectedresult = "Sorry, we don't recognise this email address.";
		
		System.setProperty("webdriver.chrome.driver", "E:\\APPLICATIONS\\Eclipse+JDK8\\Cromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('login-signin').click()");
		
		Thread.sleep(2000);
		String actualresult = driver.findElement(By.id("username-error")).getText();
		
		Assert.assertEquals(actualresult, expectedresult);
		System.out.println("Equal assertion successfully validated.");
		
		Assert.assertFalse(driver.findElement(By.id("username-error")).isSelected());
		System.out.println("False assertion successfully validated.");
		
		Assert.assertTrue(driver.findElement(By.id("username-error")).isDisplayed());
		System.out.println("True assertion successfully validated.");
	}
	
}
