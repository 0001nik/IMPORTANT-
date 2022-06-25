package Selenium;

import java.util.concurrent.TimeUnit;
import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUps1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\APPLICATIONS\\Eclipse+JDK8\\Cromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");

		// print how many popups are open
		Thread.sleep(3000);
		Set<String> PopUpID = driver.getWindowHandles(); // Alphanumeric ID of all windows
		System.out.println(PopUpID);

		Iterator<String> abc = PopUpID.iterator();
		String Window1 = abc.next();
		String Window2 = abc.next();
		String Window3 = abc.next();
		String Window4 = abc.next();

		// print title of popup window2
		driver.switchTo().window(Window2);
		System.out.println(Window2); //// Alphanumeric ID of window2
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();

		// print title of popup window3
		driver.switchTo().window(Window3);
		System.out.println(Window3); //// Alphanumeric ID of window3
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();

		// print title of popup window4
		driver.switchTo().window(Window4);
		System.out.println(Window4); //// Alphanumeric ID of window4
		System.out.println(driver.getTitle());
		Thread.sleep(3000);

		// print title of popup window1
		driver.switchTo().window(Window1);
		System.out.println(Window1); //// Alphanumeric ID of window1
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
	}

}
