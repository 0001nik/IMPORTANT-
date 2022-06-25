package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\APPLICATIONS\\Eclipse+JDK8\\Cromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");

		// creat list of all companies
		List<WebElement> allcompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("Total companies:-  " + allcompanies.size());

		// current price list of all companies
		List<WebElement> currentprice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total current price:-  " + currentprice.size());

		String expectedcompanyname = "Lime Chemicals";

		for (int i = 0; i < allcompanies.size(); i++) {
			if (allcompanies.get(i).getText().equalsIgnoreCase(expectedcompanyname)) {
				System.out.println(allcompanies.get(i).getText() + "====" + currentprice.get(i).getText());
				allcompanies.get(i).click();
				break;

			}
		}

	}

}
