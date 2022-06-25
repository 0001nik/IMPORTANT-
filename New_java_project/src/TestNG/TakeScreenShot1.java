package TestNG;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeScreenShot1 {
	
	WebDriver driver;
	
	public void CaptureScreenShot(ITestResult result) throws Exception {
		
		if(ITestResult.FAILURE == result.getStatus()) {
			
			//Creat reference of TakeScreenShot Interface and Type Casting
			TakesScreenshot ts = (TakesScreenshot) driver;  //Type Casting of interface
			
			//call getScreenShotAs() method to capture the screenshot in termsof file
			//getScreenShotAs() method return type is file
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			//Copy file to specific location
			FileUtils.copyFile(source, new File("./ScreenShots/" + result.getName() + ".png"));
			System.out.println(result.getName() + "method() Screenshot Captured");
		}
	}
}
