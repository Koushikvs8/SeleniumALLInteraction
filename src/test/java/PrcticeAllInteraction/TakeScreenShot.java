package PrcticeAllInteraction;

import java.awt.AWTException;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenShot {
	 static  WebDriver driver;
	 @Test
	 void KeyboardAction() throws AWTException, InterruptedException{
			 {
	 	driver =new ChromeDriver();
	     driver.get("https://testautomationpractice.blogspot.com/");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	     captureScreenShot();
	    
			 }
			 	 
			 
			 
}
		public  static String captureScreenShot()
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			  File sourcefile =ts.getScreenshotAs(OutputType.FILE);
			   
			  File targetfile= new File(System.getProperty("user.dir")+"\\Reports\\Screenshots"+System.currentTimeMillis()+"ss.png");
			  String targetfile1=System.getProperty("user.dir")+"\\Reports\\Screenshots"+System.currentTimeMillis()+"ss.png";
			  sourcefile.renameTo(targetfile);
			return targetfile1;
		}
			
}
