package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ObjectRepository {
	
	//public static void main(String[] args) throws Exception {

	@Test
	public void readProperty() throws Exception {
		
		ObjectRepository or = new ObjectRepository();

		// specify the location of propert file
		File src = new File("C:\\Users\\Lenovo\\eclipse-workspace\\New_java_project\\Repositry\\Object_Repo.properties");
		
		//creat FileInputStream class object to load the file
		FileInputStream fis = new FileInputStream(src);
		
		//Creat Properties class object to read properties file
		Properties pro = new Properties();
		pro.load(fis); 
		
		// Setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "E:\\APPLICATIONS\\Eclipse+JDK8\\Cromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		or.hitURL(driver, pro.getProperty("URL"));
		or.hitURL(driver, pro.getProperty("URL1"));
		driver.get(pro.getProperty("URL"));
		Thread.sleep(3000);
		
		//getProperty() method accept key and it return value for same key
		driver.findElement(By.xpath(pro.getProperty("Email"))).sendKeys(pro.getProperty("EmailTestData"));
		driver.findElement(By.xpath(pro.getProperty("Password"))).sendKeys(pro.getProperty("PasswordTestData"));
		Thread.sleep(3000);
		driver.quit();
	}
		
		//Hit url in dynamic way
		public void hitURL(WebDriver driver, String urlAdd) {
			driver.get(urlAdd);
		}
}
