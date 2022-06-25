package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\APPLICATIONS\\Eclipse+JDK8\\Cromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");

		// switching frame
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total frames available on web page :- " + allFrames.size());
		driver.switchTo().frame(0);

		// will find draggable and droppable web elements
		WebElement draggable = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement droppable = driver.findElement(By.xpath("//*[@id='droppable']"));

		// will use Actions class for drag and drop
		Thread.sleep(3000);
		Actions abcd = new Actions(driver);
		abcd.dragAndDrop(draggable, droppable).build().perform();

	}

}
