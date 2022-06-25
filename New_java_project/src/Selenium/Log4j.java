package Selenium;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j {

	public static void main(String[] args) {
		
		//we need to creat logger instance so we need to pass class name 
		//for which we have to creat logfile,In this case class name is Log4j
		Logger logger = Logger.getLogger("Log4j");
		
		//configure Log4j.property file
		PropertyConfigurator.configure("C:\\Users\\Lenovo\\eclipse-workspace\\New_java_project\\log4j.properties");
		
		//open chrome browser instance
		System.setProperty("webdriver.chrome.driver", "E:\\APPLICATIONS\\Eclipse+JDK8\\Cromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		logger.info("Chrome Browser Instance opened");
		
		//maximize the window
		driver.manage().window().maximize();
		logger.info("Window Maximized");
		
		//set implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		logger.info("Implicit Wait given");
		
		//open url
		driver.get("https://www.facebook.com/");
		logger.info("Application launched");	 
	}

}
