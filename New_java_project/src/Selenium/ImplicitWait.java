package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\APPLICATIONS\\Eclipse+JDK8\\Cromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Introduce implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("How Stuff Works");
		
		//How to handle autosuggestion
		WebElement autosuggestion= driver.findElement(By.xpath("//ul[@role='listbox']"));
		List<WebElement> allsearch = autosuggestion.findElements(By.tagName("li"));
		System.out.println("Total auto suggestion:- " +allsearch.size());
		
		for(int i=0; i < allsearch.size() ; i++) {
			String allsuggestionlist= allsearch.get(i).getText();
			String Finalresult="how stuff works health";
			
			if(allsuggestionlist.equalsIgnoreCase(Finalresult)) {
				allsearch.get(i).click();
				System.out.println("You have selected:-  "  +Finalresult);
				break;
			}
		}
	}

}
