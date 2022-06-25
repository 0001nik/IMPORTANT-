package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\APPLICATIONS\\Eclipse+JDK8\\Cromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(300);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();

		// Creating WebElement Reference
		WebElement Electronics = driver.findElement(By.xpath("//*[text()='Electronics']"));
		WebElement Home = driver.findElement(By.xpath("//*[text()='Home']"));

		// Mouse simulation using actions class
		Actions abcd = new Actions(driver);

		// mouse hover to electronics
		Thread.sleep(3000);
		abcd.moveToElement(Electronics).build().perform();

		// right click on electronics
		//Thread.sleep(3000);
		//abcd.contextClick(Electronics).build().perform();
		
		//release control from Electronics
		Thread.sleep(3000);
		abcd.release(Electronics).build().perform();
		
		//perform key events
		Thread.sleep(3000);
		abcd.sendKeys(Keys.ENTER).build().perform();
		System.out.println("Entered");
		
		//press enter to home
		//Thread.sleep(3000);
		//abcd.sendKeys(Home,Keys.ENTER).build().perform();
		//System.out.println("Successfully Clicked on Home");
		
		Thread.sleep(3000);
		abcd.moveToElement(Home).build().perform();
		Thread.sleep(3000);
		
		WebElement LivingRoom = driver.findElement(By.xpath("//*[text()='Living Room']"));
		WebElement TVUnits = driver.findElement(By.xpath("//*[text()='TV Units']"));
		
		//mouse hovering to livingroom and click on tv units
		Thread.sleep(3000);
		abcd.moveToElement(LivingRoom).build().perform();
		Thread.sleep(3000);
		TVUnits.click();
	}

}
