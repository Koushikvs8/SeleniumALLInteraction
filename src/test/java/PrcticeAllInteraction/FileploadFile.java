package PrcticeAllInteraction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileploadFile {

	@Test
	public void uploadFile()
	{//button[normalize-space()='Upload Single File']
		ChromeDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get("https://testautomationpractice.blogspot.com/");
    	driver.findElement(By.xpath("//input[@id='singleFileInput']")).sendKeys("C:\\Users\\User\\eclipse-workspace\\SeleniumFRAmwork\\ALLAutomationinteractions\\src\\test\\java\\Utilities\\config.properties");
    	driver.findElement(By.xpath("//button[normalize-space()='Upload Single File']")).click();
	}
	
}
