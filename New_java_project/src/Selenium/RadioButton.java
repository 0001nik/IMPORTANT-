package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {
		
				System.setProperty("webdriver.chrome.driver", "E:\\APPLICATIONS\\Eclipse+JDK8\\Cromedriver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();	
				Thread.sleep(3000);
				driver.get("https://www.facebook.com/");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
				Thread.sleep(3000);
				
				//first way to handle  (not good method for multiple buttons)
				driver.findElement(By.xpath("//input[@value='1']")).click();	//Click on female radio button
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@value='2']")).click();	//Click on male radio button
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@value='-1']")).click();	//Click on custom radio button
				
				//second way to handle
				List<WebElement> radio= driver.findElements(By.xpath("//input[@type='radio']"));
				System.out.println("total radio buttons we have :-  " +radio.size());
				
				System.out.println(radio.get(1).isEnabled());		//mail radio button is enabled or not
				System.out.println(radio.get(0).isDisplayed());		//female radio button is displayed or not
				System.out.println(radio.get(2).isSelected()); 		//custom radio button is selected or not
				Thread.sleep(3000);
				radio.get(1).click();
				System.out.println(radio.get(2).isSelected());		//custom radio button is selected or not
				
				//third way to handle
				List<WebElement> radio1= driver.findElements(By.xpath("//label[contains(@class,'mt')]"));
				String expectedresult = "Female";
				
				for(int i=0; i<radio1.size();i++) {
					if(radio1.get(i).getText().equalsIgnoreCase(expectedresult)) {
						radio1.get(i).click();
						System.out.println(expectedresult+  "Clicked");
						break;
					}
					
				}


	}

}
