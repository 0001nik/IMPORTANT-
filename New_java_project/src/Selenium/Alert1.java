package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alert1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\APPLICATIONS\\Eclipse+JDK8\\Cromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();

		// verify alert text
		System.out.println(driver.switchTo().alert().getText());
		 String expectedResult="Do you confirm action?";
		 Assert.assertEquals(driver.switchTo().alert().getText(),expectedResult);
		 System.out.println("Alert content verified successfully");

		// To accept alert
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println("Alert accepted");

		// To dismiss alert
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		System.out.println("Dismiss worked");
		
		//Switch to parent page
		driver.switchTo().defaultContent();
		System.out.println("Default");
	}

}
