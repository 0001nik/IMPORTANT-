package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class TakeScreenShot2 {

	TakeScreenShot1 t1 = new TakeScreenShot1();

	@Test(priority = 1)
	public void doLogin() throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\APPLICATIONS\\Eclipse+JDK8\\Cromedriver\\chromedriver.exe");
		t1.driver= new ChromeDriver();
		t1.driver.manage().window().maximize();
		t1.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		t1.driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		t1.driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abc@gmail.com");
		t1.driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123");

		// passing wrong id so that our testcase will get fail
		t1.driver.findElement(By.xpath("//*[@id='email_button_']")).click();
	}

	@Test(priority = 2)
	public void Assertioncheck() {
		System.out.println("Assertioncheck");
	}
	
	@AfterMethod
	public void TakeScreenShot1(ITestResult result) throws Exception {
		t1.CaptureScreenShot(result);
	}
	
}
