package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\APPLICATIONS\\Eclipse+JDK8\\Cromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://paytm.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		Thread.sleep(3000);
		
		//find total frame on web page
		int totalframes = driver.findElements(By.tagName("iframe")).size();
		System.out.println(totalframes);
		
		//Go inside each frame and see which frame has our element
		for(int i=0;i<totalframes;i++) {
			driver.switchTo().frame(i);
			driver.findElement(By.xpath("//*[contains(text(),'Watch Video')]")).click();
			
		}

	}

}
