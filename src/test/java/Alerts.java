import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts {
     WebDriver driver;
	@Test
	void waits()
	{
		driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("rghrhijithk");
		driver.findElement(By.name("submit")).click();
		 // Switching to Alert //////////////////////////
		Alert alert= driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		
	}
}
