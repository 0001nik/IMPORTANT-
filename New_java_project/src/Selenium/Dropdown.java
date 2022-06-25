package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\APPLICATIONS\\Eclipse+JDK8\\Cromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(6000);

		// 1st way--industry use mostly
		List<WebElement> birthmonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total dropdown values are:-  " + birthmonth.size());
		birthmonth.get(8).click();
		System.out.println(birthmonth.get(1).isEnabled());
		System.out.println(birthmonth.get(1).isDisplayed());
		System.out.println(birthmonth.get(1).isSelected());
		

		// 2nd way--recommended
		WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
		// we will use select class constructer
		Select month = new Select(bm);
		// select by visible text
		month.selectByVisibleText("Apr");
		Thread.sleep(6000);
		// select by value
		month.selectByValue("5");
		Thread.sleep(6000);
		// select by index
		month.selectByIndex(1);
		// get current value from dropdown
		System.out.println(month.getFirstSelectedOption().getText());

		// 3rd way
		List<WebElement> dropdown = month.getOptions();
		System.out.println("Total dropdown is :-  " + dropdown.size());
		 for (int i = 0; i < dropdown.size(); i++) {
			String dropdownValues = dropdown.get(i).getText();
			if (dropdownValues.equalsIgnoreCase("Aug")) {
				dropdown.get(i).click();
			}
		}

		// 4th way
		System.out.println(month.isMultiple()); // false
		month.selectByIndex(2);
		month.selectByIndex(5);
		month.selectByVisibleText("Dec");
		//month.deselectByIndex(2);
		//month.deselectByIndex(5);
		//month.deselectByVisibleText("Dec");
		//month.deselectAll();
		
		
		//5th way
		bm.sendKeys("Aug");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Sep");
		
	}

}
