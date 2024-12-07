package PrcticeAllInteraction;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Waites {
	
		 static  WebDriver driver;
		 @Test
		 void KeyboardAction() throws AWTException, InterruptedException{
				 {
		 	driver =new ChromeDriver();
		     driver.get("https://testautomationpractice.blogspot.com/");
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		     driver.manage().window().maximize();
		     WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='et_pb_contact_name_0']"))).sendKeys("koushik");
				 driver.close();
				 }
				 	 
				 
				 
	
}
}
