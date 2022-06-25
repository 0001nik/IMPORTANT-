package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURL3 {

	public static void main(String[] args) throws Exception {

		// Setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "E:\\APPLICATIONS\\Eclipse+JDK8\\Cromedriver\\chromedriver.exe");

		// Launching chrome browser instance
		WebDriver driver = new ChromeDriver();

		// manage() method
		driver.manage().window().maximize();

		// Openinh URL of application using GET() method
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);

		// Get current URL
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		System.out.println(url);

		// Get title of thr web page
		Thread.sleep(3000);
		System.out.println(driver.getTitle());

		// Close current browser instance
		// Thread.sleep(3000);
		// driver.close();
		// driver.quit(); ----> closing all browser instances

	}

}
